package com.ecust.equsys.domain.vessel.vesselperiodic;

import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselPreTest extends VesselBaseEntity {

	public static VesselPreTest vesselPreTest = null;

	public VesselPreTest() {
		super();
		this.db_Description = "耐压试验记录";
		this.method = "updateVesselPreTest";//上传servlet的方法名称，很重要

	}

	public static VesselPreTest getInstance() {
		if (vesselPreTest == null) {
			vesselPreTest = new VesselPreTest();
		}
		return vesselPreTest;
	}

	public String v_Pre_De;//设计压力
	public String v_Pre_Permission;//允许/监控使用压力
	public String v_Pre_Test_Pre;//试验压力
	public String v_Pre_De_Main_Mat;//主体材质
	public String v_Pre_Med;//试验介质
	public String v_Pre_Med_Tem;//介质温度
	public String v_Pre_Part;//试压部位
	public String v_Pre_Tem;//环境温度
	public String v_Pre_Range;//压力表量程
	public String v_Pre_Acc;//精度
	public String v_Pre_Type;//机泵型号
	public String v_Pre_Check_Stress;//试验前应力校核结果：
	public String v_Pre_Process;//试验程序记录
	public String v_Pre_Result;//试验结果
	public String v_Pre_Date;//检测
	public String v_Pre_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselPreTest{" +
				"v_Pre_De='" + v_Pre_De + '\'' +
				", v_Pre_Permission='" + v_Pre_Permission + '\'' +
				", v_Pre_Test_Pre='" + v_Pre_Test_Pre + '\'' +
				", v_Pre_De_Main_Mat='" + v_Pre_De_Main_Mat + '\'' +
				", v_Pre_Med='" + v_Pre_Med + '\'' +
				", v_Pre_Med_Tem='" + v_Pre_Med_Tem + '\'' +
				", v_Pre_Part='" + v_Pre_Part + '\'' +
				", v_Pre_Tem='" + v_Pre_Tem + '\'' +
				", v_Pre_Range='" + v_Pre_Range + '\'' +
				", v_Pre_Acc='" + v_Pre_Acc + '\'' +
				", v_Pre_Type='" + v_Pre_Type + '\'' +
				", v_Pre_Check_Stress='" + v_Pre_Check_Stress + '\'' +
				", v_Pre_Process='" + v_Pre_Process + '\'' +
				", v_Pre_Result='" + v_Pre_Result + '\'' +
				", v_Pre_Date='" + v_Pre_Date + '\'' +
				", v_Pre_Check_Date='" + v_Pre_Check_Date + '\'' +
				'}';
	}
}
