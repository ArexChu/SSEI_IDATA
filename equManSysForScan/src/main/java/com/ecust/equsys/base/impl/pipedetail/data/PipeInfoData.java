package com.ecust.equsys.base.impl.pipedetail.data;

import com.ecust.equsys.domain.MenuDetailUIDomain;
import com.ecust.equsys.domain.pipe.PipeInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by smxiang on 01/11/2016.
 */

public class PipeInfoData {
    public static MenuDetailUIDomain getPipeInfo(){

        String [] cItems = {"管道基本信息",
                "使用单位名称","管道系统","管道编号","设计单位",
                "管道名称","设计日期","装置名称","设计规范",
                "管道级别","安装单位","管道长度","安装与验收规范",
                "起始位置","验收日期","终止位置","投用日期",
                "敷设方式","实际使用时间","设计压力","工作压力",
                "设计温度 ","工作温度","管子材料牌号","工作介质",
                "管道规格外径","管道规格壁厚","绝热层材料","绝热层厚度",
                "腐蚀裕量","防腐层材料","注册代码","最高工作压力",
                "最高工作温度","安全状况等级","工艺图号","管道标识",
                "对接焊口数量","角接焊口数量","总焊口数量","三通数量",
                "弯头数量","变径管数量","轴侧图数","安装日期",
                "使用证号","管道规格",
                "备注",
                "提交"};
        String [] eItems = {"管道基本信息",
                "company","p_Sys","p_ID","p_De_Com",
                "p_Name","p_De_Date","p_Equ_Name","p_De_Norm",
                "p_Gra","p_Ins_Com","p_Len","p_Ins_Norm",
                "p_Start_Pos","p_Che_Bef_Date","p_End_Pos","p_Use_Date",
                "p_Lay","p_Act_Use_Date","p_De_Pre","p_Wo_Pre",
                "p_De_Tem ","p_Wo_Tem","p_Ma_Gra","p_Wo_Med",
                "p_Out_Rad","p_Thi","p_Ins_Ma","p_Ins_Thi",
                "p_Pro_Mar","p_Pro_Ma","p_Reg_Code","p_Max_Pre",
                "p_Max_Tem","p_Sec_Rank","p_Pro_Num","p_Sign",
                "p_Butt_Joint","p_Corner_Joint","p_Total_Joint","p_T_Cock",
                "p_Elbow","p_Reducer","p_Axial_View","p_Install_Date",
                "p_Cer_Num","p_Speci",
                "p_Comment",
                "提交"};
        Integer[] type = {3,
                0,0,0,0,
                0,7,0,0,
                0,0,0,0,
                0,7,0,7,
                6,7,0,0,
                0,0,0,0,
                0,0,0,0,
                0,0,0,0,
                0,0,0,0,
                0,0,0,0,
                0,0,0,7,
                0,0,
                4,
                9};

        MenuDetailUIDomain m = new MenuDetailUIDomain();
        m.setcItems(cItems);
        m.seteItems(eItems);
        m.setType(type);
        //是该页面对应的实体类
        m.setEntity(PipeInfo.getInstance());
        Map<String, String[]> checkBoxItems = new HashMap<String, String[]>();
        Map<String, boolean[]>checkBoxBooleans = new HashMap<String, boolean[]>();
        checkBoxItems.put("p_Gra",  new String[]{"一级","二级","三级"});
        checkBoxItems.put("p_Lay",  new String[]{"架空","埋地"});
        /**
         * 根据checkBoxItems生成checkBoxBooleans
         */
        PipeOverallCheckData.generateBooleans(checkBoxItems,checkBoxBooleans);
        m.checkBoxItems = checkBoxItems;
        m.checkBoxBooleans = checkBoxBooleans;
        return m;

    }

}
