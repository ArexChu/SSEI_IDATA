package com.ecust.equsys.domain.vessel.vesselcheck;


import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselCheckConclusion extends VesselBaseEntity {

	public static VesselCheckConclusion vesselCheckConclusion = null;

	public VesselCheckConclusion() {
		super();
		this.db_Description = "压力容器验收检查记录";
		this.method = "updateVesselCheckConclusion";//上传servlet的方法名称，很重要

	}

	public static VesselCheckConclusion getInstance() {
		if (vesselCheckConclusion == null) {
			vesselCheckConclusion = new VesselCheckConclusion();
		}
		return vesselCheckConclusion;
	}

	public String v_Check_Basic;//检验依据
	public String v_Check_Conclusion;//检验结论
	public String v_Check_Level;//安全状况等级评定为
	public String v_Check_Pre;//允许使用参数压力
	public String v_Check_Tem;//允许使用参数温度
	public String v_Check_Med;//允许使用参数介质
	public String v_Check_Other;//允许使用参数其他
	public String v_Check_Explan;//说明
	public String v_Check_Test;//检查
	public String v_Check_Check;//校对
	public String v_M_Option;//检验发现的缺陷位置、程度、性质及处理意见

	@Override
	public String toString() {
		return "VesselCheckConclusion{" +
				"v_Check_Basic='" + v_Check_Basic + '\'' +
				", v_Check_Conclusion='" + v_Check_Conclusion + '\'' +
				", v_Check_Level='" + v_Check_Level + '\'' +
				", v_Check_Pre='" + v_Check_Pre + '\'' +
				", v_Check_Tem='" + v_Check_Tem + '\'' +
				", v_Check_Med='" + v_Check_Med + '\'' +
				", v_Check_Other='" + v_Check_Other + '\'' +
				", v_Check_Explan='" + v_Check_Explan + '\'' +
				", v_Check_Test='" + v_Check_Test + '\'' +
				", v_Check_Check='" + v_Check_Check + '\'' +
				", v_M_Option='" + v_M_Option + '\'' +
				'}';
	}
}

