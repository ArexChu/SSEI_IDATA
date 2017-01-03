package com.ecust.equsys.domain.pipe.pipeoverallcheck;

import com.ecust.equsys.domain.pipe.PipeBaseEntity;

public class PipeThiCheck extends PipeBaseEntity {

	public static PipeThiCheck pipeThiCheck = null;

	public PipeThiCheck() {
		super();
		this.db_Description = "管道测厚检查";
		this.method = "updatePipeThiCheck";//上传servlet的方法名称，很重要

	}

	public static PipeThiCheck getInstance() {
		if (pipeThiCheck == null) {
			pipeThiCheck = new PipeThiCheck();
		}
		return pipeThiCheck;
	}

	public String universal;
	public String p_Thi_Name;//管道编号（为了自己填的）
	public String p_Sur_Sta;//表面状况
	public String p_Equ_Mod;//测厚仪器型号
	public String p_Equ_Acc;//测厚仪器精度
	public String p_Equ_ID;//测厚仪器编号
	public String p_Use_Sta;//使用状态
	public String p_Thi_ratio_1;//管件测厚比例
	public String p_Thi_ratio_2;//管子测厚比例
	public String p_Thi_Num;//实测点数
	public String p_Min_Thi;//实测最小壁厚
	public String p_Thi_Value;//检验值
	public String p_Thi_Date;//壁厚检测检查日期

	@Override
	public String toString() {
		return "PipeThiCheck{" +
				"universal='" + universal + '\'' +
				", p_Thi_Name='" + p_Thi_Name + '\'' +
				", p_Sur_Sta='" + p_Sur_Sta + '\'' +
				", p_Equ_Mod='" + p_Equ_Mod + '\'' +
				", p_Equ_Acc='" + p_Equ_Acc + '\'' +
				", p_Equ_ID='" + p_Equ_ID + '\'' +
				", p_Use_Sta='" + p_Use_Sta + '\'' +
				", p_Thi_ratio_1='" + p_Thi_ratio_1 + '\'' +
				", p_Thi_ratio_2='" + p_Thi_ratio_2 + '\'' +
				", p_Thi_Num='" + p_Thi_Num + '\'' +
				", p_Min_Thi='" + p_Min_Thi + '\'' +
				", p_Thi_Value='" + p_Thi_Value + '\'' +
				", p_Thi_Date='" + p_Thi_Date + '\'' +
				'}';
	}
}
