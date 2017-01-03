package com.ecust.equsys.domain.vessel.vesselperiodic;

import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselAmmoniaTest extends VesselBaseEntity {

	public static VesselAmmoniaTest vesselAmmoniaTest = null;

	public VesselAmmoniaTest() {
		super();
		this.db_Description = "氨检漏试验记录";
		this.method = "updateVesselAmmoniaTest";//上传servlet的方法名称，很重要

	}

	public static VesselAmmoniaTest getInstance() {
		if (vesselAmmoniaTest == null) {
			vesselAmmoniaTest = new VesselAmmoniaTest();
		}
		return vesselAmmoniaTest;
	}

	public String v_Amm_De_Pre;//试验压力
	public String v_Amm_Level;//氨浓度
	public String v_Amm_Range;//压力表量程
	public String v_Amm_Acc;//精度
	public String v_Amm_Tem;//环境温度
	public String v_Amm_Test;//试纸（试剂）
	public String v_Amm_Keep_Tem;//保压时间
	public String v_Amm_Part;//试验部位
	public String v_Amm_Result;//试验结果
	public String v_Amm_Date;//检测
	public String v_Amm_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselAmmoniaTest{" +
				"v_Amm_De_Pre='" + v_Amm_De_Pre + '\'' +
				", v_Amm_Level='" + v_Amm_Level + '\'' +
				", v_Amm_Range='" + v_Amm_Range + '\'' +
				", v_Amm_Acc='" + v_Amm_Acc + '\'' +
				", v_Amm_Tem='" + v_Amm_Tem + '\'' +
				", v_Amm_Test='" + v_Amm_Test + '\'' +
				", v_Amm_Keep_Tem='" + v_Amm_Keep_Tem + '\'' +
				", v_Amm_Part='" + v_Amm_Part + '\'' +
				", v_Amm_Result='" + v_Amm_Result + '\'' +
				", v_Amm_Date='" + v_Amm_Date + '\'' +
				", v_Amm_Check_Date='" + v_Amm_Check_Date + '\'' +
				'}';
	}
}
