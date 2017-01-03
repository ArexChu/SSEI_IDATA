package com.ecust.equsys.domain.vessel.vesselperiodic;


import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselPlasticTest extends VesselBaseEntity {
		
	public static VesselPlasticTest vesselPlasticTest = null;

	public VesselPlasticTest() {
		super();
		this.db_Description = "塑料压力容器定期检验记录附页";
		this.method = "updateVesselPlasticTest";//上传servlet的方法名称，很重要

	}

	public static VesselPlasticTest getInstance() {
		if (vesselPlasticTest == null) {
			vesselPlasticTest = new VesselPlasticTest();
		}
		return vesselPlasticTest;
	}

	public String v_Pla_Result1;//铭牌和标志检验
	public String v_Pla_Result2;//外表面检验
	public String v_Pla_Result3;//内表面检验
	public String v_Pla_Result4;//焊缝和连接部位检验
	public String v_Pla_Result5;//附件检验
	public String v_Pla_Result6;//支承或者支座检验
	public String v_Pla_Remark1;//
	public String v_Pla_Remark2;//
	public String v_Pla_Remark3;//
	public String v_Pla_Remark4;//
	public String v_Pla_Remark5;//
	public String v_Pla_Remark6;//
	public String v_Pla_Explain;
	public String v_Pla_Date;//检测
	public String v_Pla_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselPlasticTest{" +
				"v_Pla_Result1='" + v_Pla_Result1 + '\'' +
				", v_Pla_Result2='" + v_Pla_Result2 + '\'' +
				", v_Pla_Result3='" + v_Pla_Result3 + '\'' +
				", v_Pla_Result4='" + v_Pla_Result4 + '\'' +
				", v_Pla_Result5='" + v_Pla_Result5 + '\'' +
				", v_Pla_Result6='" + v_Pla_Result6 + '\'' +
				", v_Pla_Remark1='" + v_Pla_Remark1 + '\'' +
				", v_Pla_Remark2='" + v_Pla_Remark2 + '\'' +
				", v_Pla_Remark3='" + v_Pla_Remark3 + '\'' +
				", v_Pla_Remark4='" + v_Pla_Remark4 + '\'' +
				", v_Pla_Remark5='" + v_Pla_Remark5 + '\'' +
				", v_Pla_Remark6='" + v_Pla_Remark6 + '\'' +
				", v_Pla_Explain='" + v_Pla_Explain + '\'' +
				", v_Pla_Date='" + v_Pla_Date + '\'' +
				", v_Pla_Check_Date='" + v_Pla_Check_Date + '\'' +
				'}';
	}
}

