package com.ecust.equsys.base;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.ecust.equsys.R;
import com.ecust.equsys.adaptor.MyBasicAdaptor;
import com.ecust.equsys.base.impl.pipedetail.PipeTagLoadPager;
import com.ecust.equsys.base.impl.vesseldetail.VesselTagLoadPager;
import com.ecust.equsys.domain.BaseEntity;
import com.ecust.equsys.domain.ConfigMap;
import com.ecust.equsys.domain.MenuDetailUIDomain;
import com.ecust.equsys.domain.pipe.PipeConfig;
import com.ecust.equsys.domain.vessel.VesselConfig;
import com.ecust.equsys.utils.BeanUtils;
import com.ecust.equsys.utils.CacheUtils;
import com.ecust.equsys.utils.DbHelper;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.db.sqlite.Selector;
import com.lidroid.xutils.db.sqlite.WhereBuilder;
import com.lidroid.xutils.view.annotation.ViewInject;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuDetailUI extends MenuDetailBasePager{
    private static final String TAG = MenuDetailUI.class.getSimpleName();
    private String tag_ID;//取出的标签ID
    private String mission_ID;//取出的任务号
    private Class clazz_flag;
    private Map<String, String> tempInfo;//管道信息初始化信息数组
    private int quantity = 0;//用户输入值
    private int add_Index = 0;//要添加数据的数组中的位置
    private Integer[] num = new Integer[5];//要添加数据的数组中的位置
    private Map<String, String> clazz_En_Name ;//不同页面对应的扩展字段

    public MenuDetailUI(Activity activity) {
		super(activity);
	}
	
	@ViewInject(R.id.menu_body_list_items)
    private ListView mListView;
	
	public MenuDetailUIDomain mDomain;

	public MenuDetailUI(Activity activity,MenuDetailUIDomain m) {
		super(activity);
		this.mDomain = m;
	}

	@Override
	public View initView() {
		View view = View.inflate(mActivity, R.layout.menu_body, null);
		ViewUtils.inject(this,view);
		return view;
	}

    /**
     * 1取用户输入值
     * 2新数组的生成
     */
    @Override
	public void initData() {
        //数据适配前处理数据
		processData();
        //System.out.println("初始数据");
        myBasicAdaptor=new MyBasicAdaptor(mActivity,mDomain);
		mListView.setAdapter(myBasicAdaptor);
	}

	private void processData() {
        Class clazz = mDomain.getEntity().getClass();
        //根据用户输入值添加数据
        if (mDomain.getcExpand() != null && mDomain.geteExpand() != null && mDomain.gettExpand() != null && add_Index == 0) {
            //数据ArrayList初始化
            //原始数据
            List<String> cItemsList = new ArrayList<>();
            List<String> eItemsList = new ArrayList<>();
            List<Integer> typeList = new ArrayList<>();
            //扩展数据
            List<String> cExpandList = new ArrayList<>();
            List<String> eExpandList = new ArrayList<>();
            List<Integer> tExpandList = new ArrayList<>();
            //暂存数据
            List<String> usercExpandList = new ArrayList<>();
            List<String> usereExpandList = new ArrayList<>();
            List<Integer> usertExpandList = new ArrayList<>();
            //数组转ArrayList
            cItemsList.addAll(Arrays.asList(mDomain.cItems));
            eItemsList.addAll(Arrays.asList(mDomain.eItems));
            typeList.addAll(Arrays.asList(mDomain.type));

            if (typeList.indexOf(2)!=-1) {
                clazz_En_Name = ConfigMap.getConfigMap();
                accessData();
                add_Index = typeList.indexOf(2);//寻找要扩展数据的位置
				typeList.set(add_Index, 3);
                //Log.v(TAG, "add_Index:" +eItemsList.get(add_Index));

                if (tempInfo != null) {
                            if (tempInfo.get(clazz_En_Name.get(clazz.getSimpleName())) != null) {
                                quantity = Integer.parseInt(tempInfo.get(clazz_En_Name.get(clazz.getSimpleName())));
                            }
                        //Log.v(TAG, "quantity:" +quantity);
                }
            }

            cExpandList.addAll(Arrays.asList(mDomain.cExpand));
            eExpandList.addAll(Arrays.asList(mDomain.eExpand));
            tExpandList.addAll(Arrays.asList(mDomain.tExpand));

            for (int i = 0; i < quantity; i++) {
                usercExpandList.addAll(cExpandList);
            }
            for (int i = 0; i < quantity; i++) {
                usereExpandList.addAll(eExpandList);
            }
            for (int i = 0; i < quantity; i++) {
                usertExpandList.addAll(tExpandList);
            }
            //Log.v(TAG, "add_Index:" +add_Index);

            cItemsList.addAll(add_Index, usercExpandList);
            //Log.v(TAG, "cItemsList:" +cItemsList);
            eItemsList.addAll(add_Index, usereExpandList);
            typeList.addAll(add_Index, usertExpandList);

            mDomain.cItems = cItemsList.toArray(new String[cItemsList.size()]);
            mDomain.eItems = eItemsList.toArray(new String[cItemsList.size()]);
            mDomain.type = typeList.toArray(new Integer[cItemsList.size()]);

            num[0] = add_Index;
            num[1] = add_Index + quantity * cExpandList.size();
            num[2] = cExpandList.size();
            num[3] = quantity;
            num[4] = quantity * cExpandList.size();
            //Log.v(TAG, "num:" +Arrays.toString(num));

            mDomain.setNum(num);
        }

	}

	private void accessData() {

        DbHelper dbHelper = DbHelper.getInstance(mActivity);
        tempInfo = new HashMap<>();

        //1先在该对象中取出type，判断是管道还是容器，根据不同的设备添加tag和mission信息
        String type = BeanUtils.getStringFromBean(mDomain.getEntity(),"scan_type");


        //如果是管道，将管道的id和missionID取出来
        if (type.equals(BaseEntity.SCAN_PIPE_TYPE)) {
            tag_ID = CacheUtils.getString(mActivity, PipeTagLoadPager.PIPE_TAG_ID, null);//无值的话为"0"
            mission_ID = CacheUtils.getString(mActivity, PipeTagLoadPager.PIPE_MISSION_ID, null);
            clazz_flag = PipeConfig.class;
        }
        //如果是容器，将容器id和missionID取出来
        if (type.equals(BaseEntity.SCAN_SESSEL_TYPE)) {
            tag_ID = CacheUtils.getString(mActivity, VesselTagLoadPager.VESSEL_TAG_ID, null);//无值的话为"0"
            mission_ID = CacheUtils.getString(mActivity, VesselTagLoadPager.VESSEL_MISSION_ID, null);
            clazz_flag = VesselConfig.class;
        }
        Log.v(TAG, "clazz_flag:" + clazz_flag);
        Selector selector = Selector.from(clazz_flag).where("scan_Tag_ID", "=", tag_ID).and(WhereBuilder.b("scan_Mission_ID", "=", mission_ID));
        Object obj =dbHelper.findFirst(selector);
        //循环遍历
        if (obj!=null){
            try
            {
                Field[] fields = clazz_flag.getFields();
                for (Field field : fields) {
                    String key = field.getName();
                    String value = null;
                    try {
                        String className = field.getType().getSimpleName();
                        if (className.equalsIgnoreCase("String"))
                            value = (String) field.get(obj);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    tempInfo.put(key, value);
                }
                Log.v(TAG, "tempInfo:" +tempInfo);
            }

            catch(Exception e){
                e.printStackTrace();
            }
        }


	}


}
