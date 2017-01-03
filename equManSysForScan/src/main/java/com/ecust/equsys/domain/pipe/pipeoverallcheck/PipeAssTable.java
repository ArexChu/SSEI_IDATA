package com.ecust.equsys.domain.pipe.pipeoverallcheck;

import com.ecust.equsys.domain.pipe.PipeBaseEntity;

public class PipeAssTable extends PipeBaseEntity {

	public static PipeAssTable pipeAssTable = null;

	public PipeAssTable() {
		super();
		this.db_Description = "管道安全状况等级评定结果汇总表";
		this.method = "updatePipeAssTable";//上传servlet的方法名称，很重要

	}

	public static PipeAssTable getInstance() {
		if (pipeAssTable == null) {
			pipeAssTable = new PipeAssTable();
		}
		return pipeAssTable;
	}
	
	public String p_pos_Sum;//管道位置及结构
	public String p_pos_Gra;//
	public String p_Ma_Sum_1;//与设计不符
	public String p_Ma_Sum_2;//材质不明
	public String p_Ma_Sum_3;//材质劣化损伤
	public String p_Ma_Sum_4;//硬度异常
	public String p_Ma_Gra_1;//
	public String p_Ma_Gra_2;//
	public String p_Ma_Gra_3;//
	public String p_Ma_Gra_4;//
	public String p_Thi_Sum;//管子及管件全面减薄
	public String p_Thi_Gra;//
	public String p_Thi_Part_Sum;//管子局部减薄
	public String p_Thi_Part_Gra;//
	public String p_Wel_Sum_1;//裂纹
	public String p_Wel_Sum_2;//咬边
	public String p_Wel_Sum_3;//气孔
	public String p_Wel_Sum_4;//夹渣
	public String p_Wel_Sum_5;//未焊透
	public String p_Wel_Sum_6;//未熔合
	public String p_Wel_Sum_7;//错边
	public String p_Wel_Gra_1;//
	public String p_Wel_Gra_2;//
	public String p_Wel_Gra_3;//
	public String p_Wel_Gra_4;//
	public String p_Wel_Gra_5;//
	public String p_Wel_Gra_6;//
	public String p_Wel_Gra_7;//
	public String p_Component_Sum_1;//裂纹、皱褶、重皮
	public String p_Component_Sum_2;//碰伤
	public String p_Component_Sum_3;//变形
	public String p_Component_Sum_4;//损坏
	public String p_Component_Gra_1;//
	public String p_Component_Gra_2;//
	public String p_Component_Gra_3;//
	public String p_Component_Gra_4;//
	public String p_Hanger_Sum;//吊支架异常
	public String p_Hanger_Gra;//
	public String p_Other_Sum_1;//安全保护装置
	public String p_Other_Sum_2;//其它附属装置
	public String p_Other_Gra_1;//
	public String p_Other_Gra_2;//
	public String p_Pretest_Rep;//压力试验
	public String p_Pretest_Gra;//
	public String p_Leaktest_Rep;//泄漏试验
	public String p_Leaktest_Gra;//
	public String p_NDEtest_Rep;//无损检测
	public String p_NDEtest_Gra;//
	public String p_Mettest_Rep;//金相检测
	public String p_Mettest_Gra;//
	public String p_Ma_Ana_Rep;//材料成分分析
	public String p_Ma_Ana_Gra;//
	public String p_Hardtest_Rep;//硬度检测
	public String p_Hardtest_Gra;//
	public String p_Safe_Ass_Gra;//管道安全等级评定
	public String p_Ass_Remark;//备注

	@Override
	public String toString() {
		return "PipeAssTable{" +
				"p_pos_Sum='" + p_pos_Sum + '\'' +
				", p_pos_Gra='" + p_pos_Gra + '\'' +
				", p_Ma_Sum_1='" + p_Ma_Sum_1 + '\'' +
				", p_Ma_Sum_2='" + p_Ma_Sum_2 + '\'' +
				", p_Ma_Sum_3='" + p_Ma_Sum_3 + '\'' +
				", p_Ma_Sum_4='" + p_Ma_Sum_4 + '\'' +
				", p_Ma_Gra_1='" + p_Ma_Gra_1 + '\'' +
				", p_Ma_Gra_2='" + p_Ma_Gra_2 + '\'' +
				", p_Ma_Gra_3='" + p_Ma_Gra_3 + '\'' +
				", p_Ma_Gra_4='" + p_Ma_Gra_4 + '\'' +
				", p_Thi_Sum='" + p_Thi_Sum + '\'' +
				", p_Thi_Gra='" + p_Thi_Gra + '\'' +
				", p_Thi_Part_Sum='" + p_Thi_Part_Sum + '\'' +
				", p_Thi_Part_Gra='" + p_Thi_Part_Gra + '\'' +
				", p_Wel_Sum_1='" + p_Wel_Sum_1 + '\'' +
				", p_Wel_Sum_2='" + p_Wel_Sum_2 + '\'' +
				", p_Wel_Sum_3='" + p_Wel_Sum_3 + '\'' +
				", p_Wel_Sum_4='" + p_Wel_Sum_4 + '\'' +
				", p_Wel_Sum_5='" + p_Wel_Sum_5 + '\'' +
				", p_Wel_Sum_6='" + p_Wel_Sum_6 + '\'' +
				", p_Wel_Sum_7='" + p_Wel_Sum_7 + '\'' +
				", p_Wel_Gra_1='" + p_Wel_Gra_1 + '\'' +
				", p_Wel_Gra_2='" + p_Wel_Gra_2 + '\'' +
				", p_Wel_Gra_3='" + p_Wel_Gra_3 + '\'' +
				", p_Wel_Gra_4='" + p_Wel_Gra_4 + '\'' +
				", p_Wel_Gra_5='" + p_Wel_Gra_5 + '\'' +
				", p_Wel_Gra_6='" + p_Wel_Gra_6 + '\'' +
				", p_Wel_Gra_7='" + p_Wel_Gra_7 + '\'' +
				", p_Component_Sum_1='" + p_Component_Sum_1 + '\'' +
				", p_Component_Sum_2='" + p_Component_Sum_2 + '\'' +
				", p_Component_Sum_3='" + p_Component_Sum_3 + '\'' +
				", p_Component_Sum_4='" + p_Component_Sum_4 + '\'' +
				", p_Component_Gra_1='" + p_Component_Gra_1 + '\'' +
				", p_Component_Gra_2='" + p_Component_Gra_2 + '\'' +
				", p_Component_Gra_3='" + p_Component_Gra_3 + '\'' +
				", p_Component_Gra_4='" + p_Component_Gra_4 + '\'' +
				", p_Hanger_Sum='" + p_Hanger_Sum + '\'' +
				", p_Hanger_Gra='" + p_Hanger_Gra + '\'' +
				", p_Other_Sum_1='" + p_Other_Sum_1 + '\'' +
				", p_Other_Sum_2='" + p_Other_Sum_2 + '\'' +
				", p_Other_Gra_1='" + p_Other_Gra_1 + '\'' +
				", p_Other_Gra_2='" + p_Other_Gra_2 + '\'' +
				", p_Pretest_Rep='" + p_Pretest_Rep + '\'' +
				", p_Pretest_Gra='" + p_Pretest_Gra + '\'' +
				", p_Leaktest_Rep='" + p_Leaktest_Rep + '\'' +
				", p_Leaktest_Gra='" + p_Leaktest_Gra + '\'' +
				", p_NDEtest_Rep='" + p_NDEtest_Rep + '\'' +
				", p_NDEtest_Gra='" + p_NDEtest_Gra + '\'' +
				", p_Mettest_Rep='" + p_Mettest_Rep + '\'' +
				", p_Mettest_Gra='" + p_Mettest_Gra + '\'' +
				", p_Ma_Ana_Rep='" + p_Ma_Ana_Rep + '\'' +
				", p_Ma_Ana_Gra='" + p_Ma_Ana_Gra + '\'' +
				", p_Hardtest_Rep='" + p_Hardtest_Rep + '\'' +
				", p_Hardtest_Gra='" + p_Hardtest_Gra + '\'' +
				", p_Safe_Ass_Gra='" + p_Safe_Ass_Gra + '\'' +
				", p_Ass_Remark='" + p_Ass_Remark + '\'' +
				'}';
	}
}
