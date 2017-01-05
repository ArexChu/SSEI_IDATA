package com.ecust.equsys.base.impl.vesseldetail.data;

import com.ecust.equsys.domain.MenuDetailUIDomain;
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
                "爆破片","检验结果","备注",
                "紧急切断装置","检验结果","备注",
                "压力表","检验结果","备注",
                "温度计","检验结果","备注",
                "液位计","检验结果","备注",
                "其他附件","检验结果","备注",
                "壳体外观检查",
                "铭牌和标志","检验结果","备注",
                "内外表面的腐蚀","检验结果","备注",
                "裂纹、泄漏、鼓包、变形、机械接触损伤、过热","检验结果","备注",
                "工卡具焊迹、电弧灼伤","检验结果","备注",
                "密封紧固件","检验结果","备注",
                "支承、支座或者基础的下沉、倾斜、开裂","检验结果","备注",
                "地脚螺栓","检验结果","备注",
                "直立容器和球形容器支柱的铅垂度","检验结果","备注",
                "多支座卧式容器的支座膨胀孔","检验结果","备注",
                "排放（疏水、排污）装置和泄漏信号指示孔的堵塞、腐蚀、沉积物","检验结果","备注",
                "隔热层、衬里检查",
                "隔热脱落、潮湿及层下腐蚀、裂纹","检验结果","备注",
                "衬里层的破损、腐蚀、裂纹、脱落及检查孔介质流出情况","检验结果","备注",
                "堆焊层的腐蚀、裂纹、剥离和脱落","检验结果","备注",
                "其他检查",
                "夹层真空度","检验结果","备注",
                "日蒸发率","检验结果","备注",
                "存在的其他问题及整改要求",
                "检验人员","检验时间",
                "提交"};
        String [] eItems = {"产品编号",
                "操作工况安全",
                "工作温度（有无超温）","v_Result_1","v_Result_Remark_1",
                "工作压力（有无超压）","v_Result_2","v_Result_Remark_2",
                "工作介质（有无异常）","v_Result_3","v_Result_Remark_3",
                "安全附件",
                "安全阀","v_Result_4","v_Result_Remark_4",
                "爆破片","v_Result_5","v_Result_Remark_5",
                "紧急切断装置","v_Result_6","v_Result_Remark_6",
                "压力表","v_Result_7","v_Result_Remark_7",
                "温度计","v_Result_8","v_Result_Remark_8",
                "液位计","v_Result_9","v_Result_Remark_9",
                "其他附件","v_Result_10","v_Result_Remark_10",
                "壳体外观检查",
                "铭牌和标志","v_Result_11","v_Result_Remark_11",
                "内外表面的腐蚀","v_Result_12","v_Result_Remark_12",
                "裂纹、泄漏、鼓包、变形、机械接触损伤、过热","v_Result_13","v_Result_Remark_13",
                "工卡具焊迹、电弧灼伤","v_Result_14","v_Result_Remark_14",
                "密封紧固件","v_Result_15","v_Result_Remark_15",
                "支承、支座或者基础的下沉、倾斜、开裂","v_Result_16","v_Result_Remark_16",
                "地脚螺栓","v_Result_17","v_Result_Remark_17",
                "直立容器和球形容器支柱的铅垂度","v_Result_18","v_Result_Remark_18",
                "多支座卧式容器的支座膨胀孔","v_Result_19","v_Result_Remark_19",
                "排放（疏水、排污）装置和泄漏信号指示孔的堵塞、腐蚀、沉积物","v_Result_20","v_Result_Remark_20",
                "隔热层、衬里检查",
                "隔热脱落、潮湿及层下腐蚀、裂纹","v_Result_21","v_Result_Remark_21",
                "衬里层的破损、腐蚀、裂纹、脱落及检查孔介质流出情况","v_Result_22","v_Result_Remark_22",
                "堆焊层的腐蚀、裂纹、剥离和脱落","v_Result_23","v_Result_Remark_23",
                "其他检查",
                "夹层真空度","v_Result_24","v_Result_Remark_24",
                "日蒸发率","v_Result_25","v_Result_Remark_25",
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
                3,
                3,0,0,
                3,0,0,
                3,0,0,
                3,
                3,0,0,
                3,0,0,
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
