package com.ecust.equsys.domain.pipe.pipeoverallcheck;

import com.ecust.equsys.domain.pipe.PipeBaseEntity;

public class PipeSPDTest extends PipeBaseEntity {

	public static PipeSPDTest pipeSPDTest = null;

	public PipeSPDTest() {
		super();
		this.db_Description = "安全保护装置检查情况";
		this.method = "updatePipeSPDTest";//上传servlet的方法名称，很重要

	}
	public static PipeSPDTest getInstance() {
		if (pipeSPDTest == null) {
			pipeSPDTest = new PipeSPDTest();
		}
		return pipeSPDTest;
	}

	public String pre_De_Num; //压 力 表设计规定数
	public String pre_Wo_Num; //压 力 表实际安装数
	public String pre_Wo_Pos; //压 力 表安装位置
	public String pre_Valid_Date; //压 力 表有效期
	public String pre_Range; //压 力 表量程
	public String pre_Acc; //压 力 表精度
	public String pre_Dia; //压 力 表表盘直径
	public String pre_Appe; //压 力 表外观质量
	public String tem_De_Num; //测温仪表设计规定数
	public String tem_Wo_Num; //测温仪表实际安装数
	public String tem_Wo_Pos; //测温仪表安装位置
	public String tem_Valid_Date; //测温仪表有效期
	public String tem_Range; //测温仪表量程
	public String tem_Acc; //测温仪表精度
	public String tem_Appe; //测温仪表外观质量
	public String valve_De_Num; //	安全阀设计数量
	public String valve_De_Mod; //安全阀设计型号
	public String valve_De_Pre; //安全阀设计公称压力
	public String valve_De_Dia; //	安全阀设计公称通径
	public String valve_Num; //安全阀数量
	public String valve_Mod; //安全阀型号
	public String valve_Pre; //安全阀公称压力	
	public String valve_Dia; //安全阀公称通径
	public String valve_Start_Pre; //开启压力
	public String valve_Wo_Tem; //	工作温度
	public String valve_Wo_Med; //工作介质
	public String valve_Appe; //外观质量
	public String valve_Valid_Date; //	有效期
	public String valve_Seal; //铅封
	public String valve_Wo_Pos; //位置
	public String valve_Man_ID; //	制造许可证
	public String valve_Cer_ID; //合格证编号
	public String rup_De_Num; //爆破片设计数量
	public String rup_De_Mod; //	爆破片设计型号
	public String rup_De_Norm; //爆破片设计规格
	public String rup_De_Stress; //爆破片设计爆破应力
	public String rup_De_Dia; //	爆破片设计公称直径
	public String rup_De_Ma; //爆破片设计材料
	public String rup_Num; //爆破片数量
	public String rup_Mod; //爆破片型号
	public String rup_Dia; //	爆破片公称直径
	public String rup_Norm; //爆破片规格
	public String rup_Appe; //爆破片外观质量
	public String rup_Valid_Date; //爆破片有效期	
	public String rup_Wo_Pos; //爆破片安装位置
	public String rup_Cer_ID; //爆破片合格证编号
	public String rup_Man_ID; //爆破片制造许可证
	public String ecof_Man_Com; //	制造厂家
	public String ecof_Man_ID; //制造许可科正号
	public String ecof_Cer_ID; //合格证编号
	public String ecof_Norm; //	型式及规格
	public String ecof_Cut_Time; //切断时间
	public String ecof_Valid_Date; //有限期
	public String ecof_Pre_Test; //耐压试验
	public String ecof_Seal_Pre; //密封压力试验
	public String ecof_Seal; //铅封
	public String ecof_Remark; //备注
	public String ecof_Date; //测试时间

	@Override
	public String toString() {
		return "PipeSPDTest{" +
				"pre_De_Num='" + pre_De_Num + '\'' +
				", pre_Wo_Num='" + pre_Wo_Num + '\'' +
				", pre_Wo_Pos='" + pre_Wo_Pos + '\'' +
				", pre_Valid_Date='" + pre_Valid_Date + '\'' +
				", pre_Range='" + pre_Range + '\'' +
				", pre_Acc='" + pre_Acc + '\'' +
				", pre_Dia='" + pre_Dia + '\'' +
				", pre_Appe='" + pre_Appe + '\'' +
				", tem_De_Num='" + tem_De_Num + '\'' +
				", tem_Wo_Num='" + tem_Wo_Num + '\'' +
				", tem_Wo_Pos='" + tem_Wo_Pos + '\'' +
				", tem_Valid_Date='" + tem_Valid_Date + '\'' +
				", tem_Range='" + tem_Range + '\'' +
				", tem_Acc='" + tem_Acc + '\'' +
				", tem_Appe='" + tem_Appe + '\'' +
				", valve_De_Num='" + valve_De_Num + '\'' +
				", valve_De_Mod='" + valve_De_Mod + '\'' +
				", valve_De_Pre='" + valve_De_Pre + '\'' +
				", valve_De_Dia='" + valve_De_Dia + '\'' +
				", valve_Num='" + valve_Num + '\'' +
				", valve_Mod='" + valve_Mod + '\'' +
				", valve_Pre='" + valve_Pre + '\'' +
				", valve_Dia='" + valve_Dia + '\'' +
				", valve_Start_Pre='" + valve_Start_Pre + '\'' +
				", valve_Wo_Tem='" + valve_Wo_Tem + '\'' +
				", valve_Wo_Med='" + valve_Wo_Med + '\'' +
				", valve_Appe='" + valve_Appe + '\'' +
				", valve_Valid_Date='" + valve_Valid_Date + '\'' +
				", valve_Seal='" + valve_Seal + '\'' +
				", valve_Wo_Pos='" + valve_Wo_Pos + '\'' +
				", valve_Man_ID='" + valve_Man_ID + '\'' +
				", valve_Cer_ID='" + valve_Cer_ID + '\'' +
				", rup_De_Num='" + rup_De_Num + '\'' +
				", rup_De_Mod='" + rup_De_Mod + '\'' +
				", rup_De_Norm='" + rup_De_Norm + '\'' +
				", rup_De_Stress='" + rup_De_Stress + '\'' +
				", rup_De_Dia='" + rup_De_Dia + '\'' +
				", rup_De_Ma='" + rup_De_Ma + '\'' +
				", rup_Num='" + rup_Num + '\'' +
				", rup_Mod='" + rup_Mod + '\'' +
				", rup_Dia='" + rup_Dia + '\'' +
				", rup_Norm='" + rup_Norm + '\'' +
				", rup_Appe='" + rup_Appe + '\'' +
				", rup_Valid_Date='" + rup_Valid_Date + '\'' +
				", rup_Wo_Pos='" + rup_Wo_Pos + '\'' +
				", rup_Cer_ID='" + rup_Cer_ID + '\'' +
				", rup_Man_ID='" + rup_Man_ID + '\'' +
				", ecof_Man_Com='" + ecof_Man_Com + '\'' +
				", ecof_Man_ID='" + ecof_Man_ID + '\'' +
				", ecof_Cer_ID='" + ecof_Cer_ID + '\'' +
				", ecof_Norm='" + ecof_Norm + '\'' +
				", ecof_Cut_Time='" + ecof_Cut_Time + '\'' +
				", ecof_Valid_Date='" + ecof_Valid_Date + '\'' +
				", ecof_Pre_Test='" + ecof_Pre_Test + '\'' +
				", ecof_Seal_Pre='" + ecof_Seal_Pre + '\'' +
				", ecof_Seal='" + ecof_Seal + '\'' +
				", ecof_Remark='" + ecof_Remark + '\'' +
				", ecof_Date='" + ecof_Date + '\'' +
				'}';
	}
}
