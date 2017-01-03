package com.ecust.equsys.domain.pipe.pipeinstall;

public class PipeInstallReview extends PipeInstallBaseEntity {

	public static PipeInstallReview pipeInstallReview = null;

	public PipeInstallReview() {
		super();
		this.db_Description = "压力管道底片复审记录表";
		this.method = "updatePipeInstallReview";//上传servlet的方法名称，很重要

	}

	public static PipeInstallReview getInstance() {
		if (pipeInstallReview == null) {
			pipeInstallReview = new PipeInstallReview();
		}
		return pipeInstallReview;
	}

	public String uniValue;
	public String universal;
	public String pi_Rev_PID;//管线编号
	public String pi_Rev_Ration;//检测比例
	public String pi_Rev_Cri;//评定标准
	public String pi_Rev_Num;//拍片总数
	public String pi_Rev_Che_Num;//抽查片数
	public String pi_Rev_Che_Ration;//抽查比例 
	public String pi_Rev_Gra;//合格级别
	public String pi_Rev_Che1;//管口号/底片号
	public String pi_Rev_value1;//抽查结果，数量，备注
	public String pi_Rev_value2;
	public String pi_Rev_value3;
	public String pi_Rev_value4;
	public String pi_Rev_value5;
	public String pi_Rev_value6;
	public String pi_Rev_value7;
	public String pi_Rev_value8;
	public String pi_Rev_value9;
	public String pi_Rev_value10;
	public String pi_Rev_value11;
	public String pi_Rev_value12;
	public String pi_Rev_value13;
	public String pi_Rev_value14;
	public String pi_Rev_value15;
	public String pi_Rev_value16;
	public String pi_Rev_value17;
	public String pi_Rev_value18;
	public String pi_Rev_value19;
	public String pi_Rev_value20;
	public String pi_Rev_Per_Name;
	public String pi_Rev_Date;

}
