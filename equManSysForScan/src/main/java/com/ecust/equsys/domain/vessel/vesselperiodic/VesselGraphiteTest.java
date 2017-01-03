package com.ecust.equsys.domain.vessel.vesselperiodic;


import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselGraphiteTest extends VesselBaseEntity {
		
	public static VesselGraphiteTest vesselGraphiteTest = null;

	public VesselGraphiteTest() {
		super();
		this.db_Description = "石墨压力容器定期检验记录附页";
		this.method = "updateVesselGraphiteTest";//上传servlet的方法名称，很重要

	}

	public static VesselGraphiteTest getInstance() {
		if (vesselGraphiteTest == null) {
			vesselGraphiteTest = new VesselGraphiteTest();
		}
		return vesselGraphiteTest;
	}

	public String v_Grap_Result1;//铭牌和标志检验
	public String v_Grap_Result2;//容器筒体、侧盖板、上下盖板变形与腐蚀
	public String v_Grap_Result3;//石墨件表面腐蚀、磨损、分层、掉块、裂纹
	public String v_Grap_Result4;//石墨件粘接部位的粘接剂，粘接部位腐蚀、开裂和渗漏	
	public String v_Grap_Result5;//法兰密封面检验
	public String v_Grap_Result6;//附件检验（阀门、压力表、液面计、温度计、防腐层）
	public String v_Grap_Remark1;//
	public String v_Grap_Remark2;//
	public String v_Grap_Remark3;//
	public String v_Grap_Remark4;//
	public String v_Grap_Remark5;//
	public String v_Grap_Remark6;//
	public String v_Grap_Explain;
	public String v_Grap_Date;//检测
	public String v_Grap_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselGraphiteTest{" +
				"v_Grap_Result1='" + v_Grap_Result1 + '\'' +
				", v_Grap_Result2='" + v_Grap_Result2 + '\'' +
				", v_Grap_Result3='" + v_Grap_Result3 + '\'' +
				", v_Grap_Result4='" + v_Grap_Result4 + '\'' +
				", v_Grap_Result5='" + v_Grap_Result5 + '\'' +
				", v_Grap_Result6='" + v_Grap_Result6 + '\'' +
				", v_Grap_Remark1='" + v_Grap_Remark1 + '\'' +
				", v_Grap_Remark2='" + v_Grap_Remark2 + '\'' +
				", v_Grap_Remark3='" + v_Grap_Remark3 + '\'' +
				", v_Grap_Remark4='" + v_Grap_Remark4 + '\'' +
				", v_Grap_Remark5='" + v_Grap_Remark5 + '\'' +
				", v_Grap_Remark6='" + v_Grap_Remark6 + '\'' +
				", v_Grap_Explain='" + v_Grap_Explain + '\'' +
				", v_Grap_Date='" + v_Grap_Date + '\'' +
				", v_Grap_Check_Date='" + v_Grap_Check_Date + '\'' +
				'}';
	}
}

