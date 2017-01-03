package com.ecust.equsys.domain.vessel.vesselperiodic;

import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselTOFDTest extends VesselBaseEntity {

	public static VesselTOFDTest vesselTOFDTest = null;

	public VesselTOFDTest() {
		super();
		this.db_Description = "衍射时差法（TOFD）超声检测记录";
		this.method = "updateVesselTOFDTest";//上传servlet的方法名称，很重要

	}

	public static VesselTOFDTest getInstance() {
		if (vesselTOFDTest == null) {
			vesselTOFDTest = new VesselTOFDTest();
		}
		return vesselTOFDTest;
	}

	public String v_TOFD_Equ_Model;//检测仪器型号
	public String v_TOFD_Equ_ID;//检测仪器编号
	public String v_TOFD_Head_Type;//探头型号
	public String v_TOFD_Block_Type;//试块型号及编号
	public String v_TOFD_Eva_Sens;//评定灵敏度
	public String v_TOFD_Det_Method;//检测方法/扫查面
	public String v_TOFD_Coup;//耦 合 剂
	public String v_TOFD_Compen;//补    偿
	public String v_TOFD_Det_Cri;//检测标准
	public String v_TOFD_Det_Ration;//检测比例、长度
	public String v_TOFD_Cha_1;//通道一
	public String v_TOFD_Cha_2;//
	public String v_TOFD_Cha_3;//
	public String v_TOFD_Cha_4;//
	public String v_TOFD_Cha_Dis;//通道间距
	public String v_TOFD_Value;//
	public String v_TOFD_Result;//
	public String v_TOFD_Date;//检测
	public String v_TOFD_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselTOFDTest{" +
				"v_TOFD_Equ_Model='" + v_TOFD_Equ_Model + '\'' +
				", v_TOFD_Equ_ID='" + v_TOFD_Equ_ID + '\'' +
				", v_TOFD_Head_Type='" + v_TOFD_Head_Type + '\'' +
				", v_TOFD_Block_Type='" + v_TOFD_Block_Type + '\'' +
				", v_TOFD_Eva_Sens='" + v_TOFD_Eva_Sens + '\'' +
				", v_TOFD_Det_Method='" + v_TOFD_Det_Method + '\'' +
				", v_TOFD_Coup='" + v_TOFD_Coup + '\'' +
				", v_TOFD_Compen='" + v_TOFD_Compen + '\'' +
				", v_TOFD_Det_Cri='" + v_TOFD_Det_Cri + '\'' +
				", v_TOFD_Det_Ration='" + v_TOFD_Det_Ration + '\'' +
				", v_TOFD_Cha_1='" + v_TOFD_Cha_1 + '\'' +
				", v_TOFD_Cha_2='" + v_TOFD_Cha_2 + '\'' +
				", v_TOFD_Cha_3='" + v_TOFD_Cha_3 + '\'' +
				", v_TOFD_Cha_4='" + v_TOFD_Cha_4 + '\'' +
				", v_TOFD_Cha_Dis='" + v_TOFD_Cha_Dis + '\'' +
				", v_TOFD_Value='" + v_TOFD_Value + '\'' +
				", v_TOFD_Result='" + v_TOFD_Result + '\'' +
				", v_TOFD_Date='" + v_TOFD_Date + '\'' +
				", v_TOFD_Check_Date='" + v_TOFD_Check_Date + '\'' +
				'}';
	}
}
