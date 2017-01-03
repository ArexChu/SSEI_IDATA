package com.ecust.equsys.adaptor;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ecust.equsys.R;
import com.ecust.equsys.base.impl.UserPager;
import com.ecust.equsys.domain.DBList;
import com.ecust.equsys.utils.CacheUtils;
import com.ecust.equsys.utils.DbHelper;
import com.ecust.equsys.utils.HttpHelper;
import com.lidroid.xutils.db.sqlite.Selector;
import com.lidroid.xutils.db.sqlite.WhereBuilder;

import java.util.List;

public class UpLoadAdapter extends BaseAdapter{


	private static UpLoadAdapter adapter;

	public  static UpLoadAdapter getAdapter(Activity activity , List<DBList> dbLists){
		if (adapter==null){
			adapter = new UpLoadAdapter(activity, dbLists);
		}else{
			adapter.mActivity = activity;
			adapter.dbLists = dbLists;
		}
		return adapter;
	}


	private  Activity mActivity;
	private  List<DBList> dbLists;
	private  DbHelper dbHelper;
	private  LayoutInflater mInflater;

	private String tag_ID;
	private String mission_ID;

	private UpLoadAdapter(Activity activity, List<DBList> dbLists) {
		this.mActivity = activity;
		this.dbLists = dbLists;
		this.mInflater =  LayoutInflater.from(mActivity);
	}


	@Override
	public int getCount() {
		//System.out.println("重新调用getcont方法"+dbLists.size());
		if (dbLists!=null) {
			return dbLists.size();
		}else {
			return 0;
		}
	}

	@Override
	public Object getItem(int position) {
		return dbLists.get(position);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView==null){
			holder= new ViewHolder();
			convertView = mInflater.inflate(R.layout.upload_data_detail, parent,false);
			holder.tv_Description=(TextView) convertView.findViewById(R.id.tv_upload_description);
			holder.tv_Upload_time = (TextView) convertView.findViewById(R.id.tv_upload_time);
			holder.tv_Tag_ID=(TextView) convertView.findViewById(R.id.tv_upload_tag);
			holder.tv_Mission_ID=(TextView) convertView.findViewById(R.id.tv_upload_mission);
			holder.upLoadButton= (Button) convertView.findViewById(R.id.bt_loadup);
			holder.deleteButton= (Button) convertView.findViewById(R.id.bt_delete);
			convertView.setTag(holder);
		}else {
			holder = (ViewHolder) convertView.getTag();
		}
		holder.tv_Description.setText(dbLists.get(position).getDb_Description());
		holder.tv_Upload_time.setText(dbLists.get(position).getDb_Current_Time());
		holder.tv_Tag_ID.setText(dbLists.get(position).getScan_Tag_ID());
		holder.tv_Mission_ID.setText(dbLists.get(position).getScan_Mission_ID());
		//System.out.println("在getview中输出此时的位置"+position);
		//System.out.println("在getview 中输出此时的对象"+dbLists.get(position).toString());
		holder.upLoadButton.setOnClickListener(new UpLoadListener( position,holder.upLoadButton));
		holder.deleteButton.setOnClickListener(new DeleteListener( position));
		return convertView;
	}
		
	private class UpLoadListener implements OnClickListener{

		private Class clazz;
		@SuppressWarnings("rawtypes")

		private int position;
		private Button upLoadButton;

		UpLoadListener(int position, Button upLoadButton) {
			this.position = position;
			this.upLoadButton = upLoadButton;
//			try {
//				clazz =  Class.forName(dbLists.get(position).getClassName());
//				System.out.println(dbLists.get(position).getClassName());
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
//			}
			tag_ID = dbLists.get(position).getScan_Tag_ID();
			mission_ID = dbLists.get(position).getScan_Mission_ID();
			dbHelper=DbHelper.getInstance(mActivity);
		}

		@Override
		public void onClick(View v) {
			HttpHelper httpHelper;
			Object obj;
			upLoadButton.setClickable(false);
			//首先要确保用户名密码不为空
			String userName = CacheUtils.getString(mActivity, UserPager.USERNAME, "0");
			String password = CacheUtils.getString(mActivity, UserPager.PASSWORD, "0");
			if ((userName .equals("0")) || (password .equals("0") )) {
				Toast.makeText(mActivity, "用户名或密码不能为空", Toast.LENGTH_SHORT).show();
				upLoadButton.setClickable(true);
			}
			else {
				if (dbLists.size()!=0) {
					//System.out.println("dblists的大小"+dbLists.size());
					//System.out.println("点击的position"+position);
					//System.out.println("dblists的第position位"+ dbLists.get(position).toString());
					httpHelper = new HttpHelper(mActivity);
					//查找相关的数据
					try {
						clazz = Class.forName(dbLists.get(position).getClassName());
						//System.out.println(dbLists.get(position).getClassName());
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					//System.out.println(clazz.getName());
					Selector selector = Selector.from(clazz).where("scan_Tag_ID", "=", tag_ID).and(WhereBuilder.b("scan_Mission_ID", "=", mission_ID));
					obj = dbHelper.findFirst(selector);
					//将其上传,上传成功后,将该对象删除，注意，要删除两个记录，一是对象实体，二是对象记录,所以把对象记录也传进去,三是按键，应为要为按键解除禁用
					httpHelper.upload(obj,dbLists,position,UpLoadAdapter.this,upLoadButton);
					//dbLists.remove(position);
					//UpLoadAdapter.this.notifyDataSetChanged();
				}
			}

		}
		
	}


	private class DeleteListener implements OnClickListener{
		private int position;
		DeleteListener(int position) {
			this.position = position;
		}

		@SuppressWarnings("deprecation")
		@Override
		public void onClick(View v) {
			// 创建退出对话框
            AlertDialog isExit = new AlertDialog.Builder(mActivity).create();
            // 设置对话框标题
            isExit.setTitle("系统提示");
            // 设置对话框消息
            isExit.setMessage("确定要删除吗");
            // 添加选择按钮并注册监听
            isExit.setButton("确定", listener);
            isExit.setButton2("取消", listener);
            // 显示对话框
            isExit.show();
        }

        /**监听对话框里面的button点击事件*/
        DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface dialog, int which)
            {
                switch (which)
                {
                    case AlertDialog.BUTTON_POSITIVE:// "确认"按钮删除
						/*dbHelper.myDelete(clazz, WhereBuilder.b("scan_Tag_ID", "=", tag_ID)
								.and("scan_Mission_ID", "=", mission_ID));//删除原先的对象*/
                        dbHelper.deleteEntity(dbLists.get(position));
                        dbLists.remove(position);
                        notifyDataSetChanged();
						//System.out.println(UpLoadAdapter.this);
                        Toast.makeText(mActivity, "删除成功！", Toast.LENGTH_SHORT).show();
                        //将临时文件清掉
                        //TempDateUtils.deleteTempDate(mActivity);
                        break;
                    case AlertDialog.BUTTON_NEGATIVE:// "取消"第二个按钮取消对话框
                        break;
                    default:
                        break;
                }
            }
        };

	}

	private class ViewHolder{
		TextView tv_Description;
		TextView tv_Upload_time;
		TextView tv_Tag_ID;
		TextView tv_Mission_ID;
		Button upLoadButton ;
		Button deleteButton ;
	}


}
