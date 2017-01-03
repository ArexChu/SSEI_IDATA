package com.ecust.equsys.domain.pipe.pipeinstall;
import com.ecust.equsys.domain.pipe.PipeBaseEntity;

public class PipeInstallConclusion extends PipeInstallBaseEntity {

	public static PipeInstallConclusion pipeInstallConclusion = null;

	public PipeInstallConclusion() {
		super();
		this.db_Description = "工业管道安装安全质量监督检验结论记录";
		this.method = "updatePipeInstallConclusion";//上传servlet的方法名称，很重要
	}

	public static PipeInstallConclusion getInstance() {
		if (pipeInstallConclusion == null) {
			pipeInstallConclusion = new PipeInstallConclusion();
		}
		return pipeInstallConclusion;
	}

	public String pi_Addr;//工程地址
	public String pi_Start_Date;//开工时间
	public String pi_End_Date;//竣工时间
	public String pi_De_Com;//设计单位
	public String pi_De_Cer_ID;//设计证书编号
	public String pi_Install_Cer_ID;//安装许可证编号
	public String pi_Pro_Com;//防腐施工单位
	public String pi_Pro_Cer_ID;//防腐资质证书编号
	public String pi_Sup_Com;//监理单位
	public String pi_Sup_Cer_ID;//监理资质证书编号
	public String pi_Check_Com;//检测单位
	public String pi_Check_Cer_ID;//检测资质证书编号
	public String pi_Insp_ID;//授权监督检验文号
	public String pi_Insp_Start_Date;//监督检验起止日期
	public String pi_Insp_End_Date;//监督检验起止日期
	public String pi_Pipe_ID;//管道编号
	public String pi_Insp_Reasion;//监督检验依据
	public String pi_Insp_Result;//监督检验结论：
	public String  pi_Insp_Grade;//安全状况等级
	public String  pi_Next_Date;//下次全面检验日期
	public String  pi_Check_Equ;//监检使用的设备名称及编号
	public String  pi_Insp_Per_Name;//监检
	public String  pi_Insp_Per_ID;//资格证号
	public String  pi_Insp_Date;//日期
	public String  pi_Check_Per_Name;//校对
	public String  pi_Check_Per_ID;//资格证号
	public String  pi_Check_Date;//日期

	@Override
	public String toString() {
		return "PipeInstallConclusion{" +
				"pi_Addr='" + pi_Addr + '\'' +
				", pi_Start_Date='" + pi_Start_Date + '\'' +
				", pi_End_Date='" + pi_End_Date + '\'' +
				", pi_De_Com='" + pi_De_Com + '\'' +
				", pi_De_Cer_ID='" + pi_De_Cer_ID + '\'' +
				", pi_Install_Cer_ID='" + pi_Install_Cer_ID + '\'' +
				", pi_Pro_Com='" + pi_Pro_Com + '\'' +
				", pi_Pro_Cer_ID='" + pi_Pro_Cer_ID + '\'' +
				", pi_Sup_Com='" + pi_Sup_Com + '\'' +
				", pi_Sup_Cer_ID='" + pi_Sup_Cer_ID + '\'' +
				", pi_Check_Com='" + pi_Check_Com + '\'' +
				", pi_Check_Cer_ID='" + pi_Check_Cer_ID + '\'' +
				", pi_Insp_ID='" + pi_Insp_ID + '\'' +
				", pi_Insp_Start_Date='" + pi_Insp_Start_Date + '\'' +
				", pi_Insp_End_Date='" + pi_Insp_End_Date + '\'' +
				", pi_Pipe_ID='" + pi_Pipe_ID + '\'' +
				", pi_Insp_Reasion='" + pi_Insp_Reasion + '\'' +
				", pi_Insp_Result='" + pi_Insp_Result + '\'' +
				", pi_Insp_Grade='" + pi_Insp_Grade + '\'' +
				", pi_Next_Date='" + pi_Next_Date + '\'' +
				", pi_Check_Equ='" + pi_Check_Equ + '\'' +
				", pi_Insp_Per_Name='" + pi_Insp_Per_Name + '\'' +
				", pi_Insp_Per_ID='" + pi_Insp_Per_ID + '\'' +
				", pi_Insp_Date='" + pi_Insp_Date + '\'' +
				", pi_Check_Per_Name='" + pi_Check_Per_Name + '\'' +
				", pi_Check_Per_ID='" + pi_Check_Per_ID + '\'' +
				", pi_Check_Date='" + pi_Check_Date + '\'' +
				'}';
	}
}
