package com.ecust.equsys.base.impl.pipedetail.data;

import com.ecust.equsys.domain.MenuDetailUIDomain;
import com.ecust.equsys.domain.pipe.PipeConfig;

/**
 * Created by smxiang on 01/11/2016.
 */

public class PipeConfigData {

    public static MenuDetailUIDomain getPipeConfig(){

        String [] cItems = {"管道测厚","管道硬度测定","压力管道底片","工业管道元件","工业管道焊接",
                "工业管道补偿器和热传导支承件","工业管道附属设施和设备","工业管道穿跨越及隐蔽工程","工业管道防腐、绝热","工业管道通球、扫线、干燥",
                "工业管道强度、泄漏性","工业管道安全保护",
                "提交"};
        String [] eItems = {"p_Thick_Qua","p_Hard_Qua","pi_Rev_value","pi_Wel_Ma","pi_Wel_Qua",
                "pi_Compen","pi_Appurt","pi_Cross","pi_InsPro","pi_Dry",
                "pi_Leak","pi_SafeEqu",
                "提交"};
        Integer[] type = {8,8,8,8,8,
                8,8,8,8,8,
                8,8,
                9};

        MenuDetailUIDomain m = new MenuDetailUIDomain();
        m.setcItems(cItems);
        m.seteItems(eItems);
        m.setType(type);
        //是该页面对应的实体类
        m.setEntity(PipeConfig.getInstance());

        return m;

    }


}
