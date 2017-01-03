package com.ecust.equsys.domain.vessel.vesselperiodic;


import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselGraphiteLinerTest extends VesselBaseEntity {
		
	public static VesselGraphiteLinerTest vesselGraphiteLinerTest = null;

	public VesselGraphiteLinerTest() {
		super();
		this.db_Description = "石墨衬里压力容器定期检验记录附页";
		this.method = "updateVesselGraphiteLinerTest";//上传servlet的方法名称，很重要

	}

	public static VesselGraphiteLinerTest getInstance() {
		if (vesselGraphiteLinerTest == null) {
			vesselGraphiteLinerTest = new VesselGraphiteLinerTest();
		}
		return vesselGraphiteLinerTest;
	}

	public String v_GraL_Result1;//铭牌和标志检验
	public String v_GraL_Result2;//外表面检验
	public String v_GraL_Result3;//法兰密封面检验
	public String v_GraL_Result4;//附件检验（阀门、压力表、液面计、温度计、防腐层
	public String v_GraL_Remark1;//
	public String v_GraL_Remark2;//
	public String v_GraL_Remark3;//
	public String v_GraL_Remark4;//
	public String v_GraL_Explain;
	public String v_GraL_Date;//检测
	public String v_GraL_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselGraphiteLinerTest{" +
				"v_GraL_Result1='" + v_GraL_Result1 + '\'' +
				", v_GraL_Result2='" + v_GraL_Result2 + '\'' +
				", v_GraL_Result3='" + v_GraL_Result3 + '\'' +
				", v_GraL_Result4='" + v_GraL_Result4 + '\'' +
				", v_GraL_Remark1='" + v_GraL_Remark1 + '\'' +
				", v_GraL_Remark2='" + v_GraL_Remark2 + '\'' +
				", v_GraL_Remark3='" + v_GraL_Remark3 + '\'' +
				", v_GraL_Remark4='" + v_GraL_Remark4 + '\'' +
				", v_GraL_Explain='" + v_GraL_Explain + '\'' +
				", v_GraL_Date='" + v_GraL_Date + '\'' +
				", v_GraL_Check_Date='" + v_GraL_Check_Date + '\'' +
				'}';
	}
}

