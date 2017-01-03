package com.ecust.equsys.domain.vessel.vesselperiodic;

import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselMetTest extends VesselBaseEntity {

	public static VesselMetTest vesselMetTest = null;

	public VesselMetTest() {
		super();
		this.db_Description = "金相分析记录";
		this.method = "updateVesselMetTest";//上传servlet的方法名称，很重要

	}

	public static VesselMetTest getInstance() {
		if (vesselMetTest == null) {
			vesselMetTest = new VesselMetTest();
		}
		return vesselMetTest;
	}
	
	public String v_Met_Equ_Mode;//分析仪器型号
	public String v_Met_Equ_ID;//分析仪器编号
	public String v_Met_Cor;//腐蚀方法
	public String v_Met_Pol;//抛光方法
	public String v_Met_Cri;//执行标准
	public String v_Met_Part;//金相组织
	public String v_Met_Mat;//主体材质
	public String v_Met_Heat;//热处理状态
	public String v_Met_Result;//
	public String v_Met_Date;//检测
	public String v_Met_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselMetTest{" +
				"v_Met_Equ_Mode='" + v_Met_Equ_Mode + '\'' +
				", v_Met_Equ_ID='" + v_Met_Equ_ID + '\'' +
				", v_Met_Cor='" + v_Met_Cor + '\'' +
				", v_Met_Pol='" + v_Met_Pol + '\'' +
				", v_Met_Cri='" + v_Met_Cri + '\'' +
				", v_Met_Part='" + v_Met_Part + '\'' +
				", v_Met_Mat='" + v_Met_Mat + '\'' +
				", v_Met_Heat='" + v_Met_Heat + '\'' +
				", v_Met_Result='" + v_Met_Result + '\'' +
				", v_Met_Date='" + v_Met_Date + '\'' +
				", v_Met_Check_Date='" + v_Met_Check_Date + '\'' +
				'}';
	}
}
