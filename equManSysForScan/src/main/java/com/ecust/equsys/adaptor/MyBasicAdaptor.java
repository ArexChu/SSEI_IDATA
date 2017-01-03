package com.ecust.equsys.adaptor;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.ecust.equsys.R;
import com.ecust.equsys.base.impl.pipedetail.PipeTagLoadPager;
import com.ecust.equsys.base.impl.vesseldetail.VesselTagLoadPager;
import com.ecust.equsys.domain.BaseEntity;
import com.ecust.equsys.domain.DBList;
import com.ecust.equsys.domain.MenuDetailUIDomain;
import com.ecust.equsys.domain.pipe.PipeConfig;
import com.ecust.equsys.domain.pipe.PipeInfo;
import com.ecust.equsys.domain.vessel.VesselConfig;
import com.ecust.equsys.domain.vessel.VesselInfo;
import com.ecust.equsys.utils.BeanUtils;
import com.ecust.equsys.utils.CacheUtils;
import com.ecust.equsys.utils.DateUtils;
import com.ecust.equsys.utils.DbHelper;
import com.ecust.equsys.utils.TempDateUtils;
import com.google.gson.Gson;
import com.lidroid.xutils.db.sqlite.Selector;
import com.lidroid.xutils.db.sqlite.WhereBuilder;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 神马翔的适配器，适配所有界面，目前功能不完善，封装不到位，加油，努力！
 *
 * @author smxiang
 */
public class MyBasicAdaptor extends BaseAdapter {
    private static final String TAG = MyBasicAdaptor.class.getSimpleName();
    private Activity mActivity;
    private Integer[] type;//类型
    private String[] cItems;//中文描述
    private String[] eItems;//与数据库对应的英文描述
    private String[] userValue;//保存着用户输入的值
    private String userVSTemp = "";//临时保存着用户输入的值的拼接
    private String eName;
    private String splice;//用户输入的值的拼接
    private Map<String, String[]> checkBoxItems;//复选框选项
    private Map<String, boolean[]> checkBoxBooleans;//是否选中的标志
    private Map<String, String> tempMap;
    private Integer[] num;//类型
    private int numTemp;//临时保存类型
    private Object entity;//对象

    @SuppressWarnings("rawtypes")
    private Class clazz;
    private ListView areaCheckListView;//是复选框dialog的listview
    private DbHelper dbHelper;//数据库帮助类
    private String tag_ID;//取出的标签ID
    private String mission_ID;//取出的任务号
    private String tempInfo;
    @SuppressWarnings("unused")
    private ListView areaRadioListView;//是单选框dialog的listview

    private int radioCheck;//单选框初始值

    /**
     * 构造函数，传入上下文，中英文数据，数据类型,复选框数据，复选框是否选中标志，对象
     */
    public MyBasicAdaptor(Activity activity, MenuDetailUIDomain mDomain) {
        this.mActivity = activity;
        initAdaptor(mDomain);
    }

    //初始化数据
    private void initAdaptor(MenuDetailUIDomain mDomain) {
        //System.out.println("diaoyong init 方法");
        cItems = mDomain.getcItems();
        eItems = mDomain.geteItems();
        checkBoxBooleans = mDomain.getCheckBoxBooleans();
        checkBoxItems = mDomain.getCheckBoxItems();
        type = mDomain.getType();
        num = mDomain.getNum();
        entity = mDomain.getEntity();
        dbHelper = DbHelper.getInstance(mActivity);
        clazz = entity.getClass();
        radioCheck = -1;

        initUserValue();
        //initTempValue();
        tempMap = new HashMap<>();
        Gson gson = new Gson();

        //1先在该对象中取出type，判断是管道还是容器，根据不同的设备添加tag和mission信息
        String type = BeanUtils.getStringFromBean(entity, "scan_type");

        //如果是管道，将管道的id和missionID取出来
        if (type.equals(BaseEntity.SCAN_PIPE_TYPE)) {
            tag_ID = CacheUtils.getString(mActivity, PipeTagLoadPager.PIPE_TAG_ID, null);//无值的话为"0"
            mission_ID = CacheUtils.getString(mActivity, PipeTagLoadPager.PIPE_MISSION_ID, null);
            tempInfo = TempDateUtils.getString(mActivity, "pipebasicInfo", null);//取得从网络获得数据
            if (tempInfo != null) {
                PipeInfo pipeInfo = gson.fromJson(tempInfo, PipeInfo.class);
                //存入数据库
                BeanUtils.setStringToBean(pipeInfo, "scan_Tag_ID", tag_ID);
                BeanUtils.setStringToBean(pipeInfo, "scan_Mission_ID", mission_ID);
                dbHelper.save(pipeInfo);
                //删缓存
                TempDateUtils.deleteTempInfo(mActivity,"pipebasicInfo");
            }
        }
        //如果是容器，将容器id和missionID取出来
        if (type.equals(BaseEntity.SCAN_SESSEL_TYPE)) {
            tag_ID = CacheUtils.getString(mActivity, VesselTagLoadPager.VESSEL_TAG_ID, null);//无值的话为"0"
            mission_ID = CacheUtils.getString(mActivity, VesselTagLoadPager.VESSEL_MISSION_ID, null);
            tempInfo = TempDateUtils.getString(mActivity, "vesselbasicInfo", null);//取得从网络获得数据
            if (tempInfo != null) {
                VesselInfo vesselInfo = gson.fromJson(tempInfo, VesselInfo.class);
                //存入数据库
                BeanUtils.setStringToBean(vesselInfo, "scan_Tag_ID", tag_ID);
                BeanUtils.setStringToBean(vesselInfo, "scan_Mission_ID", mission_ID);
                dbHelper.save(vesselInfo);
                //删缓存
                TempDateUtils.deleteTempInfo(mActivity,"vesselbasicInfo");
            }
        }


        Log.v(TAG, "clazz:" + clazz.getSimpleName());
        Selector selector;
        selector = Selector.from(clazz).where("scan_Tag_ID", "=", tag_ID).and(WhereBuilder.b("scan_Mission_ID", "=", mission_ID));
        if (clazz.getSimpleName().equals(PipeInfo.class.getSimpleName()) || clazz.getSimpleName().equals(VesselInfo.class.getSimpleName())) {
            selector = Selector.from(clazz).where("scan_Tag_ID", "=", tag_ID);
        }
        Object obj = dbHelper.findFirst(selector);
        //Log.v(TAG, "obj:" + obj);
        if (obj != null) {
            //循环遍历
            try {
                clazz = obj.getClass();
                Field[] fields = clazz.getFields();
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
                    tempMap.put(key, value);
                }
                //Log.v(TAG, "tempMap:" + tempMap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }



       /* *
         * 对于多条item属于同一字段的数据
         * 1用，号分割同一测点的数据，2用;分割不同测点之间的数据
         */
        if (num != null && tempMap.get(eItems[num[1]]) != null) {
            List<String> arrList = new ArrayList<>();
            numTemp = num[0];
//            System.out.println("eitems"+eItems[num[1]]);
//            System.out.println(tempMap.get(eItems[num[1]]));
             String[] arr = tempMap.get(eItems[num[1]]).split(",|;");
//            System.out.println(arr.length);
//            System.out.println("qiege");
//            for (String str:arr) {
//                System.out.println(str+",");
//            }
            arrList.addAll(Arrays.asList(arr));
            if (arrList.size() < num[4]) {
                for (int j = arrList.size(); j < num[4]; j++) {
                    arrList.add(j, "");
                }
            }
            for (int i = 0; i < num[4]; i++) {
                if (arrList.get(i).equals("null")) {
                    arrList.set(i, "");
                }
//                if (arr.length < num[4]) {
//                    for (int j = 0; j < num[4] - arr.length; j++) {
//                        arrList.add(arr.length + j, "");
//                    }
//                }
                userValue[numTemp] = arrList.get(i);
                numTemp = numTemp + 1;
            }
            for (int i =0;i<num[0];i++){//将扩展类型前面的加载
               if (eItems[i]!=null&&tempMap.get(eItems[i]) != null){
                   userValue[i] = tempMap.get(eItems[i]);
               }
            }
            for (int i =num[0]+num[4];i<cItems.length;i++){//将扩展类型后面的加载
                if (eItems[i]!=null&&tempMap.get(eItems[i]) != null){
                    userValue[i] = tempMap.get(eItems[i]);
                }
            }
            tempMap.clear();//已经初始化了uservalue 就要清空tempmap
            //Log.v(TAG, "userValue:" + Arrays.toString(userValue));
        }
    }

    @Override
    public int getCount() {
        return cItems.length;
    }

    @Override
    public Object getItem(int position) {
        return cItems[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv;
        EditText et;
        LayoutInflater mInflater = LayoutInflater.from(mActivity);

        if (tempMap.get(eItems[position]) != null) {
            userValue[position] = tempMap.get(eItems[position]);
            tempMap.put(eItems[position], null);
        }

//        for (String str:userValue) {
//            System.out.print(str+",");
//        }
//        System.out.println();

        switch (type[position]) {
            //0代表TextView+EditText的组合
            case 0:
                convertView = mInflater.inflate(R.layout.menu_detail_line, parent, false);
                tv = (TextView) convertView.findViewById(R.id.tv_menu_detail_line);
                et = (EditText) convertView.findViewById(R.id.et_menu_detail_line);

                tv.setText(cItems[position]);//为TextView添加文字信息

                //要为EditText添加初始信息
                if (userValue[position] != null) {
                    et.setText(userValue[position]);
                    BeanUtils.setStringToBean(entity, eItems[position], userValue[position]);
                }
                //当EditText改变时为EditText注册监听器,同时要把值保留下来
                et.addTextChangedListener(new MyWatcher(position, eItems[position]));
                break;
            // 1代表中间的过度过程
            case 1:
                convertView = mInflater.inflate(R.layout.mean_detail_layout_middle, parent, false);
                break;
            //3代表只有TextView
            case 3:
                convertView = mInflater.inflate(R.layout.menu_detail_tv_only, parent, false);
                tv = (TextView) convertView.findViewById(R.id.tv_menu_detail_line);
                tv.setText(cItems[position]);
                break;
            //4代表TextView+大型EditText的组合
            case 4:
                convertView = mInflater.inflate(R.layout.menu_detail_bigline, parent, false);
                tv = (TextView) convertView.findViewById(R.id.tv_menu_detail_bigline);
                et = (EditText) convertView.findViewById(R.id.et_menu_detail_bigline);
                tv.setText(cItems[position]);//为TextView添加文字信息
                //要为EditText添加初始信息
                if (userValue[position] != null) {
                    et.setText(userValue[position]);
                    BeanUtils.setStringToBean(entity, eItems[position], userValue[position]);
                }
                //当EditText改变时为EditText注册监听器,同时要把值保留下来
                et.addTextChangedListener(new MyWatcher(position, eItems[position]));
                break;
            //5代表多选框
            case 5:
                convertView = mInflater.inflate(R.layout.menu_detail_checkbox, parent, false);
                tv = (TextView) convertView.findViewById(R.id.tv_menu_detail_line);
                //要为TextView添加按键监听
                tv.setOnClickListener(new CheckBoxListener(cItems[position], eItems[position], position));
                if (userValue[position] == null) {
                    tv.setText(cItems[position]);
                } else {
                    tv.setText(cItems[position] + "    " + userValue[position]);
                    BeanUtils.setStringToBean(entity, eItems[position], userValue[position]);
                }
                break;
            //6代表单选框
            case 6:
                convertView = mInflater.inflate(R.layout.menu_detail_checkbox, parent, false);
                tv = (TextView) convertView.findViewById(R.id.tv_menu_detail_line);
                //要为TextView添加按键监听
                tv.setOnClickListener(new RadioClickListener(cItems[position], eItems[position], position));
                if (userValue[position] == null) {
                    tv.setText(cItems[position]);
                } else {
                    tv.setText(cItems[position] + "    " + userValue[position]);
                    BeanUtils.setStringToBean(entity, eItems[position], userValue[position]);
                }
                break;
            //7代表日期选择
            case 7:
                convertView = mInflater.inflate(R.layout.menu_detail_datapicker, parent, false);
                tv = (TextView) convertView.findViewById(R.id.tv_menu_detail_line);
                final TextView tvd = (TextView) convertView.findViewById(R.id.tv2_menu_detail_line);
                tv.setText(cItems[position]);
                //要为TextView添加初始信息
                if (userValue[position] != null) {
                    tvd.setText(userValue[position]);
                    BeanUtils.setStringToBean(entity, eItems[position], userValue[position]);
                }
                //要为TextView2t添加点击时间，弹出时间对话框
                tvd.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        MyDatePicker newDialog = MyDatePicker.newInstance(MyDatePicker.DATE_PICKER_DIALOG, tvd);
                        newDialog.show(mActivity.getFragmentManager(), null);
                    }
                });
                //当TextView改变时为TextView注册监听器,同时要把值保留下来
                tvd.addTextChangedListener(new MyWatcher(position, eItems[position]));
                break;
            //8代表数值选择器
            case 8:
                convertView = mInflater.inflate(R.layout.menu_detail_datapicker, parent, false);
                tv = (TextView) convertView.findViewById(R.id.tv_menu_detail_line);
                final TextView tvn = (TextView) convertView.findViewById(R.id.tv2_menu_detail_line);
                tv.setText(cItems[position]);
                //要为TextView添加初始信息
                if (userValue[position] != null) {
                    tvn.setText(userValue[position]);
                    BeanUtils.setStringToBean(entity, eItems[position], userValue[position]);
                }
                //要为TextView2t添加点击时间，弹出时间对话框
                tvn.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        MyNumPicker newDialog = MyNumPicker.newInstance(tvn);
                        newDialog.show(mActivity.getFragmentManager(), null);
                    }
                });
                //当TextView改变时为TextView注册监听器,同时要把值保留下来
                tvn.addTextChangedListener(new MyWatcher(position, eItems[position]));
                break;
            //9代表确定
            case 9:
                convertView = mInflater.inflate(R.layout.menu_detail_button, parent, false);
                Button bt = (Button) convertView.findViewById(R.id.tv_menu_detail_button);
                //要为bt添加按键监听
                //addButtonClickListener(bt);
                bt.setOnClickListener(new View.OnClickListener() {

                    @SuppressLint("SimpleDateFormat")
                    @SuppressWarnings("unchecked")
                    @Override
                    public void onClick(View v) {
                        /**
                         * 将userValue保存
                         * 创建一个用于同步数据的对象
                         * 先在该对象中取出type，根据类型判断是管道还是容器，根据不同的设备取出tag和mission信息
                         * 判断取出的tag和mission是否为空
                         * 根据管道ID，先判断是否有值，再检查ID两项确定在数据库中是否已经存在一个
                         * 如果存在，删除旧的，增加新的，取出描述（用于数据同步），删除dblsit中的旧数据
                         * 如果不存在，直接增加新的
                         * 最后刷新界面，显示成功。
                         */

                        //1先在该对象中取出type，判断是管道还是容器，根据不同的设备添加tag和mission信息
                        String type = BeanUtils.getStringFromBean(entity, "scan_type");

                        //如果是管道，将管道的id和missionID取出来
                        if (type.equals(BaseEntity.SCAN_PIPE_TYPE)) {
                            tag_ID = CacheUtils.getString(mActivity, PipeTagLoadPager.PIPE_TAG_ID, null);//无值的话为"0"
                            mission_ID = CacheUtils.getString(mActivity, PipeTagLoadPager.PIPE_MISSION_ID, null);
                        }
                        //如果是容器，将容器id和missionID取出来
                        if (type.equals(BaseEntity.SCAN_SESSEL_TYPE)) {
                            tag_ID = CacheUtils.getString(mActivity, VesselTagLoadPager.VESSEL_TAG_ID, null);//无值的话为"0"
                            mission_ID = CacheUtils.getString(mActivity, VesselTagLoadPager.VESSEL_MISSION_ID, null);

                            //Log.v(TAG, "tag_ID:" +clazz.getSimpleName()+tag_ID);
                            //TempDateUtils.putString(mActivity, clazz.getSimpleName()+mission_ID, json);
                        }
                        //如果没有值，提示用户需要输入值
                        if (tag_ID == null || mission_ID == null) {
                            Toast.makeText(mActivity, "请先扫描标签并输入任务号", Toast.LENGTH_LONG).show();
                        }
                        //如果有值，将值赋予对象
                        else {
                            BeanUtils.setStringToBean(entity, "scan_Tag_ID", tag_ID);
                            BeanUtils.setStringToBean(entity, "scan_Mission_ID", mission_ID);
                        }

                        /**
                         * 对于多条item属于同一字段的数据
                         * 1用，号分割同一测点的数据，2用;分割不同测点之间的数据
                         */

                        if (num != null) {
                            numTemp = num[0];
                            for (int j = 0; j < num[3]; j++) {
                                for (int i = 0; i < num[2]; i++) {
                                    userVSTemp = userVSTemp + userValue[numTemp];
                                    if (i < num[2] - 1) {
                                        userVSTemp = userVSTemp + ",";
                                    }
                                    numTemp = numTemp + 1;
                                }
                                userVSTemp = userVSTemp + ';';
                            }
                            splice = userVSTemp;
                            userVSTemp = "";
                            //Log.v(TAG, "userVSTempsplice:" +splice);
                            eName = eItems[num[1]];
                            //Log.v(TAG, "eName:" +eName);
                            BeanUtils.setStringToBean(entity, eName, splice);
                        }

                        //System.out.println(map);
                        DBList dbList = new DBList();

                        //dbHelper.drop(clazz);
                        //dbHelper.drop(DBList.class);

                        //建立一张该对象的表（之前不存在）
                        dbHelper.createTableIfNotExist(clazz);
                        dbHelper.createTableIfNotExist(DBList.class);
                       /* if (!clazz.getSimpleName().equals(PipeInfo.class.getSimpleName()) && !clazz.getSimpleName().equals(VesselInfo.class.getSimpleName())) {
                        }*/

                        //判断是否为空
                        if (tag_ID != null && mission_ID != null) {

                            //2:删除之前存在的
                            dbHelper.myDelete(clazz, WhereBuilder.b("scan_Tag_ID", "=", tag_ID)
                                    .and("scan_Mission_ID", "=", mission_ID));//删除原先的对象
                            /**
                             * 删除dblist对象
                             */
                            String db_Description;
                            String method;
                            db_Description = BeanUtils.getStringFromBean(entity, "db_Description");
                            method = BeanUtils.getStringFromBean(entity, "method");
                            dbHelper.myDelete(DBList.class, WhereBuilder.b("scan_Tag_ID", "=", tag_ID)
                                    .and("scan_Mission_ID", "=", mission_ID).and("db_Description", "=", db_Description));
                            dbList.setScan_Tag_ID(tag_ID);
                            dbList.method = method;
                            dbList.setScan_Mission_ID(mission_ID);
                            dbList.setDb_Description(db_Description);
                            dbList.setClassName(clazz.getName());
                            //System.out.println(clazz.getName());
                            //获得当前时间
                            String nowTime = DateUtils.getTime();
                            dbList.setDb_Current_Time(nowTime);

                            //4 增加新的
                            boolean isTrue = dbHelper.save(entity);
                            Log.v(TAG, "entity：" + entity.toString());


                            if (isTrue) {
                                if (!clazz.getSimpleName().equals(PipeConfig.class.getSimpleName()) && !clazz.getSimpleName().equals(VesselConfig.class.getSimpleName())) {
                                    dbHelper.save(dbList);
                                }
                                Toast.makeText(mActivity, "提交成功", Toast.LENGTH_SHORT).show();
                                // 刷新界面
                            } else {
                                Toast.makeText(mActivity, "提交失败", Toast.LENGTH_SHORT).show();
                            }


                        }
                    }
                });
                break;
            default:
                break;
        }
        //Log.v(TAG, "convertView:" +convertView);
        return convertView;
    }


    /**
     * 文本改变时将值给JavaBean
     */
    private class MyWatcher implements TextWatcher {

        private String myEName;
        private int position;

        MyWatcher(int position, String eName) {
            this.myEName = eName;
            this.position = position;
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count,
                                      int after) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            BeanUtils.setStringToBean(entity, myEName, s.toString());
            userValue[position] = s.toString();
        }
    }

    private class CheckBoxListener implements OnClickListener {

        String eName;
        String cName;
        int position;

        CheckBoxListener(String cName, String eName, int position) {
            this.cName = cName;
            this.eName = eName;
            this.position = position;
        }

        @Override
        public void onClick(View v) {
            final String[] areas = checkBoxItems.get(eName);
            final boolean[] areaState = checkBoxBooleans.get(eName + "_Booleans");
            AlertDialog ad = new AlertDialog.Builder(mActivity)
                    .setTitle(cName)
                    .setMultiChoiceItems(areas, areaState, new DialogInterface.OnMultiChoiceClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton, boolean isChecked) {
                            //点击某个区域
                        }
                    }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {
                            //点击确定按钮，这里处理字符串需要与页面处理方式一致
                            //数据的格式：完好,间距不合理,脱落
                            String s = "";//初始为空
                            for (int i = 0; i < areas.length; i++) {
                                if (areaCheckListView.getCheckedItemPositions().get(i)) {
                                    s += areaCheckListView.getAdapter().getItem(i) + ",";
                                } else {
                                    areaCheckListView.getCheckedItemPositions().get(i, false);
                                }
                            }

                            if (s.length() != 0) {
                                s = s.substring(0, s.length() - 1);//去掉最后一位的逗号
                                userValue[position] = "已完成";
                                MyBasicAdaptor.this.notifyDataSetChanged();

                                /**
                                 * 通过反射修改对象的值
                                 */
                                BeanUtils.setStringToBean(entity, eName, s);
                                // System.out.println(entity.toString());

                            }
                            //将点击的条目记忆，下次再次点击的时候保证是有值的
                            checkBoxBooleans.put(eName + "_Booleans", areaState);
                            dialog.dismiss();
                        }
                    }).setNegativeButton("取消", null).create();
            areaCheckListView = ad.getListView();
            ad.show();
        }
    }

    /**
     * 单选弹出菜单窗口
     */
    private class RadioClickListener implements OnClickListener {
        String eName;
        String cName;
        int position;
        RadioOnClick radioOnClick;

        RadioClickListener(String cName, String eName, int position) {
            this.cName = cName;
            this.eName = eName;
            this.position = position;
        }

        @Override
        public void onClick(View v) {
            final String[] areas = checkBoxItems.get(eName);
            radioOnClick = new RadioOnClick(radioCheck, areas, position, eName);
            AlertDialog ad = new AlertDialog.Builder(mActivity).setTitle("选项")
                    .setSingleChoiceItems(areas, radioOnClick.getIndex(), radioOnClick).create();
            ad.show();
        }
    }

    /**
     * 点击单选框事件
     */
    private class RadioOnClick implements DialogInterface.OnClickListener {
        int index;
        String[] areas;
        int position;
        String eName;

        private RadioOnClick(int index, String[] areas, int position, String eName) {
            this.index = index;
            this.areas = areas;
            this.position = position;
            this.eName = eName;
        }

        private void setIndex(int index) {
            this.index = index;
        }

        private int getIndex() {
            return index;
        }

        public void onClick(DialogInterface dialog, int whichButton) {
            setIndex(whichButton);
            userValue[position] = areas[index];
            MyBasicAdaptor.this.notifyDataSetChanged();
            BeanUtils.setStringToBean(entity, eName, areas[index]);
            dialog.dismiss();
        }
    }

    /**
     * 初始化存放用户数据的数据
     */
    private void initUserValue() {
        if (num != null) {
            userValue = new String[cItems.length + num[4]];
        } else {
            userValue = new String[cItems.length];
        }
    }

}
