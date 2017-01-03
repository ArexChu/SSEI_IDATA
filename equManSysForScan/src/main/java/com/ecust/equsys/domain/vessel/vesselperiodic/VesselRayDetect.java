package com.ecust.equsys.domain.vessel.vesselperiodic;

import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselRayDetect extends VesselBaseEntity {

	public static VesselRayDetect vesselRayDetect = null;

	public VesselRayDetect() {
		super();
		this.db_Description = "射线检测记录";
		this.method = "updateVesselRayDetect";//上传servlet的方法名称，很重要

	}

	public static VesselRayDetect getInstance() {
		if (vesselRayDetect == null) {
			vesselRayDetect = new VesselRayDetect();
		}
		return vesselRayDetect;
	}

	public String v_Radio_Type;//源种类
	public String v_Radio_Sen_Mode;//增感方式
	public String v_Radio_Det;//探伤机型号
	public String v_Radio_Equ_ID;//仪器编号
	public String v_Radio_Tube_Voltage;//管电压/源活度
	public String v_Radio_Tube_Current;//管电流
	public String v_Radio_Iqi_Mod;//象质计型号
	public String v_Radio_Iqi_Coe;//象质计指数
	public String v_Radio_Tran_Mode;//透照方式
	public String v_Radio_Expo;//曝光时间
	public String v_Radio_Focal_Dis;//焦   距
	public String v_Radio_Focal_Size;//焦点尺寸
	public String v_Radio_Film_Type;//胶片类型
	public String v_Radio_Film_Density;//底片黑度
	public String v_Radio_Cri;//检测标准
	public String v_Radio_Ration;//检测比例、长度
	public String v_Radio_value;//检 测 底 片 评 定 表1
	public String v_Radio_Result;//评片结果
	public String v_Radio_Per;//检测人员
	public String v_Radio_Per_Date;//检测时间
	public String v_Radio_Date;//评片
	public String v_Radio_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselRayDetect{" +
				"v_Radio_Type='" + v_Radio_Type + '\'' +
				", v_Radio_Sen_Mode='" + v_Radio_Sen_Mode + '\'' +
				", v_Radio_Det='" + v_Radio_Det + '\'' +
				", v_Radio_Equ_ID='" + v_Radio_Equ_ID + '\'' +
				", v_Radio_Tube_Voltage='" + v_Radio_Tube_Voltage + '\'' +
				", v_Radio_Tube_Current='" + v_Radio_Tube_Current + '\'' +
				", v_Radio_Iqi_Mod='" + v_Radio_Iqi_Mod + '\'' +
				", v_Radio_Iqi_Coe='" + v_Radio_Iqi_Coe + '\'' +
				", v_Radio_Tran_Mode='" + v_Radio_Tran_Mode + '\'' +
				", v_Radio_Expo='" + v_Radio_Expo + '\'' +
				", v_Radio_Focal_Dis='" + v_Radio_Focal_Dis + '\'' +
				", v_Radio_Focal_Size='" + v_Radio_Focal_Size + '\'' +
				", v_Radio_Film_Type='" + v_Radio_Film_Type + '\'' +
				", v_Radio_Film_Density='" + v_Radio_Film_Density + '\'' +
				", v_Radio_Cri='" + v_Radio_Cri + '\'' +
				", v_Radio_Ration='" + v_Radio_Ration + '\'' +
				", v_Radio_value='" + v_Radio_value + '\'' +
				", v_Radio_Result='" + v_Radio_Result + '\'' +
				", v_Radio_Per='" + v_Radio_Per + '\'' +
				", v_Radio_Per_Date='" + v_Radio_Per_Date + '\'' +
				", v_Radio_Date='" + v_Radio_Date + '\'' +
				", v_Radio_Check_Date='" + v_Radio_Check_Date + '\'' +
				'}';
	}
}
