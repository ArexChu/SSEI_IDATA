package com.ecust.equsys.domain.vessel.vesselannual;


import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselAnnualTest extends VesselBaseEntity {

	public static VesselAnnualTest vesselAnnualTest = null;

	public VesselAnnualTest() {
		super();
		this.db_Description = "压力容器年度检查记录附页";
		this.method = "updateVesselAnnualTest";//上传servlet的方法名称，很重要

	}

	public static VesselAnnualTest getInstance() {
		if (vesselAnnualTest == null) {
			vesselAnnualTest = new VesselAnnualTest();
		}
		return vesselAnnualTest;
	}

	public String v_Ann_1;//安全管理制度、安全操作规程
	public String v_Ann_2;//设计、制造、安装、改造、维修等资料
	public String v_Ann_3;//《使用登记表》、《使用登记证》
	public String v_Ann_4;//作业人员持证情况
	public String v_Ann_5;//日常维护保养、运行、定期安全检查记录
	public String v_Ann_6;//年度检查、定期检验报告及问题处理情况
	public String v_Ann_7;//安全附件校验、修理和更换记录
	public String v_Ann_8;//移动式压力容器装卸记录
	public String v_Ann_9;//应急预案和演练记录
	public String v_Ann_10;//压力容器事故、故障情况记录
	public String v_Ann_11;//铭牌、漆色、标志和使用登记证的标注
	public String v_Ann_12;//本体、接口（阀门、管路）部位、焊接接头缺陷情况检查
	public String v_Ann_13;//外表面腐蚀、结霜、结露情况检查
	public String v_Ann_14;//隔热层检查
	public String v_Ann_15;//检漏孔、信号孔检查
	public String v_Ann_16;//压力容器与相邻管道或者构件异常振动、响声或者相互摩擦情况检查
	public String v_Ann_17;//支承或者支座、基础、紧固螺栓检查
	public String v_Ann_18;//排放（疏水、排污）装置检查
	public String v_Ann_19;//运行期间超压、超温、超量等情况检查
	public String v_Ann_20;//接地装置检查
	public String v_Ann_21;//监控措施是否有效实施情况检查
	public String v_Ann_22;//快开门式压力容器安全联锁功能检查
	public String v_Ann_23;//压力表
	public String v_Ann_24;//液位计
	public String v_Ann_25;//测温仪表
	public String v_Ann_26;//爆破片装置
	public String v_Ann_27;//安全阀
	public String v_Ann_28;//易熔塞
	public String v_Ann_29;//导静电装置
	public String v_Ann_30;//紧急切断装置
	public String v_Ann_31;//专项要求1
	public String v_Ann_32;//专项要求2
	public String v_Ann_33;//专项要求3
	public String v_Ann_31_Content;//专项要求1内容
	public String v_Ann_32_Content;//专项要求2内容
	public String v_Ann_33_Content;//专项要求3内容
	public String v_Ann_1_Reamrk;//
	public String v_Ann_2_Reamrk;//
	public String v_Ann_3_Reamrk;//
	public String v_Ann_4_Reamrk;//
	public String v_Ann_5_Reamrk;//
	public String v_Ann_6_Reamrk;//
	public String v_Ann_7_Reamrk;//
	public String v_Ann_8_Reamrk;//
	public String v_Ann_9_Reamrk;//
	public String v_Ann_10_Reamrk;//
	public String v_Ann_11_Reamrk;//
	public String v_Ann_12_Reamrk;//
	public String v_Ann_13_Reamrk;//
	public String v_Ann_14_Reamrk;//
	public String v_Ann_15_Reamrk;//
	public String v_Ann_16_Reamrk;//
	public String v_Ann_17_Reamrk;//
	public String v_Ann_18_Reamrk;//
	public String v_Ann_19_Reamrk;//
	public String v_Ann_20_Reamrk;//
	public String v_Ann_21_Reamrk;//
	public String v_Ann_22_Reamrk;//
	public String v_Ann_23_Reamrk;//
	public String v_Ann_24_Reamrk;//
	public String v_Ann_25_Reamrk;//
	public String v_Ann_26_Reamrk;//
	public String v_Ann_27_Reamrk;//
	public String v_Ann_28_Reamrk;//
	public String v_Ann_29_Reamrk;//
	public String v_Ann_30_Reamrk;//
	public String v_Ann_31_Reamrk;//
	public String v_Ann_32_Reamrk;//
	public String v_Ann_33_Reamrk;//
	

	@Override
	public String toString() {
		return "VesselCheckTest{" +
				"v_Ann_1='" + v_Ann_1 + '\'' +
				", v_Ann_2='" + v_Ann_2 + '\'' +
				", v_Ann_3='" + v_Ann_3 + '\'' +
				", v_Ann_4='" + v_Ann_4 + '\'' +
				", v_Ann_5='" + v_Ann_5 + '\'' +
				", v_Ann_6='" + v_Ann_6 + '\'' +
				", v_Ann_7='" + v_Ann_7 + '\'' +
				", v_Ann_8='" + v_Ann_8 + '\'' +
				", v_Ann_9='" + v_Ann_9 + '\'' +
				", v_Ann_10='" + v_Ann_10 + '\'' +
				", v_Ann_11='" + v_Ann_11 + '\'' +
				", v_Ann_12='" + v_Ann_12 + '\'' +
				", v_Ann_13='" + v_Ann_13 + '\'' +
				", v_Ann_14='" + v_Ann_14 + '\'' +
				", v_Ann_15='" + v_Ann_15 + '\'' +
				", v_Ann_16='" + v_Ann_16 + '\'' +
				", v_Ann_17='" + v_Ann_17 + '\'' +
				", v_Ann_18='" + v_Ann_18 + '\'' +
				", v_Ann_19='" + v_Ann_19 + '\'' +
				", v_Ann_20='" + v_Ann_20 + '\'' +
				", v_Ann_21='" + v_Ann_21 + '\'' +
				", v_Ann_22='" + v_Ann_22 + '\'' +
				", v_Ann_23='" + v_Ann_23 + '\'' +
				", v_Ann_24='" + v_Ann_24 + '\'' +
				", v_Ann_25='" + v_Ann_25 + '\'' +
				", v_Ann_26='" + v_Ann_26 + '\'' +
				", v_Ann_27='" + v_Ann_27 + '\'' +
				", v_Ann_28='" + v_Ann_28 + '\'' +
				", v_Ann_29='" + v_Ann_29 + '\'' +
				", v_Ann_30='" + v_Ann_30 + '\'' +
				", v_Ann_31='" + v_Ann_31 + '\'' +
				", v_Ann_32='" + v_Ann_32 + '\'' +
				", v_Ann_33='" + v_Ann_33 + '\'' +
				", v_Ann_31_Content='" + v_Ann_31_Content + '\'' +
				", v_Ann_32_Content='" + v_Ann_32_Content + '\'' +
				", v_Ann_33_Content='" + v_Ann_33_Content + '\'' +
				", v_Ann_1_Reamrk='" + v_Ann_1_Reamrk + '\'' +
				", v_Ann_2_Reamrk='" + v_Ann_2_Reamrk + '\'' +
				", v_Ann_3_Reamrk='" + v_Ann_3_Reamrk + '\'' +
				", v_Ann_4_Reamrk='" + v_Ann_4_Reamrk + '\'' +
				", v_Ann_5_Reamrk='" + v_Ann_5_Reamrk + '\'' +
				", v_Ann_6_Reamrk='" + v_Ann_6_Reamrk + '\'' +
				", v_Ann_7_Reamrk='" + v_Ann_7_Reamrk + '\'' +
				", v_Ann_8_Reamrk='" + v_Ann_8_Reamrk + '\'' +
				", v_Ann_9_Reamrk='" + v_Ann_9_Reamrk + '\'' +
				", v_Ann_10_Reamrk='" + v_Ann_10_Reamrk + '\'' +
				", v_Ann_11_Reamrk='" + v_Ann_11_Reamrk + '\'' +
				", v_Ann_12_Reamrk='" + v_Ann_12_Reamrk + '\'' +
				", v_Ann_13_Reamrk='" + v_Ann_13_Reamrk + '\'' +
				", v_Ann_14_Reamrk='" + v_Ann_14_Reamrk + '\'' +
				", v_Ann_15_Reamrk='" + v_Ann_15_Reamrk + '\'' +
				", v_Ann_16_Reamrk='" + v_Ann_16_Reamrk + '\'' +
				", v_Ann_17_Reamrk='" + v_Ann_17_Reamrk + '\'' +
				", v_Ann_18_Reamrk='" + v_Ann_18_Reamrk + '\'' +
				", v_Ann_19_Reamrk='" + v_Ann_19_Reamrk + '\'' +
				", v_Ann_20_Reamrk='" + v_Ann_20_Reamrk + '\'' +
				", v_Ann_21_Reamrk='" + v_Ann_21_Reamrk + '\'' +
				", v_Ann_22_Reamrk='" + v_Ann_22_Reamrk + '\'' +
				", v_Ann_23_Reamrk='" + v_Ann_23_Reamrk + '\'' +
				", v_Ann_24_Reamrk='" + v_Ann_24_Reamrk + '\'' +
				", v_Ann_25_Reamrk='" + v_Ann_25_Reamrk + '\'' +
				", v_Ann_26_Reamrk='" + v_Ann_26_Reamrk + '\'' +
				", v_Ann_27_Reamrk='" + v_Ann_27_Reamrk + '\'' +
				", v_Ann_28_Reamrk='" + v_Ann_28_Reamrk + '\'' +
				", v_Ann_29_Reamrk='" + v_Ann_29_Reamrk + '\'' +
				", v_Ann_30_Reamrk='" + v_Ann_30_Reamrk + '\'' +
				", v_Ann_31_Reamrk='" + v_Ann_31_Reamrk + '\'' +
				", v_Ann_32_Reamrk='" + v_Ann_32_Reamrk + '\'' +
				", v_Ann_33_Reamrk='" + v_Ann_33_Reamrk + '\'' +
				'}';
	}
}

