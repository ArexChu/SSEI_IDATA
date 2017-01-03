package com.ecust.equsys.domain.vessel.vesselperiodic;

import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselMagneticTest extends VesselBaseEntity {

	public static VesselMagneticTest vesselMagneticTest = null;

	public VesselMagneticTest() {
		super();
		this.db_Description = "磁粉检测记录";
		this.method = "updateVesselMagneticTest";//上传servlet的方法名称，很重要

	}

	public static VesselMagneticTest getInstance() {
		if (vesselMagneticTest == null) {
			vesselMagneticTest = new VesselMagneticTest();
		}
		return vesselMagneticTest;
	}

	public String v_Mag_Equ_Model;//检测仪器型号
	public String v_Mag_Equ_ID;//检测仪器编号
	public String v_Mag_Mod;//磁粉类型
	public String v_Mag_Sus;//磁 悬 液
	public String v_Mag_Sens;//灵敏度试片
	public String v_Mag_Method;//磁化方法
	public String v_Mag_Cur;//提升力/磁化电流
	public String v_Mag_Spr;//喷洒方法
	public String v_Mag_Cri;//检测标准
	public String v_Mag_Len;//检测比例、长度
	public String v_Mag_Value;//
	public String v_Mag_Result;//检测结果
	public String v_Mag_Date;//检测
	public String v_Mag_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselMagneticTest{" +
				"v_Mag_Equ_Model='" + v_Mag_Equ_Model + '\'' +
				", v_Mag_Equ_ID='" + v_Mag_Equ_ID + '\'' +
				", v_Mag_Mod='" + v_Mag_Mod + '\'' +
				", v_Mag_Sus='" + v_Mag_Sus + '\'' +
				", v_Mag_Sens='" + v_Mag_Sens + '\'' +
				", v_Mag_Method='" + v_Mag_Method + '\'' +
				", v_Mag_Cur='" + v_Mag_Cur + '\'' +
				", v_Mag_Spr='" + v_Mag_Spr + '\'' +
				", v_Mag_Cri='" + v_Mag_Cri + '\'' +
				", v_Mag_Len='" + v_Mag_Len + '\'' +
				", v_Mag_Value='" + v_Mag_Value + '\'' +
				", v_Mag_Result='" + v_Mag_Result + '\'' +
				", v_Mag_Date='" + v_Mag_Date + '\'' +
				", v_Mag_Check_Date='" + v_Mag_Check_Date + '\'' +
				'}';
	}
}
