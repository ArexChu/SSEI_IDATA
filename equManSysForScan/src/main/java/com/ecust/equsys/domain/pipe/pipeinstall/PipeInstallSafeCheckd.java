package com.ecust.equsys.domain.pipe.pipeinstall;

public class PipeInstallSafeCheckd extends PipeInstallBaseEntity {

	public static PipeInstallSafeCheckd pipeInstallSafeCheckd = null;

	public PipeInstallSafeCheckd() {
		super();
		this.db_Description = "工业管道附属设施和设备安装质量抽查记录";
		this.method = "updatePISafeCheck3";//上传servlet的方法名称，很重要

	}

	public static PipeInstallSafeCheckd getInstance() {
		if (pipeInstallSafeCheckd == null) {
			pipeInstallSafeCheckd = new PipeInstallSafeCheckd();
		}
		return pipeInstallSafeCheckd;
	}

	public String uniValue;
	public String universal;
	public String pi_Appurt;//工业管道附属设施和设备安装质量抽查记录
	public String pi_SafeChe3_Remark;//备注
	public String pi_SafeChe3_Per;//监检人
	public String pi_SafeChe3_Date;//监检日期

}
