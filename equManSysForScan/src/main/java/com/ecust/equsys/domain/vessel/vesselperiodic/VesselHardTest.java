package com.ecust.equsys.domain.vessel.vesselperiodic;

import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselHardTest extends VesselBaseEntity {

	public static VesselHardTest vesselHardTest = null;

	public VesselHardTest() {
		super();
		this.db_Description = "硬度检测记录";
		this.method = "updateVesselHardTest";//上传servlet的方法名称，很重要

	}

	public static VesselHardTest getInstance() {
		if (vesselHardTest == null) {
			vesselHardTest = new VesselHardTest();
		}
		return vesselHardTest;
	}

	public String universal;
	public String v_Hard_Equ_Mode;//测量仪器型号
	public String v_Hard_Equ_ID;//测量仪器编号
	public String v_Hard_Mat;//主体材质
	public String v_Hard_Heat;//热处理状态
	public String v_Hard_Cri;//检测标准
	public String v_Hard_Unit;//硬度单位
	public String v_Hard_Value;//
	public String v_Hard_Result;//
	public String v_Hard_Date;//检测
	public String v_Hard_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselHardTest{" +
				"universal='" + universal + '\'' +
				", v_Hard_Equ_Mode='" + v_Hard_Equ_Mode + '\'' +
				", v_Hard_Equ_ID='" + v_Hard_Equ_ID + '\'' +
				", v_Hard_Mat='" + v_Hard_Mat + '\'' +
				", v_Hard_Heat='" + v_Hard_Heat + '\'' +
				", v_Hard_Cri='" + v_Hard_Cri + '\'' +
				", v_Hard_Unit='" + v_Hard_Unit + '\'' +
				", v_Hard_Value='" + v_Hard_Value + '\'' +
				", v_Hard_Result='" + v_Hard_Result + '\'' +
				", v_Hard_Date='" + v_Hard_Date + '\'' +
				", v_Hard_Check_Date='" + v_Hard_Check_Date + '\'' +
				'}';
	}
}
