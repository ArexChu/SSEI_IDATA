package com.ecust.equsys.domain.vessel;


public class VesselConfig extends VesselBaseEntity {

	public static VesselConfig vesselConfig = null;

	public VesselConfig() {
		super();
		this.db_Description = "容器信息配置";
		this.method = "updateVesselConfig";//上传servlet的方法名称，很重要

	}

	public static VesselConfig getInstance() {
		if (vesselConfig == null) {
			vesselConfig = new VesselConfig();
		}
		return vesselConfig;
	}
	
	public String v_Thi_Value;//容器测厚
	public String v_Radio_value;//检 测 底 片 评 定 表
	public String v_Ult_Value;//
	public String v_TOFD_Value;//
	public String v_Mag_Value;//
	public String v_Perm_Value;//
	public String v_Mat_Value;//
	public String v_Hard_Value;//

	@Override
	public String toString() {
		return "VesselConfig{" +
				"v_Thi_Value='" + v_Thi_Value + '\'' +
				", v_Radio_value='" + v_Radio_value + '\'' +
				", v_Ult_Value='" + v_Ult_Value + '\'' +
				", v_TOFD_Value='" + v_TOFD_Value + '\'' +
				", v_Mag_Value='" + v_Mag_Value + '\'' +
				", v_Perm_Value='" + v_Perm_Value + '\'' +
				", v_Mat_Value='" + v_Mat_Value + '\'' +
				", v_Hard_Value='" + v_Hard_Value + '\'' +
				'}';
	}
}
