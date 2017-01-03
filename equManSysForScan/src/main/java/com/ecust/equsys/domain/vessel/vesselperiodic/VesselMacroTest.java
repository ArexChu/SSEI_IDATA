package com.ecust.equsys.domain.vessel.vesselperiodic;


import com.ecust.equsys.domain.vessel.VesselBaseEntity;

public class VesselMacroTest extends VesselBaseEntity {
		
	public static VesselMacroTest vesselMacroTest = null;

	public VesselMacroTest() {
		super();
		this.db_Description = "容器宏观检查";
		this.method = "updateVesselMacroTest";//上传servlet的方法名称，很重要

	}

	public static VesselMacroTest getInstance() {
		if (vesselMacroTest == null) {
			vesselMacroTest = new VesselMacroTest();
		}
		return vesselMacroTest;
	}
	public String v_Str_1;//封头型式
	public String v_Str_2;//封头与筒体的连接
	public String v_Str_3;//开孔位置及补强
	public String v_Str_4;//纵/（环）焊缝的布置及型式
	public String v_Str_5;//支承或者支座的型式与布置
	public String v_Str_6;//排放（疏水、排污）装置的设置
	public String v_Str_1_Remark;
	public String v_Str_2_Remark;
	public String v_Str_3_Remark;
	public String v_Str_4_Remark;
	public String v_Str_5_Remark;
	public String v_Str_6_Remark;
	public String v_Geo_1;//筒体同一断面上最大内径与最小内径之差
	public String v_Geo_2;//纵/（环）焊缝最大对口错边量
	public String v_Geo_3;//纵/（环）焊缝最大棱角度
	public String v_Geo_4;//纵/（环）焊缝最大咬边
	public String v_Geo_5;//纵/（环）焊缝最大余高
	public String v_Geo_1_Remark;//
	public String v_Geo_2_Remark;//
	public String v_Geo_3_Remark;//
	public String v_Geo_4_Remark;//
	public String v_Geo_5_Remark;//
	public String v_Appe_1;//铭牌和标志
	public String v_Appe_2;//内外表面的腐蚀
	public String v_Appe_3;//裂纹、泄漏、鼓包、变形、机械接触损伤、过热
	public String v_Appe_4;//工卡具焊迹、电弧灼伤
	public String v_Appe_5;//法兰、密封面及其紧固螺栓
	public String v_Appe_6;//支承、支座或者基础的下沉、倾斜、开裂
	public String v_Appe_7;//地脚螺栓
	public String v_Appe_8;//直立容器和球形容器支柱的铅垂度
	public String v_Appe_9;//多支座卧式容器的支座膨胀孔
	public String v_Appe_10;//排放（疏水、排污）装置和泄漏信号指示孔的堵塞、腐蚀、沉积物
	public String v_Appe_1_Remark;//
	public String v_Appe_2_Remark;//
	public String v_Appe_3_Remark;//
	public String v_Appe_4_Remark;//
	public String v_Appe_5_Remark;//
	public String v_Appe_6_Remark;//
	public String v_Appe_7_Remark;//
	public String v_Appe_8_Remark;//
	public String v_Appe_9_Remark;//
	public String v_Appe_10_Remark;//
	public String v_Ins_1;//隔热脱落、潮湿及层下腐蚀、裂纹
	public String v_Ins_2;//衬里层的破损、腐蚀、裂纹、脱落及检查孔介质流出情况
	public String v_Ins_3;//堆焊层的龟裂、剥离和脱落
	public String v_Ins_1_Remark;//
	public String v_Ins_2_Remark;//
	public String v_Ins_3_Remark;//
	public String v_Mac_Other_1;//夹层真空度
	public String v_Mac_Other_2;//日蒸发率
	public String v_Mac_Other_1_Remark;//
	public String v_Mac_Other_2_Remark;//
	public String v_Mac_Result;//结果
	public String v_Mac_Test_Date;//检验
	public String v_Mac_Proo_Date;//校对

	@Override
	public String toString() {
		return "VesselMacroTest{" +
				"v_Str_1='" + v_Str_1 + '\'' +
				", v_Str_2='" + v_Str_2 + '\'' +
				", v_Str_3='" + v_Str_3 + '\'' +
				", v_Str_4='" + v_Str_4 + '\'' +
				", v_Str_5='" + v_Str_5 + '\'' +
				", v_Str_6='" + v_Str_6 + '\'' +
				", v_Str_1_Remark='" + v_Str_1_Remark + '\'' +
				", v_Str_2_Remark='" + v_Str_2_Remark + '\'' +
				", v_Str_3_Remark='" + v_Str_3_Remark + '\'' +
				", v_Str_4_Remark='" + v_Str_4_Remark + '\'' +
				", v_Str_5_Remark='" + v_Str_5_Remark + '\'' +
				", v_Str_6_Remark='" + v_Str_6_Remark + '\'' +
				", v_Geo_1='" + v_Geo_1 + '\'' +
				", v_Geo_2='" + v_Geo_2 + '\'' +
				", v_Geo_3='" + v_Geo_3 + '\'' +
				", v_Geo_4='" + v_Geo_4 + '\'' +
				", v_Geo_5='" + v_Geo_5 + '\'' +
				", v_Geo_1_Remark='" + v_Geo_1_Remark + '\'' +
				", v_Geo_2_Remark='" + v_Geo_2_Remark + '\'' +
				", v_Geo_3_Remark='" + v_Geo_3_Remark + '\'' +
				", v_Geo_4_Remark='" + v_Geo_4_Remark + '\'' +
				", v_Geo_5_Remark='" + v_Geo_5_Remark + '\'' +
				", v_Appe_1='" + v_Appe_1 + '\'' +
				", v_Appe_2='" + v_Appe_2 + '\'' +
				", v_Appe_3='" + v_Appe_3 + '\'' +
				", v_Appe_4='" + v_Appe_4 + '\'' +
				", v_Appe_5='" + v_Appe_5 + '\'' +
				", v_Appe_6='" + v_Appe_6 + '\'' +
				", v_Appe_7='" + v_Appe_7 + '\'' +
				", v_Appe_8='" + v_Appe_8 + '\'' +
				", v_Appe_9='" + v_Appe_9 + '\'' +
				", v_Appe_10='" + v_Appe_10 + '\'' +
				", v_Appe_1_Remark='" + v_Appe_1_Remark + '\'' +
				", v_Appe_2_Remark='" + v_Appe_2_Remark + '\'' +
				", v_Appe_3_Remark='" + v_Appe_3_Remark + '\'' +
				", v_Appe_4_Remark='" + v_Appe_4_Remark + '\'' +
				", v_Appe_5_Remark='" + v_Appe_5_Remark + '\'' +
				", v_Appe_6_Remark='" + v_Appe_6_Remark + '\'' +
				", v_Appe_7_Remark='" + v_Appe_7_Remark + '\'' +
				", v_Appe_8_Remark='" + v_Appe_8_Remark + '\'' +
				", v_Appe_9_Remark='" + v_Appe_9_Remark + '\'' +
				", v_Appe_10_Remark='" + v_Appe_10_Remark + '\'' +
				", v_Ins_1='" + v_Ins_1 + '\'' +
				", v_Ins_2='" + v_Ins_2 + '\'' +
				", v_Ins_3='" + v_Ins_3 + '\'' +
				", v_Ins_1_Remark='" + v_Ins_1_Remark + '\'' +
				", v_Ins_2_Remark='" + v_Ins_2_Remark + '\'' +
				", v_Ins_3_Remark='" + v_Ins_3_Remark + '\'' +
				", v_Mac_Other_1='" + v_Mac_Other_1 + '\'' +
				", v_Mac_Other_2='" + v_Mac_Other_2 + '\'' +
				", v_Mac_Other_1_Remark='" + v_Mac_Other_1_Remark + '\'' +
				", v_Mac_Other_2_Remark='" + v_Mac_Other_2_Remark + '\'' +
				", v_Mac_Result='" + v_Mac_Result + '\'' +
				", v_Mac_Test_Date='" + v_Mac_Test_Date + '\'' +
				", v_Mac_Proo_Date='" + v_Mac_Proo_Date + '\'' +
				'}';
	}
}

