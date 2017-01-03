package com.ecust.equsys.base.impl.vesseldetail.data;

import com.ecust.equsys.domain.MenuDetailUIDomain;
import com.ecust.equsys.domain.pipe.PipeMonthlyCheck;
import com.ecust.equsys.domain.vessel.VesselMonthlyCheck;

/**
 * Created by smxiang on 01/11/2016.
 */

public class VesselMonthlyCheckData {
    public static MenuDetailUIDomain getVesselMonthlyCheck(){

        String [] cItems = {"产品编号",
                "操作工况安全",
                "工作温度（有无超温）","检验结果","备注",
                "工作压力（有无超压）","检验结果","备注",
                "工作介质（有无异常）","检验结果","备注",
                "安全附件",
                "安全阀","检验结果","备注",
                "爆破片装置","检验结果","备注",
                "紧急切断装置","检验结果","备注",
                "阻火器","检验结果","备注",
                "压力表","检验结果","备注",
                "温度计","检验结果","备注",
                "其他附件","检验结果","备注",
                "管道外观检查",
                "管道及其组成件是否有泄漏","检验结果","备注",
                "管道绝热层是否完好","检验结果","备注",
                "管道防腐层是否完好","检验结果","备注",
                "管道有无异常振动","检验结果","备注",
                "密封紧固件是否完好","检验结果","备注",
                "管道是否存在挠曲、下沉及异常变形","检验结果","备注",
                "支吊架是否完好","检验结果","备注",
                "阀门是否完好","检验结果","备注",
                "管道标识情况","检验结果","备注",
                "膨胀节有无异常","检验结果","备注",
                "静电接地是否完好","检验结果","备注",
                "其他检查",
                "检验项目","检验结果","备注",
                "检验项目","检验结果","备注",
                "存在的其他问题及整改要求",
                "检验人员","检验时间",
                "提交"};
        String [] eItems = {"管道系统",
                "操作工况安全",
                "工作温度（有无超温）","v_Result_1","v_Result_Remark_1",
                "工作压力（有无超压）","v_Result_2","v_Result_Remark_2",
                "工作介质（有无异常）","v_Result_3","v_Result_Remark_3",
                "安全附件",
                "安全阀","v_Result_4","v_Result_Remark_4",
                "爆破片装置","v_Result_5","v_Result_Remark_5",
                "紧急切断装置","v_Result_6","v_Result_Remark_6",
                "阻火器","v_Result_7","v_Result_Remark_7",
                "压力表","v_Result_8","v_Result_Remark_8",
                "温度计","v_Result_9","v_Result_Remark_9",
                "其他附件","v_Result_10","v_Result_Remark_10",
                "管道外观检查",
                "管道及其组成件是否有泄漏","v_Result_11","v_Result_Remark_11",
                "管道绝热层是否完好","v_Result_12","v_Result_Remark_12",
                "管道防腐层是否完好","v_Result_13","v_Result_Remark_13",
                "管道有无异常振动","v_Result_14","v_Result_Remark_14",
                "密封紧固件是否完好","v_Result_15","v_Result_Remark_15",
                "管道是否存在挠曲、下沉及异常变形","v_Result_16","v_Result_Remark_16",
                "支吊架是否完好","v_Result_17","v_Result_Remark_17",
                "阀门是否完好","v_Result_18","v_Result_Remark_18",
                "管道标识情况","v_Result_19","v_Result_Remark_19",
                "膨胀节有无异常","v_Result_20","v_Result_Remark_20",
                "静电接地是否完好","v_Result_21","v_Result_Remark_21",
                "其他检查",
                "检验项目","v_Result_22","v_Result_Remark_22",
                "检验项目","v_Result_23","v_Result_Remark_23",
                "v_Problem",
                "v_Persion","v_Date",
                "提交"};
        Integer[] type = {0,
                3,
                3,0,0,
                3,0,0,
                3,0,0,
                3,
                3,0,0,
                3,0,0,
                3,0,0,
                3,0,0,
                3,0,0,
                3,0,0,
                3,0,0,
                3,
                3,0,0,
                3,0,0,
                3,0,0,
                3,0,0,
                3,0,0,
                3,0,0,
                3,0,0,
                3,0,0,
                3,0,0,
                3,0,0,
                3,0,0,
                3,
                0,0,0,
                0,0,0,
                4,
                0,7,
                9};

        MenuDetailUIDomain m = new MenuDetailUIDomain();
        m.setcItems(cItems);
        m.seteItems(eItems);
        m.setType(type);
        //是该页面对应的实体类
        m.setEntity(VesselMonthlyCheck.getInstance());


        return m;

    }

}
