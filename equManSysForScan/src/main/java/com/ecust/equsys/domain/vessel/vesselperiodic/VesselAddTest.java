package com.ecust.equsys.domain.vessel.vesselperiodic;

import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselAddTest extends VesselBaseEntity {

	public static VesselAddTest vesselAddTest = null;

	public VesselAddTest() {
		super();
		this.db_Description = "附加检验记录";
		this.method = "updateVesselAddTest";//上传servlet的方法名称，很重要

	}

	public static VesselAddTest getInstance() {
		if (vesselAddTest == null) {
			vesselAddTest = new VesselAddTest();
		}
		return vesselAddTest;
	}

	public String v_Sta_Ele_ID;//测试仪器型号
	public String v_Sta_Ele_Acc;//仪器精度
	public String v_Sta_Ele_Res;//导静电电阻
	public String v_Sta_Ele_Connection;//连接处电阻
	public String v_Add_Ins_Type;//真空仪型号
	public String v_Add_Ins_Acc;//仪器精度
	public String v_Add_Ins_Degree;//空载时真空度
	public String v_Add_Ins_Degree1;//承载时真空度
	public String v_Tank_Type;//真空泵型号
	public String v_Tank_Time;//抽真空时间
	public String v_Tank_Degree;//罐内真空度
	public String v_Tank_Med;//置换介质
	public String v_Tank_Pre;//置换压力
	public String v_Tank_Discharge_Pre;//排放后罐内压力
	public String v_Tank_Content;//罐内气体含氧量(≤3%)
	public String v_Cor_Name;//介质名称
	public String v_Cor_Compon;//腐蚀介质成分
	public String v_Cor_Content;//腐蚀介质含量
	public String v_Cor_Speed;//腐蚀速度
	public String v_Cor_Reason;//腐蚀机理
	public String v_Add_Others;//其他检验、检测
	public String v_Add_Result;//检测结果
	public String v_Add_Date;//检测
	public String v_Add_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselAddTest{" +
				"v_Sta_Ele_ID='" + v_Sta_Ele_ID + '\'' +
				", v_Sta_Ele_Acc='" + v_Sta_Ele_Acc + '\'' +
				", v_Sta_Ele_Res='" + v_Sta_Ele_Res + '\'' +
				", v_Sta_Ele_Connection='" + v_Sta_Ele_Connection + '\'' +
				", v_Add_Ins_Type='" + v_Add_Ins_Type + '\'' +
				", v_Add_Ins_Acc='" + v_Add_Ins_Acc + '\'' +
				", v_Add_Ins_Degree='" + v_Add_Ins_Degree + '\'' +
				", v_Add_Ins_Degree1='" + v_Add_Ins_Degree1 + '\'' +
				", v_Tank_Type='" + v_Tank_Type + '\'' +
				", v_Tank_Time='" + v_Tank_Time + '\'' +
				", v_Tank_Degree='" + v_Tank_Degree + '\'' +
				", v_Tank_Med='" + v_Tank_Med + '\'' +
				", v_Tank_Pre='" + v_Tank_Pre + '\'' +
				", v_Tank_Discharge_Pre='" + v_Tank_Discharge_Pre + '\'' +
				", v_Tank_Content='" + v_Tank_Content + '\'' +
				", v_Cor_Name='" + v_Cor_Name + '\'' +
				", v_Cor_Compon='" + v_Cor_Compon + '\'' +
				", v_Cor_Content='" + v_Cor_Content + '\'' +
				", v_Cor_Speed='" + v_Cor_Speed + '\'' +
				", v_Cor_Reason='" + v_Cor_Reason + '\'' +
				", v_Add_Others='" + v_Add_Others + '\'' +
				", v_Add_Result='" + v_Add_Result + '\'' +
				", v_Add_Date='" + v_Add_Date + '\'' +
				", v_Add_Check_Date='" + v_Add_Check_Date + '\'' +
				'}';
	}
}
