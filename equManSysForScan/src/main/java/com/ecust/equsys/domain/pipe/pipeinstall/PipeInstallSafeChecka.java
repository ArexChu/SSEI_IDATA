package com.ecust.equsys.domain.pipe.pipeinstall;

public class PipeInstallSafeChecka extends PipeInstallBaseEntity {

	public static PipeInstallSafeChecka pipeInstallSafeChecka = null;

	public PipeInstallSafeChecka() {
		super();
		this.db_Description = "工业管道元件及焊接材料的材质审查记录";
		this.method = "updatePISafeCheck";//上传servlet的方法名称，很重要

	}

	public static PipeInstallSafeChecka getInstance() {
		if (pipeInstallSafeChecka == null) {
			pipeInstallSafeChecka = new PipeInstallSafeChecka();
		}
		return pipeInstallSafeChecka;
	}

	public String uniValue;
	public String universal;
	public String pi_Wel_Ma;//工业管道元件及焊接材料的材质审查记录（管子、管件、阀门、法兰、焊材等）
	public String pi_SafeChe_Remark;//备注
	public String pi_SafeChe_Per;//监检人
	public String pi_SafeChe_Date;//监检日期

}
