package com.ecust.equsys.domain.vessel.vesselperiodic;


import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselGlassSteelTest extends VesselBaseEntity {
		
	public static VesselGlassSteelTest vesselGlassSteelTest = null;

	public VesselGlassSteelTest() {
		super();
		this.db_Description = "玻璃钢压力容器定期检验记录附页";
		this.method = "updateVesselGlassSteelTest";//上传servlet的方法名称，很重要

	}

	public static VesselGlassSteelTest getInstance() {
		if (vesselGlassSteelTest == null) {
			vesselGlassSteelTest = new VesselGlassSteelTest();
		}
		return vesselGlassSteelTest;
	}

	public String v_GlaS_Result1;//铭牌和标志检验
	public String v_GlaS_Result2;//外表面检验
	public String v_GlaS_Result3;//内表面检验
	public String v_GlaS_Result4;//连接部位检验
	public String v_GlaS_Result5;//附件防腐层检验
	public String v_GlaS_Remark1;//
	public String v_GlaS_Remark2;//
	public String v_GlaS_Remark3;//
	public String v_GlaS_Remark4;//
	public String v_GlaS_Remark5;//
	public String v_GlaS_Explain;
	public String v_GlaS_Date;//检测
	public String v_GlaS_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselGlassSteelTest{" +
				"v_GlaS_Result1='" + v_GlaS_Result1 + '\'' +
				", v_GlaS_Result2='" + v_GlaS_Result2 + '\'' +
				", v_GlaS_Result3='" + v_GlaS_Result3 + '\'' +
				", v_GlaS_Result4='" + v_GlaS_Result4 + '\'' +
				", v_GlaS_Result5='" + v_GlaS_Result5 + '\'' +
				", v_GlaS_Remark1='" + v_GlaS_Remark1 + '\'' +
				", v_GlaS_Remark2='" + v_GlaS_Remark2 + '\'' +
				", v_GlaS_Remark3='" + v_GlaS_Remark3 + '\'' +
				", v_GlaS_Remark4='" + v_GlaS_Remark4 + '\'' +
				", v_GlaS_Remark5='" + v_GlaS_Remark5 + '\'' +
				", v_GlaS_Explain='" + v_GlaS_Explain + '\'' +
				", v_GlaS_Date='" + v_GlaS_Date + '\'' +
				", v_GlaS_Check_Date='" + v_GlaS_Check_Date + '\'' +
				'}';
	}
}

