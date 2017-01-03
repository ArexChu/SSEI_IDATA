package com.ecust.equsys.domain.pipe.pipeinstall;

public class PipeInstallSafeCheckf extends PipeInstallBaseEntity {

	public static PipeInstallSafeCheckf pipeInstallSafeCheckf = null;

	public PipeInstallSafeCheckf() {
		super();
		this.db_Description = "工业管道防腐、绝热施工质量抽查记录";
		this.method = "updatePISafeCheck5";//上传servlet的方法名称，很重要

	}

	public static PipeInstallSafeCheckf getInstance() {
		if (pipeInstallSafeCheckf == null) {
			pipeInstallSafeCheckf = new PipeInstallSafeCheckf();
		}
		return pipeInstallSafeCheckf;
	}

	public String uniValue;
	public String universal;
	public String pi_InsPro;//工业管道防腐、绝热施工质量抽查记录
	public String pi_SafeChe5_Remark;//备注
	public String pi_SafeChe5_Per;//监检人
	public String pi_SafeChe5_Date;//监检日期

}
