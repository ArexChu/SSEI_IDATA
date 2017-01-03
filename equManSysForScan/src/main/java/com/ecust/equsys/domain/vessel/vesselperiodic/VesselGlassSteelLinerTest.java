package com.ecust.equsys.domain.vessel.vesselperiodic;


import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselGlassSteelLinerTest extends VesselBaseEntity {
		
	public static VesselGlassSteelLinerTest vesselGlassSteelLinerTest = null;

	public VesselGlassSteelLinerTest() {
		super();
		this.db_Description = "玻璃钢衬里压力容器定期检验记录附页";
		this.method = "updateVesselGlassSteelLinerTest";//上传servlet的方法名称，很重要

	}

	public static VesselGlassSteelLinerTest getInstance() {
		if (vesselGlassSteelLinerTest == null) {
			vesselGlassSteelLinerTest = new VesselGlassSteelLinerTest();
		}
		return vesselGlassSteelLinerTest;
	}

	public String v_GlaSL_Result1;//铭牌和标志检验
	public String v_GlaSL_Result2;//衬里表面检验
	public String v_GlaSL_Result3;//衬里鼓包、与基体分离情况检验
	public String v_GlaSL_Result4;//连接部位检验
	public String v_GlaSL_Result5;//附件防腐层检验
	public String v_GlaSL_Result6;//玻璃钢层厚度测定
	public String v_GlaSL_Remark1;//
	public String v_GlaSL_Remark2;//
	public String v_GlaSL_Remark3;//
	public String v_GlaSL_Remark4;//
	public String v_GlaSL_Remark5;//
	public String v_GlaSL_Remark6;//
	public String v_GlaSL_Explain;
	public String v_GlaSL_Date;//检测
	public String v_GlaSL_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselGlassSteelLinerTest{" +
				"v_GlaSL_Result1='" + v_GlaSL_Result1 + '\'' +
				", v_GlaSL_Result2='" + v_GlaSL_Result2 + '\'' +
				", v_GlaSL_Result3='" + v_GlaSL_Result3 + '\'' +
				", v_GlaSL_Result4='" + v_GlaSL_Result4 + '\'' +
				", v_GlaSL_Result5='" + v_GlaSL_Result5 + '\'' +
				", v_GlaSL_Result6='" + v_GlaSL_Result6 + '\'' +
				", v_GlaSL_Remark1='" + v_GlaSL_Remark1 + '\'' +
				", v_GlaSL_Remark2='" + v_GlaSL_Remark2 + '\'' +
				", v_GlaSL_Remark3='" + v_GlaSL_Remark3 + '\'' +
				", v_GlaSL_Remark4='" + v_GlaSL_Remark4 + '\'' +
				", v_GlaSL_Remark5='" + v_GlaSL_Remark5 + '\'' +
				", v_GlaSL_Remark6='" + v_GlaSL_Remark6 + '\'' +
				", v_GlaSL_Explain='" + v_GlaSL_Explain + '\'' +
				", v_GlaSL_Date='" + v_GlaSL_Date + '\'' +
				", v_GlaSL_Check_Date='" + v_GlaSL_Check_Date + '\'' +
				'}';
	}
}

