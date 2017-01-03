package com.ecust.equsys.domain.vessel.vesselperiodic;

import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselConclusionTest extends VesselBaseEntity {

	public static VesselConclusionTest vesselConclusionTest = null;

	public VesselConclusionTest() {
		super();
		this.db_Description = "容器定期检验结论";
		this.method = "updateVesselConclusionTest";//上传servlet的方法名称，很重要

	}

	public static VesselConclusionTest getInstance() {
		if (vesselConclusionTest == null) {
			vesselConclusionTest = new VesselConclusionTest();
		}
		return vesselConclusionTest;
	}

	public String v_M_Type;//用于定期检验类别
	public String v_M_Sta;//运行状态
	public String v_M_Basic;//检验依据
	public String v_M_Explain;//说明：
	public String v_M_Test_Date;//检验
	public String v_M_Check_Date;//校核
	public String v_M_check_Prob;//原始资料及记录审查问题记载
	public String v_M_Prob;//上次全面检验及自上次全面检验以来历次在线检验问题记载
	public String v_M_Condition;//检验条件确认
	public String v_M_Conclusion;//检验结论
	public String v_M_Level;//经检验本台压力容器的安全状况等级评定为      级
	public String v_M_Pre;//允许使用参数压力
	public String v_M_Tem;//允许使用参数温度
	public String v_M_Med;//允许使用参数介质
	public String v_M_Other;//允许使用参数其他

	@Override
	public String toString() {
		return "VesselConclusionTest{" +
				"v_M_Type='" + v_M_Type + '\'' +
				", v_M_Sta='" + v_M_Sta + '\'' +
				", v_M_Basic='" + v_M_Basic + '\'' +
				", v_M_Explain='" + v_M_Explain + '\'' +
				", v_M_Test_Date='" + v_M_Test_Date + '\'' +
				", v_M_Check_Date='" + v_M_Check_Date + '\'' +
				", v_M_check_Prob='" + v_M_check_Prob + '\'' +
				", v_M_Prob='" + v_M_Prob + '\'' +
				", v_M_Condition='" + v_M_Condition + '\'' +
				", v_M_Conclusion='" + v_M_Conclusion + '\'' +
				", v_M_Level='" + v_M_Level + '\'' +
				", v_M_Pre='" + v_M_Pre + '\'' +
				", v_M_Tem='" + v_M_Tem + '\'' +
				", v_M_Med='" + v_M_Med + '\'' +
				", v_M_Other='" + v_M_Other + '\'' +
				'}';
	}
}
