package com.ecust.equsys.domain.vessel.vesselperiodic;


import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselSPDTest extends VesselBaseEntity {
		
	public static VesselSPDTest vesselSPDTest = null;

	public VesselSPDTest() {
		super();
		this.db_Description = "安全附件检验记录";
		this.method = "updateVesselSPDTest";//上传servlet的方法名称，很重要

	}

	public static VesselSPDTest getInstance() {
		if (vesselSPDTest == null) {
			vesselSPDTest = new VesselSPDTest();
		}
		return vesselSPDTest;
	}

	public String v_Valve_Type;//安全阀型  号
	public String v_Valve_Num;//安全阀数  量
	public String v_Valve_Check_Date;//安全阀校验日期
	public String v_Valve_Seal_Pre;//安全阀密封压力
	public String v_Valve_Set_Pre;//安全阀整定压力
	public String v_Valve_Pos;//安全阀安装位置
	public String v_Rup_Type;//爆破片型  号
	public String v_Rup_Num;//爆破片数  量
	public String v_Rup_Spe;//爆破片规  格
	public String v_Rup_Replace_Fre;//爆破片更换周期要求
	public String v_Rup_Replace_Date;//爆破片更换日期
	public String v_Rup_Pos;//爆破片安装位置
	public String v_PreGage_Range;//压力表量程
	public String v_PreGage_Num;//压力表数量
	public String v_PreGage_Acc;//压力表精度
	public String v_PreGage_Date;//压力表检定日期
	public String v_PreGage_Rep_ID;//压力表检定报告编号
	public String v_PreGage_Pos;//压力表安装位置
	public String v_ECOF_Type;//紧急切断装置型式及规格
	public String v_ECOF_Num;//紧急切断装置数  量
	public String v_ECOF_Pre;//紧急切断装置耐压试验压力
	public String v_ECOF_Airt;//紧急切断装置密闭试验压力
	public String v_ECOF_Cut;//紧急切断装置切断时间
	public String v_ECOF_Man;//紧急切断装置检修记录
	public String v_ECOF_Pos;//紧急切断装置安装位置
	public String v_ECOF_Appe;//紧急切断装置外  观
	public String v_CG_Type;//液位计型  式
	public String v_CG_Num;//液位计数  量
	public String v_CG_Content;//液位计容器充装量
	public String v_CG_Pos;//液位计安装位置
	public String v_CG_Appe;//液位计外  观
	public String v_CG_Error;//液位计误  差
	public String v_Tem_Type;//测温仪表型号
	public String v_Tem_Valid_Date;//测温仪表有效期
	public String v_Tem_Appe;//测温仪表外观
	public String v_AH_Pre;//气象软管压力
	public String v_AH_Med;//气象软管介质
	public String v_AH_Time;//气象软管时间
	public String v_LPH_Pre;//液相软管压力
	public String v_LPH_Med;//液相软管介质
	public String v_LPH_Time;//液相软管时间
	public String v_SPD_Others;//其他阀门、附件检验
	public String v_SPD_Result;//
	public String v_SPD_Date;//检测
	public String v_SPD_Check_Date;//校对

    @Override
    public String toString() {
        return "VesselSPDTest{" +
                "v_Valve_Type='" + v_Valve_Type + '\'' +
                ", v_Valve_Num='" + v_Valve_Num + '\'' +
                ", v_Valve_Check_Date='" + v_Valve_Check_Date + '\'' +
                ", v_Valve_Seal_Pre='" + v_Valve_Seal_Pre + '\'' +
                ", v_Valve_Set_Pre='" + v_Valve_Set_Pre + '\'' +
                ", v_Valve_Pos='" + v_Valve_Pos + '\'' +
                ", v_Rup_Type='" + v_Rup_Type + '\'' +
                ", v_Rup_Num='" + v_Rup_Num + '\'' +
                ", v_Rup_Spe='" + v_Rup_Spe + '\'' +
                ", v_Rup_Replace_Fre='" + v_Rup_Replace_Fre + '\'' +
                ", v_Rup_Replace_Date='" + v_Rup_Replace_Date + '\'' +
                ", v_Rup_Pos='" + v_Rup_Pos + '\'' +
                ", v_PreGage_Range='" + v_PreGage_Range + '\'' +
                ", v_PreGage_Num='" + v_PreGage_Num + '\'' +
                ", v_PreGage_Acc='" + v_PreGage_Acc + '\'' +
                ", v_PreGage_Date='" + v_PreGage_Date + '\'' +
                ", v_PreGage_Rep_ID='" + v_PreGage_Rep_ID + '\'' +
                ", v_PreGage_Pos='" + v_PreGage_Pos + '\'' +
                ", v_ECOF_Type='" + v_ECOF_Type + '\'' +
                ", v_ECOF_Num='" + v_ECOF_Num + '\'' +
                ", v_ECOF_Pre='" + v_ECOF_Pre + '\'' +
                ", v_ECOF_Airt='" + v_ECOF_Airt + '\'' +
                ", v_ECOF_Cut='" + v_ECOF_Cut + '\'' +
                ", v_ECOF_Man='" + v_ECOF_Man + '\'' +
                ", v_ECOF_Pos='" + v_ECOF_Pos + '\'' +
                ", v_ECOF_Appe='" + v_ECOF_Appe + '\'' +
                ", v_CG_Type='" + v_CG_Type + '\'' +
                ", v_CG_Num='" + v_CG_Num + '\'' +
                ", v_CG_Content='" + v_CG_Content + '\'' +
                ", v_CG_Pos='" + v_CG_Pos + '\'' +
                ", v_CG_Appe='" + v_CG_Appe + '\'' +
                ", v_CG_Error='" + v_CG_Error + '\'' +
                ", v_Tem_Type='" + v_Tem_Type + '\'' +
                ", v_Tem_Valid_Date='" + v_Tem_Valid_Date + '\'' +
                ", v_Tem_Appe='" + v_Tem_Appe + '\'' +
                ", v_AH_Pre='" + v_AH_Pre + '\'' +
                ", v_AH_Med='" + v_AH_Med + '\'' +
                ", v_AH_Time='" + v_AH_Time + '\'' +
                ", v_LPH_Pre='" + v_LPH_Pre + '\'' +
                ", v_LPH_Med='" + v_LPH_Med + '\'' +
                ", v_LPH_Time='" + v_LPH_Time + '\'' +
                ", v_SPD_Others='" + v_SPD_Others + '\'' +
                ", v_SPD_Result='" + v_SPD_Result + '\'' +
                ", v_SPD_Date='" + v_SPD_Date + '\'' +
                ", v_SPD_Check_Date='" + v_SPD_Check_Date + '\'' +
                '}';
    }
}

