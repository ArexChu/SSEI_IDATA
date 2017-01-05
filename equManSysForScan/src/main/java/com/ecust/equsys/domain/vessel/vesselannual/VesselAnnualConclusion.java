package com.ecust.equsys.domain.vessel.vesselannual;


import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselAnnualConclusion extends VesselBaseEntity {

	public static VesselAnnualConclusion vesselAnnualConclusion = null;

	public VesselAnnualConclusion() {
		super();
		this.db_Description = "压力容器年度检查结论记录";
		this.method = "updateVesselAnnualConclusion";//上传servlet的方法名称，很重要

	}

	public static VesselAnnualConclusion getInstance() {
		if (vesselAnnualConclusion == null) {
			vesselAnnualConclusion = new VesselAnnualConclusion();
		}
		return vesselAnnualConclusion;
	}

	public String v_Ann_Type;//设备型号
	public String v_Ann_Basic;//检验依据
	public String v_Ann_Conclusion;//检验结论
	public String v_Ann_Level;//安全状况等级评定为
	public String v_Ann_Pre;//允许使用参数压力
	public String v_Ann_Tem;//允许使用参数温度
	public String v_Ann_Med;//允许使用参数介质
	public String v_Ann_Explan;//说明
	public String v_Ann_Test;//检查
	public String v_Ann_Check;//校对
	public String v_next_periodic_check;//
	public String v_next_annual_check;//
}

