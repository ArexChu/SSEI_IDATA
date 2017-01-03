package com.ecust.equsys.domain.pipe.pipeinstall;

import com.ecust.equsys.domain.pipe.PipeBaseEntity;

public class PipeInstallBasic extends PipeInstallBaseEntity {

	public static PipeInstallBasic pipeInstallBasic = null;

	public PipeInstallBasic() {
		super();
		this.db_Description = "监督检验的工业管道基本情况记录";
		this.method = "updatePipeInstallBasic";//上传servlet的方法名称，很重要

	}

	public static PipeInstallBasic getInstance() {
		if (pipeInstallBasic == null) {
			pipeInstallBasic = new PipeInstallBasic();
		}
		return pipeInstallBasic;
	}

	public String pi_De_Pre;//设计压力
	public String pi_De_Tem;//设计温度
	public String pi_Wo_Med;//输送介质
	public String pi_Gra;//管道级别
	public String pi_De_Cri;//管道设计标准
	public String pi_Ins_Cri;//管道安装标准
	public String pi_Len;//管道长度
	public String pi_Wel_Num;//焊口数量
	public String pi_Wel_Cri;//焊评标准
	public String pi_Wel_Rep;//焊评报告号
	public String pi_Wel_ID;//焊接工艺号
	public String pi_Hidden_Len;//管道隐蔽长度
	public String pi_Hidden_Wel;//隐蔽焊口
	public String pi_Corss_Cri;//穿跨越标准
	public String pi_Corss_Num;//穿跨越数
	public String pi_Corss_Method;//穿跨越方法
	public String pi_Corss_Len;//穿跨越总长度
	public String pi_Che_Wel;//检测焊口
	public String pi_Che_Cri;//检测标准
	public String pi_Che_Ration;//检测比例
	public String pi_Qua_Gra;//合格级别
	public String pi_Che_Method;//检测方法
	public String pi_Basic_Remark;//备注
	public String pi_Basic_Per;//监检人员
	public String pi_Basic_Date;//日期

	@Override
	public String toString() {
		return "PipeInstallBasic{" +
				"pi_De_Pre='" + pi_De_Pre + '\'' +
				", pi_De_Tem='" + pi_De_Tem + '\'' +
				", pi_Wo_Med='" + pi_Wo_Med + '\'' +
				", pi_Gra='" + pi_Gra + '\'' +
				", pi_De_Cri='" + pi_De_Cri + '\'' +
				", pi_Ins_Cri='" + pi_Ins_Cri + '\'' +
				", pi_Len='" + pi_Len + '\'' +
				", pi_Wel_Num='" + pi_Wel_Num + '\'' +
				", pi_Wel_Cri='" + pi_Wel_Cri + '\'' +
				", pi_Wel_Rep='" + pi_Wel_Rep + '\'' +
				", pi_Wel_ID='" + pi_Wel_ID + '\'' +
				", pi_Hidden_Len='" + pi_Hidden_Len + '\'' +
				", pi_Hidden_Wel='" + pi_Hidden_Wel + '\'' +
				", pi_Corss_Cri='" + pi_Corss_Cri + '\'' +
				", pi_Corss_Num='" + pi_Corss_Num + '\'' +
				", pi_Corss_Method='" + pi_Corss_Method + '\'' +
				", pi_Corss_Len='" + pi_Corss_Len + '\'' +
				", pi_Che_Wel='" + pi_Che_Wel + '\'' +
				", pi_Che_Cri='" + pi_Che_Cri + '\'' +
				", pi_Che_Ration='" + pi_Che_Ration + '\'' +
				", pi_Qua_Gra='" + pi_Qua_Gra + '\'' +
				", pi_Che_Method='" + pi_Che_Method + '\'' +
				", pi_Basic_Remark='" + pi_Basic_Remark + '\'' +
				", pi_Basic_Per='" + pi_Basic_Per + '\'' +
				", pi_Basic_Date='" + pi_Basic_Date + '\'' +
				'}';
	}
}
