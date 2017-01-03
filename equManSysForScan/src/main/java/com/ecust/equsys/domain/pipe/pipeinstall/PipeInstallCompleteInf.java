package com.ecust.equsys.domain.pipe.pipeinstall;

public class PipeInstallCompleteInf extends PipeInstallBaseEntity {

	public static PipeInstallCompleteInf pipeInstallCompleteInf = null;

	public PipeInstallCompleteInf() {
		super();
		this.db_Description = "管道安装竣工资料审查报告记录";
		this.method = "updatePipeInstallCompleteInf";//上传servlet的方法名称，很重要

	}

	public static PipeInstallCompleteInf getInstance() {
		if (pipeInstallCompleteInf == null) {
			pipeInstallCompleteInf = new PipeInstallCompleteInf();
		}
		return pipeInstallCompleteInf;
	}

	public String pi_EquIns_Check;//特种设备安装改造维修告知书
	public String pi_EquIns_Result;//
	public String pi_Assur_Check;//安装单位现场质保体系及人员任命书
	public String pi_Assur_Result;//
	public String pi_Explain_Check;//设计图纸及其技术要求（说明）
	public String pi_Explain_Result;//
	public String pi_Cons_Check;//施工组织设计（或施工方案）
	public String pi_Cons_Result;//
	public String pi_Wel_Check;//焊接工艺规程（焊接作业指导书）
	public String pi_Wel_Result;//
	public String pi_NDE_Check;//无损检测工艺和方案
	public String pi_NDE_Result;//
	public String pi_WelReg_Check;//压力管道焊工汇总登记表及其资格复印件
	public String pi_WelReg_Result;//
	public String pi_NDEBook_Check;//无损检测人员汇总登记表及其资格复印件
	public String pi_NDEBook_Result;//
	public String pi_Compon_Check;//管道组成件（含焊材）质证书及检查验收记录
	public String pi_Compon_Result;//
	public String pi_Compon_Rep_Check;//管道组成件理化试验报告
	public String pi_Compon_Rep_Result;//
	public String pi_Proc_Check;//管件加工记录
	public String pi_Proc_Result;//
	public String pi_Valve_Check;//阀门试验记录
	public String pi_Valve_Result;//
	public String pi_InsCons_Check;//组对安装施工记录
	public String pi_InsCons_Result;//
	public String pi_WelCons_Check;//管道焊接施工记录
	public String pi_WelCons_Result;//
	public String pi_compen_Check;//补偿装置安装记录
	public String pi_compen_Result;//
	public String pi_Hanger_Check;//支、吊架安装记录
	public String pi_Hanger_Result;//
	public String pi_Hidden_Check;//隐蔽工程（封闭）记录
	public String pi_Hidden_Result;//
	public String pi_WelHeat_Check;//管道焊缝热处理报告
	public String pi_WelHeat_Result;//
	public String pi_NDERep_Check;//无损检测报告
	public String pi_NDERep_Result;//
	public String pi_LeakRep_Check;//强度及泄漏性试验报告
	public String pi_LeakRep_Result;//
	public String pi_DryRep_Check;//通球、吹扫及清洗记录
	public String pi_DrykRep_Result;//
	public String pi_SafeEqu_Check;//安全保护装置调试记录
	public String pi_SafeEqu_Result;//
	public String pi_ProTest_Check;//防腐施工、绝缘测试记录
	public String pi_ProTest_Result;//
	public String pi_Sta_Ele_Check;//静电测试记录
	public String pi_Sta_Ele_Result;//
	public String pi_InsTem_Check;//保温施工记录
	public String pi_InsTem_Result;//
	public String pi_Change_Check;//设计变更通知（确认）单
	public String pi_Change_Result;//
	public String pi_Complete_Pic_Check;//竣工图（包含单线图）
	public String pi_Complete_Pic_Result;//
	public String pi_Complete_Remark;//备注
	public String pi_Complete_Per;//监检人
	public String pi_Complete_Date;//监检日期

	@Override
	public String toString() {
		return "PipeInstallCompleteInf{" +
				"pi_EquIns_Check='" + pi_EquIns_Check + '\'' +
				", pi_EquIns_Result='" + pi_EquIns_Result + '\'' +
				", pi_Assur_Check='" + pi_Assur_Check + '\'' +
				", pi_Assur_Result='" + pi_Assur_Result + '\'' +
				", pi_Explain_Check='" + pi_Explain_Check + '\'' +
				", pi_Explain_Result='" + pi_Explain_Result + '\'' +
				", pi_Cons_Check='" + pi_Cons_Check + '\'' +
				", pi_Cons_Result='" + pi_Cons_Result + '\'' +
				", pi_Wel_Check='" + pi_Wel_Check + '\'' +
				", pi_Wel_Result='" + pi_Wel_Result + '\'' +
				", pi_NDE_Check='" + pi_NDE_Check + '\'' +
				", pi_NDE_Result='" + pi_NDE_Result + '\'' +
				", pi_WelReg_Check='" + pi_WelReg_Check + '\'' +
				", pi_WelReg_Result='" + pi_WelReg_Result + '\'' +
				", pi_NDEBook_Check='" + pi_NDEBook_Check + '\'' +
				", pi_NDEBook_Result='" + pi_NDEBook_Result + '\'' +
				", pi_Compon_Check='" + pi_Compon_Check + '\'' +
				", pi_Compon_Result='" + pi_Compon_Result + '\'' +
				", pi_Compon_Rep_Check='" + pi_Compon_Rep_Check + '\'' +
				", pi_Compon_Rep_Result='" + pi_Compon_Rep_Result + '\'' +
				", pi_Proc_Check='" + pi_Proc_Check + '\'' +
				", pi_Proc_Result='" + pi_Proc_Result + '\'' +
				", pi_Valve_Check='" + pi_Valve_Check + '\'' +
				", pi_Valve_Result='" + pi_Valve_Result + '\'' +
				", pi_InsCons_Check='" + pi_InsCons_Check + '\'' +
				", pi_InsCons_Result='" + pi_InsCons_Result + '\'' +
				", pi_WelCons_Check='" + pi_WelCons_Check + '\'' +
				", pi_WelCons_Result='" + pi_WelCons_Result + '\'' +
				", pi_compen_Check='" + pi_compen_Check + '\'' +
				", pi_compen_Result='" + pi_compen_Result + '\'' +
				", pi_Hanger_Check='" + pi_Hanger_Check + '\'' +
				", pi_Hanger_Result='" + pi_Hanger_Result + '\'' +
				", pi_Hidden_Check='" + pi_Hidden_Check + '\'' +
				", pi_Hidden_Result='" + pi_Hidden_Result + '\'' +
				", pi_WelHeat_Check='" + pi_WelHeat_Check + '\'' +
				", pi_WelHeat_Result='" + pi_WelHeat_Result + '\'' +
				", pi_NDERep_Check='" + pi_NDERep_Check + '\'' +
				", pi_NDERep_Result='" + pi_NDERep_Result + '\'' +
				", pi_LeakRep_Check='" + pi_LeakRep_Check + '\'' +
				", pi_LeakRep_Result='" + pi_LeakRep_Result + '\'' +
				", pi_DryRep_Check='" + pi_DryRep_Check + '\'' +
				", pi_DrykRep_Result='" + pi_DrykRep_Result + '\'' +
				", pi_SafeEqu_Check='" + pi_SafeEqu_Check + '\'' +
				", pi_SafeEqu_Result='" + pi_SafeEqu_Result + '\'' +
				", pi_ProTest_Check='" + pi_ProTest_Check + '\'' +
				", pi_ProTest_Result='" + pi_ProTest_Result + '\'' +
				", pi_Sta_Ele_Check='" + pi_Sta_Ele_Check + '\'' +
				", pi_Sta_Ele_Result='" + pi_Sta_Ele_Result + '\'' +
				", pi_InsTem_Check='" + pi_InsTem_Check + '\'' +
				", pi_InsTem_Result='" + pi_InsTem_Result + '\'' +
				", pi_Change_Check='" + pi_Change_Check + '\'' +
				", pi_Change_Result='" + pi_Change_Result + '\'' +
				", pi_Complete_Pic_Check='" + pi_Complete_Pic_Check + '\'' +
				", pi_Complete_Pic_Result='" + pi_Complete_Pic_Result + '\'' +
				", pi_Complete_Remark='" + pi_Complete_Remark + '\'' +
				", pi_Complete_Per='" + pi_Complete_Per + '\'' +
				", pi_Complete_Date='" + pi_Complete_Date + '\'' +
				'}';
	}
}
