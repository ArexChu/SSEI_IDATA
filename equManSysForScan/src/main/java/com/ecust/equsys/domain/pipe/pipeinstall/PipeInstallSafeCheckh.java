package com.ecust.equsys.domain.pipe.pipeinstall;

public class PipeInstallSafeCheckh extends PipeInstallBaseEntity {

	public static PipeInstallSafeCheckh pipeInstallSafeCheck7 = null;

	public PipeInstallSafeCheckh() {
		super();
		this.db_Description = "工业管道强度试验、泄漏性试验记录";
		this.method = "updatePISafeCheck7";//上传servlet的方法名称，很重要

	}

	public static PipeInstallSafeCheckh getInstance() {
		if (pipeInstallSafeCheck7 == null) {
			pipeInstallSafeCheck7 = new PipeInstallSafeCheckh();
		}
		return pipeInstallSafeCheck7;
	}

	public String uniValue;
	public String universal;
	public String pi_Leak;//工业管道强度试验、泄漏性试验记录
	public String pi_SafeChe7_Remark;//备注
	public String pi_SafeChe7_Per;//监检人
	public String pi_SafeChe7_Date;//监检日期

}
