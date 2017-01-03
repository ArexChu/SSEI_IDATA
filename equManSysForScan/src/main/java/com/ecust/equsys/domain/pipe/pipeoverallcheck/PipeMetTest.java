package com.ecust.equsys.domain.pipe.pipeoverallcheck;

import com.ecust.equsys.domain.pipe.PipeBaseEntity;

public class PipeMetTest extends PipeBaseEntity {

	public static PipeMetTest pipeMetTest = null;

	public PipeMetTest() {
		super();
		this.db_Description = "在用工业管道金相分析记录";
		this.method = "updatePipeMetTest";//上传servlet的方法名称，很重要

	}

	public static PipeMetTest getInstance() {
		if (pipeMetTest == null) {
			pipeMetTest = new PipeMetTest();
		}
		return pipeMetTest;
	}

	public String p_Heat_Sta;//热处理状态
	public String p_Met_Pos;//取样部位
	public String p_Sample_ID;//试样编号
	public String p_Equ_Mod;//仪器型号
	public String p_Equ_ID;//仪器编号
	public String p_Cor_Method;//腐蚀方法
	public String p_Pol_Method;//抛光方法
	public String p_Amp_Times;//放大倍数
	public String p_Met_Cri;//执行标准
	public String p_Ana_Result;//分析结果
	public String p_Met_Data;//金相分析日期

	@Override
	public String toString() {
		return "PipeMetTest{" +
				"p_Heat_Sta='" + p_Heat_Sta + '\'' +
				", p_Met_Pos='" + p_Met_Pos + '\'' +
				", p_Sample_ID='" + p_Sample_ID + '\'' +
				", p_Equ_Mod='" + p_Equ_Mod + '\'' +
				", p_Equ_ID='" + p_Equ_ID + '\'' +
				", p_Cor_Method='" + p_Cor_Method + '\'' +
				", p_Pol_Method='" + p_Pol_Method + '\'' +
				", p_Amp_Times='" + p_Amp_Times + '\'' +
				", p_Met_Cri='" + p_Met_Cri + '\'' +
				", p_Ana_Result='" + p_Ana_Result + '\'' +
				", p_Met_Data='" + p_Met_Data + '\'' +
				'}';
	}
}
