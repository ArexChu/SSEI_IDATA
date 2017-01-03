package com.ecust.equsys.domain.pipe.pipeinstall;

public class PipeInstallSafeChecke extends PipeInstallBaseEntity {

	public static PipeInstallSafeChecke pipeInstallSafeChecke = null;

	public PipeInstallSafeChecke() {
		super();
		this.db_Description = "工业管道穿跨越及隐蔽工程安装质量抽查记录";
		this.method = "updatePISafeCheck4";//上传servlet的方法名称，很重要

	}

	public static PipeInstallSafeChecke getInstance() {
		if (pipeInstallSafeChecke == null) {
			pipeInstallSafeChecke = new PipeInstallSafeChecke();
		}
		return pipeInstallSafeChecke;
	}

	public String uniValue;
	public String universal;
	public String pi_Cross;//工业管道穿跨越及隐蔽工程安装质量抽查记录
	public String pi_SafeChe4_Remark;//备注
	public String pi_SafeChe4_Per;//监检人
	public String pi_SafeChe4_Date;//监检日期

}
