package com.ecust.equsys.domain.vessel;


import com.ecust.equsys.domain.pipe.PipeBaseEntity;

public class VesselMonthlyCheck extends PipeBaseEntity {

	public static VesselMonthlyCheck vesselMonthlyCheck = null;

	public VesselMonthlyCheck() {
		super();
		this.db_Description = "容器月度检验";
		this.method = "updatevesselMonthlyCheck";//上传servlet的方法名称，很重要

	}

	public static VesselMonthlyCheck getInstance() {
		if (vesselMonthlyCheck == null) {
			vesselMonthlyCheck = new VesselMonthlyCheck();
		}
		return vesselMonthlyCheck;
	}

	public String v_Date;
	public String v_Problem;
	public String v_Persion;
	public String v_Result_1;
	public String v_Result_Remark_1;
	public String v_Result_2;
	public String v_Result_Remark_2;
	public String v_Result_3;
	public String v_Result_Remark_3;
	public String v_Result_4;
	public String v_Result_Remark_4;
	public String v_Result_5;
	public String v_Result_Remark_5;
	public String v_Result_6;
	public String v_Result_Remark_6;
	public String v_Result_7;
	public String v_Result_Remark_7;
	public String v_Result_8;
	public String v_Result_Remark_8;
	public String v_Result_9;
	public String v_Result_Remark_9;
	public String v_Result_10;
	public String v_Result_Remark_10;
	public String v_Result_11;
	public String v_Result_Remark_11;
	public String v_Result_12;
	public String v_Result_Remark_12;
	public String v_Result_13;
	public String v_Result_Remark_13;
	public String v_Result_14;
	public String v_Result_Remark_14;
	public String v_Result_15;
	public String v_Result_Remark_15;
	public String v_Result_16;
	public String v_Result_Remark_16;
	public String v_Result_17;
	public String v_Result_Remark_17;
	public String v_Result_18;
	public String v_Result_Remark_18;
	public String v_Result_19;
	public String v_Result_Remark_19;
	public String v_Result_20;
	public String v_Result_Remark_20;
	public String v_Result_21;
	public String v_Result_Remark_21;
	public String v_Result_22;
	public String v_Result_Remark_22;
	public String v_Result_23;
	public String v_Result_Remark_23;
	public String v_Result_24;
	public String v_Result_Remark_24;
	public String v_Result_25;
	public String v_Result_Remark_25;

}
