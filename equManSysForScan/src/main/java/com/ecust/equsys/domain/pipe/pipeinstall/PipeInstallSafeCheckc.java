package com.ecust.equsys.domain.pipe.pipeinstall;

public class PipeInstallSafeCheckc extends PipeInstallBaseEntity {

	public static PipeInstallSafeCheckc pipeInstallSafeCheckc = null;

	public PipeInstallSafeCheckc() {
		super();
		this.db_Description = "工业管道补偿器和热传导支承件安装质量抽查记录";
		this.method = "updatePISafeCheck2";//上传servlet的方法名称，很重要

	}

	public static PipeInstallSafeCheckc getInstance() {
		if (pipeInstallSafeCheckc == null) {
			pipeInstallSafeCheckc = new PipeInstallSafeCheckc();
		}
		return pipeInstallSafeCheckc;
	}

	public String uniValue;
	public String universal;
	public String pi_Compen;//工业管道补偿器和热传导支承件安装质量抽查记录
	public String pi_SafeChe2_Remark;//备注
	public String pi_SafeChe2_Per;//监检人
	public String pi_SafeChe2_Date;//监检日期

}
