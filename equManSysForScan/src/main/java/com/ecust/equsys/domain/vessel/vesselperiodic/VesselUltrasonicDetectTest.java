package com.ecust.equsys.domain.vessel.vesselperiodic;

import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselUltrasonicDetectTest extends VesselBaseEntity {

	public static VesselUltrasonicDetectTest vesselUltrasonicDetectTest = null;

	public VesselUltrasonicDetectTest() {
		super();
		this.db_Description = "超声检测记录";
		this.method = "updateVesselUltrasonicTest";//上传servlet的方法名称，很重要

	}

	public static VesselUltrasonicDetectTest getInstance() {
		if (vesselUltrasonicDetectTest == null) {
			vesselUltrasonicDetectTest = new VesselUltrasonicDetectTest();
		}
		return vesselUltrasonicDetectTest;
	}

	public String v_Ult_Inst_Model;//检测仪器型号
	public String v_Ult_Inst_ID;//检测仪器编号
	public String v_Ult_Head_Type;//探头型号
	public String v_Ult_Block_Type;//试块型号及编号
	public String v_Ult_Eva_Sens;//评定灵敏度
	public String v_Ult_Det_Method;//检测方法/扫查面
	public String v_Ult_Coup;//耦 合 剂
	public String v_Ult_Compen;//补    偿
	public String v_Ult_Det_Cri;//检测标准
	public String v_Ult_Det_Ration;//检测比例、长度
	public String v_Ult_Value;//
	public String v_Ult_Result;//检测结果
	public String v_Ult_Date;//检测
	public String v_Ult_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselUltrasonicDetectTest{" +
				"v_Ult_Inst_Model='" + v_Ult_Inst_Model + '\'' +
				", v_Ult_Inst_ID='" + v_Ult_Inst_ID + '\'' +
				", v_Ult_Head_Type='" + v_Ult_Head_Type + '\'' +
				", v_Ult_Block_Type='" + v_Ult_Block_Type + '\'' +
				", v_Ult_Eva_Sens='" + v_Ult_Eva_Sens + '\'' +
				", v_Ult_Det_Method='" + v_Ult_Det_Method + '\'' +
				", v_Ult_Coup='" + v_Ult_Coup + '\'' +
				", v_Ult_Compen='" + v_Ult_Compen + '\'' +
				", v_Ult_Det_Cri='" + v_Ult_Det_Cri + '\'' +
				", v_Ult_Det_Ration='" + v_Ult_Det_Ration + '\'' +
				", v_Ult_Value='" + v_Ult_Value + '\'' +
				", v_Ult_Result='" + v_Ult_Result + '\'' +
				", v_Ult_Date='" + v_Ult_Date + '\'' +
				", v_Ult_Check_Date='" + v_Ult_Check_Date + '\'' +
				'}';
	}
}
