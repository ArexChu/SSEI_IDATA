package com.ecust.equsys.base.impl.vesseldetail.data;


import com.ecust.equsys.domain.MenuDetailUIDomain;
import com.ecust.equsys.domain.vessel.vesselannual.VesselAnnualConclusion;
import com.ecust.equsys.domain.vessel.vesselannual.VesselAnnualTest;

import java.util.HashMap;
import java.util.Map;

public class VesselAnnualData {

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
		 String [] cItems = {"压力容器年度检查结论记录",
				 "设备型号","检查结论",
				 "检查依据(《压力容器使用管理规则》)",
				 "允许（监控）使用参数",
				 "压力","温度","介质(Pa)","下次定期检验日期",
				 "安全状况等级","下次年度检验日期",
				 "需要说明情况","检验发现的问题及处理意见",
				 "检验","校核",
				 "提交"};

		 String [] eItems = {"压力容器年度检查结论记录",
				 "v_Ann_Type","v_Ann_Conclusion",
				 "v_Ann_Basic",
				 "允许（监控）使用参数",
				 "v_Ann_Pre","v_Ann_Tem","v_Ann_Med","下次定期检验日期",
				 "v_Ann_Level","下次年度检验日期",
				 "v_Ann_Explan","检验发现的问题及处理意见",
				 "v_Ann_Test","v_Ann_Check",
				 "提交"};

		 Integer[] type = {3,
				 0,6,
				 4,
				 0,
				 0,0,0,7,
				 0,7,
				 4,4,
				 7,7,
				 9};

		 MenuDetailUIDomain m = new MenuDetailUIDomain();
		 m.setcItems(cItems);
		 m.seteItems(eItems);
		 m.setType(type);
		 //是该页面对应的实体类
		 m.setEntity(VesselAnnualConclusion.getInstance());


		 Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		 Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		 checkBoxItems.put("v_Ann_Conclusion",  new String[]{"符合要求","基本符合要求","不符合要求"});

		 /**
		  * 根据checkBoxItems生成checkBoxBooleans
		  */
		 generateBooleans(checkBoxItems,checkBoxBooleans);
		 m.checkBoxItems = checkBoxItems;
		 m.checkBoxBooleans = checkBoxBooleans;
		 return m;

	}

	public static MenuDetailUIDomain getTab2Data(){
		String [] cItems = {"压力容器年度检查记录附页",
				"安全管理",
				"安全管理制度、安全操作规程","备注",
				"设计、制造、安装、改造、维修等资料","备注",
				"《使用登记表》、《使用登记证》","备注",
				"作业人员持证情况","备注",
				"日常维护保养、运行、定期安全检查记录","备注",
				"年度检查、定期检验报告及问题处理情况","备注",
				"安全附件校验、修理和更换记录","备注",
				"移动式压力容器装卸记录","备注",
				"应急预案和演练记录","备注",
				"压力容器事故、故障情况记录","备注",
				"容器本体及运行情况",
				"铭牌、漆色、标志和使用登记证的标注","备注",
				"本体、接口（阀门、管路）部位、焊接接头缺陷情况检查","备注",
				"外表面腐蚀、结霜、结露情况检查","备注",
				"隔热层检查","备注",
				"检漏孔、信号孔检查","备注",
				"压力容器与相邻管道或者构件异常振动、响声或者相互摩擦情况检查","备注",
				"支承或者支座、基础、紧固螺栓检查","备注",
				"排放（疏水、排污）装置检查","备注",
				"运行期间超压、超温、超量等情况检查","备注",
				"接地装置检查","备注",
				"监控措施是否有效实施情况检查","备注",
				"快开门式压力容器安全联锁功能检查","备注",
				"安全附件",
				"压力表","备注",
				"液位计","备注",
				"测温仪表","备注",
				"爆破片装置","备注",
				"安全阀","备注",
				"易熔塞","备注",
				"导静电装置","备注",
				"紧急切断装置","备注",
				"专项要求","是否合格","备注",
				"专项要求","是否合格","备注",
				"专项要求","是否合格","备注",
				"提交"};
		String [] eItems = {"压力容器年度检查记录附页",
				"安全管理",
				"v_Ann_1","v_Ann_1_Reamrk",
				"v_Ann_2","v_Ann_2_Reamrk",
				"v_Ann_3","v_Ann_3_Reamrk",
				"v_Ann_4","v_Ann_4_Reamrk",
				"v_Ann_5","v_Ann_5_Reamrk",
				"v_Ann_6","v_Ann_6_Reamrk",
				"v_Ann_7","v_Ann_7_Reamrk",
				"v_Ann_8","v_Ann_8_Reamrk",
				"v_Ann_9","v_Ann_9_Reamrk",
				"v_Ann_10","v_Ann_10_Reamrk",
				"容器本体及运行情况",
				"v_Ann_11","v_Ann_11_Reamrk",
				"v_Ann_12","v_Ann_12_Reamrk",
				"v_Ann_13","v_Ann_13_Reamrk",
				"v_Ann_14","v_Ann_14_Reamrk",
				"v_Ann_15","v_Ann_15_Reamrk",
				"v_Ann_16","v_Ann_16_Reamrk",
				"v_Ann_17","v_Ann_17_Reamrk",
				"v_Ann_18","v_Ann_18_Reamrk",
				"v_Ann_19","v_Ann_19_Reamrk",
				"v_Ann_20","v_Ann_20_Reamrk",
				"v_Ann_21","v_Ann_21_Reamrk",
				"v_Ann_22","v_Ann_22_Reamrk",
				"安全附件",
				"v_Ann_23","v_Ann_23_Reamrk",
				"v_Ann_24","v_Ann_24_Reamrk",
				"v_Ann_25","v_Ann_25_Reamrk",
				"v_Ann_26","v_Ann_26_Reamrk",
				"v_Ann_27","v_Ann_27_Reamrk",
				"v_Ann_28","v_Ann_28_Reamrk",
				"v_Ann_29","v_Ann_29_Reamrk",
				"v_Ann_30","v_Ann_30_Reamrk",
				"v_Ann_31_Content","v_Ann_31","v_Ann_31_Reamrk",
				"v_Ann_32_Content","v_Ann_32","v_Ann_32_Reamrk",
				"v_Ann_33_Content","v_Ann_33","v_Ann_33_Reamrk",
				"提交"};
		Integer[] type = {3,
				3,
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
				3,
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
				3,
				6,0,
				6,0,
				6,0,
				6,0,
				6,0,
				6,0,
				6,0,
				6,0,
				0,6,0,
				0,6,0,
				0,6,0,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselAnnualTest.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("v_Ann_1",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_2",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_3",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_4",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_5",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_6",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_7",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_8",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_9",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_10",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_11",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_12",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_13",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_14",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_15",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_16",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_17",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_18",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_19",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_20",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_21",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_22",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_23",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_24",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_25",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_26",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_27",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_28",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_29",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_30",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_31",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_32",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Ann_33",  new String[]{"无","合格","不合格"});

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
