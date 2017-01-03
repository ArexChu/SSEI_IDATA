package com.ecust.equsys.domain.vessel.vesselperiodic;

import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselMatAna extends VesselBaseEntity {

	public static VesselMatAna vesselMatAna = null;

	public VesselMatAna() {
		super();
		this.db_Description = "材料成分分析记录";
		this.method = "updateVesselMatTest";//上传servlet的方法名称，很重要

	}

	public static VesselMatAna getInstance() {
		if (vesselMatAna == null) {
			vesselMatAna = new VesselMatAna();
		}
		return vesselMatAna;
	}

	public String v_Mat_Samp_Method;//取样方法
	public String v_Mat_Part;//检测部位
	public String v_Mat_Equ_Mode;//仪器型号
	public String v_Mat_Equ_ID;//仪器编号
	public String v_Mat_Ana_Method;//分析方法
	public String v_Mat_Ana_Cri;//分析方法标准
	public String v_Mat_Ele_1;//元素及含量
	public String v_Mat_Ele_2;//元素及含量
	public String v_Mat_Ele_3;//元素及含量
	public String v_Mat_Ele_4;//元素及含量
	public String v_Mat_Ele_5;//元素及含量
	public String v_Mat_Ele_6;//元素及含量
	public String v_Mat_Ele_7;//元素及含量
	public String v_Mat_Ele_8;//元素及含量
	public String v_Mat_Value;//
	public String v_Mat_Result;//
	public String v_Mat_Date;//检测
	public String v_Mat_Check_Date;//校对

}
