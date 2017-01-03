package com.ecust.equsys.domain.vessel.vesselperiodic;

import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselHeTest extends VesselBaseEntity {

	public static VesselHeTest vesselHeTest = null;

	public VesselHeTest() {
		super();
		this.db_Description = "氦、卤素检漏试验记录";
		this.method = "updateVesselHeTest";//上传servlet的方法名称，很重要

	}

	public static VesselHeTest getInstance() {
		if (vesselHeTest == null) {
			vesselHeTest = new VesselHeTest();
		}
		return vesselHeTest;
	}

	public String v_He_Equ_Mod;//仪器型号
	public String v_He_Equ_ID;//仪器编号
	public String v_He_Equ_Acc;//仪器精度量程
	public String v_He_Test_Method;//检测方式
	public String v_He_Type;//试漏气体
	public String v_He_Pre;//试验压力
	public String v_He_Keep;//保压时间
	public String v_He_Ration;//泄漏率
	public String v_He_Part;//试验部位
	public String v_He_Result;//试验结果
	public String v_He_Date;//检测
	public String v_He_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselHeTest{" +
				"v_He_Equ_Mod='" + v_He_Equ_Mod + '\'' +
				", v_He_Equ_ID='" + v_He_Equ_ID + '\'' +
				", v_He_Equ_Acc='" + v_He_Equ_Acc + '\'' +
				", v_He_Test_Method='" + v_He_Test_Method + '\'' +
				", v_He_Type='" + v_He_Type + '\'' +
				", v_He_Pre='" + v_He_Pre + '\'' +
				", v_He_Keep='" + v_He_Keep + '\'' +
				", v_He_Ration='" + v_He_Ration + '\'' +
				", v_He_Part='" + v_He_Part + '\'' +
				", v_He_Result='" + v_He_Result + '\'' +
				", v_He_Date='" + v_He_Date + '\'' +
				", v_He_Check_Date='" + v_He_Check_Date + '\'' +
				'}';
	}
}
