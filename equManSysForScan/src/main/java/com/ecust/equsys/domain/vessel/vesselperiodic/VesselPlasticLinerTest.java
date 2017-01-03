package com.ecust.equsys.domain.vessel.vesselperiodic;


import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselPlasticLinerTest extends VesselBaseEntity {
		
	public static VesselPlasticLinerTest vesselPlasticLinerTest = null;

	public VesselPlasticLinerTest() {
		super();
		this.db_Description = "塑料压力容器定期检验记录附页";
		this.method = "updateVesselPlasticLinerTest";//上传servlet的方法名称，很重要

	}

	public static VesselPlasticLinerTest getInstance() {
		if (vesselPlasticLinerTest == null) {
			vesselPlasticLinerTest = new VesselPlasticLinerTest();
		}
		return vesselPlasticLinerTest;
	}

	public String v_PlaL_Result1;//铭牌和标志检验
	public String v_PlaL_Result2;//衬里表面检验
	public String v_PlaL_Result3;//衬里鼓包、与基体分离情况检验
	public String v_PlaL_Result4;//5kV直流高电压检测
	public String v_PlaL_Result5;//衬里厚度测定
	public String v_PlaL_Result6;//焊缝和连接部位检验
	public String v_PlaL_Result7;//附件检验
	public String v_PlaL_Result8;//支承或者支座检验
	public String v_PlaL_Remark1;//
	public String v_PlaL_Remark2;//
	public String v_PlaL_Remark3;//
	public String v_PlaL_Remark4;//
	public String v_PlaL_Remark5;//
	public String v_PlaL_Remark6;//
	public String v_PlaL_Remark7;//
	public String v_PlaL_Remark8;//
	public String v_PlaL_Explain;
	public String v_PlaL_Date;//检测
	public String v_PlaL_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselPlasticLinerTest{" +
				"v_PlaL_Result1='" + v_PlaL_Result1 + '\'' +
				", v_PlaL_Result2='" + v_PlaL_Result2 + '\'' +
				", v_PlaL_Result3='" + v_PlaL_Result3 + '\'' +
				", v_PlaL_Result4='" + v_PlaL_Result4 + '\'' +
				", v_PlaL_Result5='" + v_PlaL_Result5 + '\'' +
				", v_PlaL_Result6='" + v_PlaL_Result6 + '\'' +
				", v_PlaL_Result7='" + v_PlaL_Result7 + '\'' +
				", v_PlaL_Result8='" + v_PlaL_Result8 + '\'' +
				", v_PlaL_Remark1='" + v_PlaL_Remark1 + '\'' +
				", v_PlaL_Remark2='" + v_PlaL_Remark2 + '\'' +
				", v_PlaL_Remark3='" + v_PlaL_Remark3 + '\'' +
				", v_PlaL_Remark4='" + v_PlaL_Remark4 + '\'' +
				", v_PlaL_Remark5='" + v_PlaL_Remark5 + '\'' +
				", v_PlaL_Remark6='" + v_PlaL_Remark6 + '\'' +
				", v_PlaL_Remark7='" + v_PlaL_Remark7 + '\'' +
				", v_PlaL_Remark8='" + v_PlaL_Remark8 + '\'' +
				", v_PlaL_Explain='" + v_PlaL_Explain + '\'' +
				", v_PlaL_Date='" + v_PlaL_Date + '\'' +
				", v_PlaL_Check_Date='" + v_PlaL_Check_Date + '\'' +
				'}';
	}
}

