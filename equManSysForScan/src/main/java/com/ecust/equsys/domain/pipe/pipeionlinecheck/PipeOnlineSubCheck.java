package com.ecust.equsys.domain.pipe.pipeionlinecheck;

import com.ecust.equsys.domain.pipe.PipeBaseEntity;

public class PipeOnlineSubCheck extends PipeBaseEntity {

	public static PipeOnlineSubCheck pipeOnlineThiCheck = null;

	public PipeOnlineSubCheck() {
		super();
		this.db_Description = "在用工业管道在线检验记录（2）";
		this.method = "updatePipeOnlineSubCheck";//上传servlet的方法名称，很重要

	}

	public static PipeOnlineSubCheck getInstance() {
		if (pipeOnlineThiCheck == null) {
			pipeOnlineThiCheck = new PipeOnlineSubCheck();
		}
		return pipeOnlineThiCheck;
	}

	public String m_OL_Prep;//资料准备
	public String m_OL_Check;//记录审查
	public String p_Surface;//管道表面
	public String p_Other;//其他
	public String p_Wel;//焊接接头
	public String p_Leak;//泄漏
	public String p_Ins;//绝热层
	public String p_Pro;//防腐层
	public String p_Vib;//管道振动
	public String p_Hanger;//支吊架
	public String p_Valve;//阀门
	public String p_Exp;//膨胀节
	public String p_Fla;//法兰
	public String p_Str;//管道结构
	public String p_Ide;//管道标识
	public String p_Fla_Res;//法兰间接触电阻
	public String p_Gro_Res;//对地电阻
	public String p_Thi;//壁厚测定
	public String m_OL_Pre;//压力表
	public String m_OL_Tem;//测温仪表
	public String m_OL_Valve;//安全阀
	public String m_OL_Rup;//爆破片装置
	public String m_OL_Others;//其它
	public String m_OL_Bug;//缺陷情况说明
	public String m_OL_Bug_Sol;//缺陷处理情况说明
	public String m_OL_Result;//检验结果
	public String m_Test_Date;//检验人员
	public String m_Check_Date;//校核

	@Override
	public String toString() {
		return "PipeOnlineSubCheck{" +
				"m_OL_Prep='" + m_OL_Prep + '\'' +
				", m_OL_Check='" + m_OL_Check + '\'' +
				", p_Surface='" + p_Surface + '\'' +
				", p_Other='" + p_Other + '\'' +
				", p_Wel='" + p_Wel + '\'' +
				", p_Leak='" + p_Leak + '\'' +
				", p_Ins='" + p_Ins + '\'' +
				", p_Pro='" + p_Pro + '\'' +
				", p_Vib='" + p_Vib + '\'' +
				", p_Hanger='" + p_Hanger + '\'' +
				", p_Valve='" + p_Valve + '\'' +
				", p_Exp='" + p_Exp + '\'' +
				", p_Fla='" + p_Fla + '\'' +
				", p_Str='" + p_Str + '\'' +
				", p_Ide='" + p_Ide + '\'' +
				", p_Fla_Res='" + p_Fla_Res + '\'' +
				", p_Gro_Res='" + p_Gro_Res + '\'' +
				", p_Thi='" + p_Thi + '\'' +
				", m_OL_Pre='" + m_OL_Pre + '\'' +
				", m_OL_Tem='" + m_OL_Tem + '\'' +
				", m_OL_Valve='" + m_OL_Valve + '\'' +
				", m_OL_Rup='" + m_OL_Rup + '\'' +
				", m_OL_Others='" + m_OL_Others + '\'' +
				", m_OL_Bug='" + m_OL_Bug + '\'' +
				", m_OL_Bug_Sol='" + m_OL_Bug_Sol + '\'' +
				", m_OL_Result='" + m_OL_Result + '\'' +
				", m_Test_Date='" + m_Test_Date + '\'' +
				", m_Check_Date='" + m_Check_Date + '\'' +
				'}';
	}
}
