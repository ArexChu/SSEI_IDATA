package com.ecust.equsys.domain.vessel.vesselperiodic;

import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselPeneTest extends VesselBaseEntity {

	public static VesselPeneTest vesselPeneTest = null;

	public VesselPeneTest() {
		super();
		this.db_Description = "渗透检测记录";
		this.method = "updateVesselPermTest";//上传servlet的方法名称，很重要

	}

	public static VesselPeneTest getInstance() {
		if (vesselPeneTest == null) {
			vesselPeneTest = new VesselPeneTest();
		}
		return vesselPeneTest;
	}

	public String v_Perm_JFC;//渗透剂型号
	public String v_Perm_Surface;//表面状况
	public String v_Perm_Clean;//清洗剂型号
	public String v_Perm_Tem;//环境温度
	public String v_Perm_Image;//显像剂型号
	public String v_Perm_Contrast;//对比试块及编号
	public String v_Perm_JFC_Time;//渗透时间
	public String v_Perm_Image_Time;//显像时间
	public String v_Perm_Cri;//检测标准
	public String v_Perm_Len;//检测比例、长度
	public String v_Perm_Value;//
	public String v_Perm_Result;//
	public String v_Perm_Date;//检测
	public String v_Perm_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselPeneTest{" +
				"v_Perm_JFC='" + v_Perm_JFC + '\'' +
				", v_Perm_Surface='" + v_Perm_Surface + '\'' +
				", v_Perm_Clean='" + v_Perm_Clean + '\'' +
				", v_Perm_Tem='" + v_Perm_Tem + '\'' +
				", v_Perm_Image='" + v_Perm_Image + '\'' +
				", v_Perm_Contrast='" + v_Perm_Contrast + '\'' +
				", v_Perm_JFC_Time='" + v_Perm_JFC_Time + '\'' +
				", v_Perm_Image_Time='" + v_Perm_Image_Time + '\'' +
				", v_Perm_Cri='" + v_Perm_Cri + '\'' +
				", v_Perm_Len='" + v_Perm_Len + '\'' +
				", v_Perm_Value='" + v_Perm_Value + '\'' +
				", v_Perm_Result='" + v_Perm_Result + '\'' +
				", v_Perm_Date='" + v_Perm_Date + '\'' +
				", v_Perm_Check_Date='" + v_Perm_Check_Date + '\'' +
				'}';
	}
}
