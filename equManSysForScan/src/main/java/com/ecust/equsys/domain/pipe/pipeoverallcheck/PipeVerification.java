package com.ecust.equsys.domain.pipe.pipeoverallcheck;

import com.ecust.equsys.domain.pipe.PipeBaseEntity;

public class PipeVerification extends PipeBaseEntity {

	public static PipeVerification pipeVerification = null;

	public PipeVerification() {
		super();
		this.db_Description = "管道全面检验结论（必填）";
		this.method = "updatePipeVerification";//上传servlet的方法名称，很重要

	}

	public static PipeVerification getInstance() {
		if (pipeVerification == null) {
			pipeVerification = new PipeVerification();
		}
		return pipeVerification;
	}

	public String m_Original_Data;//原始资料
	public String m_Rules;//规章制度
	public String m_Items;//检验检测项目
	public String m_Gra;//安全状况等级
	public String m_Max_Pre;//最高工作压力
	public String m_Tem;//工作温度
	public String m_Med;//介质
	public String m_Limit;//监控使用的限制性条件
	public String m_Reasion;//.判废依据
	public String m_Others;//其它
	public String m_Test_Equ;//检验使用的设备名称及编号
	public String m_Test_Remark;//其他需要说明的检验情况
	public String m_Test_Date;//检验
	public String m_Check_Date;//校核
	
}
