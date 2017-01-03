package com.ecust.equsys.domain.vessel.vesselperiodic;


import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselGlassTest extends VesselBaseEntity {
		
	public static VesselGlassTest vesselGlassTest = null;

	public VesselGlassTest() {
		super();
		this.db_Description = "搪玻璃压力容器搪玻璃层定期检验记录";
		this.method = "updateVesselGlassTest";//上传servlet的方法名称，很重要

	}

	public static VesselGlassTest getInstance() {
		if (vesselGlassTest == null) {
			vesselGlassTest = new VesselGlassTest();
		}
		return vesselGlassTest;
	}

	public String v_Gla_Result1;//铭牌和标志检验
	public String v_Gla_Result2;//表面检验
	public String v_Gla_Result3;//直流高电压试验10kV
	public String v_Gla_Result4;//厚度测定
	public String v_Gla_Result5;///卡子、活套法兰、压力表、液面计、温度计
	public String v_Gla_Result6;//密封面、密封垫片、结构层
	public String v_Gla_Result7;//放料阀、孔板防腐层
	public String v_Gla_Result8;//夹套介质进口管口挡板检验
	public String v_Gla_Result9;//搪玻璃层修复部位检验
	public String v_Gla_Remark1;
	public String v_Gla_Remark2;
	public String v_Gla_Remark3;
	public String v_Gla_Remark4;
	public String v_Gla_Remark5;
	public String v_Gla_Remark6;
	public String v_Gla_Remark7;
	public String v_Gla_Remark8;
	public String v_Gla_Remark9;
	public String v_Gla_Explain;
	public String v_Gla_Date;//检测
	public String v_Gla_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselGlassTest{" +
				"v_Gla_Result1='" + v_Gla_Result1 + '\'' +
				", v_Gla_Result2='" + v_Gla_Result2 + '\'' +
				", v_Gla_Result3='" + v_Gla_Result3 + '\'' +
				", v_Gla_Result4='" + v_Gla_Result4 + '\'' +
				", v_Gla_Result5='" + v_Gla_Result5 + '\'' +
				", v_Gla_Result6='" + v_Gla_Result6 + '\'' +
				", v_Gla_Result7='" + v_Gla_Result7 + '\'' +
				", v_Gla_Result8='" + v_Gla_Result8 + '\'' +
				", v_Gla_Result9='" + v_Gla_Result9 + '\'' +
				", v_Gla_Remark1='" + v_Gla_Remark1 + '\'' +
				", v_Gla_Remark2='" + v_Gla_Remark2 + '\'' +
				", v_Gla_Remark3='" + v_Gla_Remark3 + '\'' +
				", v_Gla_Remark4='" + v_Gla_Remark4 + '\'' +
				", v_Gla_Remark5='" + v_Gla_Remark5 + '\'' +
				", v_Gla_Remark6='" + v_Gla_Remark6 + '\'' +
				", v_Gla_Remark7='" + v_Gla_Remark7 + '\'' +
				", v_Gla_Remark8='" + v_Gla_Remark8 + '\'' +
				", v_Gla_Remark9='" + v_Gla_Remark9 + '\'' +
				", v_Gla_Explain='" + v_Gla_Explain + '\'' +
				", v_Gla_Date='" + v_Gla_Date + '\'' +
				", v_Gla_Check_Date='" + v_Gla_Check_Date + '\'' +
				'}';
	}
}

