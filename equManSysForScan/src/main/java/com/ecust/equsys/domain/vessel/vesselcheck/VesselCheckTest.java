package com.ecust.equsys.domain.vessel.vesselcheck;


import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselCheckTest extends VesselBaseEntity {

	public static VesselCheckTest vesselCheckTest = null;

	public VesselCheckTest() {
		super();
		this.db_Description = "资料审查及外观检查记录";
		this.method = "updateVesselCheckTest";//上传servlet的方法名称，很重要

	}

	public static VesselCheckTest getInstance() {
		if (vesselCheckTest == null) {
			vesselCheckTest = new VesselCheckTest();
		}
		return vesselCheckTest;
	}

	public String v_M_Entrust_Com;//委托单位
	public String v_M_Entrust_Com_Per;//委托单位联系人
	public String v_Che_1;//铭牌	
	public String v_Che_2;//堆焊层质量
	public String v_Che_3;//内表面质量
	public String v_Che_4;//支承的型式与布置
	public String v_Che_5;//外表面质量
	public String v_Che_6;//排放装置的设置
	public String v_Che_7;//焊缝余高
	public String v_Che_8;//基础开裂倾斜
	public String v_Che_9;//焊缝错边
	public String v_Che_10;//防腐质量
	public String v_Che_11;//焊缝咬边
	public String v_Che_12;//绝热质量
	public String v_Che_13;//焊缝棱角度
	public String v_Che_14;//衬里质量
	public String v_Che_15;//封头型式
	public String v_Che_16;//地脚螺栓
	public String v_Che_17;//封头与筒体的连接
	public String v_Che_18;//卧式容器的支座膨胀孔
	public String v_Che_19;//开孔位置及补强
	public String v_Che_20;//水平度或者铅垂度
	public String v_Che_21;//焊缝的布置及型式
	public String v_Che_22;//快开门安全联锁装置
	public String v_Che_23;//法兰、密封面及其紧固螺栓
	public String v_Che_24;//静电接地
	public String v_Che_1_Remark;//
	public String v_Che_2_Remark;//
	public String v_Che_3_Remark;//
	public String v_Che_4_Remark;//
	public String v_Che_5_Remark;//
	public String v_Che_6_Remark;//
	public String v_Che_7_Remark;//
	public String v_Che_8_Remark;//
	public String v_Che_9_Remark;//
	public String v_Che_10_Remark;//
	public String v_Che_11_Remark;//
	public String v_Che_12_Remark;//
	public String v_Che_13_Remark;//
	public String v_Che_14_Remark;//
	public String v_Che_15_Remark;//
	public String v_Che_16_Remark;//
	public String v_Che_17_Remark;//
	public String v_Che_18_Remark;//
	public String v_Che_19_Remark;//
	public String v_Che_20_Remark;//
	public String v_Che_21_Remark;//
	public String v_Che_22_Remark;//
	public String v_Che_23_Remark;//
	public String v_Che_24_Remark;//
	public String v_Che_Explan;
	public String v_Che_Result;
	public String v_Che_Date;
	public String v_Che_Che_Date;

	@Override
	public String toString() {
		return "VesselCheckTest{" +
				"v_M_Entrust_Com='" + v_M_Entrust_Com + '\'' +
				", v_M_Entrust_Com_Per='" + v_M_Entrust_Com_Per + '\'' +
				", v_Che_1='" + v_Che_1 + '\'' +
				", v_Che_2='" + v_Che_2 + '\'' +
				", v_Che_3='" + v_Che_3 + '\'' +
				", v_Che_4='" + v_Che_4 + '\'' +
				", v_Che_5='" + v_Che_5 + '\'' +
				", v_Che_6='" + v_Che_6 + '\'' +
				", v_Che_7='" + v_Che_7 + '\'' +
				", v_Che_8='" + v_Che_8 + '\'' +
				", v_Che_9='" + v_Che_9 + '\'' +
				", v_Che_10='" + v_Che_10 + '\'' +
				", v_Che_11='" + v_Che_11 + '\'' +
				", v_Che_12='" + v_Che_12 + '\'' +
				", v_Che_13='" + v_Che_13 + '\'' +
				", v_Che_14='" + v_Che_14 + '\'' +
				", v_Che_15='" + v_Che_15 + '\'' +
				", v_Che_16='" + v_Che_16 + '\'' +
				", v_Che_17='" + v_Che_17 + '\'' +
				", v_Che_18='" + v_Che_18 + '\'' +
				", v_Che_19='" + v_Che_19 + '\'' +
				", v_Che_20='" + v_Che_20 + '\'' +
				", v_Che_21='" + v_Che_21 + '\'' +
				", v_Che_22='" + v_Che_22 + '\'' +
				", v_Che_23='" + v_Che_23 + '\'' +
				", v_Che_24='" + v_Che_24 + '\'' +
				", v_Che_1_Remark='" + v_Che_1_Remark + '\'' +
				", v_Che_2_Remark='" + v_Che_2_Remark + '\'' +
				", v_Che_3_Remark='" + v_Che_3_Remark + '\'' +
				", v_Che_4_Remark='" + v_Che_4_Remark + '\'' +
				", v_Che_5_Remark='" + v_Che_5_Remark + '\'' +
				", v_Che_6_Remark='" + v_Che_6_Remark + '\'' +
				", v_Che_7_Remark='" + v_Che_7_Remark + '\'' +
				", v_Che_8_Remark='" + v_Che_8_Remark + '\'' +
				", v_Che_9_Remark='" + v_Che_9_Remark + '\'' +
				", v_Che_10_Remark='" + v_Che_10_Remark + '\'' +
				", v_Che_11_Remark='" + v_Che_11_Remark + '\'' +
				", v_Che_12_Remark='" + v_Che_12_Remark + '\'' +
				", v_Che_13_Remark='" + v_Che_13_Remark + '\'' +
				", v_Che_14_Remark='" + v_Che_14_Remark + '\'' +
				", v_Che_15_Remark='" + v_Che_15_Remark + '\'' +
				", v_Che_16_Remark='" + v_Che_16_Remark + '\'' +
				", v_Che_17_Remark='" + v_Che_17_Remark + '\'' +
				", v_Che_18_Remark='" + v_Che_18_Remark + '\'' +
				", v_Che_19_Remark='" + v_Che_19_Remark + '\'' +
				", v_Che_20_Remark='" + v_Che_20_Remark + '\'' +
				", v_Che_21_Remark='" + v_Che_21_Remark + '\'' +
				", v_Che_22_Remark='" + v_Che_22_Remark + '\'' +
				", v_Che_23_Remark='" + v_Che_23_Remark + '\'' +
				", v_Che_24_Remark='" + v_Che_24_Remark + '\'' +
				", v_Che_Explan='" + v_Che_Explan + '\'' +
				", v_Che_Result='" + v_Che_Result + '\'' +
				", v_Che_Date='" + v_Che_Date + '\'' +
				", v_Che_Che_Date='" + v_Che_Che_Date + '\'' +
				'}';
	}
}

