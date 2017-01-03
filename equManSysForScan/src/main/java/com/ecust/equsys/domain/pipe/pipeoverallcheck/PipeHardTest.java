package com.ecust.equsys.domain.pipe.pipeoverallcheck;

import com.ecust.equsys.domain.pipe.PipeBaseEntity;

public class PipeHardTest extends PipeBaseEntity {

	public static PipeHardTest pipeHardTest = null;

	public PipeHardTest() {
		super();
		this.db_Description = "在用工业管道硬度测定记录";
		this.method = "updatePipeHardTest";//上传servlet的方法名称，很重要

	}

	public static PipeHardTest getInstance() {
		if (pipeHardTest == null) {
			pipeHardTest = new PipeHardTest();
		}
		return pipeHardTest;
	}

	public String universal;
	public String p_Heat_Sta;//热处理状态
	public String p_Equ_Mod;//仪器型号
	public String p_Equ_ID;//仪器编号
	public String p_Hard_Pos;//测定部位
	public String p_Hard_Cri;//评定标准
	public String p_HB_Val1;//硬 度 值（HB）
	public String p_HB_Pos1;//硬度测定部位
	public String p_HB_Value;//测定结果
	public String p_Ass_Opinion;//评定意见
	public String p_Hard_Data;//管道硬度检查时间


	@Override
	public String toString() {
		return "PipeHardTest{" +
				"universal='" + universal + '\'' +
				", p_Heat_Sta='" + p_Heat_Sta + '\'' +
				", p_Equ_Mod='" + p_Equ_Mod + '\'' +
				", p_Equ_ID='" + p_Equ_ID + '\'' +
				", p_Hard_Pos='" + p_Hard_Pos + '\'' +
				", p_Hard_Cri='" + p_Hard_Cri + '\'' +
				", p_HB_Val1='" + p_HB_Val1 + '\'' +
				", p_HB_Pos1='" + p_HB_Pos1 + '\'' +
				", p_HB_Value='" + p_HB_Value + '\'' +
				", p_Ass_Opinion='" + p_Ass_Opinion + '\'' +
				", p_Hard_Data='" + p_Hard_Data + '\'' +
				'}';
	}
}
