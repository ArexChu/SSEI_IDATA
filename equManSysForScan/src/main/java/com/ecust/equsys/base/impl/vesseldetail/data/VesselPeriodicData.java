package com.ecust.equsys.base.impl.vesseldetail.data;


import com.ecust.equsys.domain.MenuDetailUIDomain;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselAddTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselAirTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselAmmoniaTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselConclusionTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselGlassSteelLinerTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselGlassSteelTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselGlassTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselGraphiteLinerTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselGraphiteTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselHardTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselHeTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselMacroTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselMagneticTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselMatAna;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselMetTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselPeneTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselPlasticLinerTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselPlasticTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselPreTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselRayDetect;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselSPDTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselSonciTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselTOFDTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselThiCheck;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselThiTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselUltrasonicDetectTest;

import java.util.HashMap;
import java.util.Map;

public class VesselPeriodicData {
	
	 /**
	  * 0代表TextView+EditText的组合
	  * 3代表只有TextView
	  * 6代表单选框
	  * 5代表多选框
	  * 4代表TextView+大型EditText的组合
	  * 7代表日期选择器
	  * 9代表确定
	  * 1代表分隔器
	  * 8代表数值选择器
	  */

	public static MenuDetailUIDomain getTab1Data(){
		String[] cItems = {"压力容器宏观检验记录",
				"结构检验",
				"封头型式", "检验结果", "备注",
				"封头与筒体的连接", "检验结果", "备注",
				"开孔位置及补强", "检验结果", "备注",
				"纵/（环）焊缝的布置及型式", "检验结果", "备注",
				"支承或者支座的型式与布置", "检验结果", "备注",
				"排放（疏水、排污）装置的设置", "检验结果", "备注",
				"几何尺寸检验", "几何尺寸检验",
				"筒体同一断面上最大内径与最小内径之差", "检验结果", "备注",
				"纵/（环）焊缝最大对口错边量(mm)", "检验结果", "备注",
				"纵/（环）焊缝最大棱角度(mm)", "检验结果", "备注",
				"纵/（环）焊缝最大咬边(mm)", "检验结果", "备注",
				"纵/（环）焊缝最大余高(mm)", "检验结果", "备注",
				"壳体外观检验", "壳体外观检验",
				"铭牌和标志", "检验结果", "备注",
				"内外表面的腐蚀", "检验结果", "备注",
				"裂纹、泄漏、鼓包、变形、机械接触损伤、过热", "检验结果", "备注",
				"工卡具焊迹、电弧灼伤", "检验结果", "备注",
				"法兰、密封面及其紧固螺栓", "检验结果", "备注",
				"支承、支座或者基础的下沉、倾斜、开裂", "检验结果", "备注",
				"地脚螺栓", "检验结果", "备注",
				"直立容器和球形容器支柱的铅垂度", "检验结果", "备注",
				"多支座卧式容器的支座膨胀孔", "检验结果", "备注",
				"排放（疏水、排污）装置和泄漏信号指示孔的堵塞、腐蚀、沉积物", "检验结果", "备注",
				"隔热层、衬里检验", "隔热层、衬里检验",
				"隔热脱落、潮湿及层下腐蚀、裂纹", "检验结果", "备注",
				"衬里层的破损、腐蚀、裂纹、脱落及检查孔介质流出情况", "检验结果", "备注",
				"堆焊层的龟裂、剥离和脱落", "检验结果", "备注",
				"其他检验", "其他检验",
				"夹层真空度纹", "检验结果", "备注",
				"日蒸发率", "检验结果", "备注",
				"结果",
				"分析", "校对",
				"提交"};
		String [] eItems = {"压力容器宏观检验记录",
				"结构检验",
				"封头型式","v_Str_1","v_Str_1_Remark",
				"封头与筒体的连接","v_Str_2","v_Str_2_Remark",
				"开孔位置及补强","v_Str_3","v_Str_3_Remark",
				"纵/（环）焊缝的布置及型式","v_Str_4","v_Str_4_Remark",
				"支承或者支座的型式与布置","v_Str_5","v_Str_5_Remark",
				"排放（疏水、排污）装置的设置","v_Str_6","v_Str_5_Remark",
				"几何尺寸检验","几何尺寸检验",
				"筒体同一断面上最大内径与最小内径之差","v_Geo_1","v_Geo_1_Remark",
				"纵/（环）焊缝最大对口错边量(mm)","v_Geo_2","v_Geo_2_Remark",
				"纵/（环）焊缝最大棱角度(mm)","v_Geo_3","v_Geo_3_Remark",
				"纵/（环）焊缝最大咬边(mm)","v_Geo_4","v_Geo_4_Remark",
				"纵/（环）焊缝最大余高(mm)","v_Geo_5","v_Geo_5_Remark",
				"壳体外观检验","壳体外观检验",
				"铭牌和标志","v_Appe_1","v_Appe_1_Remark",
				"内外表面的腐蚀","v_Appe_2","v_Appe_2_Remark",
				"裂纹、泄漏、鼓包、变形、机械接触损伤、过热","v_Appe_3","v_Appe_3_Remark",
				"工卡具焊迹、电弧灼伤","v_Appe_4","v_Appe_4_Remark",
				"法兰、密封面及其紧固螺栓","v_Appe_5","v_Appe_5_Remark",
				"支承、支座或者基础的下沉、倾斜、开裂","v_Appe_6","v_Appe_6_Remark",
				"地脚螺栓","v_Appe_7","v_Appe_7_Remark",
				"直立容器和球形容器支柱的铅垂度","v_Appe_8","v_Appe_8_Remark",
				"多支座卧式容器的支座膨胀孔","v_Appe_9","v_Appe_9_Remark",
				"排放（疏水、排污）装置和泄漏信号指示孔的堵塞、腐蚀、沉积物","v_Appe_10","v_Appe_10_Remark",
				"隔热层、衬里检验","隔热层、衬里检验",
				"隔热脱落、潮湿及层下腐蚀、裂纹","v_Ins_1","v_Ins_1_Remark",
				"衬里层的破损、腐蚀、裂纹、脱落及检查孔介质流出情况","v_Ins_2","v_Ins_2_Remark",
				"堆焊层的龟裂、剥离和脱落","v_Ins_3","v_Ins_3_Remark",
				"其他检验","其他检验",
				"夹层真空度纹","v_Mac_Other_2","v_Mac_Other_1_Remark",
				"日蒸发率","v_Mac_Other_2","v_Mac_Other_2_Remark",
				"v_Mac_Result",
				"v_Mac_Test_Date","v_Mac_Proo_Date",
				"提交"};
		Integer[] type = {3,
				3,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				1,3,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				1,3,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				1,3,
				3,0,0,
				3,0,0,
				3,0,0,
				1,3,
				3,0,0,
				3,0,0,
				4,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselMacroTest.getInstance());

		return m;

	}

	public static MenuDetailUIDomain getTab2Data(){
		String [] cItems = {"壁厚测定记录",
				"测量仪器型号","测量仪器编号","测量仪器精度","耦 合 剂",
				"公称厚度","筒体mm","封头mm",
				"实测最小壁厚","筒体mm","封头mm",
				"表面状况","实测点数",
				"测厚记录","",
				"测定结果",
				"检测","校对",
				"提交"};
		String [] cExpand = {"测点编号","测点厚度(mm)"};

		String [] eItems = {"壁厚测定记录",
				"v_Thi_Equ_Mod","v_Thi_Equ_ID","v_Thi_Equ_Acc","v_Thi_Coup",
				"公称厚度","v_Thi_Barrel","v_Thi_Seal",
				"实测最小壁厚","v_Thi_Min_Barrel","v_Thi_Min_Seal",
				"v_Thi_Surface","v_Thi_Num",
				"","v_Thi_Value",
				"v_Thi_Result",
				"v_Thi_Test_Date","v_Thi_Proo_Date",
				"提交"};
		String[] eExpand = {"universal", "universal"};

		Integer[] type = {3,
				0,0,0,0,
				3,0,0,
				3,0,0,
				0,0,
				3,2,
				6,
				7,7,
				9};
		Integer[] tExpand = {0,0};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.setcExpand(cExpand);
		m.seteItems(eItems);
		m.seteExpand(eExpand);
		m.setType(type);
		m.settExpand(tExpand);
		//是该页面对应的实体类
		m.setEntity(VesselThiTest.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("v_Thi_Result",  new String[]{"合格","不合格"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems,checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;

		return m;

	}

	public static MenuDetailUIDomain getTab3Data(){
		String [] cItems = {"壁厚校核记录",
				"壁厚校核部位","允许/监控使用压力(MPa)","实测内径(mm)",
				"实测最小壁厚(mm)","材料许用应力(MPa)","腐蚀裕量(mm)",
				"焊接接头系数","封头形状系数","允许/监控使用温度(℃)",
				"校核选用标准",
				"校核参数取值说明","壁厚校核计算","校核结果",
				"检测","校对",
				"提交"};
		String [] eItems = {"壁厚校核记录",
				"v_ThiChe_Pos","v_ThiChe_Stress","v_ThiChe_Dia",
				"v_ThiChe_Min","v_ThiChe_Ma_Stress","v_ThiChe_Cor",
				"v_ThiChe_Wel_Coe","v_ThiChe_Seal_Coe","v_ThiChe_Tem",
				"v_ThiChe_Cri",
				"v_ThiChe_Coe","v_ThiChe_Cal","v_ThiChe_Result",
				"v_ThiChe_Test_Date","v_ThiChe_Proo_Date",
				"提交"};
		Integer[] type = {3,
				0,0,0,
				0,0,0,
				0,0,0,
				0,
				4,4,4,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselThiCheck.getInstance());

		return m;

	}

	public static MenuDetailUIDomain getTab4Data(){
		String [] cItems = {"射线检测记录",
				"源种类","增感方式","探伤机型号","仪器编号",
				"管电压/源活度(KV/Ci)","管电流(mA)","象质计型号","象质计指数",
				"透照方式","曝光时间(min)","焦 距(min)","焦点尺寸(min)",
				"胶片类型","底片黑度","检测标准","检测比例、长度",
				"检 测 底 片 评 定 表","",
				"评片结果",
				"检测人员","检测时间","评片","校对",
				"提交"};
		String [] cExpand = {"底片编号","一次透照长度(mm)","缺陷位置","缺陷性质及缺陷尺寸(mm)","评定","备注"};

		String [] eItems = {"射线检测记录",
				"v_Radio_Type","v_Radio_Sen_Mode","v_Radio_Det","v_Radio_Equ_ID",
				"v_Radio_Tube_Voltage","v_Radio_Tube_Current","v_Radio_Iqi_Mod","v_Radio_Iqi_Coe",
				"v_Radio_Tran_Mode","v_Radio_Expo","v_Radio_Focal_Dis","v_Radio_Focal_Size",
				"v_Radio_Film_Type","v_Radio_Film_Density","v_Radio_Cri","v_Radio_Ration",
				"检 测 底 片 评 定 表","v_Radio_value",
				"v_Radio_Result",
				"v_Radio_Per","v_Radio_Per_Date","v_Radio_Date","v_Radio_Check_Date",
				"提交"};
		String[] eExpand = {"universal", "universal","universal", "universal","universal", "universal"};

		Integer[] type = {3,
				6,0,0,0,
				0,0,0,0,
				0,0,0,0,
				0,0,0,0,
				3,2,
				4,
				0,7,7,7,
				9};
		Integer[] tExpand = {0,0,0,0,0,0};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.setcExpand(cExpand);
		m.seteItems(eItems);
		m.seteExpand(eExpand);
		m.setType(type);
		m.settExpand(tExpand);
		//是该页面对应的实体类
		m.setEntity(VesselRayDetect.getInstance());


		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("v_Radio_Type",  new String[]{"X射线","Ir192","Co60","其他"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems,checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static MenuDetailUIDomain getTab5Data(){
		String [] cItems = {"超声检测记录",
				"检测仪器型号","检测仪器编号","探头型号","试块型号及编号",
				"评定灵敏度(dB)","检测方法/扫查面","耦 合 剂","补 偿(dB)",
				"检测标准","检测比例、长度",
				"检 测 结 果 评 定 表","",
				"检测结果",
				"检验","校对",
				"提交"};
		String [] cExpand = {"区段编号","缺陷位置","缺陷埋藏深度(mm)","缺陷指示长度(mm)","缺陷高度(mm)","缺陷反射波幅","评定级别","备注"};

		String [] eItems = {"超声检测记录",
				"v_Ult_Inst_Model","v_Ult_Inst_ID","v_Ult_Head_Type","v_Ult_Block_Type",
				"v_Ult_Eva_Sens","v_Ult_Det_Method","v_Ult_Coup","v_Ult_Compen",
				"v_Ult_Det_Cri","v_Ult_Det_Ration",
				"检 测 结 果 评 定 表","v_Ult_Value",
				"v_Ult_Result",
				"v_Ult_Date","v_Ult_Check_Date",
				"提交"};
		String[] eExpand = {"universal", "universal","universal", "universal","universal", "universal","universal", "universal"};

		Integer[] type = {3,
				0,0,0,0,
				0,0,0,0,
				0,0,
				3,2,
				4,
				7,7,
				9};
		Integer[] tExpand = {0,0,0,0,0,0,0,0};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.setcExpand(cExpand);
		m.seteItems(eItems);
		m.seteExpand(eExpand);
		m.setType(type);
		m.settExpand(tExpand);
		//是该页面对应的实体类
		m.setEntity(VesselUltrasonicDetectTest.getInstance());

		return m;
	}

	public static MenuDetailUIDomain getTab6Data(){
		String [] cItems = {"衍射时差法（TOFD）超声检测记录",
				"检测仪器型号","检测仪器编号","探头型号","试块型号及编号",
				"评定灵敏度(dB)","检测方法/扫查面","耦 合 剂","补 偿(dB)",
				"检测标准","检测比例、长度",
				"通道一",
				"探头频率","晶片尺寸","楔块角度","探头中心间距","探头延迟","检测范围","对比试块",
				"通道二",
				"探头频率","晶片尺寸","楔块角度","探头中心间距","探头延迟","检测范围","对比试块",
				"通道三",
				"探头频率","晶片尺寸","楔块角度","探头中心间距","探头延迟","检测范围","对比试块",
				"通道四",
				"探头频率","晶片尺寸","楔块角度","探头中心间距","探头延迟","检测范围","对比试块",
				"通道间距",
				"探头频率","晶片尺寸","楔块角度","探头中心间距","探头延迟","检测范围","对比试块",
				"检 测 结 果 评 定 表","",
				"检测结果",
				"检验","校对",
				"提交"};
		String [] cExpand = {"区段编号","缺陷位置","缺陷埋藏深度(mm)","缺陷指示长度(mm)","缺陷高度(mm)","缺陷反射波幅","评定级别","备注"};

		String [] eItems = {"衍射时差法（TOFD）超声检测记录",
				"v_TOFD_Equ_Model","v_TOFD_Equ_ID","v_TOFD_Head_Type","v_TOFD_Block_Type",
				"v_TOFD_Eva_Sens","v_TOFD_Det_Method","v_TOFD_Coup","v_TOFD_Compen",
				"v_TOFD_Det_Cri","v_TOFD_Det_Ration",
				"v_TOFD_Cha_1",
				"探头频率","晶片尺寸","楔块角度","探头中心间距","探头延迟","检测范围","对比试块",
				"v_TOFD_Cha_2",
				"探头频率","晶片尺寸","楔块角度","探头中心间距","探头延迟","检测范围","对比试块",
				"v_TOFD_Cha_3",
				"探头频率","晶片尺寸","楔块角度","探头中心间距","探头延迟","检测范围","对比试块",
				"v_TOFD_Cha_4",
				"探头频率","晶片尺寸","楔块角度","探头中心间距","探头延迟","检测范围","对比试块",
				"v_TOFD_Cha_Dis",
				"探头频率","晶片尺寸","楔块角度","探头中心间距","探头延迟","检测范围","对比试块",
				"检 测 结 果 评 定 表","v_TOFD_Value",
				"v_TOFD_Result",
				"v_TOFD_Date","v_TOFD_Check_Date",
				"提交"};
		String[] eExpand = {"universal", "universal","universal", "universal","universal", "universal","universal", "universal"};

		Integer[] type =  {3,
				0,0,0,0,
				0,0,0,0,
				0,0,
				3,
				0,0,0,0,0,0,0,
				3,
				0,0,0,0,0,0,0,
				3,
				0,0,0,0,0,0,0,
				3,
				0,0,0,0,0,0,0,
				3,
				0,0,0,0,0,0,0,
				3,2,
				4,
				7,7,
				9};
		Integer[] tExpand = {0,0,0,0,0,0,0,0};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.setcExpand(cExpand);
		m.seteItems(eItems);
		m.seteExpand(eExpand);
		m.setType(type);
		m.settExpand(tExpand);
		//是该页面对应的实体类
		m.setEntity(VesselTOFDTest.getInstance());

		return m;

	}

	public static MenuDetailUIDomain getTab7Data(){
		String [] cItems = {"磁粉检测记录",
				"检测仪器型号","检测仪器编号","磁粉类型","磁 悬 液",
				"灵敏度试片","磁化方法","提升力/磁化电流","喷洒方法",
				"检测标准","检测比例、长度",
				"检 测 结 果 评 定 表","",
				"检测结果",
				"评片","校对",
				"提交"};
		String [] cExpand = {"区段编号","缺陷位置","缺陷磁痕尺寸(mm)","缺陷性质","缺陷高度(mm)","评定","备注"};

		String [] eItems = {"磁粉检测记录",
				"v_Mag_Equ_Model","v_Mag_Equ_ID","v_Mag_Mod","v_Mag_Sus",
				"v_Mag_Sens","v_Mag_Method","v_Mag_Cur","v_Mag_Spr",
				"v_Mag_Cri","v_Mag_Len",
				"检 测 结 果 评 定 表","v_Mag_Value",
				"v_Mag_Result",
				"v_Mag_Date","v_Mag_Check_Date",
				"提交"};
		String[] eExpand = {"universal", "universal","universal", "universal","universal", "universal","universal"};

		Integer[] type = {3,
				0,0,0,0,
				0,0,0,0,
				0,0,
				3,2,
				4,
				7,7,
				9};
		Integer[] tExpand = {0,0,0,0,0,0,0};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.setcExpand(cExpand);
		m.seteItems(eItems);
		m.seteExpand(eExpand);
		m.setType(type);
		m.settExpand(tExpand);
		//是该页面对应的实体类
		m.setEntity(VesselMagneticTest.getInstance());

		return m;

	}

	public static MenuDetailUIDomain getTab8Data(){
		String [] cItems = {"渗透检测记录",
				"渗透剂型号","表面状况","清洗剂型号","环境温度(℃)",
				"显像剂型号","对比试块及编号","渗透时间(Min)","显像时间(Min)",
				"检测标准","检测比例、长度",
				"检 测 结 果 评 定 表","",
				"检测结果",
				"分析","校对",
				"提交"};
		String [] cExpand = {"区段编号","缺陷位置","缺陷磁痕尺寸(mm)","缺陷性质","评定","备注"};

		String [] eItems = {"渗透检测记录",
				"v_Perm_JFC","v_Perm_Surface","v_Perm_Clean","v_Perm_Tem",
				"v_Perm_Image","v_Perm_Contrast","v_Perm_JFC_Time","v_Perm_Image_Time",
				"v_Perm_Cri","v_Perm_Len",
				"检 测 结 果 评 定 表","v_Perm_Value",
				"v_Perm_Result",
				"v_Perm_Date","v_Perm_Check_Date",
				"提交"};
		String[] eExpand = {"universal", "universal","universal", "universal","universal", "universal"};

		Integer[] type = {3,
				0,0,0,0,
				0,0,0,0,
				0,0,
				3,2,
				4,
				7,7,
				9};
		Integer[] tExpand = {0,0,0,0,0,0};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.setcExpand(cExpand);
		m.seteItems(eItems);
		m.seteExpand(eExpand);
		m.setType(type);
		m.settExpand(tExpand);
		//是该页面对应的实体类
		m.setEntity(VesselPeneTest.getInstance());

		return m;
	}

	public static MenuDetailUIDomain getTab9Data(){
		String [] cItems = {"声发射检测记录",
				"检测标准","试验压力(MPa)","仪器型号",
				"检测方式","检测频率","仪器编号",
				"传感器型号","固定方式","耦合剂",
				"传感器数量","传感器平均灵敏度(DB)","最小灵敏度(DB)",
				"背景噪声(DB)","门槛电平(DB)","最大灵敏度(DB)",
				"增 益(DB)","模拟源","传感器最大间距(mm)",
				"模拟源距离(m)","衰减测量传感器号(DB)","信号幅度(DB)",
				"检测结果及评定",
				"检测","校对",
				"提交"};
		String [] eItems = {"声发射检测记录",
				"v_Sonic_Cri","v_Sonic_Pre","v_Sonic_Equ_Type",
				"v_Sonic_Method","v_Sonic_Fre","v_Sonic_Equ_ID",
				"v_Sonic_Sensor","v_Sonic_Fixed_Mode","v_Sonic_Coup",
				"v_Sonic_Sensor_Num","v_Sonic_Sensor_Sens","v_Sonic_Sensor_Min",
				"v_Sonic_Noise","v_Sonic_Thr","v_Sonic_Sensor_Max",
				"v_Sonic_Gain","v_Sonic_Source","v_Sonic_Sensor_Dis",
				"v_Sonic_Source_Dis","v_Sonic_Sensor_ID","v_Sonic_Amp",
				"v_Sonic_Result",
				"v_Sonic_Date","v_Sonic_Check_Date",
				"提交"};
		Integer[] type = {3,
				0,0,0,
				0,0,0,
				0,0,0,
				0,0,0,
				0,0,0,
				0,0,0,
				0,0,0,
				4,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselSonciTest.getInstance());

		return m;

	}

	public static MenuDetailUIDomain getTab10Data(){
		String [] cItems = {"材料成分分析记录",
				"取样方法","检测部位","仪器型号","仪器编号",
				"分析方法","分析方法标准",
				"元素1","元素2","元素3","元素4","元素5","元素6","元素7","元素8",
				"",
				"分析结果",
				"分析","校对",
				"提交"};
		String [] cExpand = {"序号","取样位置","标称材质","元素1含量（%）","元素2含量（%）","元素3含量（%）",
				"元素4含量（%）","元素5含量（%）","元素6含量（%）","元素7含量（%）","元素8含量（%）","备注"};

		String [] eItems = {"材料成分分析记录",
				"v_Mat_Samp_Method","v_Mat_Part","v_Mat_Equ_Mode","v_Mat_Equ_ID",
				"v_Mat_Ana_Method","v_Mat_Ana_Cri",
				"v_Mat_Ele_1","v_Mat_Ele_2","v_Mat_Ele_3","v_Mat_Ele_4","v_Mat_Ele_5","v_Mat_Ele_6","v_Mat_Ele_7","v_Mat_Ele_8",
				"v_Mat_Value",
				"v_Mat_Result",
				"v_Mat_Date","v_Mat_Check_Date",
				"提交"};
		String[] eExpand = {"universal", "universal","universal", "universal","universal", "universal",
				"universal", "universal","universal", "universal","universal", "universal"};

		Integer[] type = {3,
				0,0,0,0,
				0,0,
				0,0,0,0,0,0,0,0,
				2,
				4,
				7,7,
				9};
		Integer[] tExpand = {0,0,0,0,0,0,
				0,0,0,0,0,0};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.setcExpand(cExpand);
		m.seteItems(eItems);
		m.seteExpand(eExpand);
		m.setType(type);
		m.settExpand(tExpand);
		//是该页面对应的实体类
		m.setEntity(VesselMatAna.getInstance());

		return m;
	}

	public static MenuDetailUIDomain getTab11Data(){
		String [] cItems = {"硬度检测记录",
				"检测仪器型号","检测仪器编号","主体材质","热处理状态",
				"检测标准","硬度单位",
				"检 测 底 片 评 定 表","",
				"检测结果",
				"检验","校对",
				"提交"};
		String [] cExpand = {"测点编号","测点硬度","测点位置"};

		String [] eItems = {"硬度检测记录",
				"v_Hard_Equ_Mode","v_Hard_Equ_ID","v_Hard_Mat","v_Hard_Heat",
				"v_Hard_Cri","v_Hard_Unit",
				"检 测 底 片 评 定 表","v_Hard_Value",
				"v_Hard_Result",
				"v_Hard_Date","v_Hard_Check_Date",
				"提交"};
		String [] eExpand = {"universal","universal","universal"};

		Integer [] type = {3,
				0,0,0,0,
				0,0,
				3,2,
				4,
				7,7,
				9};
		Integer [] tExpand = {0,0,0};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.setcExpand(cExpand);
		m.seteItems(eItems);
		m.seteExpand(eExpand);
		m.setType(type);
		m.settExpand(tExpand);
		//是该页面对应的实体类
		m.setEntity(VesselHardTest.getInstance());

		return m;
	}

	public static MenuDetailUIDomain getTab12Data(){
		String [] cItems = {"金相分析记录",
				"分析仪器型号","分析仪器编号","腐蚀方法","抛光方法",
				"执行标准","金相组织","主体材质","热处理状态",
				"分析结果：",
				"分析","校对",
				"提交"};

		String [] eItems = {"金相分析记录",
				"v_Met_Equ_Mode","v_Met_Equ_ID","v_Met_Cor","v_Met_Pol",
				"v_Met_Cri","v_Met_Part","v_Met_Mat","v_Met_Heat",
				"v_Met_Result",
				"v_Met_Date","v_Met_Check_Date",
				"提交"};

		Integer [] type = {0,
				0,0,0,0,
				0,0,0,0,
				4,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselMetTest.getInstance());

		return m;
	}

	public static MenuDetailUIDomain getTab13Data(){
		String [] cItems = {"安全附件检验记录",
				"安全阀",
				"型 号","数 量","校验日期","密封压力(MPa)",
				"整定压力(MPa)","安装位置",
				"爆破片装置","爆破片装置",
				"型 号","数 量","规 格","更换周期要求",
				"更换日期","安装位置",
				"压力表","压力表",
				"量程(MPa)","数 量","精度","检定日期",
				"检定报告编号","安装位置",
				"紧急切断装置","紧急切断装置",
				"型式及规格","数 量","耐压试验压力(MPa)","密闭试验压力(MPa)",
				"切断时间(S)","检修记录","安装位置","外 观",
				"液位（面）计","液位（面）计",
				"型 式","数 量","容器充装量(m3)","安装位置",
				"外 观","误 差",
				"测温仪表","测温仪表",
				"型 号","有效期","外观",
				"气相软管","气相软管",
				"试验压力(MPa)","试验介质","保压时间(min)",
				"液相软管","液相软管",
				"试验压力(MPa)","试验介质","保压时间(min)",
				"其他阀门、附件检验","检验结果",
				"检测","校对",
				"提交"};
		String [] eItems = {"安全附件检验记录",
				"安全阀",
				"v_Valve_Type","v_Valve_Num","v_Valve_Check_Date","v_Valve_Seal_Pre)",
				"v_Valve_Set_Pre","v_Valve_Pos",
				"爆破片装置","爆破片装置",
				"v_Rup_Type","v_Rup_Num","v_Rup_Spe","v_Rup_Replace_Fre",
				"v_Rup_Replace_Date","v_Rup_Pos",
				"压力表","压力表",
				"v_PreGage_Range","v_PreGage_Num","v_PreGage_Acc","v_PreGage_Date",
				"v_PreGage_Rep_ID","v_PreGage_Pos",
				"紧急切断装置","紧急切断装置",
				"v_ECOF_Type","v_ECOF_Num","v_ECOF_Pre","v_ECOF_Airt",
				"v_ECOF_Cut","v_ECOF_Man","v_ECOF_Pos","v_ECOF_Appe",
				"液位（面）计","液位（面）计",
				"v_CG_Type","v_CG_Num","v_CG_Content","v_CG_Pos",
				"v_CG_Appe","v_CG_Error",
				"测温仪表","测温仪表",
				"v_Tem_Type","v_Tem_Valid_Date","v_Tem_Appe",
				"气相软管","气相软管",
				"v_AH_Pre","v_AH_Med","v_AH_Time",
				"液相软管","液相软管",
				"v_LPH_Pre","v_LPH_Med","v_LPH_Time",
				"v_SPD_Others","v_SPD_Result",
				"v_SPD_Date","v_SPD_Check_Date",
				"提交"};
		Integer[] type = {3,
				3,
				3,
				0,0,7,0,
				0,0,
				1,3,
				0,0,0,0,
				7,0,
				1,3,
				0,0,0,7,
				0,0,
				1,3,
				0,0,0,0,
				0,0,0,0,
				1,3,
				0,0,0,0,
				0,0,
				1,3,
				0,7,0,
				1,3,
				0,0,0,
				1,3,
				0,0,0,
				4,4,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselSPDTest.getInstance());

		return m;

	}

	public static MenuDetailUIDomain getTab14Data(){
		String [] cItems = {"耐压试验记录",
				"设计压力(MPa)","允许/监控使用压力(MPa)","试验压力(MPa)","主体材质",
				"试验介质","介质温度(℃)","试压部位","环境温度(℃)",
				"压力表量程(MPa)","压力表精度(级)",
				"机泵型号","试验前应力校核结果",
				"试验程序记录","试验程序记录",
				"缓慢升压至试验压力(MPa)","保压(min)","缓慢降压至最高工作压力(MPa)","保压(min)",
				"检验容器","渗漏","可见的变形","异常的响声",
				"试验结果",
				"分析","校对",
				"提交"};
		String [] eItems = {"耐压试验记录",
				"v_Pre_De","v_Pre_Permission","v_Pre_Test_Pre","v_Pre_De_Main_Mat",
				"v_Pre_Med","v_Pre_Med_Tem","v_Pre_Part","v_Pre_Tem",
				"v_Pre_Range","v_Pre_Acc",
				"v_Pre_Type","v_Pre_Check_Stress",
				"试验程序记录","试验程序记录",
				"v_Pre_Process","v_Pre_Process","v_Pre_Process","v_Pre_Process",
				"v_Pre_Process","v_Pre_Process","v_Pre_Process","v_Pre_Process",
				"v_Pre_Result",
				"v_Pre_Date","v_Pre_Check_Date",
				"提交"};
		Integer[] type = {3,
				0,0,0,0,
				0,0,0,0,
				0,0,
				0,0,
				1,3,
				0,0,0,0,
				0,0,0,0,
				6,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselPreTest.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("v_Pre_Result",  new String[]{"合格","不合格"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems,checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static MenuDetailUIDomain getTab15Data(){
		String [] cItems = {"气密性试验记录",
				"设计压力(MPa)","允许/监控使用压力(MPa)","耐压试验压力(MPa)","气密性试验压力",
				"试验介质","介质温度(℃)","环境温度","容积",
				"压缩机型号及编号","安全阀型号及编号","压力表量程(MPa)","压力表精度(级)",
				"试验部位",
				"试验程序记录","试验程序记录",
				"缓慢升压至试验压力(MPa)","保压(min)",
				"检验容器及连接部位()渗漏","()异常现象",
				"试验结果",
				"备注",
				"检验","校对",
				"提交"};
		String [] eItems = {"气密性试验记录",
				"v_Air_De_Pre","v_Air_Permission_Pre","v_Air_Pre_Pre","v_Air_Pre",
				"v_Air_Med","v_Air_Med_Tem","v_Air_Tem","v_Air_Volume",
				"v_Air_Comp_Type","v_Air_Valve_Type","v_Air_Range","v_Air_Acc",
				"v_Air_Part",
				"试验程序记录","试验程序记录",
				"v_Air_Process","v_Air_Process",
				"v_Air_Process","v_Air_Process",
				"v_Air_Result",
				"v_Air_Remark",
				"v_Air_Date","v_Air_Check_Date",
				"提交"};
		Integer[] type = {3,
				0,0,0,0,
				0,0,0,0,
				0,0,0,0,
				0,
				1,3,
				0,0,
				0,0,
				6,
				4,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselAirTest.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("v_Air_Result",  new String[]{"合格","不合格"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems,checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static MenuDetailUIDomain getTab16Data(){
		String [] cItems = {"氨检漏试验记录",
				"设计压力(MPa)","氨浓度","压力表量程(MPa)","压力表精度(级)",
				"环境温度(℃)","试纸（试剂","保压时间(min)","试验部位",
				"试验结果",
				"检验","校对",
				"提交"};
		String [] eItems = {"氨检漏试验记录",
				"v_Amm_De_Pre","v_Amm_Level","v_Amm_Range","v_Amm_Acc",
				"v_Amm_Tem","v_Amm_Test","v_Amm_Keep_Tem","v_Amm_Part",
				"v_Amm_Result",
				"v_Amm_Date","v_Amm_Check_Date",
				"提交"};
		Integer[] type = {3,
				0,0,0,0,
				0,0,0,0,
				4,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselAmmoniaTest.getInstance());
		
		return m;

	}

	public static MenuDetailUIDomain getTab17Data(){
		String [] cItems = {"氦、卤素检漏试验记录",
				"仪器型号","仪器编号","仪器精度量程","检测方式",
				"试漏气体","试验压力(MPa)","保压时间(min)","泄漏率(Paml/s)",
				"试验部位",
				"试验结果",
				"检验","校对",
				"提交"};
		String [] eItems =  {"氦、卤素检漏试验记录",
				"v_He_Equ_Mod","v_He_Equ_ID","v_He_Equ_Acc","v_He_Test_Method",
				"v_He_Type","v_He_Pre","v_He_Keep","v_He_Ration",
				"v_He_Part",
				"v_He_Result",
				"v_He_Date","v_He_Check_Date",
				"提交"};
		Integer[] type =  {3,
				0,0,0,0,
				0,0,0,0,
				0,
				4,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselHeTest.getInstance());

		return m;

	}

	public static MenuDetailUIDomain getTab18Data(){
		String [] cItems = {"附加检验记录",
				"导 静 电 装 置 检 验",
				"测试仪器型号","仪器精度","导静电电阻(Ω)","连接处电阻(Ω)",
				"绝 热 层 真 空 度 检 测","绝 热 层 真 空 度 检 测",
				"真空仪型号","仪器精度","空载时真空度(Pa)","承载时真空度(Pa)",
				"绝 热 层 真 空 度 检 测","绝 热 层 真 空 度 检 测",
				"真空泵型号","抽真空时间(h)","置换介质","置换压力",
				"排放后罐内压力(MPa)","罐内气体含氧量(≤3%)","罐内真空度(Pa)",
				"腐 蚀 介 质 含 量 测 定","腐 蚀 介 质 含 量 测 定",
				"介质名称","腐蚀介质成分","腐蚀介质含量(%)","腐蚀速度(mm/y)",
				"腐蚀机理",
				"其他检验、检测",
				"试验结果",
				"检验","校对",
				"提交"};
		String [] eItems = {"附加检验记录",
				"导 静 电 装 置 检 验",
				"v_Sta_Ele_ID","v_Sta_Ele_Acc","v_Sta_Ele_Res","v_Sta_Ele_Connection",
				"绝 热 层 真 空 度 检 测","绝 热 层 真 空 度 检 测",
				"v_Add_Ins_Type","v_Add_Ins_Acc","v_Add_Ins_Degree","v_Add_Ins_Degree1",
				"绝 热 层 真 空 度 检 测","绝 热 层 真 空 度 检 测",
				"v_Tank_Type","v_Tank_Time","v_Tank_Med","v_Tank_Pre",
				"v_Tank_Discharge_Pre","v_Tank_Content","v_Tank_Degree",
				"腐 蚀 介 质 含 量 测 定","腐 蚀 介 质 含 量 测 定",
				"v_Cor_Name","v_Cor_Compon","v_Cor_Content","v_Cor_Speed",
				"v_Cor_Reason",
				"v_Add_Others",
				"v_Add_Result",
				"v_Add_Date","v_Add_Check_Date",
				"提交"};
		Integer[] type = {3,
				3,
				0,0,0,0,
				1,3,
				0,0,0,0,
				1,3,
				0,0,0,0,
				0,0,0,
				1,3,
				0,0,0,0,
				0,
				4,
				6,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselAddTest.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("v_Add_Result",  new String[]{"合格","不合格"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems,checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static MenuDetailUIDomain getTab19Data(){
		String [] cItems = {"搪玻璃压力容器搪玻璃层定期检验记录",
				"铭牌和标志检验","检验结果","备注",
				"搪玻璃层检验","搪玻璃层检验",
				"表面检验","检验结果","备注",
				"直流高电压试验10kV","检验结果","备注",
				"厚度测定","检验结果","备注",
				"附件与部件检验","附件与部件检验",
				"卡子、活套法兰、压力表、液面计、温度计","检验结果","备注",
				"密封面、密封垫片、结构层","检验结果","备注",
				"放料阀、孔板防腐层","检验结果","备注",
				"夹套介质进口管口挡板检验","夹套介质进口管口挡板检验",
				"检验结果","备注",
				"搪玻璃层修复部位检验","搪玻璃层修复部位检验",
				"检验结果","备注",
				"说明",
				"检验","校对",
				"提交"};
		String [] eItems = {"搪玻璃压力容器搪玻璃层定期检验记录",
				"铭牌和标志检验","v_Gla_Result1","v_Gla_Remark1",
				"搪玻璃层检验","搪玻璃层检验",
				"表面检验","v_Gla_Result2","v_Gla_Remark2",
				"直流高电压试验10kV","v_Gla_Result3","v_Gla_Remark3",
				"厚度测定","v_Gla_Result4","v_Gla_Remark4",
				"附件与部件检验","附件与部件检验",
				"卡子、活套法兰、压力表、液面计、温度计","v_Gla_Result5","v_Gla_Remark5",
				"密封面、密封垫片、结构层","v_Gla_Result6","v_Gla_Remark6",
				"放料阀、孔板防腐层","v_Gla_Result7","v_Gla_Remark7",
				"夹套介质进口管口挡板检验","夹套介质进口管口挡板检验",
				"v_Gla_Result8","v_Gla_Remark8",
				"搪玻璃层修复部位检验","搪玻璃层修复部位检验",
				"v_Gla_Result9","v_Gla_Remark9",
				"v_Gla_Explain",
				"v_Gla_Date","v_Gla_Check_Date",
				"提交"};
		Integer[] type = {3,
				3,0,0,
				1,3,
				3,0,0,
				3,0,0,
				3,0,0,
				1,3,
				3,0,0,
				3,0,0,
				3,0,0,
				1,3,
				0,0,
				1,3,
				0,0,
				4,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselGlassTest.getInstance());

		return m;

	}
	public static MenuDetailUIDomain getTab20Data(){
		String [] cItems = {"石墨压力容器定期检验记录附页",
				"铭牌和标志检验","检验结果","备注",
				"表面检验","表面检验",
				"容器筒体、侧盖板、上下盖板变形与腐蚀","检验结果","备注",
				"石墨件表面腐蚀、磨损、分层、掉块、裂纹","检验结果","备注",
				"石墨件粘接部位的粘接剂，粘接部位腐蚀、开裂和渗漏","检验结果","备注",
				"法兰密封面检验","法兰密封面检验",
				"检验结果","备注",
				"附件检验（阀门、压力表、液面计、温度计、防腐层）","附件检验（阀门、压力表、液面计、温度计、防腐层）",
				"检验结果","备注",
				"说明",
				"检验","校对",
				"提交"};
		String [] eItems = {"石墨压力容器定期检验记录附页",
				"铭牌和标志检验","v_Grap_Result1","v_Grap_Remark1",
				"表面检验","表面检验",
				"容器筒体、侧盖板、上下盖板变形与腐蚀","v_Grap_Result2","v_Grap_Remark2",
				"石墨件表面腐蚀、磨损、分层、掉块、裂纹","v_Grap_Result3","v_Grap_Remark3",
				"石墨件粘接部位的粘接剂，粘接部位腐蚀、开裂和渗漏","v_Grap_Result4","v_Grap_Remark4",
				"法兰密封面检验","法兰密封面检验",
				"v_Grap_Result5","v_Grap_Remark5",
				"附件检验（阀门、压力表、液面计、温度计、防腐层）","附件检验（阀门、压力表、液面计、温度计、防腐层）",
				"v_Grap_Result6","v_Grap_Remark6",
				"v_Grap_Explain",
				"v_Grap_Date","v_Grap_Check_Date",
				"提交"};
		Integer[] type = {3,
				3,0,0,
				1,3,
				3,0,0,
				3,0,0,
				3,0,0,
				1,3,
				0,0,
				1,3,
				0,0,
				4,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselGraphiteTest.getInstance());

		return m;

	}

	public static MenuDetailUIDomain getTab21Data(){
		String [] cItems = {"石墨衬里压力容器定期检验记录附页",
				"铭牌和标志检验","检验结果","备注",
				"表面检验","表面检验",
				"石墨衬里层腐蚀、磨损、剥落、裂纹、鼓包、与金属基体粘接","备注",
				"法兰密封面检验","法兰密封面检验",
				"检验结果","备注",
				"附件检验（阀门、压力表、液面计、温度计、防腐层）","附件检验（阀门、压力表、液面计、温度计、防腐层）",
				"检验结果","备注",
				"说明",
				"检验","校对",
				"提交"};
		String [] eItems = {"石墨衬里压力容器定期检验记录附页",
				"铭牌和标志检验","v_GraL_Result1","v_GraL_Remark1",
				"表面检验","表面检验",
				"v_GraL_Result2","v_GraL_Remark2",
				"法兰密封面检验","法兰密封面检验",
				"v_GraL_Result3","v_GraL_Remark3",
				"附件检验（阀门、压力表、液面计、温度计、防腐层）","附件检验（阀门、压力表、液面计、温度计、防腐层）",
				"v_GraL_Result4","v_GraL_Remark4",
				"v_GraL_Explain",
				"v_GraL_Date","v_GraL_Check_Date",
				"提交"};
		Integer[] type = {3,
				3,0,0,
				1,3,
				3,0,
				1,3,
				0,0,
				1,3,
				0,0,
				4,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselGraphiteLinerTest.getInstance());

		return m;

	}

	public static MenuDetailUIDomain getTab22Data(){
		String [] cItems = {"玻璃钢压力容器定期检验记录附页",
				"铭牌和标志检验","检验结果","备注",
				"外表面检验","检验结果","备注",
				"内表面检验","检验结果","备注",
				"连接部位检验","检验结果","备注",
				"附件防腐层检验","检验结果","备注",
				"说明",
				"检验","校对",
				"提交"};
		String [] eItems = {"玻璃钢压力容器定期检验记录附页",
				"铭牌和标志检验","v_GlaS_Result1","v_GlaS_Remark1",
				"外表面检验","v_GlaS_Result2","v_GlaS_Remark2",
				"内表面检验","v_GlaS_Result3","v_GlaS_Remark3",
				"连接部位检验","v_GlaS_Result4","v_GlaS_Remark4",
				"附件防腐层检验","v_GlaS_Result5","v_GlaS_Remark5",
				"v_GlaS_Explain",
				"v_GlaS_Date","v_GlaS_Check_Date",
				"提交"};
		Integer[] type = {3,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				4,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselGlassSteelTest.getInstance());

		return m;

	}

	public static MenuDetailUIDomain getTab23Data(){
		String [] cItems = {"玻璃钢衬里压力容器定期检验记录附页",
				"铭牌和标志检验","检验结果","备注",
				"衬里表面检验","检验结果","备注",
				"衬里鼓包、与基体分离情况检验","检验结果","备注",
				"连接部位检验","检验结果","备注",
				"附件防腐层检验","检验结果","备注",
				"玻璃钢层厚度测定","检验结果","备注",
				"说明",
				"检验","校对",
				"提交"};
		String [] eItems = {"铭牌和标志检验","v_GlaSL_Result1","v_GlaSL_Remark1",
				"衬里表面检验","v_GlaSL_Result2","v_GlaSL_Remark2",
				"衬里鼓包、与基体分离情况检验","v_GlaSL_Result3","v_GlaSL_Remark3",
				"连接部位检验","v_GlaSL_Result4","v_GlaSL_Remark4",
				"附件防腐层检验","v_GlaSL_Result5","v_GlaSL_Remark5",
				"玻璃钢层厚度测定","v_GlaSL_Result6","v_GlaSL_Remark6",
				"v_GlaSL_Explain",
				"v_GlaSL_Date","v_GlaSL_Check_Date",
				"提交"};
		Integer[] type = {3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				4,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselGlassSteelLinerTest.getInstance());

		return m;

	}

	public static MenuDetailUIDomain getTab24Data(){
		String [] cItems = {"塑料压力容器定期检验记录附页",
				"铭牌和标志检验","检验结果","备注",
				"外表面检验","检验结果","备注",
				"内表面检验","检验结果","备注",
				"焊缝和连接部位检验","检验结果","备注",
				"附件检验","检验结果","备注",
				"支承或者支座检验","检验结果","备注",
				"分析",
				"检验","校对",
				"提交"};
		String [] eItems = {"塑料压力容器定期检验记录附页",
				"铭牌和标志检验","v_Pla_Result1","v_Pla_Remark1",
				"外表面检验","v_Pla_Result2","v_Pla_Remark2",
				"内表面检验","v_Pla_Result3","v_Pla_Remark3",
				"焊缝和连接部位检验","v_Pla_Result4","v_Pla_Remark4",
				"附件检验","v_Pla_Result5","v_Pla_Remark5",
				"支承或者支座检验","v_Pla_Result6","v_Pla_Remark6",
				"v_Pla_Explain",
				"v_Pla_Date","v_Pla_Check_Date",
				"提交"};
		Integer[] type = {3,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				4,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselPlasticTest.getInstance());

		return m;

	}

	public static MenuDetailUIDomain getTab25Data(){
		String [] cItems = {"塑料衬里压力容器定期检验记录附页",
				"铭牌和标志检验","检验结果","备注",
				"衬里表面检验","检验结果","备注",
				"衬里鼓包、与基体分离情况检验","检验结果","备注",
				"5kV直流高电压检测","检验结果","备注",
				"衬里厚度测定","检验结果","备注",
				"焊缝和连接部位检验","检验结果","备注",
				"附件检验","检验结果","备注",
				"支承或者支座检验","检验结果","备注",
				"说明",
				"分析","校对",
				"提交"};
		String [] eItems = {"塑料衬里压力容器定期检验记录附页",
				"铭牌和标志检验","v_PlaL_Result1","v_PlaL_Remark1",
				"衬里表面检验","v_PlaL_Result2","v_PlaL_Remark2",
				"衬里鼓包、与基体分离情况检验","v_PlaL_Result3","v_PlaL_Remark3",
				"5kV直流高电压检测","v_PlaL_Result4","v_PlaL_Remark4",
				"衬里厚度测定","v_PlaL_Result5","v_PlaL_Remark5",
				"焊缝和连接部位检验","v_PlaL_Result6","v_PlaL_Remark6",
				"附件检验","v_PlaL_Result7","v_PlaL_Remark7",
				"支承或者支座检验","v_PlaL_Result8","v_PlaL_Remark8",
				"v_PlaL_Explain",
				"v_PlaL_Date","v_PlaL_Check_Date",
				"提交"};
		Integer[] type = {3,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				4,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselPlasticLinerTest.getInstance());

		return m;

	}

	public static MenuDetailUIDomain getTab26Data(){
		String [] cItems = {"容器定期检验结论（必填）",
				"检验类别","运行状态","检验条件确认","检查结论",
				"允许（监控）使用参数","允许（监控）使用参数",
				"经验收检查本台压力容器的安全状况等级(级)","压力","温度","介质(Pa)",
				"其他(Pa)","下次定期检验日期",
				"需要说明情况","检验发现的问题及处理意见","资料审查问题记载","上次全面检验问题记载",
				"检验","校对",
				"提交"};
		String [] eItems = {"容器定期检验结论（必填）",
				"v_M_Type","v_M_Sta","v_M_Condition","v_M_Conclusion",
				"允许（监控）使用参数","允许（监控）使用参数",
				"v_M_Level","v_M_Pre","v_M_Tem","v_M_Med",
				"v_M_Other","下次定期检验日期",
				"v_M_Explain","检验发现的问题及处理意见","v_M_check_Prob","v_M_Prob",
				"v_M_Test_Date","v_M_Check_Date",
				"提交"};
		Integer[] type = {3,
				6,0,6,6,
				1,3,
				0,0,0,0,
				0,7,
				4,4,4,4,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselConclusionTest.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("v_M_Type",  new String[]{"首次","定期检验"});
		checkBoxItems.put("v_M_Condition",  new String[]{"具备检验条件","不具备检验条件"});
		checkBoxItems.put("v_M_Conclusion",  new String[]{"符合要求","基本符合要求","不符合要求"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems,checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static void generateBooleans(Map<String, String[]> checkBoxItems,
			Map<String, boolean[]> checkBoxBooleans) {
		for (Map.Entry<String,String[]> entry : checkBoxItems.entrySet()) {
			String booleanKey = entry.getKey()+"_Booleans";
			int size = entry.getValue().length;
			checkBoxBooleans.put(booleanKey, new boolean[size]);
		}

	}


}
