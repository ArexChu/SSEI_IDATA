package com.ecust.equsys.domain.vessel.vesselperiodic;

import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselSonciTest extends VesselBaseEntity {

	public static VesselSonciTest vesselSonciTest = null;

	public VesselSonciTest() {
		super();
		this.db_Description = "声发射检测记录";
		this.method = "updateVesselSonciTest";//上传servlet的方法名称，很重要

	}

	public static VesselSonciTest getInstance() {
		if (vesselSonciTest == null) {
			vesselSonciTest = new VesselSonciTest();
		}
		return vesselSonciTest;
	}

	public String v_Sonic_Cri;//检测标准
	public String v_Sonic_Pre;//试验压力
	public String v_Sonic_Equ_Type;//仪器型号
	public String v_Sonic_Equ_ID;//仪器编号
	public String v_Sonic_Method;//检测方式
	public String v_Sonic_Fre;//检测频率
	public String v_Sonic_Sensor;//传感器型号
	public String v_Sonic_Fixed_Mode;//固定方式
	public String v_Sonic_Coup;//耦合剂
	public String v_Sonic_Sensor_Num;//传感器数量
	public String v_Sonic_Sensor_Sens;//传感器平均灵敏度
	public String v_Sonic_Sensor_Max;//最大灵敏度
	public String v_Sonic_Noise;//背景噪声
	public String v_Sonic_Thr;//门槛电平
	public String v_Sonic_Sensor_Min;//最小灵敏度
	public String v_Sonic_Gain;//增   益
	public String v_Sonic_Source;//模拟源
	public String v_Sonic_Sensor_Dis;//传感器最大间距
	public String v_Sonic_Source_Dis;//模拟源距离
	public String v_Sonic_Sensor_ID;//衰减测量传感器号
	public String v_Sonic_Amp;//信号幅度
	public String v_Sonic_Result;//
	public String v_Sonic_Date;//检测
	public String v_Sonic_Check_Date;//校对

	@Override
	public String toString() {
		return "VesselSonciTest{" +
				"v_Sonic_Cri='" + v_Sonic_Cri + '\'' +
				", v_Sonic_Pre='" + v_Sonic_Pre + '\'' +
				", v_Sonic_Equ_Type='" + v_Sonic_Equ_Type + '\'' +
				", v_Sonic_Equ_ID='" + v_Sonic_Equ_ID + '\'' +
				", v_Sonic_Method='" + v_Sonic_Method + '\'' +
				", v_Sonic_Fre='" + v_Sonic_Fre + '\'' +
				", v_Sonic_Sensor='" + v_Sonic_Sensor + '\'' +
				", v_Sonic_Fixed_Mode='" + v_Sonic_Fixed_Mode + '\'' +
				", v_Sonic_Coup='" + v_Sonic_Coup + '\'' +
				", v_Sonic_Sensor_Num='" + v_Sonic_Sensor_Num + '\'' +
				", v_Sonic_Sensor_Sens='" + v_Sonic_Sensor_Sens + '\'' +
				", v_Sonic_Sensor_Max='" + v_Sonic_Sensor_Max + '\'' +
				", v_Sonic_Noise='" + v_Sonic_Noise + '\'' +
				", v_Sonic_Thr='" + v_Sonic_Thr + '\'' +
				", v_Sonic_Sensor_Min='" + v_Sonic_Sensor_Min + '\'' +
				", v_Sonic_Gain='" + v_Sonic_Gain + '\'' +
				", v_Sonic_Source='" + v_Sonic_Source + '\'' +
				", v_Sonic_Sensor_Dis='" + v_Sonic_Sensor_Dis + '\'' +
				", v_Sonic_Source_Dis='" + v_Sonic_Source_Dis + '\'' +
				", v_Sonic_Sensor_ID='" + v_Sonic_Sensor_ID + '\'' +
				", v_Sonic_Amp='" + v_Sonic_Amp + '\'' +
				", v_Sonic_Result='" + v_Sonic_Result + '\'' +
				", v_Sonic_Date='" + v_Sonic_Date + '\'' +
				", v_Sonic_Check_Date='" + v_Sonic_Check_Date + '\'' +
				'}';
	}
}
