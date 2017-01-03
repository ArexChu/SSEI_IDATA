package com.ecust.equsys.domain.pipe;


public class PipeConfig extends PipeBaseEntity {

	public static PipeConfig pipeConfig = null;

	public PipeConfig() {
		super();
		this.db_Description = "管道信息配置";
		this.method = "updatePipeModify";//上传servlet的方法名称，很重要

	}

	public static PipeConfig getInstance() {
		if (pipeConfig == null) {
			pipeConfig = new PipeConfig();
		}
		return pipeConfig;
	}
	
	public String p_Thick_Qua;//管道测厚个数
	public String p_Hard_Qua;//管道硬度测定个数
	public String pi_Rev_value;//压力管道底片抽查个数
	public String pi_Wel_Ma;
	public String pi_Wel_Qua;
	public String pi_Compen;
	public String pi_Appurt;
	public String pi_Cross;
	public String pi_InsPro;
	public String pi_Dry;
	public String pi_Leak;
	public String pi_SafeEqu;

}
