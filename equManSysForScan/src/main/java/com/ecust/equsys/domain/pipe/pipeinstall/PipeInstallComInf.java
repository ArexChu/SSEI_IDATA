package com.ecust.equsys.domain.pipe.pipeinstall;

import com.ecust.equsys.domain.pipe.PipeBaseEntity;

public class PipeInstallComInf extends PipeInstallBaseEntity {

	public static PipeInstallComInf pipeInstallComInf = null;

	public PipeInstallComInf() {
		super();
		this.db_Description = "对相关单位安全质量管理行为的评价记录";
		this.method = "updatePipeInstallComInf";//上传servlet的方法名称，很重要

	}

	public static PipeInstallComInf getInstance() {
		if (pipeInstallComInf == null) {
			pipeInstallComInf = new PipeInstallComInf();
		}
		return pipeInstallComInf;
	}

	public String pi_Cons_Inf1;//设计、监理、安装、检测及防腐合同管理
	public String pi_Cons_Inf2;//组织设计交底和施工方案讨论
	public String pi_Cons_Inf3;//材料采购质量控制与施工管理
	public String pi_Cons_Inf4;//监督检验意见处理情况
	public String pi_Cons_Opinion;//评价意见
	public String pi_Sup_Inf1;//监理单位资质、监理人员资格
	public String pi_Sup_Inf2;//监理单位质量管理体系
	public String pi_Sup_Inf3;//监理工作质量
	public String pi_Sup_Inf4;//监督检验意见处理情况
	public String pi_Sup_Opinion;//评价意见
	public String pi_InsCom_Inf1;//安装单位资质与告知手续
	public String pi_InsCom_Inf2;//质量管理体系及专业技术、管理人员
	public String pi_InsCom_Inf3;//材料验收及施工质量检验管理
	public String pi_InsCom_Inf4;//焊工资格、焊评报告及焊接工艺、施工方案实施情况
	public String pi_InsCom_Inf5;//施工技术文件管理
	public String pi_InsCom_Inf6;//安装分包、转包管理
	public String pi_InsCom_Inf7;//监督检验意见处理情况
	public String pi_InsCom_Opinion;//评价意见
	public String pi_CheCom_Inf1;//检测单位资质检测人员资格
	public String pi_CheCom_Inf2;//检测单位质量管理体系
	public String pi_CheCom_Inf3;//检测工作质量与检测报告
	public String pi_CheCom_Inf4;//监督检验意见处理情况
	public String pi_CheCom_Opinion;//评价意见
	public String pi_Pro_Inf1;//防腐单位资质
	public String pi_Pro_Inf2;//防腐单位质量管理体系
	public String pi_Pro_Inf3;//防腐工作质量与施工记录
	public String pi_Pro_Inf4;//监督检验意见处理情况
	public String pi_Pro_Opinion;//评价意见
	public String pi_InsCom_Remark;//备注
	public String pi_InsCom_Per;//监检人
	public String pi_InsCom_Date;//监检日期

	@Override
	public String toString() {
		return "PipeInstallComInf{" +
				"pi_Cons_Inf1='" + pi_Cons_Inf1 + '\'' +
				", pi_Cons_Inf2='" + pi_Cons_Inf2 + '\'' +
				", pi_Cons_Inf3='" + pi_Cons_Inf3 + '\'' +
				", pi_Cons_Inf4='" + pi_Cons_Inf4 + '\'' +
				", pi_Cons_Opinion='" + pi_Cons_Opinion + '\'' +
				", pi_Sup_Inf1='" + pi_Sup_Inf1 + '\'' +
				", pi_Sup_Inf2='" + pi_Sup_Inf2 + '\'' +
				", pi_Sup_Inf3='" + pi_Sup_Inf3 + '\'' +
				", pi_Sup_Inf4='" + pi_Sup_Inf4 + '\'' +
				", pi_Sup_Opinion='" + pi_Sup_Opinion + '\'' +
				", pi_InsCom_Inf1='" + pi_InsCom_Inf1 + '\'' +
				", pi_InsCom_Inf2='" + pi_InsCom_Inf2 + '\'' +
				", pi_InsCom_Inf3='" + pi_InsCom_Inf3 + '\'' +
				", pi_InsCom_Inf4='" + pi_InsCom_Inf4 + '\'' +
				", pi_InsCom_Inf5='" + pi_InsCom_Inf5 + '\'' +
				", pi_InsCom_Inf6='" + pi_InsCom_Inf6 + '\'' +
				", pi_InsCom_Inf7='" + pi_InsCom_Inf7 + '\'' +
				", pi_InsCom_Opinion='" + pi_InsCom_Opinion + '\'' +
				", pi_CheCom_Inf1='" + pi_CheCom_Inf1 + '\'' +
				", pi_CheCom_Inf2='" + pi_CheCom_Inf2 + '\'' +
				", pi_CheCom_Inf3='" + pi_CheCom_Inf3 + '\'' +
				", pi_CheCom_Inf4='" + pi_CheCom_Inf4 + '\'' +
				", pi_CheCom_Opinion='" + pi_CheCom_Opinion + '\'' +
				", pi_Pro_Inf1='" + pi_Pro_Inf1 + '\'' +
				", pi_Pro_Inf2='" + pi_Pro_Inf2 + '\'' +
				", pi_Pro_Inf3='" + pi_Pro_Inf3 + '\'' +
				", pi_Pro_Inf4='" + pi_Pro_Inf4 + '\'' +
				", pi_Pro_Opinion='" + pi_Pro_Opinion + '\'' +
				", pi_InsCom_Remark='" + pi_InsCom_Remark + '\'' +
				", pi_InsCom_Per='" + pi_InsCom_Per + '\'' +
				", pi_InsCom_Date='" + pi_InsCom_Date + '\'' +
				'}';
	}
}
