package com.ecust.equsys.domain.vessel.vesselperiodic;

import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselThiCheck extends VesselBaseEntity {

	public static VesselThiCheck vesselThiCheck = null;

	public VesselThiCheck() {
		super();
		this.db_Description = "容器测厚检查";
		this.method = "updateVesselThiCheck";//上传servlet的方法名称，很重要

	}

	public static VesselThiCheck getInstance() {
		if (vesselThiCheck == null) {
			vesselThiCheck = new VesselThiCheck();
		}
		return vesselThiCheck;
	}


	public String v_ThiChe_Pos;//壁厚校核部位
	public String v_ThiChe_Stress;//允许/监控使用压力
	public String v_ThiChe_Dia;//实测内径
	public String v_ThiChe_Min;//实测最小壁厚
	public String v_ThiChe_Ma_Stress;//材料许用应力
	public String v_ThiChe_Cor;//腐蚀裕量
	public String v_ThiChe_Wel_Coe;//焊接接头系数
	public String v_ThiChe_Seal_Coe;//封头形状系数
	public String v_ThiChe_Tem;//允许/监控使用温度
	public String v_ThiChe_Cri;//校核选用标准
	public String v_ThiChe_Coe;//校核参数取值说明
	public String v_ThiChe_Cal;//壁厚校核计算
	public String v_ThiChe_Result;//校核结果
	public String v_ThiChe_Test_Date;//检验
	public String v_ThiChe_Proo_Date;//校对

	@Override
	public String toString() {
		return "VesselThiCheck{" +
				"v_ThiChe_Pos='" + v_ThiChe_Pos + '\'' +
				", v_ThiChe_Stress='" + v_ThiChe_Stress + '\'' +
				", v_ThiChe_Dia='" + v_ThiChe_Dia + '\'' +
				", v_ThiChe_Min='" + v_ThiChe_Min + '\'' +
				", v_ThiChe_Ma_Stress='" + v_ThiChe_Ma_Stress + '\'' +
				", v_ThiChe_Cor='" + v_ThiChe_Cor + '\'' +
				", v_ThiChe_Wel_Coe='" + v_ThiChe_Wel_Coe + '\'' +
				", v_ThiChe_Seal_Coe='" + v_ThiChe_Seal_Coe + '\'' +
				", v_ThiChe_Tem='" + v_ThiChe_Tem + '\'' +
				", v_ThiChe_Cri='" + v_ThiChe_Cri + '\'' +
				", v_ThiChe_Coe='" + v_ThiChe_Coe + '\'' +
				", v_ThiChe_Cal='" + v_ThiChe_Cal + '\'' +
				", v_ThiChe_Result='" + v_ThiChe_Result + '\'' +
				", v_ThiChe_Test_Date='" + v_ThiChe_Test_Date + '\'' +
				", v_ThiChe_Proo_Date='" + v_ThiChe_Proo_Date + '\'' +
				'}';
	}
}
