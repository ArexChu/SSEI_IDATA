package com.ecust.equsys.base.impl.vesseldetail.data;


import com.ecust.equsys.domain.MenuDetailUIDomain;
import com.ecust.equsys.domain.vessel.vesselcheck.VesselCheckConclusion;
import com.ecust.equsys.domain.vessel.vesselcheck.VesselCheckTest;

import java.util.HashMap;
import java.util.Map;

public class VesselCheckData {

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
		 String [] cItems = {"压力容器验收检查记录",
				 "检查结论","委托单位","委托单位联系人",
				 "检查依据(1、相关单位委托书\n" + "2、有关压力容器规范规章标准)",
				 "允许（监控）使用参数",
				 "压力","温度","介质(Pa)","其他",
				 "安全状况等级","下次年度检验日期",
				 "需要说明情况","检验发现的问题及处理意见",
				 "检验","校核",
				 "提交"};

		 String [] eItems = {"压力容器验收检查记录",
				 "v_Check_Conclusion","委托单位","委托单位联系人",
				 "v_Check_Basic",
				 "允许（监控）使用参数",
				 "v_Check_Pre","v_Check_Tem","v_Check_Med","v_Check_Other",
				 "v_Check_Level","下次年度检验日期",
				 "v_Check_Explan","v_M_Option",
				 "v_Check_Test","v_Check_Check",
				 "提交"};

		 Integer[] type = {3,
				 6,0,0,
				 4,
				 3,
				 0,0,0,0,
				 0,7,
				 4,4,
				 7,7,
				 9};

		 MenuDetailUIDomain m = new MenuDetailUIDomain();
		 m.setcItems(cItems);
		 m.seteItems(eItems);
		 m.setType(type);
		 //是该页面对应的实体类
		 m.setEntity(VesselCheckConclusion.getInstance());


		 Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		 Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		 checkBoxItems.put("v_Check_Conclusion",  new String[]{"符合要求","基本符合要求","不符合要求"});

		 /**
		  * 根据checkBoxItems生成checkBoxBooleans
		  */
		 generateBooleans(checkBoxItems,checkBoxBooleans);
		 m.checkBoxItems = checkBoxItems;
		 m.checkBoxBooleans = checkBoxBooleans;
		 return m;

	}

	public static MenuDetailUIDomain getTab2Data(){
		String [] cItems = {"资料审查及外观检查记录",
				"检查项目",
				"铭牌","备注",
				"内表面质量","备注",
				"外表面质量","备注",
				"焊缝余高","备注",
				"焊缝错边","备注",
				"焊缝咬边","备注",
				"焊缝棱角度","备注",
				"封头型式","备注",
				"封头与筒体的连接","备注",
				"开孔位置及补强","备注",
				"焊缝的布置及型式","备注",
				"法兰、密封面及其紧固螺栓","备注",
				"堆焊层质量","备注",
				"支承的型式与布置","备注",
				"排放装置的设置","备注",
				"基础开裂倾斜","备注",
				"防腐质量","备注",
				"绝热质量","备注",
				"衬里质量","备注",
				"地脚螺栓","备注",
				"卧式容器的支座膨胀孔","备注",
				"水平度或者铅垂度","备注",
				"快开门安全联锁装置","备注",
				"静电接地","备注",
				"需要说明情况","结论",
				"检验","校对",
				"提交"};
		String [] eItems = {"资料审查及外观检查记录",
				"检查项目",
				"v_Che_1","v_Che_1_Remark",
				"v_Che_3","v_Che_3_Remark",
				"v_Che_5","v_Che_5_Remark",
				"v_Che_7","v_Che_7_Remark",
				"v_Che_9","v_Che_9_Remark",
				"v_Che_11","v_Che_11_Remark",
				"v_Che_13","v_Che_13_Remark",
				"v_Che_15","v_Che_15_Remark",
				"v_Che_17","v_Che_17_Remark",
				"v_Che_19","v_Che_19_Remark",
				"v_Che_21","v_Che_21_Remark",
				"v_Che_23","v_Che_23_Remark",
				"v_Che_2","v_Che_2_Remark",
				"v_Che_4","v_Che_4_Remark",
				"v_Che_6","v_Che_6_Remark",
				"v_Che_8","v_Che_8_Remark",
				"v_Che_10","v_Che_10_Remark",
				"v_Che_12","v_Che_12_Remark",
				"v_Che_14","v_Che_14_Remark",
				"v_Che_16","v_Che_16_Remark",
				"v_Che_18","v_Che_18_Remark",
				"v_Che_20","v_Che_20_Remark",
				"v_Che_22","v_Che_22_Remark",
				"v_Che_24","v_Che_24_Remark",
				"v_Che_Explan","v_Che_Result",
				"v_Che_Date","v_Che_Che_Date",
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
				4,4,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselCheckTest.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("v_Che_1",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_2",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_3",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_4",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_5",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_6",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_7",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_8",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_9",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_10",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_11",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_12",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_13",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_14",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_15",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_16",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_17",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_18",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_19",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_20",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_21",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_22",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_23",  new String[]{"无","合格","不合格"});
		checkBoxItems.put("v_Che_24",  new String[]{"无","合格","不合格"});

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
