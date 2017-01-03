package com.ecust.equsys.domain.pipe.pipeinstall;

public class PipeInstallLeftProblem extends PipeInstallBaseEntity {

	public static PipeInstallLeftProblem pipeInstallLeftProblem= null;

	public PipeInstallLeftProblem() {
		super();
		this.db_Description = "遗留质量问题的处理意见记录";
		this.method = "updatePipeInstallLeftProblem";//上传servlet的方法名称，很重要

	}

	public static PipeInstallLeftProblem getInstance() {
		if (pipeInstallLeftProblem== null) {
			pipeInstallLeftProblem= new PipeInstallLeftProblem();
		}
		return pipeInstallLeftProblem;
	}

	public String pi_Left_Prob;//遗留问题：
	public String pi_Left_Opin;//处理意见：
	public String pi_Left_Per_Name;//监检：
	public String pi_Left_Date;//监检日期

	@Override
	public String toString() {
		return "PipeInstallLeftProblem{" +
				"pi_Left_Prob='" + pi_Left_Prob + '\'' +
				", pi_Left_Opin='" + pi_Left_Opin + '\'' +
				", pi_Left_Per_Name='" + pi_Left_Per_Name + '\'' +
				", pi_Left_Date='" + pi_Left_Date + '\'' +
				'}';
	}
}
