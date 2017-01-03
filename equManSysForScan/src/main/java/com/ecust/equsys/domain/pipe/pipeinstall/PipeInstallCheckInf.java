package com.ecust.equsys.domain.pipe.pipeinstall;

import com.ecust.equsys.domain.pipe.PipeBaseEntity;

public class PipeInstallCheckInf extends PipeInstallBaseEntity {

	public static PipeInstallCheckInf pipeInstallCheckInf = null;

	public PipeInstallCheckInf() {
		super();
		this.db_Description = "监督检验的工作内容及工作基本情况记录";
		this.method = "updatePipeInstallCheckInf";//上传servlet的方法名称，很重要

	}

	public static PipeInstallCheckInf getInstance() {
		if (pipeInstallCheckInf == null) {
			pipeInstallCheckInf = new PipeInstallCheckInf();
		}
		return pipeInstallCheckInf;
	}

	public String pi_Check1_inf;//安装告知书
	public String pi_Check1_Date;//
	public String pi_Check2_inf;//设计单位资质及图纸审查
	public String pi_Check2_Date;//
	public String pi_Check3_inf;//设计变更及材料代用手续
	public String pi_Check3_Date;//
	public String pi_Check4_inf;//施工方案及焊接工艺评定
	public String pi_Check4_Date;//
	public String pi_Check5_inf;//焊接、探伤人员资格审查
	public String pi_Check5_Date;//
	public String pi_Check6_inf;//管道元件、焊接材料质量证明文件
	public String pi_Check6_Date;//
	public String pi_Check7_inf;//阀门强度与密封性试验
	public String pi_Check7_Date;//
	public String pi_Check8_inf;//管道布置及焊缝检查
	public String pi_Check8_Date;//
	public String pi_Check9_inf;//支吊架安装质量检查
	public String pi_Check9_Date;//
	public String pi_Check10_inf;//可拆件/补偿器/阀门/法兰安装质量抽查
	public String pi_Check10_Date;//
	public String pi_Check11_inf;//射线底片抽审
	public String pi_Check11_Date;//
	public String pi_Check12_inf;//无损检测结果质量评定
	public String pi_Check12_Date;//
	public String pi_Check13_inf;//管道强度试验
	public String pi_Check13_Date;//
	public String pi_Check14_inf;//管道泄漏性试验
	public String pi_Check14_Date;//
	public String pi_Check15_inf;//管道附属设备安装质量
	public String pi_Check15_Date;//
	public String pi_Check16_inf;//防静电设施安装质量
	public String pi_Check16_Date;//
	public String pi_Check17_inf;//管道吹扫、清洗、通球质量
	public String pi_Check17_Date;//
	public String pi_Check18_inf;//管道防腐、绝热施工质量抽查
	public String pi_Check18_Date;//
	public String pi_Check19_inf;//管道安全附件检查
	public String pi_Check19_Date;//
	public String pi_Check20_inf;//相关单位安全质量管理行为
	public String pi_Check20_Date;//
	public String pi_Check21_inf;//安装竣工技术文件审查
	public String pi_Check21_Date;//
	public String pi_Check_Result;//结论
	public String pi_Check_Remark;//备注
	public String pi_Check_Per;//监检人
	public String pi_Check_Date;//监检日期

	@Override
	public String toString() {
		return "PipeInstallCheckInf{" +
				"pi_Check1_inf='" + pi_Check1_inf + '\'' +
				", pi_Check1_Date='" + pi_Check1_Date + '\'' +
				", pi_Check2_inf='" + pi_Check2_inf + '\'' +
				", pi_Check2_Date='" + pi_Check2_Date + '\'' +
				", pi_Check3_inf='" + pi_Check3_inf + '\'' +
				", pi_Check3_Date='" + pi_Check3_Date + '\'' +
				", pi_Check4_inf='" + pi_Check4_inf + '\'' +
				", pi_Check4_Date='" + pi_Check4_Date + '\'' +
				", pi_Check5_inf='" + pi_Check5_inf + '\'' +
				", pi_Check5_Date='" + pi_Check5_Date + '\'' +
				", pi_Check6_inf='" + pi_Check6_inf + '\'' +
				", pi_Check6_Date='" + pi_Check6_Date + '\'' +
				", pi_Check7_inf='" + pi_Check7_inf + '\'' +
				", pi_Check7_Date='" + pi_Check7_Date + '\'' +
				", pi_Check8_inf='" + pi_Check8_inf + '\'' +
				", pi_Check8_Date='" + pi_Check8_Date + '\'' +
				", pi_Check9_inf='" + pi_Check9_inf + '\'' +
				", pi_Check9_Date='" + pi_Check9_Date + '\'' +
				", pi_Check10_inf='" + pi_Check10_inf + '\'' +
				", pi_Check10_Date='" + pi_Check10_Date + '\'' +
				", pi_Check11_inf='" + pi_Check11_inf + '\'' +
				", pi_Check11_Date='" + pi_Check11_Date + '\'' +
				", pi_Check12_inf='" + pi_Check12_inf + '\'' +
				", pi_Check12_Date='" + pi_Check12_Date + '\'' +
				", pi_Check13_inf='" + pi_Check13_inf + '\'' +
				", pi_Check13_Date='" + pi_Check13_Date + '\'' +
				", pi_Check14_inf='" + pi_Check14_inf + '\'' +
				", pi_Check14_Date='" + pi_Check14_Date + '\'' +
				", pi_Check15_inf='" + pi_Check15_inf + '\'' +
				", pi_Check15_Date='" + pi_Check15_Date + '\'' +
				", pi_Check16_inf='" + pi_Check16_inf + '\'' +
				", pi_Check16_Date='" + pi_Check16_Date + '\'' +
				", pi_Check17_inf='" + pi_Check17_inf + '\'' +
				", pi_Check17_Date='" + pi_Check17_Date + '\'' +
				", pi_Check18_inf='" + pi_Check18_inf + '\'' +
				", pi_Check18_Date='" + pi_Check18_Date + '\'' +
				", pi_Check19_inf='" + pi_Check19_inf + '\'' +
				", pi_Check19_Date='" + pi_Check19_Date + '\'' +
				", pi_Check20_inf='" + pi_Check20_inf + '\'' +
				", pi_Check20_Date='" + pi_Check20_Date + '\'' +
				", pi_Check21_inf='" + pi_Check21_inf + '\'' +
				", pi_Check21_Date='" + pi_Check21_Date + '\'' +
				", pi_Check_Result='" + pi_Check_Result + '\'' +
				", pi_Check_Remark='" + pi_Check_Remark + '\'' +
				", pi_Check_Per='" + pi_Check_Per + '\'' +
				", pi_Check_Date='" + pi_Check_Date + '\'' +
				'}';
	}
}
