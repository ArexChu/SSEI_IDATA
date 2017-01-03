package com.ecust.equsys.base.impl.vesseldetail.data;

import com.ecust.equsys.domain.MenuDetailUIDomain;
import com.ecust.equsys.domain.vessel.VesselInfo;

import java.util.HashMap;
import java.util.Map;

public class VesselInfoData {

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
	public static MenuDetailUIDomain getVesselInfo() {
		String [] cItems = {"使用单位名称","设计单位名称","制造单位名称","安装单位名称",
				"注册登记机构","设备代码","使用证号","产品编号",
				"单位内编号","容器名称","设备使用地点","设备品种",
				"主体结构形式","容器图号","设计日期","产品标准",
				"制造日期","制造单位许可号","安装告知书号","安装单位许可号",
				"安装完成日期","设计单位许可号","投入使用日期","设计使用年限",
				"支座型式","安装型式","保温绝热方式","容器内径",
				"容器高/长(mm)","容积、换热面积","容积m3、换热面积m2",
				"最大允许充装量","封头",
				"性能参数","性能参数",
				"设计压力","设计压力MPa","设计压力","设计压力MPa",
				"工作压力","工作压力MPa","工作压力","工作压力MPa",
				"设计温度","设计温度℃","设计温度","设计温度℃",
				"工作温度","工作温度℃","工作温度","工作温度℃",
				"腐蚀裕度","筒体","封头",
				"介质","介质","介质","介质",
				"材质","筒体","封头","夹套、换热器","夹套、换热器","衬里",
				"厚度(mm)","筒体","封头","夹套、换热器","夹套、换热器","衬里",
				"提交"};
		String [] eItems = {"v_Use_Com","v_De_Com","v_Man_Com","v_Install_Com",
				"v_Reg_Com","v_Equ_ID","v_Use_ID","v_Product_ID",
				"v_Inuse_Com_ID","v_Name","v_Use_Addr","v_Type",
				"v_Mainbody_Str","v_Pic_ID","v_De_Date","v_Product_Cri",
				"v_Man_Date","v_M_Man_Permission_ID","v_M_Ins_ID","v_M_Ins_Permission_ID",
				"v_M_Ins_End_Date","v_M_De_ID","v_Start_Date","v_De_Life",
				"v_Seat_Type","v_Install_Type","v_Pro_Ins_Type","v_Inside_Dia",
				"v_Len","v_C_Volume","v_Volume",
				"v_Max_Volume","v_Head",
				"性能参数","性能参数",
				"v_De_Pre_C_Shell","v_De_Pre_Shell","v_De_Pre_C_Jacket","v_De_Pre_Jacket",
				"v_Wo_Pre_C_Shell","v_Wo_Pre_Shell","v_Wo_Pre_C_Jacket","v_Wo_Pre_Jacket",
				"v_De_Tem_C_Shell","v_De_Tem_Shell","v_De_Tem_C_Jacket","v_De_Tem_Jacket",
				"v_Wo_Tem_C_Shell","v_Wo_Tem_Shell","v_Wo_Tem_C_Jacket","v_Wo_Tem_Jacket",
				"腐蚀裕度","v_Cor_Barrel_Body","v_Cor_Seal_Head",
				"v_Med_C_Shell","v_Med_Shell","v_Med_C_Jacket","v_Med_Jacket",
				"材质","v_Ma_Barrel_Body","v_Ma_Seal_Head","v_Ma_C_Jacket","v_Ma_Jacket","v_Ma_Liner",
				"厚度(mm)","v_Thi_Barrel_Body","v_Thi_Seal_Head","v_Thi_C_Jacket","v_Thi_Jacket","v_Thi_Liner",
				"submit"};
		Integer[] type = {0,0,0,0,
				0,0,0,0,
				0,0,0,0,
				0,0,7,0,
				7,0,0,0,
				7,0,7,0,
				0,0,0,0,
				0,6,0,
				0,0,
				1,3,
				6,0,6,0,
				6,0,6,0,
				6,0,6,0,
				6,0,6,0,
				3,0,0,
				6,0,6,0,
				3,0,0,6,0,0,
				3,0,0,6,0,0,
				9};
		
		MenuDetailUIDomain m = new MenuDetailUIDomain();
		m.setcItems(cItems);
		m.seteItems(eItems);
		m.setType(type);
		//是该页面对应的实体类
		m.setEntity(VesselInfo.getInstance());
		
		Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
		Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
		checkBoxItems.put("v_C_Volume",  new String[]{"容积","换热面积"});
		checkBoxItems.put("v_De_Pre_C_Shell",  new String[]{"壳体","壳程"});
		checkBoxItems.put("v_De_Pre_C_Jacket",  new String[]{"夹套","管程"});
		checkBoxItems.put("v_De_Tem_Shell",  new String[]{"壳体","壳程"});
		checkBoxItems.put("v_De_Tem_C_Jacket",  new String[]{"夹套","管程"});
		checkBoxItems.put("v_Wo_Pre_C_Shell",  new String[]{"壳体","壳程"});
		checkBoxItems.put("v_Wo_Pre_C_Jacket",  new String[]{"夹套","管程"});
		checkBoxItems.put("v_Wo_Tem_C_Shell",  new String[]{"壳体","壳程"});
		checkBoxItems.put("v_Wo_Tem_C_Jacket",  new String[]{"夹套","管程"});
		checkBoxItems.put("v_Med_C_Shell",  new String[]{"壳体","壳程"});
		checkBoxItems.put("v_Med_C_Jacket",  new String[]{"夹套","管程"});
		checkBoxItems.put("v_Ma_C_Jacket",  new String[]{"夹套","换热管"});
		checkBoxItems.put("v_Thi_C_Jacket",  new String[]{"夹套","换热管"});
		/**
		 * 根据checkBoxItems生成checkBoxBooleans
		 */
		VesselPeriodicData.generateBooleans(checkBoxItems,checkBoxBooleans);
		m.checkBoxItems = checkBoxItems;
		m.checkBoxBooleans = checkBoxBooleans;


        return m;
		
	}
}
