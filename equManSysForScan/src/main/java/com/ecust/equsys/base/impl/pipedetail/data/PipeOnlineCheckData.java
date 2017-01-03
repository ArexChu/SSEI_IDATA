package com.ecust.equsys.base.impl.pipedetail.data;


import com.ecust.equsys.domain.MenuDetailUIDomain;
import com.ecust.equsys.domain.pipe.pipeionlinecheck.PipeOnlineSubCheck;
import com.ecust.equsys.domain.pipe.pipeionlinecheck.PipeOnlineThiCheck;
import com.ecust.equsys.domain.pipe.pipeoverallcheck.PipeAssTable;
import com.ecust.equsys.domain.pipe.pipeoverallcheck.PipeHardTest;
import com.ecust.equsys.domain.pipe.pipeoverallcheck.PipeLeakTest;
import com.ecust.equsys.domain.pipe.pipeoverallcheck.PipeMacroTest;
import com.ecust.equsys.domain.pipe.pipeoverallcheck.PipeMetTest;
import com.ecust.equsys.domain.pipe.pipeoverallcheck.PipePreTest;
import com.ecust.equsys.domain.pipe.pipeoverallcheck.PipeSPDTest;
import com.ecust.equsys.domain.pipe.pipeoverallcheck.PipeThiCheck;

import java.util.HashMap;
import java.util.Map;

public class PipeOnlineCheckData {
	
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
		String [] cItems = {"管道测厚检查",
				"管道编号","表面状况","测厚仪器型号","测厚仪器精度",
				"测厚仪器编号","使用状态","管件测厚比例(%)","管子测厚比例(%)",
				"实测点数","实测最小壁厚(mm)",
				"",
				"上次在线检验报告编号","上次在线检验单线图编号",
				"检验",
				"提交"};
		String [] cExpand = {"测点编号","测点厚度(mm)"};

		String [] eItems = {"管道测厚检查",
				"p_Thi_Name","p_Sur_Sta","p_Equ_Mod","p_Equ_Acc",
				"p_Equ_ID","p_Use_Sta","p_Thi_ratio_1","p_Thi_ratio_2",
				"p_Thi_Num","p_Min_Thi",
				"p_Thi_Value",
				"m_Ol_Last_ID","m_OL_Single_ID",
				"p_Thi_Date",
				"submit"};
		String[] eExpand = {"universal", "universal"};

		Integer[] type = {3,
				0,5,0,0,
				0,0,0,0,
				0,0,
				2,
				0,0,
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
		m.setEntity(PipeOnlineThiCheck.getInstance());

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

	public static MenuDetailUIDomain getTab2Data(){
		String [] cItems = {"在线检验记录",
				"资料准备","记录审查","问题记载",
				"检查项目及检查结果",
				"管道表面","焊接接头","泄漏",
				"绝热层","防腐层","管道振动",
				"支吊架","阀 门","膨胀节",
				"法兰","管道结构","管道标识",
				"法兰间接触电阻","对地电阻","壁厚测定",
				"其它","下次在线检验日期",
				"安全保护装置",
				"压力表","测温仪表","安全阀","爆破片装置","其它",
				"缺陷情况说明","缺陷处理情况说明","检验结果",
				"检验","校核",
				"提交"};

		String [] eItems = {"在线检验记录",
				"m_OL_Prep","m_OL_Check","问题记载",
				"检查项目及检查结果",
				"p_Surface","p_Wel","p_Leak",
				"p_Ins","p_Pro","p_Vib",
				"p_Hanger","p_Valve","p_Exp",
				"p_Fla","p_Str","p_Ide",
				"p_Fla_Res","p_Gro_Res","p_Thi",
				"p_Other","下次在线检验日期",
				"安全保护装置",
				"m_OL_Pre","m_OL_Tem","m_OL_Valve","m_OL_Rup","m_OL_Others",
				"m_OL_Bug","m_OL_Bug_Sol","m_OL_Result",
				"m_Test_Date","m_Check_Date",
				"提交"};

		Integer[] type = {3,
				5,5,4,
				3,
				0,0,0,
				0,0,0,
				0,0,0,
				0,0,0,
				0,0,0,
				0,7,
				3,
				0,0,0,0,0,
				4,4,4,
				7,7,
				9};

		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);

		//是该页面对应的实体类
		m.setEntity(PipeOnlineSubCheck.getInstance());

		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("m_OL_Prep", new String[]{"管道平面布置图","管道工艺流程图","单线图","历次在线检验报告","历次全面检验报告",
				"运行参数等技术资料"});
		checkBoxItems.put("m_OL_Check", new String[]{"管道运行记录"," 管道开停车记录","管道隐患监护措施实施情况记录", "管道改造施工记录",
				"检修报告","管道事故处理记录","检验方案"});

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
