package com.ecust.equsys.base.impl.vesseldetail.data;

import com.ecust.equsys.domain.MenuDetailUIDomain;
import com.ecust.equsys.domain.vessel.VesselConfig;

public class VesselConfigData {

    public static MenuDetailUIDomain getVesselConfig() {
        String [] cItems = {"壁厚测定","射线检测","超声检测","衍射时差法",
                "磁粉检测","渗透检测","材料成分","硬度检测",
                "提交"};
        String [] eItems = {"v_Thi_Value","v_Radio_value","v_Ult_Value","v_TOFD_Value",
                "v_Mag_Value","v_Perm_Value","v_Mat_Value","v_Hard_Value",
                "提交"};
        Integer[] type = {8,8,8,8,
                8,8,8,8,
                9};

        MenuDetailUIDomain m = new MenuDetailUIDomain();
        m.setcItems(cItems);
        m.seteItems(eItems);
        m.setType(type);
        //是该页面对应的实体类
        m.setEntity(VesselConfig.getInstance());

        return m;


    }

}
