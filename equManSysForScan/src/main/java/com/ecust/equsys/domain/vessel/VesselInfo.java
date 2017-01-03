package com.ecust.equsys.domain.vessel;


public class VesselInfo extends VesselBaseEntity {

	public static VesselInfo vesselInfo = null;

	public VesselInfo() {
		super();
		this.db_Description = "容器基础信息";
		this.method = "updateVesselInfo";//上传servlet的方法名称，很重要

	}

	public static VesselInfo getInstance() {
		if (vesselInfo == null) {
			vesselInfo = new VesselInfo();
		}
		return vesselInfo;
	}

	public String v_Reg_Com;//注册登记机构
	public String v_Equ_ID;//设备代码
	public String v_Use_ID;//使用证号
	public String v_Product_ID;//产品编号
	public String v_Inuse_Com_ID;//单位内编号
	public String v_Name;//容器名称
	public String v_Use_Addr;//设备使用地点
	public String v_Type;//设备品种
	public String v_Mainbody_Str;//主体结构形式
	public String v_Use_Com;//使用单位
	public String v_De_Com;//设计单位
	public String v_Man_Com;//制造单位
	public String v_Install_Com;//安装单位
	public String v_M_Ins_ID;//安装告知书号
	public String v_M_Ins_Permission_ID;//安装单位许可号
	public String v_M_Ins_End_Date;//安装完成日期
	public String v_M_De_ID;//设计单位许可号
	public String v_M_Man_Permission_ID;//制造单位许可号
	public String v_De_Date;//设计日期
	public String v_Product_Cri;//产品标准
	public String v_Pic_ID;//容器图号
	public String v_Man_Date;//制造日期
	public String v_Start_Date;//投入使用日期
	public String v_De_Life;//设计使用年限
	public String v_Seat_Type;//支座型式
	public String v_Install_Type;//安装型式
	public String v_Pro_Ins_Type;//保温绝热方式
	public String v_Inside_Dia;//容器内径
	public String v_Len;//容器高/长
	public String v_C_Volume;//选择容积m3/换热面积
	public String v_Volume;//容积m3/换热面积
	public String v_Max_Volume;//最大允许充装量
	public String v_Head;//封头
	public String v_De_Pre_C_Shell;//设计压力选择壳体或是壳程
	public String v_De_Pre_Shell;//壳体或是壳程的数值
	public String v_De_Pre_C_Jacket;//设计压力选择夹套或是管程
	public String v_De_Pre_Jacket;//夹套或是管程的数值
	public String v_Wo_Pre_C_Shell;//工作压力选择壳体或是壳程
	public String v_Wo_Pre_Shell;//壳体或是壳程的数值
	public String v_Wo_Pre_C_Jacket;//工作压力选择夹套或是管程
	public String v_Wo_Pre_Jacket;//夹套或是管程的数值
	public String v_De_Tem_C_Shell;//设计温度选择壳体或是壳程
	public String v_De_Tem_Shell;//壳体或是壳程的数值
	public String v_De_Tem_C_Jacket;//设计温度选择夹套或是管程
	public String v_De_Tem_Jacket;//夹套或是管程的数值
	public String v_Wo_Tem_C_Shell;//工作温度选择壳体或是壳程
	public String v_Wo_Tem_Shell;//壳体或是壳程的数值
	public String v_Wo_Tem_C_Jacket;//工作温度选择夹套或是管程
	public String v_Wo_Tem_Jacket;//夹套或是管程的数值
	public String v_Cor_Barrel_Body;// 桶体腐蚀裕度
	public String v_Cor_Seal_Head;//封头腐蚀裕度
	public String v_Med_C_Shell;//介质选择壳体或是壳程
	public String v_Med_Shell;//壳体或是壳程的数值
	public String v_Med_C_Jacket;//介质选择夹套或是管程
	public String v_Med_Jacket;//夹套或是管程的数值
	public String v_Ma_Barrel_Body;//材质 筒体
	public String v_Ma_Seal_Head;//材质 封头
	public String v_Ma_C_Jacket;//材质 夹套或换热管的选择
	public String v_Ma_Jacket;//材质 夹套 夹套或换热管的数值
	public String v_Ma_Liner;//材质 衬里
	public String v_Thi_Barrel_Body;//厚度 筒体
	public String v_Thi_Seal_Head;//厚度 封头
	public String v_Thi_C_Jacket;//厚度 夹套或换热管的选择
	public String v_Thi_Jacket;//厚度 夹套 夹套或换热管的数值
	public String v_Thi_Liner;//厚度 衬里

	@Override
	public String toString() {
		return "VesselInfo{" +
				"v_Reg_Com='" + v_Reg_Com + '\'' +
				", v_Equ_ID='" + v_Equ_ID + '\'' +
				", v_Use_ID='" + v_Use_ID + '\'' +
				", v_Product_ID='" + v_Product_ID + '\'' +
				", v_Inuse_Com_ID='" + v_Inuse_Com_ID + '\'' +
				", v_Name='" + v_Name + '\'' +
				", v_Use_Addr='" + v_Use_Addr + '\'' +
				", v_Type='" + v_Type + '\'' +
				", v_Mainbody_Str='" + v_Mainbody_Str + '\'' +
				", v_Use_Com='" + v_Use_Com + '\'' +
				", v_De_Com='" + v_De_Com + '\'' +
				", v_Man_Com='" + v_Man_Com + '\'' +
				", v_Install_Com='" + v_Install_Com + '\'' +
				", v_M_Ins_ID='" + v_M_Ins_ID + '\'' +
				", v_M_Ins_Permission_ID='" + v_M_Ins_Permission_ID + '\'' +
				", v_M_Ins_End_Date='" + v_M_Ins_End_Date + '\'' +
				", v_M_De_ID='" + v_M_De_ID + '\'' +
				", v_M_Man_Permission_ID='" + v_M_Man_Permission_ID + '\'' +
				", v_De_Date='" + v_De_Date + '\'' +
				", v_Product_Cri='" + v_Product_Cri + '\'' +
				", v_Pic_ID='" + v_Pic_ID + '\'' +
				", v_Man_Date='" + v_Man_Date + '\'' +
				", v_Start_Date='" + v_Start_Date + '\'' +
				", v_De_Life='" + v_De_Life + '\'' +
				", v_Seat_Type='" + v_Seat_Type + '\'' +
				", v_Install_Type='" + v_Install_Type + '\'' +
				", v_Pro_Ins_Type='" + v_Pro_Ins_Type + '\'' +
				", v_Inside_Dia='" + v_Inside_Dia + '\'' +
				", v_Len='" + v_Len + '\'' +
				", v_C_Volume='" + v_C_Volume + '\'' +
				", v_Volume='" + v_Volume + '\'' +
				", v_Max_Volume='" + v_Max_Volume + '\'' +
				", v_Head='" + v_Head + '\'' +
				", v_De_Pre_C_Shell='" + v_De_Pre_C_Shell + '\'' +
				", v_De_Pre_Shell='" + v_De_Pre_Shell + '\'' +
				", v_De_Pre_C_Jacket='" + v_De_Pre_C_Jacket + '\'' +
				", v_De_Pre_Jacket='" + v_De_Pre_Jacket + '\'' +
				", v_Wo_Pre_C_Shell='" + v_Wo_Pre_C_Shell + '\'' +
				", v_Wo_Pre_Shell='" + v_Wo_Pre_Shell + '\'' +
				", v_Wo_Pre_C_Jacket='" + v_Wo_Pre_C_Jacket + '\'' +
				", v_Wo_Pre_Jacket='" + v_Wo_Pre_Jacket + '\'' +
				", v_De_Tem_C_Shell='" + v_De_Tem_C_Shell + '\'' +
				", v_De_Tem_Shell='" + v_De_Tem_Shell + '\'' +
				", v_De_Tem_C_Jacket='" + v_De_Tem_C_Jacket + '\'' +
				", v_De_Tem_Jacket='" + v_De_Tem_Jacket + '\'' +
				", v_Wo_Tem_C_Shell='" + v_Wo_Tem_C_Shell + '\'' +
				", v_Wo_Tem_Shell='" + v_Wo_Tem_Shell + '\'' +
				", v_Wo_Tem_C_Jacket='" + v_Wo_Tem_C_Jacket + '\'' +
				", v_Wo_Tem_Jacket='" + v_Wo_Tem_Jacket + '\'' +
				", v_Cor_Barrel_Body='" + v_Cor_Barrel_Body + '\'' +
				", v_Cor_Seal_Head='" + v_Cor_Seal_Head + '\'' +
				", v_Med_C_Shell='" + v_Med_C_Shell + '\'' +
				", v_Med_Shell='" + v_Med_Shell + '\'' +
				", v_Med_C_Jacket='" + v_Med_C_Jacket + '\'' +
				", v_Med_Jacket='" + v_Med_Jacket + '\'' +
				", v_Ma_Barrel_Body='" + v_Ma_Barrel_Body + '\'' +
				", v_Ma_Seal_Head='" + v_Ma_Seal_Head + '\'' +
				", v_Ma_C_Jacket='" + v_Ma_C_Jacket + '\'' +
				", v_Ma_Jacket='" + v_Ma_Jacket + '\'' +
				", v_Ma_Liner='" + v_Ma_Liner + '\'' +
				", v_Thi_Barrel_Body='" + v_Thi_Barrel_Body + '\'' +
				", v_Thi_Seal_Head='" + v_Thi_Seal_Head + '\'' +
				", v_Thi_C_Jacket='" + v_Thi_C_Jacket + '\'' +
				", v_Thi_Jacket='" + v_Thi_Jacket + '\'' +
				", v_Thi_Liner='" + v_Thi_Liner + '\'' +
				'}';
	}
}
