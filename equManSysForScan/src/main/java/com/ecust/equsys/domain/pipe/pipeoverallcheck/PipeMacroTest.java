package com.ecust.equsys.domain.pipe.pipeoverallcheck;


import com.ecust.equsys.domain.pipe.PipeBaseEntity;

public class PipeMacroTest extends PipeBaseEntity {
		
		public static PipeMacroTest pipeMacroTest = null;
	
		public PipeMacroTest() {
			super();
			this.db_Description = "宏 观 检 查 记 录";
			this.method = "updatePipeMacroTest";//上传servlet的方法名称，很重要
			
		}
		
		public static PipeMacroTest getInstance() {
			if (pipeMacroTest == null) {
				pipeMacroTest = new PipeMacroTest();
			}
			return pipeMacroTest;
		}
	
	public String p_Pos;//管道位置检查
	public String p_Pos_Remark;//
	public String p_Str;//管道结构
	public String p_Str_Remark;//
	public String p_Ins;//绝热层
	public String p_Ins_Remark;//
	public String p_Pro;//防腐层
	public String p_Pro_Remark;//
	public String p_Hanger;//支吊架
	public String p_Hanger_Remark;//
	public String p_Damper;//阻尼器
	public String p_Damper_Remark;//
	public String p_Absorber;//减振器
	public String p_Absorber_Remark;//
	public String p_Compen;//补偿器
	public String p_Compen_Remark;//
	public String p_Valve;//阀  门
	public String p_Valve_Remark;//
	public String p_Fla;//法  兰
	public String p_Fla_Remark;//
	public String p_Exp;//膨胀节
	public String p_Exp_Remark;//
	public String p_Cat_Pro;//阴极保护装置
	public String p_Cat_Pro_Remark;//
	public String p_Creep;//蠕胀测点
	public String p_Creep_Remark;//
	public String p_Fla_Res;//法兰间接触电阻
	public String p_Fla_Res_Remark;//
	public String p_Gro_Res;//对地电阻
	public String p_Gro_Res_Remark;//
	public String p_Ide;//管道标识
	public String p_Ide_Remark;//
	public String p_Component;//管道组成件
	public String p_Component_Remark;//
	public String p_Wel;//焊接接头
	public String p_Wel_Remark;//
	public String p_Other;//其他
	public String p_Other_Remark;//
	public String p_Mac_Date;//宏观检查日期

	@Override
	public String toString() {
		return "PipeMacroTest{" +
				"p_Pos='" + p_Pos + '\'' +
				", p_Pos_Remark='" + p_Pos_Remark + '\'' +
				", p_Str='" + p_Str + '\'' +
				", p_Str_Remark='" + p_Str_Remark + '\'' +
				", p_Ins='" + p_Ins + '\'' +
				", p_Ins_Remark='" + p_Ins_Remark + '\'' +
				", p_Pro='" + p_Pro + '\'' +
				", p_Pro_Remark='" + p_Pro_Remark + '\'' +
				", p_Hanger='" + p_Hanger + '\'' +
				", p_Hanger_Remark='" + p_Hanger_Remark + '\'' +
				", p_Damper='" + p_Damper + '\'' +
				", p_Damper_Remark='" + p_Damper_Remark + '\'' +
				", p_Absorber='" + p_Absorber + '\'' +
				", p_Absorber_Remark='" + p_Absorber_Remark + '\'' +
				", p_Compen='" + p_Compen + '\'' +
				", p_Compen_Remark='" + p_Compen_Remark + '\'' +
				", p_Valve='" + p_Valve + '\'' +
				", p_Valve_Remark='" + p_Valve_Remark + '\'' +
				", p_Fla='" + p_Fla + '\'' +
				", p_Fla_Remark='" + p_Fla_Remark + '\'' +
				", p_Exp='" + p_Exp + '\'' +
				", p_Exp_Remark='" + p_Exp_Remark + '\'' +
				", p_Cat_Pro='" + p_Cat_Pro + '\'' +
				", p_Cat_Pro_Remark='" + p_Cat_Pro_Remark + '\'' +
				", p_Creep='" + p_Creep + '\'' +
				", p_Creep_Remark='" + p_Creep_Remark + '\'' +
				", p_Fla_Res='" + p_Fla_Res + '\'' +
				", p_Fla_Res_Remark='" + p_Fla_Res_Remark + '\'' +
				", p_Gro_Res='" + p_Gro_Res + '\'' +
				", p_Gro_Res_Remark='" + p_Gro_Res_Remark + '\'' +
				", p_Ide='" + p_Ide + '\'' +
				", p_Ide_Remark='" + p_Ide_Remark + '\'' +
				", p_Component='" + p_Component + '\'' +
				", p_Component_Remark='" + p_Component_Remark + '\'' +
				", p_Wel='" + p_Wel + '\'' +
				", p_Wel_Remark='" + p_Wel_Remark + '\'' +
				", p_Other='" + p_Other + '\'' +
				", p_Other_Remark='" + p_Other_Remark + '\'' +
				", p_Mac_Date='" + p_Mac_Date + '\'' +
				'}';
	}
}

