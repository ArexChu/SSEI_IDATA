package com.ecust.equsys.domain.vessel.vesselperiodic;

import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselAirTest extends VesselBaseEntity {

	public static VesselAirTest vesselAirTest = null;

	public VesselAirTest() {
		super();
		this.db_Description = "气密性试验记录";
		this.method = "updateVesselAirTest";//上传servlet的方法名称，很重要

	}

	public static VesselAirTest getInstance() {
		if (vesselAirTest == null) {
			vesselAirTest = new VesselAirTest();
		}
		return vesselAirTest;
	}

	public String v_Air_De_Pre;//设计压力
	public String v_Air_Permission_Pre;//允许/监控使用压力
	public String v_Air_Pre_Pre;//耐压试验压力
	public String v_Air_Pre;//气密性试验压力
	public String v_Air_Med;//试验介质
	public String v_Air_Med_Tem;//介质温度
	public String v_Air_Tem;//环境温度
	public String v_Air_Volume;//容积
	public String v_Air_Comp_Type;//压缩机型号及编号
	public String v_Air_Valve_Type;//安全阀型号及编号
	public String v_Air_Range;//压力表量程
	public String v_Air_Acc;//精度
	public String v_Air_Part;//试验部位
	public String v_Air_Process;//试验程序记录
	public String v_Air_Result;//试验结果
	public String v_Air_Remark;//试验结果
	public String v_Air_Date;//检测
	public String v_Air_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselAirTest{" +
				"v_Air_De_Pre='" + v_Air_De_Pre + '\'' +
				", v_Air_Permission_Pre='" + v_Air_Permission_Pre + '\'' +
				", v_Air_Pre_Pre='" + v_Air_Pre_Pre + '\'' +
				", v_Air_Pre='" + v_Air_Pre + '\'' +
				", v_Air_Med='" + v_Air_Med + '\'' +
				", v_Air_Med_Tem='" + v_Air_Med_Tem + '\'' +
				", v_Air_Tem='" + v_Air_Tem + '\'' +
				", v_Air_Volume='" + v_Air_Volume + '\'' +
				", v_Air_Comp_Type='" + v_Air_Comp_Type + '\'' +
				", v_Air_Valve_Type='" + v_Air_Valve_Type + '\'' +
				", v_Air_Range='" + v_Air_Range + '\'' +
				", v_Air_Acc='" + v_Air_Acc + '\'' +
				", v_Air_Part='" + v_Air_Part + '\'' +
				", v_Air_Process='" + v_Air_Process + '\'' +
				", v_Air_Result='" + v_Air_Result + '\'' +
				", v_Air_Remark='" + v_Air_Remark + '\'' +
				", v_Air_Date='" + v_Air_Date + '\'' +
				", v_Air_Check_Date='" + v_Air_Check_Date + '\'' +
				'}';
	}
}
