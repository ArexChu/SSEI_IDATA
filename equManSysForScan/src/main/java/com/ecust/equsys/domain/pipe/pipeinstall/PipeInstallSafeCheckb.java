package com.ecust.equsys.domain.pipe.pipeinstall;

public class PipeInstallSafeCheckb extends PipeInstallBaseEntity {

	public static PipeInstallSafeCheckb pipeInstallSafeCheckb = null;

	public PipeInstallSafeCheckb() {
		super();
		this.db_Description = "工业管道焊接质量抽查记录";
		this.method = "updatePISafeCheck1";//上传servlet的方法名称，很重要

	}

	public static PipeInstallSafeCheckb getInstance() {
		if (pipeInstallSafeCheckb == null) {
			pipeInstallSafeCheckb = new PipeInstallSafeCheckb();
		}
		return pipeInstallSafeCheckb;
	}

	public String uniValue;
	public String universal;
	public String pi_Wel_Qua;//工业管道焊接质量抽查记录
	public String pi_SafeChe1_Remark;//备注
	public String pi_SafeChe1_Per;//监检人
	public String pi_SafeChe1_Date;//监检日期

}
