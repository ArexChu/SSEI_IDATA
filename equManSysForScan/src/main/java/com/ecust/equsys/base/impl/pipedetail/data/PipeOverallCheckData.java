package com.ecust.equsys.base.impl.pipedetail.data;


import com.ecust.equsys.domain.MenuDetailUIDomain;
import com.ecust.equsys.domain.pipe.pipeoverallcheck.PipeAssTable;
import com.ecust.equsys.domain.pipe.pipeoverallcheck.PipeHardTest;
import com.ecust.equsys.domain.pipe.pipeoverallcheck.PipeLeakTest;
import com.ecust.equsys.domain.pipe.pipeoverallcheck.PipeMetTest;
import com.ecust.equsys.domain.pipe.pipeoverallcheck.PipeMacroTest;
import com.ecust.equsys.domain.pipe.pipeoverallcheck.PipePreTest;
import com.ecust.equsys.domain.pipe.pipeoverallcheck.PipeSPDTest;
import com.ecust.equsys.domain.pipe.pipeoverallcheck.PipeThiCheck;
import com.ecust.equsys.domain.pipe.pipeoverallcheck.PipeVerification;

import java.util.HashMap;
import java.util.Map;

public class PipeOverallCheckData {
	
	 /**
	  * 0代表TextView+EditText的组合
	  * 1代表中间的过度过程
	  * 2代表动态生成测点个数
	  * 3代表只有TextView
	  * 4代表TextView+大型EditText的组合
	  * 5代表多选框
	  * 6代表单选框
	  * 7代表日期选择
	  * 9代表确定
	  */
	public static MenuDetailUIDomain getTab1Data(){
		String [] cItems = {"宏观检查记录",
				"管道位置","备注",
				"管道结构","备注",
				"绝热层","备注",
				"防腐层","备注",
				"支吊架","备注",
				"阻尼器","备注",
				"减振器","备注",
				"补偿器","备注",
				"阀门","备注",
				"法兰","备注",
				"膨胀节","备注",
				"阴极保护装置","备注",
				"蠕胀测点","备注",
				"法兰间接触电阻","备注",
				"对地电阻","备注",
				"管道标识","备注",
				"管道组成件","备注",
				"焊接接头","备注",
				"其他","备注",
				"日期",
				"提交"};
		String [] eItems = {"宏观检查记录",
				"p_Pos","p_Pos_Remark",
				"p_Str","p_Str_Remark",
				"p_Ins","p_Ins_Remark",
				"p_Pro","p_Pro_Remark",
				"p_Hanger","p_Hanger_Remark",
				"p_Damper","p_Damper_Remark",
				"p_Absorber","p_Absorber_Remark",
				"p_Compen","p_Compen_Remark",
				"p_Valve","p_Valve_Remark",
				"p_Fla","p_Fla_Remark",
				"p_Exp","p_Exp_Remark",
				"p_Cat_Pro","p_Cat_Pro_Remark",
				"p_Creep","p_Creep_Remark",
				"p_Fla_Res","p_Fla_Res_Remark",
				"p_Gro_Res","p_Gro_Res_Remark",
				"p_Ide","p_Ide_Remark",
				"p_Component","p_Component_Remark",
				"p_Wel","p_Wel_Remark",
				"p_Other","p_Other_Remark",
				"p_Mac_Date",
				"提交"};
		Integer[] type = {3,
				6,0,
				6,0,
				6,0,
				6,0,
				6,0,
				6,0,
				6,0,
				6,0,
				6,0,
				6,0,
				6,0,
				6,0,
				6,0,
				6,0,
				6,0,
				6,0,
				6,0,
				6,0,
				0,0,
				7,
				9};
		
		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(PipeMacroTest.getInstance());
		
		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("p_Pos",  new String[]{"正常","碰撞","摩擦"});
		checkBoxItems.put("p_Str",  new String[]{"正常","翘曲","下沉","异常变形"});
		checkBoxItems.put("p_Ins",  new String[]{"完好","破损","脱落","跑冷","无绝热层"});
		checkBoxItems.put("p_Pro",  new String[]{"完好","破损","脱落","无防腐层"});
		checkBoxItems.put("p_Hanger",  new String[]{"完好","间距不合理 ","脱落","变形","腐蚀"," 与管道接触处积水",
				"恒力弹簧支吊架转体位移指示越限","变力弹簧支吊架偏斜","变力弹簧支吊架失载","刚性支吊架状态异常","吊杆损坏",
				"吊杆异常","吊杆连接配件损坏","吊杆连接配件异常","转导向支架卡涩","承载结构变形","承载机构上主要受力焊接接头存在裂纹","支承辅助钢结构上主要受力焊接接头存在裂纹"});
		checkBoxItems.put("p_Damper",  new String[]{"完好","位移异常","液压阻尼器液位正常","无"});
		checkBoxItems.put("p_Absorber",  new String[]{"完好","位移异常","无"});
		checkBoxItems.put("p_Compen",  new String[]{"完好","损坏","未采用补偿器","不需要补偿器"});
		checkBoxItems.put("p_Valve",  new String[]{"完好","腐蚀","裂缝","缩孔","连接螺栓松动","操作不灵活","无"});
		checkBoxItems.put("p_Fla",  new String[]{"完好","偏口","紧固件不齐全","紧固件不符合要求","紧固件松动","紧固件腐蚀","无"});
		checkBoxItems.put("p_Exp",  new String[]{"完好","波纹管膨胀节划痕 ","波纹管膨胀节凹痕","波纹管膨胀节腐蚀","波纹管膨胀节开裂"," 波纹管膨胀节间距异常",
				"波纹管膨胀节失稳","铰链型膨胀节铰链变形","铰链型膨胀节铰链脱落","铰链型膨胀节销轴变形","铰链型膨胀节销轴脱落",
				"拉杆式膨胀节拉杆异常","拉杆式膨胀节螺栓异常","拉杆式膨胀节连接支座异常"});
		checkBoxItems.put("p_Cat_Pro",  new String[]{"完好","异常","损坏","无"});
		checkBoxItems.put("p_Creep",   new String[]{"完好","损坏","无"});
		checkBoxItems.put("p_Fla_Res",   new String[]{"合格","大于0.03Ω","无此项"});
		checkBoxItems.put("p_Gro_Res",   new String[]{"合格","大于100Ω","无此项"});
		checkBoxItems.put("p_Ide",   new String[]{"合格","标识错误","标识不清","无标识"});
		checkBoxItems.put("p_Component",   new String[]{"完好","裂缝","皱褶","重皮","碰伤","变形","腐蚀"});
		checkBoxItems.put("p_Wel",   new String[]{"完好","裂纹","错边","咬边"});
		
		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems,checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;
		
	}

	public static MenuDetailUIDomain getTab2Data(){
		String [] cItems = {"安全保护装置检查情况",
				"压   力   表   检   查",
				"设计规定数","实际安装数", "安装位置","有效期",
				"量程","精度","表盘直径", "外观质量",
				"","测   温   仪   表   检   查",
				"设计规定数","实际安装数","安装位置","有效期",
				"量程","精度","外观质量",
				"","安   全   阀   检   查",
				"设计要求","数量","型号", "公称压力","公称通径",
				"检查情况","数量", "型号","公称压力","公称通径",
				"开启压力","工作温度","工作介质",
				"外观质量","有效期", "铅封",
				"安装位置","合格证编号","制造许可证",
				"","爆   破   片   装   置   检   查",
				"设计要求","数量","型号","规格",
				"爆破应力","公称直径","材料",
				"检查情况","数量","型号","规格",
				"公称直径","外观质量","有效期",
				"安装位置","合格证编号","制造许可证",
				"","紧   急   切   断   阀   检   查",
				"制造厂家","制造许可证号","合格证编号",
				"型式及规格","切断时间","有效期",
				"耐压试验","密封压力试验","铅封",
				"备注",
				"日期",
				"提交"};
		String [] eItems = {"安全保护装置检查情况",
				"压   力   表   检   查",
				"pre_De_Num","pre_Wo_Num","pre_Wo_Pos","pre_Valid_Date",
				"pre_Range","pre_Acc","pre_Dia","pre_Appe",
				"","测   温   仪   表   检   查",
				"tem_De_Num","tem_Wo_Num","tem_Wo_Pos","tem_Valid_Date",
				"tem_Range","tem_Acc","tem_Appe",
				"","安   全   阀   检   查",
				"设计要求","valve_De_Num","valve_De_Mod","valve_De_Pre","valve_De_Dia",
				"检查情况","valve_Num","valve_Mod","valve_Pre","valve_Dia",
				"valve_Start_Pre","valve_Wo_Tem","valve_Wo_Med",
				"valve_Appe","valve_Valid_Date","valve_Seal",
				"valve_Wo_Pos","valve_Cer_ID","valve_Man_ID",
				"","爆   破   片   装   置   检   查",
				"设计要求","rup_De_Num","rup_De_Mod","rup_De_Norm",
				"rup_De_Stress","rup_De_Dia","rup_De_Ma",
				"检查情况","rup_Num","rup_Mod","rup_Norm",
				"rup_Dia","rup_Appe","rup_Valid_Date",
				"rup_Wo_Pos","rup_Cer_ID","rup_Man_ID",
				"","紧   急   切   断   阀   检   查",
				"ecof_Man_Com","ecof_Man_ID","ecof_Cer_ID",
				"ecof_Norm","ecof_Cut_Time","ecof_Valid_Date",
				"ecof_Pre_Test","ecof_Seal_Pre","ecof_Seal",
				"ecof_Remark",
				"ecof_Date",
				"submit"};
		Integer[] type = {3,
				3,
				0,0,0,0,
				0,0,0,0,
				1,3,
				0,0,0,0,
				0,0,0,
				1,3,
				3,0,0,0,0,
				3,0,0,0,0,
				0,0,0,
				0,0,0,
				0,0,0,
				1,3,
				3,0,0,0,
				0,0,0,
				3,0,0,0,
				0,0,0,
				0,0,0,
				1,3,
				0,0,0,
				0,0,0,
				0,0,0,
				0,
				7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(PipeSPDTest.getInstance());

		return m;

	}

	public static MenuDetailUIDomain getTab3Data(){
		String [] cItems = {"管道测厚检查",
				"管道编号","表面状况","测厚仪器型号","测厚仪器精度",
				"测厚仪器编号","使用状态","管件测厚比例(%)","管子测厚比例(%)",
				"实测点数","实测最小壁厚(mm)",
				"测厚点部位图：","",
				"检验",
				"提交"};
		String [] cExpand = {"测点编号","测点厚度(mm)"};

		String [] eItems = {"管道测厚检查",
				"p_Thi_Name","p_Sur_Sta","p_Equ_Mod","p_Equ_Acc",
				"p_Equ_ID","p_Use_Sta","p_Thi_ratio_1","p_Thi_ratio_2",
				"p_Thi_Num","p_Min_Thi",
				"测厚点部位图：","p_Thi_Value",
				"p_Thi_Date",
				"submit"};
		String[] eExpand = {"universal", "universal"};

		Integer[] type = {3,
				0,5,0,0,
				0,0,0,0,
				0,0,
				3,2,
				7,
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
		m.setEntity(PipeThiCheck.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("p_Sur_Sta", new String[]{"去漆", "去锈", "打磨", "未处理"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems, checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static MenuDetailUIDomain getTab4Data(){
		String [] cItems = {"管道硬度检查",
				"仪器型号","仪器编号","测定部位","评定标准","热处理状态",
				"硬度测定","",
				"评定意见","检验",
				"提交"};
		String [] cExpand = {"硬 度 值（HB）","硬度测定部位"};

		String [] eItems = {"管道硬度检查",
				"p_Equ_Mod","p_Equ_ID","p_Hard_Pos","p_Hard_Cri","p_Heat_Sta",
				"硬度测定","p_HB_Value",
				"p_Ass_Opinion","p_Hard_Data",
				"提交"};
		String[] eExpand = {"universal", "universal"};

		Integer[] type = {3,
				0,0,0,0,0,
				3,2,
				4,7,
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
		m.setEntity(PipeHardTest.getInstance());

		return m;
	}

	public static MenuDetailUIDomain getTab5Data(){
		String [] cItems = {"金相分析",
				"取样部位","试样编号","仪器型号","仪器编号",
				"腐蚀方法","抛光方法","放大倍数","执行标准",
				"热处理状态",
				"分析结果",
				"检验",
				"提交"};
		String [] eItems = {"金相分析",
				"p_Met_Pos","p_Sample_ID","p_Equ_Mod","p_Equ_ID",
				"p_Cor_Method","p_Pol_Method","p_Amp_Times","p_Met_Cri",
				"p_Heat_Sta",
				"p_Ana_Result",
				"p_Met_Data",
				"提交"};
		Integer[] type = {3,
				0,0,0,0,
				0,0,0,0,
				0,
				4,
				7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(PipeMetTest.getInstance());

		return m;

	}

	public static MenuDetailUIDomain getTab6Data(){
		String [] cItems = {"压力试验",
				"试验介质","试验压力(MPa)","介质温度(℃)","环境温度(℃)",
				"机泵出口压力表规格(MPa)","机泵出口压力表精度(级)","管线压力表规格(MPa)","管线压力表精度(级)",
				"机泵型号及编号","执行标准","最高工作压力(MPa)",
				"压力试验结论",
				"检验",
				"提交"};
		String [] eItems = {"压力试验",
				"p_Exp_Med","p_Exp_Pre","p_Med_Tem","p_Amb_Tem",
				"p_Pump_Pre_Cri","p_Pump_Pre_Acc","p_Line_Pre_Cri","p_Line_Pre_Acc",
				"p_Pump_Type","p_Ope_Cri","p_Max_Pre",
				"p_Pre_Result",
				"p_Pre_Data",
				"提交"};
		Integer[] type = {3,
				0,0,0,0,
				0,0,0,0,
				0,0,0,0,
				0,0,0,
				4,
				7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(PipePreTest.getInstance());

		return m;

	}

	public static MenuDetailUIDomain getTab7Data(){
		String [] cItems = {"泄漏性检查",
				"试验介质","试验压力(MPa)","介质温度(℃)","环境温度(℃)",
				"机泵出口压力表规格(MPa)","机泵出口压力表精度(级)","管线压力表规格(MPa)","管线压力表精度(级)",
				"机泵型号及编号","执行标准","最高工作压力(MPa)",
				"泄露性试验结论",
				"检验",
				"提交"};
		String [] eItems = {"泄漏性检查",
				"p_Exp_Med","p_Exp_Pre","p_Med_Tem","p_Amb_Tem",
				"p_Pump_Pre_Cri","p_Pump_Pre_Acc","p_Line_Pre_Cri","p_Line_Pre_Acc",
				"p_Pump_Type","p_Ope_Cri","p_Max_Pre",
				"p_Leak_Result",
				"p_Leak_Data",
				"提交"};
		Integer[] type = {3,
				0,0,0,0,
				0,0,0,0,
				0,0,0,
				4,
				7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(PipeLeakTest.getInstance());

		return m;

	}

	public static MenuDetailUIDomain getTab8Data(){
		String [] cItems = {"管道全面检验结论",
				"检验检测项目","原始资料","规章制度",
				"安全状况等级","最高工作压力","工作温度","介质",
				"监控使用的限制性条件","判废依据","下次全面检验日期",
				"其它","检验使用的设备名称及编号","其他需要说明的检验情况","本次检验问题记载",
				"检验","校核",
				"提交"};
		String [] eItems = {"管道全面检验结论",
				"m_Items","m_Original_Data","m_Rules",
				"m_Gra","m_Max_Pre","m_Tem","m_Med",
				"m_Limit","m_Reasion","下次全面检验日期",
				"m_Others","m_Test_Equ","m_Test_Remark","本次检验问题记载",
				"m_Test_Date","m_Check_Date",
				"提交"};
		Integer[] type = {3,
				5,5,5,
				0,0,0,0,
				0,0,7,
				4,4,4,4,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);

		//是该页面对应的实体类
		m.setEntity(PipeVerification.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("m_Items", new String[]{"宏观检验", "管道测厚", "射线探伤", "超声探伤","磁粉探伤",
				"渗透探伤", "材料分析", "硬度测定", "压力试验", "泄漏试验",
				"安全附件检查", "单线图"});
		checkBoxItems.put("m_Original_Data", new String[]{"有", "部分", "无"});
		checkBoxItems.put("m_Rules", new String[]{"有", "不健全", "无"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems, checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static MenuDetailUIDomain getTab9Data(){
		String [] cItems = {"管道安全等级评估",
				"管道位置及结构","检 查 情 况 概 述","安全状况等级",
				"","管道材质",
				"与设计不符","检 查 情 况 概 述","安全状况等级",
				"材质不明","检 查 情 况 概 述","安全状况等级",
				"材质劣化损伤","检 查 情 况 概 述","安全状况等级",
				"硬度异常","检 查 情 况 概 述","安全状况等级",
				"","管子及管件全面减薄","检 查 情 况 概 述","安全状况等级",
				"管子局部减薄","检 查 情 况 概 述","安全状况等级",
				"","管子焊接缺陷",
				"裂纹","检 查 情 况 概 述","安全状况等级",
				"咬边","检 查 情 况 概 述","安全状况等级",
				"气孔","检 查 情 况 概 述","安全状况等级",
				"夹渣","检 查 情 况 概 述","安全状况等级",
				"未焊透","检 查 情 况 概 述","安全状况等级",
				"未熔合","检 查 情 况 概 述","安全状况等级",
				"错边","检 查 情 况 概 述","安全状况等级",
				"","组成件其它异常",
				"裂纹、皱褶、重皮","检 查 情 况 概 述","安全状况等级",
				"碰伤","检 查 情 况 概 述","安全状况等级",
				"变形","检 查 情 况 概 述","安全状况等级",
				"损坏","检 查 情 况 概 述","安全状况等级",
				"","吊支架异常","检 查 情 况 概 述","安全状况等级",
				"","附属设施",
				"安全保护装置","检 查 情 况 概 述","安全状况等级",
				"其它附属装置","检 查 情 况 概 述","安全状况等级",
				"","压力试验","报告编号","安全状况等级",
				"","泄漏试验","报告编号","安全状况等级",
				"","无损检测","报告编号","安全状况等级",
				"","金相检测","报告编号","安全状况等级",
				"","材料成分分析","报告编号","安全状况等级",
				"","硬度检测","报告编号","安全状况等级",
				"","管道安全等级评定",
				"备注",
				"提交"};
		String [] eItems = {"管道安全等级评估",
				"管道位置及结构","p_pos_Sum","p_pos_Gra",
				"","管道材质",
				"与设计不符","p_Ma_Sum_1","p_Ma_Gra_1",
				"材质不明","p_Ma_Sum_2","p_Ma_Gra_2",
				"材质劣化损伤","p_Ma_Sum_3","p_Ma_Gra_3",
				"硬度异常","p_Ma_Sum_4","p_Ma_Gra_4",
				"","管子及管件全面减薄","p_Thi_Sum","p_Thi_Gra",
				"管子局部减薄","p_Thi_Part_Sum","p_Thi_Part_Gra",
				"","管子焊接缺陷",
				"裂纹","p_Wel_Sum_1","p_Wel_Gra_1",
				"咬边","p_Wel_Sum_2","p_Wel_Gra_2",
				"气孔","p_Wel_Sum_3","p_Wel_Gra_3",
				"夹渣","p_Wel_Sum_4","p_Wel_Gra_4",
				"未焊透","p_Wel_Sum_5","p_Wel_Gra_5",
				"未熔合","p_Wel_Sum_6","p_Wel_Gra_6",
				"错边","p_Wel_Sum_7","p_Wel_Gra_7",
				"","组成件其它异常",
				"裂纹、皱褶、重皮","p_Component_Sum_1","p_Component_Gra_1",
				"碰伤","p_Component_Sum_2","p_Component_Gra_2",
				"变形","p_Component_Sum_3","p_Component_Gra_3",
				"损坏","p_Component_Sum_4","p_Component_Gra_4",
				"","吊支架异常","p_Hanger_Sum","p_Hanger_Gra",
				"","附属设施",
				"安全保护装置","p_Other_Sum_1","p_Other_Gra_1",
				"其它附属装置","p_Other_Sum_2","p_Other_Gra_2",
				"","压力试验","p_Pretest_Rep","p_Pretest_Gra",
				"","泄漏试验","p_Leaktest_Rep","p_Leaktest_Gra",
				"","无损检测","p_NDEtest_Rep","p_NDEtest_Gra",
				"","金相检测","p_Mettest_Rep","p_Mettest_Gra",
				"","材料成分分析","p_Ma_Ana_Rep","p_Ma_Ana_Gra",
				"","硬度检测","p_Hardtest_Rep","p_Hardtest_Gra",
				"","p_Safe_Ass_Gra",
				"p_Ass_Remark",
				"提交"};
		Integer[] type = {3,
				3,0,0,
				1,3,
				3,0,0,
				3,0,0,
				3,0,0,
				3,0,0,
				1,3,0,0,
				3,0,0,
				1,3,
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
				3,0,0,
				1,3,0,0,
				1,3,
				3,0,0,
				3,0,0,
				1,3,0,0,
				1,3,0,0,
				1,3,0,0,
				1,3,0,0,
				1,3,0,0,
				1,3,0,0,
				1,0,
				4,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(PipeAssTable.getInstance());

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
