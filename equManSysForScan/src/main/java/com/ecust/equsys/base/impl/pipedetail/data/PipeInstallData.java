package com.ecust.equsys.base.impl.pipedetail.data;


import com.ecust.equsys.domain.MenuDetailUIDomain;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallBasic;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallCheckInf;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallComInf;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallCompleteInf;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallConclusion;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallLeftProblem;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallReview;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallSafeChecka;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallSafeCheckb;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallSafeCheckc;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallSafeCheckd;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallSafeChecke;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallSafeCheckf;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallSafeCheckg;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallSafeCheckh;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallSafeChecki;

import java.util.HashMap;
import java.util.Map;

public class PipeInstallData {

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
		String [] cItems = {"安装安全质量监督检验结论记录",
				"工程地址","下次全面检验日期","开工时间","竣工时间",
				"管道设计单位","设计证书编号","授权监督检验文号","安装许可证编号",
				"防腐施工单位","防腐资质证书编号","监理单位","监理资质证书编号",
				"检测单位","检测资质证书编号","监督检验开始日期","监督检验结束日期",
				"管道编号",
				"监督检验依据1、《压力管道安全管理与监察规定》\n2、《压力管道安装安全质量监督检验规则》",
				"监督检验结论",
				"安全状况等级",
				"监检使用的设备名称及编号：",
				"监检人员","监检人员资格证号","监检日期","校对人员",
				"校对人员资格证号","校对日期",
				"提交"};
		String [] eItems = {"安装安全质量监督检验结论记录",
				"pi_Addr","pi_Next_Date","pi_Start_Date","pi_End_Date",
				"pi_De_Com","pi_De_Cer_ID","pi_Insp_ID","pi_Install_Cer_ID",
				"pi_Pro_Com","pi_Pro_Cer_ID","pi_Sup_Com","pi_Sup_Cer_ID",
				"pi_Check_Com","pi_Check_Cer_ID","pi_Insp_Start_Date","pi_Insp_End_Date",
				"pi_Pipe_ID",
				"pi_Insp_Reasion",
				"pi_Insp_Result",
				"pi_Insp_Grade",
				"pi_Check_Equ",
				"pi_Insp_Per_Name","pi_Insp_Per_ID","pi_Insp_Date","pi_Check_Per_Name",
				"pi_Check_Per_ID","pi_Check_Date",
				"提交"};
		Integer[] type = {3,
				0,7,7,7,
				0,0,0,0,
				0,0,0,0,
				0,0,7,7,
				4,
				4,
				6,
				0,
				4,
				0,0,7,0,
				0,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(PipeInstallConclusion.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("pi_Insp_Result",  new String[]{"合格","不合格"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems,checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static MenuDetailUIDomain getTab2Data(){
		String [] cItems = {"监督检验的工业管道基本情况记录",
				"设计压力(MPa)","设计温度(℃)","输送介质","管道级别",
				"管道设计标准","管道安装标准","管道长度(m)","焊口数量（道）",
				"焊评标准","焊评报告号","焊接工艺号","管道隐蔽长度(m)",
				"隐蔽焊口(道)","穿跨越标准","穿跨越数(处)","穿跨越方法",
				"穿跨越总长度(m)","检测焊口(道)","检测标准","检测比例(%)",
				"合格级别(级)","检测方法",
				"备注",
				"监检人员","日期",
				"提交"};
		String [] eItems = {"监督检验的工业管道基本情况记录",
				"pi_De_Pre","pi_De_Tem","pi_Wo_Med","pi_Gra",
				"pi_De_Cri","pi_Ins_Cri","pi_Len","pi_Wel_Num",
				"pi_Wel_Cri","pi_Wel_Rep","pi_Wel_ID","pi_Hidden_Len",
				"pi_Hidden_Wel","pi_Corss_Cri","pi_Corss_Num","pi_Corss_Method",
				"pi_Corss_Len","pi_Che_Wel","pi_Che_Cri","pi_Che_Ration",
				"pi_Qua_Gra","pi_Che_Method",
				"pi_Basic_Remark",
				"pi_Basic_Per","pi_Basic_Date",
				"提交"};
		Integer[] type = {3,
				0,0,0,0,
				0,0,0,0,
				0,0,0,0,
				0,0,0,0,
				0,0,0,0,
				0,0,
				4,
				0,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(PipeInstallBasic.getInstance());

		return m;

	}

	public static MenuDetailUIDomain getTab3Data(){
		String [] cItems = {"监督检验的工作内容及工作基本情况记录",
				"监督检验项目（类别）[工作见证]",
				"安装告知书（A）[告知书]","确认日期","设计单位资质及图纸审查（C）[图纸]","确认日期",
				"设计变更及材料代用手续（C）[修改单]","确认日期","施工方案及焊接工艺评定（B）[方案、评定]","确认日期",
				"焊接、探伤人员资格审查（B）[证书]","确认日期","管道元件、焊接材料质量证明文件（B）[质量证明书]","确认日期",
				"阀门强度与密封性试验（C）[施工记录]","确认日期","管道布置及焊缝检查（C）[施工记录]","确认日期",
				"支吊架安装质量检查（C）[施工记录]","确认日期","可拆件/补偿器/阀门/法兰安装质量抽查（C）[施工记录]","确认日期",
				"射线底片抽审（A）[复评记录]","确认日期","无损检测结果质量评定（C）[检测报告]","确认日期",
				"管道强度试验（A）[施工记录]","确认日期","管道泄漏性试验（C）[施工记录]","确认日期",
				"管道附属设备安装质量（C）[施工记录]","确认日期","防静电设施安装质量（C）[施工记录]","确认日期",
				"管道吹扫、清洗、通球质量（C）[施工记录]","确认日期","管道防腐、绝热施工质量抽查（C）[施工记录]","确认日期",
				"管道安全附件检查（B）[施工记录]","确认日期","相关单位安全质量管理行为（C）[评价记录]","确认日期",
				"安装竣工技术文件审查（C）[审查记录]","确认日期",
				"结论","备注",
				"监检人员","日期",
				"提交"};
		String [] eItems = {"监督检验的工作内容及工作基本情况记录",
				"监督检验项目（类别）[工作见证]",
				"pi_Check1_inf","pi_Check1_Date","pi_Check2_inf","pi_Check2_Date",
				"pi_Check3_inf","pi_Check3_Date","pi_Check4_inf","pi_Check4_Date",
				"pi_Check5_inf","pi_Check5_Date","pi_Check6_inf","pi_Check6_Date",
				"pi_Check7_inf","pi_Check7_Date","pi_Check8_inf","pi_Check8_Date",
				"pi_Check9_inf","pi_Check9_Date","pi_Check10_inf","pi_Check10_Date",
				"pi_Check11_inf","pi_Check11_Date","pi_Check12_inf","pi_Check12_Date",
				"pi_Check13_inf","pi_Check13_Date","pi_Check14_inf","pi_Check14_Date",
				"pi_Check15_inf","pi_Check15_Date","pi_Check16_inf","pi_Check16_Date",
				"pi_Check17_inf","pi_Check17_Date","pi_Check18_inf","pi_Check18_Date",
				"pi_Check19_inf","pi_Check19_Date","pi_Check20_inf","pi_Check20_Date",
				"pi_Check21_inf","pi_Check21_Date",
				"pi_Check_Result","pi_Check_Remark",
				"pi_Check_Per","pi_Check_Date",
				"提交"};
		Integer[] type = {3,
				3,
				6,7,6,7,
				6,7,6,7,
				6,7,6,7,
				6,7,6,7,
				6,7,6,7,
				6,7,6,7,
				6,7,6,7,
				6,7,6,7,
				6,7,6,7,
				6,7,6,7,
				6,7,
				4,4,
				0,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(PipeInstallCheckInf.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("pi_Check1_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check2_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check3_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check4_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check5_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check6_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check7_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check8_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check9_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check10_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check11_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check12_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check13_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check14_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check15_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check16_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check17_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check18_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check19_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check20_inf",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Check21_inf",  new String[]{"无","合格","不合格"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems,checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static MenuDetailUIDomain getTab4Data(){
		String [] cItems = {"对相关单位安全质量管理行为的评价记录",
				"建设单位",
				"设计、监理、安装、检测及防腐合同管理","组织设计交底和施工方案讨论","材料采购质量控制与施工管理","监督检验意见处理情况",
				"评价意见",
				"监理单位","监理单位",
				"监理单位资质、监理人员资格","监理单位质量管理体系","监理工作质量","监督检验意见处理情况",
				"评价意见",
				"安装单位","安装单位",
				"安装单位资质与告知手续","质量管理体系及专业技术、管理人员","材料验收及施工质量检验管理","焊工资格、焊评报告及焊接工艺、施工方案实施情况","施工技术文件管理","安装分包、转包管理员","监督检验意见处理情况",
				"评价意见",
				"检测单位","检测单位",
				"检测单位资质检测人员资格","检测单位质量管理体系","检测工作质量与检测报告","监督检验意见处理情况",
				"评价意见",
				"防腐单位","防腐单位",
				"防腐单位资质","防腐单位质量管理体系","防腐工作质量与施工记录","监督检验意见处理情况",
				"评价意见",
				"备注",
				"监检人员","日期",
				"提交"};
		String [] eItems = {"对相关单位安全质量管理行为的评价记录",
				"建设单位",
				"pi_Cons_Inf1","pi_Cons_Inf2","pi_Cons_Inf3","pi_Cons_Inf4",
				"pi_Cons_Opinion",
				"监理单位","监理单位",
				"pi_Sup_Inf1","pi_Sup_Inf2","pi_Sup_Inf3","pi_Sup_Inf4",
				"pi_Sup_Opinion",
				"安装单位","安装单位",
				"pi_InsCom_Inf1","pi_InsCom_Inf2","pi_InsCom_Inf3","pi_InsCom_Inf4","pi_InsCom_Inf5","pi_InsCom_Inf6","pi_InsCom_Inf7",
				"pi_InsCom_Opinion",
				"检测单位","检测单位",
				"pi_CheCom_Inf1","pi_CheCom_Inf2","pi_CheCom_Inf3","pi_CheCom_Inf4",
				"pi_CheCom_Opinion",
				"防腐单位","防腐单位",
				"pi_Pro_Inf1","pi_Pro_Inf2","pi_Pro_Inf3","pi_Pro_Inf4",
				"pi_Pro_Opinion",
				"pi_InsCom_Remark",
				"pi_InsCom_Per","pi_InsCom_Date",
				"提交"};
		Integer[] type = {3,
				3,
				6,6,6,6,
				4,
				1,3,
				6,6,6,6,
				4,
				1,3,
				6,6,6,6,6,6,6,
				4,
				1,3,
				6,6,6,6,
				4,
				1,3,
				6,6,6,6,
				4,
				4,
				0,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(PipeInstallComInf.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("pi_Cons_Inf1",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Cons_Inf2",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Cons_Inf3",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Cons_Inf4",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Sup_Inf1",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Sup_Inf2",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Sup_Inf3",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Sup_Inf4",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_InsCom_Inf1",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_InsCom_Inf2",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_InsCom_Inf3",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_InsCom_Inf4",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_InsCom_Inf5",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_InsCom_Inf6",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_InsCom_Inf7",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_CheCom_Inf1",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_CheCom_Inf2",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_CheCom_Inf3",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_CheCom_Inf4",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Pro_Inf1",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Pro_Inf2",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Pro_Inf3",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("pi_Pro_Inf4",  new String[]{"无","合格","不合格"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems,checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static MenuDetailUIDomain getTab5Data(){
		String [] cItems = {"工业管道元件及焊接材料的材质审查记录",
				"审查记录", "",
				"备注",
				"监检人员","日期",
				"提交"};
		String [] cExpand = {"元件名称","材料牌号","规格型号","制造单位","质量证明书编号","抽查结果","抽查日期"};

		String [] eItems = {"工业管道元件及焊接材料的材质审查记录",
				"审查记录","pi_Wel_Ma",
				"pi_SafeChe_Remark",
				"pi_SafeChe_Per","pi_SafeChe_Date",
				"提交"};
		String[] eExpand = {"universal","universal","universal","universal","universal","uniValue","universal"};

		Integer[] type = {3,
				3,2,
				4,
				0,7,
				9};
		Integer[] tExpand = {0,0,0,0,0,6,7};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.setcExpand(cExpand);
		m.seteItems(eItems);
		m.seteExpand(eExpand);
		m.setType(type);
		m.settExpand(tExpand);

		//是该页面对应的实体类
		m.setEntity(PipeInstallSafeChecka.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("uniValue", new String[]{"合格", "不合格"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems, checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static MenuDetailUIDomain getTab6Data(){
		String [] cItems = {"工业管道焊接质量抽查记录",
				"抽查记录","",
				"备注",
				"监检人员","日期",
				"提交"};
		String [] cExpand = {"管线管口号","焊工资质","焊接工艺","焊缝外观","错边量（mm）","抽查结果","抽查日期",};

		String [] eItems = {"工业管道焊接质量抽查记录",
				"抽查记录","pi_Wel_Qua",
				"pi_SafeChe1_Remark",
				"pi_SafeChe1_Per","pi_SafeChe1_Date",
				"提交"};
		String[] eExpand = {"universal","universal","universal","universal","universal","uniValue","universal"};

		Integer[] type = {3,
				3,2,
				4,
				0,7,
				9};
		Integer[] tExpand = {0,0,0,0,0,6,7};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.setcExpand(cExpand);
		m.seteItems(eItems);
		m.seteExpand(eExpand);
		m.setType(type);
		m.settExpand(tExpand);

		//是该页面对应的实体类
		m.setEntity(PipeInstallSafeCheckb.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("uniValue", new String[]{"合格", "不合格"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems, checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static MenuDetailUIDomain getTab7Data(){
		String [] cItems = {"工业管道补偿器和热传导支承件安装质量抽查记录",
				"抽查记录","",
				"备注",
				"监检人员","日期",
				"提交"};
		String [] cExpand = {"元件名称","规格型号","制造单位","安装质量","安装记录","抽查结果","抽查日期",};

		String [] eItems = {"工业管道补偿器和热传导支承件安装质量抽查记录",
				"抽查记录","pi_Compen",
				"pi_SafeChe2_Remark",
				"pi_SafeChe2_Per","pi_SafeChe2_Date",
				"提交"};
		String[] eExpand = {"universal","universal","universal","universal","universal","uniValue","universal"};

		Integer[] type = {3,
				3,2,
				4,
				0,7,
				9};
		Integer[] tExpand = {0,0,0,0,0,6,7};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.setcExpand(cExpand);
		m.seteItems(eItems);
		m.seteExpand(eExpand);
		m.setType(type);
		m.settExpand(tExpand);

		//是该页面对应的实体类
		m.setEntity(PipeInstallSafeCheckc.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("uniValue", new String[]{"合格", "不合格"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems, checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static MenuDetailUIDomain getTab8Data(){
		String [] cItems = {"工业管道附属设施和设备安装质量抽查记录",
				"抽查记录","",
				"备注",
				"监检人员","日期",
				"提交"};
		String [] cExpand = {"元件名称","规格型号","安装位置","安装质量","安装记录","抽查结果","抽查日期",};

		String [] eItems = {"工业管道附属设施和设备安装质量抽查记录",
				"抽查记录","pi_Appurt",
				"pi_SafeChe3_Remark",
				"pi_SafeChe3_Per","pi_SafeChe3_Date",
				"提交"};
		String[] eExpand = {"universal","universal","universal","universal","universal","uniValue","universal"};

		Integer[] type = {3,
				3,2,
				4,
				0,7,
				9};
		Integer[] tExpand = {0,0,0,0,0,6,7};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.setcExpand(cExpand);
		m.seteItems(eItems);
		m.seteExpand(eExpand);
		m.setType(type);
		m.settExpand(tExpand);

		//是该页面对应的实体类
		m.setEntity(PipeInstallSafeCheckd.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("uniValue", new String[]{"合格", "不合格"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems, checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static MenuDetailUIDomain getTab9Data(){
		String [] cItems = {"工业管道穿跨越及隐蔽工程安装质量抽查记录",
				"抽查记录","",
				"备注",
				"监检人员","日期",
				"提交"};
		String [] cExpand = {"工程部位","施工图号","相关文件审查","隐蔽前现场联检","穿跨越后检查","抽查结果","抽查日期",};

		String [] eItems = {"工业管道穿跨越及隐蔽工程安装质量抽查记录",
				"抽查记录","pi_Cross",
				"pi_SafeChe4_Remark",
				"pi_SafeChe4_Per","pi_SafeChe4_Date",
				"提交"};
		String[] eExpand = {"universal","universal","universal","universal","universal","uniValue","universal"};

		Integer[] type = {3,
				3,2,
				4,
				0,7,
				9};
		Integer[] tExpand = {0,0,0,0,0,6,7};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.setcExpand(cExpand);
		m.seteItems(eItems);
		m.seteExpand(eExpand);
		m.setType(type);
		m.settExpand(tExpand);

		//是该页面对应的实体类
		m.setEntity(PipeInstallSafeChecke.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("uniValue", new String[]{"合格", "不合格"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems, checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static MenuDetailUIDomain getTab10Data(){
		String [] cItems = {"工业管道防腐、绝热施工质量抽查记录",
				"抽查记录","",
				"备注",
				"监检人员","日期",
				"提交"};
		String [] cExpand = {"施工名称","管线号","防腐质量","绝热质量","施工记录","抽查结果","抽查日期",};

		String [] eItems = {"工业管道防腐、绝热施工质量抽查记录",
				"抽查记录","pi_InsPro",
				"pi_SafeChe5_Remark",
				"pi_SafeChe5_Per","pi_SafeChe5_Date",
				"提交"};
		String[] eExpand = {"universal","universal","universal","universal","universal","uniValue","universal"};

		Integer[] type = {3,
				3,2,
				4,
				0,7,
				9};
		Integer[] tExpand = {0,0,0,0,0,6,7};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.setcExpand(cExpand);
		m.seteItems(eItems);
		m.seteExpand(eExpand);
		m.setType(type);
		m.settExpand(tExpand);

		//是该页面对应的实体类
		m.setEntity(PipeInstallSafeCheckf.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("uniValue", new String[]{"合格", "不合格"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems, checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static MenuDetailUIDomain getTab11Data(){
		String [] cItems = {"工业管道通球、扫线、干燥质量审查记录",
				"审查记录","",
				"备注",
				"监检人员","日期",
				"提交"};
		String [] cExpand = {"管线号","通球情况","扫线情况","干燥情况","相关记录","抽查结果","抽查日期",};

		String [] eItems = {"工业管道通球、扫线、干燥质量审查记录",
				"审查记录","pi_Dry",
				"pi_SafeChe6_Remark",
				"pi_SafeChe6_Per","pi_SafeChe6_Date",
				"提交"};
		String[] eExpand = {"universal","universal","universal","universal","universal","uniValue","universal"};

		Integer[] type = {3,
				3,2,
				4,
				0,7,
				9};
		Integer[] tExpand = {0,0,0,0,0,6,7};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.setcExpand(cExpand);
		m.seteItems(eItems);
		m.seteExpand(eExpand);
		m.setType(type);
		m.settExpand(tExpand);

		//是该页面对应的实体类
		m.setEntity(PipeInstallSafeCheckg.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("uniValue", new String[]{"合格", "不合格"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems, checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static MenuDetailUIDomain getTab12Data(){
		String [] cItems = {"工业管道强度试验、泄漏性试验记录",
				"抽查记录","",
				"备注",
				"监检人员","日期",
				"提交"};
		String [] cExpand = {"施工名称","管线号","防腐质量","绝热质量","施工记录","抽查结果","抽查日期",};

		String [] eItems = {"工业管道强度试验、泄漏性试验记录",
				"抽查记录","pi_Leak",
				"pi_SafeChe7_Remark",
				"pi_SafeChe7_Per","pi_SafeChe7_Date",
				"提交"};
		String[] eExpand = {"universal","universal","universal","universal","universal","uniValue","universal"};

		Integer[] type = {3,
				3,2,
				4,
				0,7,
				9};
		Integer[] tExpand = {0,0,0,0,0,6,7};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.setcExpand(cExpand);
		m.seteItems(eItems);
		m.seteExpand(eExpand);
		m.setType(type);
		m.settExpand(tExpand);

		//是该页面对应的实体类
		m.setEntity(PipeInstallSafeCheckh.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("uniValue", new String[]{"合格", "不合格"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems, checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static MenuDetailUIDomain getTab13Data(){
		String [] cItems = {"工业管道安全保护装置检查记录",
				"审查记录","",
				"备注",
				"监检人员","日期",
				"提交"};
		String [] cExpand = {"管线号","通球情况","扫线情况","干燥情况","相关记录","审查结果","审查日期",};

		String [] eItems = {"工业管道安全保护装置检查记录",
				"审查记录","pi_SafeEqu",
				"pi_SafeChe8_Remark",
				"pi_SafeChe8_Per","pi_SafeChe8_Date",
				"提交"};
		String[] eExpand = {"universal","universal","universal","universal","universal","uniValue","universal"};

		Integer[] type = {3,
				3,2,
				4,
				0,7,
				9};
		Integer[] tExpand = {0,0,0,0,0,6,7};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.setcExpand(cExpand);
		m.seteItems(eItems);
		m.seteExpand(eExpand);
		m.setType(type);
		m.settExpand(tExpand);

		//是该页面对应的实体类
		m.setEntity(PipeInstallSafeChecki.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("uniValue", new String[]{"合格", "不合格"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems, checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static MenuDetailUIDomain getTab14Data(){
		String [] cItems = {"工业管道安装竣工资料审查报告记录",
				"特种设备安装改造维修告知书","审查结果","结果说明",
				"安装单位现场质保体系及人员任命书","审查结果","结果说明",
				"设计图纸及其技术要求（说明）","审查结果","结果说明",
				"施工组织设计（或施工方案）","审查结果","结果说明",
				"焊接工艺规程（焊接作业指导书）","审查结果","结果说明",
				"无损检测工艺和方案","审查结果","结果说明",
				"压力管道焊工汇总登记表及其资格复印件","审查结果","结果说明",
				"无损检测人员汇总登记表及其资格复印件","审查结果","结果说明",
				"管道组成件（含焊材）质证书及检查验收记录","审查结果","结果说明",
				"管道组成件理化试验报告","审查结果","结果说明",
				"管件加工记录","审查结果","结果说明",
				"阀门试验记录","审查结果","结果说明",
				"组对安装施工记录","审查结果","结果说明",
				"管道焊接施工记录","审查结果","结果说明",
				"补偿装置安装记录","审查结果","结果说明",
				"支、吊架安装记录","审查结果","结果说明",
				"隐蔽工程（封闭）记录","审查结果","结果说明",
				"管道焊缝热处理报告","审查结果","结果说明",
				"无损检测报告","审查结果","结果说明",
				"强度及泄漏性试验报告","审查结果","结果说明",
				"通球、吹扫及清洗记录","审查结果","结果说明",
				"安全保护装置调试记录","审查结果","结果说明",
				"防腐施工、绝缘测试记录","审查结果","结果说明",
				"静电测试记录","审查结果","结果说明",
				"保温施工记录","审查结果","结果说明",
				"设计变更通知（确认）单","审查结果","结果说明",
				"竣工图（包含单线图）","审查结果","结果说明",
				"备注",
				"监检人员","日期",
				"提交"};
		String [] eItems = {"工业管道安装竣工资料审查报告记录",
				"特种设备安装改造维修告知书","pi_EquIns_Check","pi_EquIns_Result",
				"安装单位现场质保体系及人员任命书","pi_Assur_Check","pi_Assur_Result",
				"设计图纸及其技术要求（说明）","pi_Explain_Check","pi_Explain_Result",
				"施工组织设计（或施工方案）","pi_Cons_Check","pi_Cons_Result",
				"焊接工艺规程（焊接作业指导书）","pi_Wel_Check","pi_Wel_Result",
				"无损检测工艺和方案","pi_NDE_Check","pi_NDE_Result",
				"压力管道焊工汇总登记表及其资格复印件","pi_WelReg_Check","pi_WelReg_Result",
				"无损检测人员汇总登记表及其资格复印件","pi_NDEBook_Check","pi_NDEBook_Result",
				"管道组成件（含焊材）质证书及检查验收记录","pi_Compon_Check","pi_Compon_Result",
				"管道组成件理化试验报告","pi_Compon_Rep_Check","pi_Compon_Rep_Result",
				"管件加工记录","pi_Proc_Check","pi_Proc_Result",
				"阀门试验记录","pi_Valve_Check","pi_Valve_Result",
				"组对安装施工记录","pi_InsCons_Check","pi_InsCons_Result",
				"管道焊接施工记录","pi_WelCons_Check","pi_WelCons_Result",
				"补偿装置安装记录","pi_compen_Check","pi_compen_Result",
				"支、吊架安装记录","pi_Hanger_Check","pi_Hanger_Result",
				"隐蔽工程（封闭）记录","pi_Hidden_Check","pi_Hidden_Result",
				"管道焊缝热处理报告","pi_WelHeat_Check","pi_WelHeat_Result",
				"无损检测报告","pi_NDERep_Check","pi_NDERep_Result",
				"强度及泄漏性试验报告","pi_LeakRep_Check","pi_LeakRep_Result",
				"通球、吹扫及清洗记录","pi_DryRep_Check","pi_DrykRep_Result",
				"安全保护装置调试记录","pi_SafeEqu_Check","pi_SafeEqu_Result",
				"防腐施工、绝缘测试记录","pi_ProTest_Check","pi_ProTest_Result",
				"静电测试记录","pi_Sta_Ele_Check","pi_Sta_Ele_Result",
				"保温施工记录","pi_InsTem_Check","pi_InsTem_Result",
				"设计变更通知（确认）单","pi_Change_Check","pi_Change_Result",
				"竣工图（包含单线图）","pi_Complete_Pic_Check","pi_Complete_Pic_Result",
				"pi_Complete_Remark",
				"pi_Complete_Per","pi_Complete_Date",
				"提交"};
		Integer[] type = {3,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				3,6,0,
				4,
				0,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(PipeInstallCompleteInf.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("pi_EquIns_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_Assur_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_Explain_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_Cons_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_Wel_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_NDE_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_WelReg_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_NDEBook_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_Compon_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_Compon_Rep_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_Proc_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_Valve_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_InsCons_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_WelCons_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_compen_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_Hanger_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_Hidden_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_WelHeat_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_NDERep_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_LeakRep_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_DryRep_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_SafeEqu_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_ProTest_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_Sta_Ele_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_InsTem_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_Change_Check",  new String[]{"符合要求","不符合要求"});
		checkBoxItems.put("pi_Complete_Pic_Check",  new String[]{"符合要求","不符合要求"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems,checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;
		return m;

	}

	public static MenuDetailUIDomain getTab15Data(){
		String [] cItems = {"遗留质量问题的处理意见记录",
				"遗留问题","处理意见",
				"监检人员","日期",
				"提交"};
		String [] eItems = {"遗留质量问题的处理意见记录",
				"pi_Left_Prob","pi_Left_Opin",
				"pi_Left_Per_Name","pi_Left_Date",
				"提交"};
		Integer[] type = {3,
				4,4,
				0,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(PipeInstallLeftProblem.getInstance());

		return m;

	}

	public static MenuDetailUIDomain getTab16Data(){
		String [] cItems = {"压力管道底片复审记录表",
				"管线编号","检测比例","评定标准","拍片总数",
				"抽查片数","抽查比例","合格级别",
				"抽查","",
				"监检人员","日期",
				"提交"};
		String [] cExpand = {"管口号/底片号","抽查结果","底片数量","备注"};

		String [] eItems = {"压力管道底片复审记录表",
				"pi_Rev_PID","pi_Rev_Ration","pi_Rev_Cri","pi_Rev_Num",
				"pi_Rev_Che_Num","pi_Rev_Che_Ration","pi_Rev_Gra",
				"抽查","pi_Rev_value",
				"pi_Rev_Per_Name","pi_Rev_Date",
				"提交"};
		String[] eExpand = {"universal","uniValue","universal","universal"};

		Integer[] type = {3,
				0,0,0,0,
				0,0,0,
				3,2,
				0,7,
				9};
		Integer[] tExpand = {0,6,0,0};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.setcExpand(cExpand);
		m.seteItems(eItems);
		m.seteExpand(eExpand);
		m.setType(type);
		m.settExpand(tExpand);

		//是该页面对应的实体类
		m.setEntity(PipeInstallReview.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("uniValue", new String[]{"认可", "需重拍", "需重评"});

		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		generateBooleans(checkBoxItems, checkBoxBooleans);
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
