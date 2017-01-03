package com.ecust.equsys.utils;


import java.lang.reflect.Field;
import java.util.List;


import android.app.Activity;
import android.widget.Button;
import android.widget.Toast;
import com.ecust.equsys.adaptor.UpLoadAdapter;
import com.ecust.equsys.base.impl.UserPager;
import com.ecust.equsys.domain.DBList;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest.HttpMethod;

/**
 * 用于将类的实体上传到我们指定的地址
 * @author smxiang
 *
 */
public class HttpHelper {

	private static final String BASEADDRESS ="http://192.168.253.1:8080/SSEI/";//将要提交的地方
	//private static final String BASEADDRESS ="http://172.18.45.1:8080/SSEI/";//将要提交的地方
	private Activity mActivity;
	private DbHelper dbHelper;
	//private List<DBList> dbLists;
	protected int position;
	private String url;
	//private UpLoadAdapter upLoadAdapter;
	private String userName;
	private String passWord;
	public HttpHelper(Activity mActivity) {
		this.mActivity = mActivity;
		dbHelper =DbHelper.getInstance(mActivity);
		userName = CacheUtils.getString(mActivity, UserPager.USERNAME, "0");
		passWord = CacheUtils.getString(mActivity, UserPager.PASSWORD, "0");
	}

	public void upload(final Object entity, final List<DBList> dbLists, int position, final UpLoadAdapter upLoadAdapter, final Button button) {		
		 this.position = position;

		// this. dbLists = dbLists;
//		final Object record = dbLists.get(position);
		// this.upLoadAdapter = upLoadAdapter;
		 HttpUtils http = new HttpUtils();
		 RequestParams params = new RequestParams();
		 @SuppressWarnings("rawtypes")
			Class clazz;
		 
		 //循环遍历，将实体的属性都封装到http请求中
		    try
		    {
		    	clazz = entity.getClass();
		    	Field[] fields = clazz.getFields();
				for (Field field : fields) {
					String key = field.getName();
					String value = null;
					try {
						String className = field.getType().getSimpleName();
						if (className.equalsIgnoreCase("String"))
							value = (String) field.get(entity);

					} catch (Exception e) {
						e.printStackTrace();
					}
					params.addBodyParameter(key, value);
				}
		    	//将用户名和密码也放到上传的参数中
		    	params.addBodyParameter("userName",userName);
		    	params.addBodyParameter("passWord",passWord);
		    }
		    catch(Exception e){
		    	e.printStackTrace();	
		   }
		    //获得确定的路径		    
		    url = getURL(entity);
		    //上传
		    http.send(HttpMethod.POST, url, params, new RequestCallBack<String>() {

		    	@Override  
	            public void onFailure(HttpException httpException, String arg1) { 
		    		
	                 Toast.makeText(mActivity, "请检查网络环境后重新上传", Toast.LENGTH_SHORT).show();  
	                 button.setClickable(true);
	            }  
	  
	            @Override  
	            public void onSuccess(ResponseInfo<String> responseInfo) { 

//	            	String result = processResponce(responseInfo.result);
					switch (responseInfo.result) {
						case "No User":
							Toast.makeText(mActivity, "没有此用户！", Toast.LENGTH_SHORT).show();
							button.setClickable(true);
							break;
						case "success":
							//把原先的数据删除
//							dbHelper.deleteEntity(entity);
//							dbHelper.deleteEntity(record);
							if (dbLists.size() != 0) {
								Toast.makeText(mActivity, "上传成功！", Toast.LENGTH_SHORT).show();
							} else {
								Toast.makeText(mActivity, "您点的太快了", Toast.LENGTH_SHORT).show();
							}
							button.setClickable(true);
							break;
						default:
							Toast.makeText(mActivity, "上传失败", Toast.LENGTH_SHORT).show();
							button.setClickable(true);
							break;
					}
				}
			});
		  }

	/**
	 * 从远程数据库取得容器的基本信息
	 * @param vesselID
     */
	public void loadVesselBasicInfo(String vesselID){
		HttpUtils http = new HttpUtils();
		RequestParams params = new RequestParams();
		//将用户名和密码也放到上传的参数中
		params.addBodyParameter("userName",userName);
		params.addBodyParameter("passWord",passWord);
		params.addBodyParameter("vesselId",vesselID);
		//获得确定的路径
		url = BASEADDRESS+"restful/load/vesselBasic";
		http.send(HttpMethod.POST, url, params, new RequestCallBack<String>() {
			@Override
			public void onSuccess(ResponseInfo<String> responseInfo) {
				if(responseInfo.result.equals("No User")){
					Toast.makeText(mActivity, "没有此用户！", Toast.LENGTH_SHORT).show();}
				else {
					if (responseInfo.result.equals("error")){
						Toast.makeText(mActivity, "加载失败！", Toast.LENGTH_SHORT).show();
					}else{
						TempDateUtils.putString(mActivity, "vesselbasicInfo",responseInfo.result);
						Toast.makeText(mActivity, "加载成功！", Toast.LENGTH_SHORT).show();
					}
				}
			}
			@Override
			public void onFailure(HttpException error, String msg) {
				Toast.makeText(mActivity, "请检查网络环境后重新上传", Toast.LENGTH_SHORT).show();
			}
		});

	}

	/**
	 * 从远程数据库取得管道的基本信息
	 * @param pipeId
	 */
	public void loadPipeBasicInfo(String pipeId){
		System.out.println(pipeId);
		HttpUtils http = new HttpUtils();
		RequestParams params = new RequestParams();
		//将用户名和密码也放到上传的参数中
		params.addBodyParameter("userName",userName);
		params.addBodyParameter("passWord",passWord);
		params.addBodyParameter("pipeId",pipeId);
		//获得确定的路径
		url = BASEADDRESS+"restful/load/pipeBasic";
		http.send(HttpMethod.POST, url, params, new RequestCallBack<String>() {
			@Override
			public void onSuccess(ResponseInfo<String> responseInfo) {
				if(responseInfo.result.equals("No User")){
					Toast.makeText(mActivity, "没有此用户！", Toast.LENGTH_SHORT).show();}
				else {
					if (responseInfo.result.equals("error")){
						Toast.makeText(mActivity, "加载失败！", Toast.LENGTH_SHORT).show();
					}else{
						TempDateUtils.putString(mActivity, "pipebasicInfo",responseInfo.result);
						Toast.makeText(mActivity, "加载成功！", Toast.LENGTH_SHORT).show();
					}
				}
			}
			@Override
			public void onFailure(HttpException error, String msg) {
				Toast.makeText(mActivity, "请检查网络环境后重新上传", Toast.LENGTH_SHORT).show();
			}
		});

	}



	private String getURL(final Object entity) {
		String servletpath = BeanUtils.getStringFromBean(entity,"servlet_type");
		String method = BeanUtils.getStringFromBean(entity,"method");
		return BASEADDRESS+servletpath+"/"+method;
	}


}
