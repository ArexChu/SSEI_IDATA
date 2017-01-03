package com.ecust.equsys.domain.pipe.pipeinstall;

public class PipeInstallSafeChecki extends PipeInstallBaseEntity {

	public static PipeInstallSafeChecki pipeInstallSafeChecki = null;

	public PipeInstallSafeChecki() {
		super();
		this.db_Description = "工业管道安全保护装置检查记录";
		this.method = "updatePISafeCheck8";//上传servlet的方法名称，很重要

	}

	public static PipeInstallSafeChecki getInstance() {
		if (pipeInstallSafeChecki == null) {
			pipeInstallSafeChecki = new PipeInstallSafeChecki();
		}
		return pipeInstallSafeChecki;
	}

	public String uniValue;
	public String universal;
	public String pi_SafeEqu;//工业管道通球、扫线、干燥质量审查记录
	public String pi_SafeChe7_Remark;//备注
	public String pi_SafeChe7_Per;//监检人
	public String pi_SafeChe7_Date;//监检日期

}
