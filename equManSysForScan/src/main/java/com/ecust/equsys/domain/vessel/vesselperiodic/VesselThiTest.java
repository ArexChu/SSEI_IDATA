package com.ecust.equsys.domain.vessel.vesselperiodic;

import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselThiTest extends VesselBaseEntity {

	public static VesselThiTest vesselThiTest = null;

	public VesselThiTest() {
		super();
		this.db_Description = "壁厚测定记录";
		this.method = "updateVesselThiTest";//上传servlet的方法名称，很重要

	}

	public static VesselThiTest getInstance() {
		if (vesselThiTest == null) {
			vesselThiTest = new VesselThiTest();
		}
		return vesselThiTest;
	}

	public String universal;
	public String v_Thi_Equ_Mod;//测量仪器型号
	public String v_Thi_Equ_ID;//测量仪器编号
	public String v_Thi_Equ_Acc;//测量仪器精度
	public String v_Thi_Coup;//耦 合 剂
	public String v_Thi_Barrel;//公称厚度 筒体
	public String v_Thi_Seal;//公称厚度 封头
	public String v_Thi_Emp_1;//公称厚度 空1
	public String v_Thi_Emp_2;//公称厚度 空2
	public String v_Thi_Emp_3;//公称厚度 空3
	public String v_Thi_Emp_4;//公称厚度 空4
	public String v_Thi_Min_Barrel;//实测最小壁厚 筒体
	public String v_Thi_Min_Seal;//实测最小壁厚  封头
	public String v_Thi_Min_Emp_1;//实测最小壁厚  空1
	public String v_Thi_Min_Emp_2;//实测最小壁厚  空2
	public String v_Thi_Min_Emp_3;//实测最小壁厚  空3
	public String v_Thi_Min_Emp_4;//实测最小壁厚  空4
	public String v_Thi_Surface;//表面状况
	public String v_Thi_Num;//实测点数
	public String v_Thi_Value;//
	public String v_Thi_Result;//测定结果
	public String v_Thi_Test_Date;//检验
	public String v_Thi_Proo_Date;//校对

	@Override
	public String toString() {
		return "VesselThiTest{" +
				"universal='" + universal + '\'' +
				", v_Thi_Equ_Mod='" + v_Thi_Equ_Mod + '\'' +
				", v_Thi_Equ_ID='" + v_Thi_Equ_ID + '\'' +
				", v_Thi_Equ_Acc='" + v_Thi_Equ_Acc + '\'' +
				", v_Thi_Coup='" + v_Thi_Coup + '\'' +
				", v_Thi_Barrel='" + v_Thi_Barrel + '\'' +
				", v_Thi_Seal='" + v_Thi_Seal + '\'' +
				", v_Thi_Emp_1='" + v_Thi_Emp_1 + '\'' +
				", v_Thi_Emp_2='" + v_Thi_Emp_2 + '\'' +
				", v_Thi_Emp_3='" + v_Thi_Emp_3 + '\'' +
				", v_Thi_Emp_4='" + v_Thi_Emp_4 + '\'' +
				", v_Thi_Min_Barrel='" + v_Thi_Min_Barrel + '\'' +
				", v_Thi_Min_Seal='" + v_Thi_Min_Seal + '\'' +
				", v_Thi_Min_Emp_1='" + v_Thi_Min_Emp_1 + '\'' +
				", v_Thi_Min_Emp_2='" + v_Thi_Min_Emp_2 + '\'' +
				", v_Thi_Min_Emp_3='" + v_Thi_Min_Emp_3 + '\'' +
				", v_Thi_Min_Emp_4='" + v_Thi_Min_Emp_4 + '\'' +
				", v_Thi_Surface='" + v_Thi_Surface + '\'' +
				", v_Thi_Num='" + v_Thi_Num + '\'' +
				", v_Thi_Value='" + v_Thi_Value + '\'' +
				", v_Thi_Result='" + v_Thi_Result + '\'' +
				", v_Thi_Test_Date='" + v_Thi_Test_Date + '\'' +
				", v_Thi_Proo_Date='" + v_Thi_Proo_Date + '\'' +
				'}';
	}
}
