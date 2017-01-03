package com.ecust.equsys.domain.pipe;


public class PipeInfo extends PipeBaseEntity {

	public static PipeInfo pipeInfo = null;

	public PipeInfo() {
		super();
		this.db_Description = "管道基本信息";
		this.method = "updatePipeInfo";//上传servlet的方法名称，很重要

	}

	public static PipeInfo getInstance() {
		if (pipeInfo == null) {
			pipeInfo = new PipeInfo();
		}
		return pipeInfo;
	}

	public String company;//管道的编号
	public String p_ID;//管道的编号
	public String p_Name;//管道名称
	public String p_Equ_Name;//装置名称
	public String p_Sys;//管道系统
	public String p_Gra;//管道级别
	public String p_Len;//管道长度
	public String p_De_Com;//设计单位
	public String p_De_Date;//设计日期
	public String p_De_Norm;//设计规范
	public String p_Ins_Com;//安装单位
	public String p_Ins_Norm;//安装与验收规范
	public String p_Start_Pos;//起始位置
	public String p_End_Pos;//终止位置
	public String p_Che_Bef_Date;//验收日期
	public String p_Use_Date;//投用日期
	public String p_Act_Use_Date;//实际使用时间
	public String p_Lay;//敷设方式
	public String p_De_Pre;//设计压力
	public String p_Wo_Pre;//工作压力
	public String p_De_Tem;//设计温度
	public String p_Wo_Tem;//工作温度
	public String p_Ma_Gra;//管子材料牌号
	public String p_Wo_Med;//工作介质
	public String p_Out_Rad;//管道规格外径
	public String p_Thi;//管道规格壁厚
	public String p_Ins_Ma;//绝热层材料
	public String p_Ins_Thi;//绝热层厚度
	public String p_Pro_Mar;//腐蚀裕量
	public String p_Pro_Ma;//	防腐层材料
	public String p_submited;//1:没有提交 2：提交     设计单位提交后无法修改，无法查看
	public String p_checkType;//1：管道为单位。2：管道系统为单位
	public String nextDetailMaintainDate;//下次全面检验时间
	public String nextOnlineMaintainDate;//下次在线检验时间
	public String p_Reg_Code; //注册代码
	public String p_Max_Pre; //最高工作压力
	public String p_Max_Tem; //最高工作温度
	public String p_Sec_Rank; //安全状况等级
	public String p_Pro_Num; //工艺图号
	public String p_Sign; //管道标识
	public String p_Butt_Joint; //对接焊口数量
	public String p_Corner_Joint;  //角接焊口数量
	public String p_Total_Joint; //总焊口数量
	public String p_T_Cock; //三通数量
	public String p_Elbow; //弯头数量
	public String p_Reducer; //变径管数量
	public String p_Axial_View; //轴侧图数
	public String p_Install_Date; //安装年月
	public String p_Comment; //备注
	public String p_Speci; //管道规格
	public String p_Cer_Num; //使用证号


}
