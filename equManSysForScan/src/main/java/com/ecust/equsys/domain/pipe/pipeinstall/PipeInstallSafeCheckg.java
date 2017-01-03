package com.ecust.equsys.domain.pipe.pipeinstall;

public class PipeInstallSafeCheckg extends PipeInstallBaseEntity {

	public static PipeInstallSafeCheckg pipeInstallSafeCheckh = null;

	public PipeInstallSafeCheckg() {
		super();
		this.db_Description = "工业管道通球、扫线、干燥质量审查记录";
		this.method = "updatePISafeCheck6";//上传servlet的方法名称，很重要

	}

	public static PipeInstallSafeCheckg getInstance() {
		if (pipeInstallSafeCheckh == null) {
			pipeInstallSafeCheckh = new PipeInstallSafeCheckg();
		}
		return pipeInstallSafeCheckh;
	}

	public String uniValue;
	public String universal;
	public String pi_Dry;//工业管道通球、扫线、干燥质量审查记录
	public String pi_SafeChe6_Remark;//备注
	public String pi_SafeChe6_Per;//监检人
	public String pi_SafeChe6_Date;//监检日期

}
