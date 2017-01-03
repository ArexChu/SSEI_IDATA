package com.ecust.equsys.domain;

import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallReview;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallSafeChecka;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallSafeCheckb;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallSafeCheckc;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallSafeCheckd;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallSafeChecke;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallSafeCheckf;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallSafeCheckg;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallSafeCheckh;
import com.ecust.equsys.domain.pipe.pipeinstall.PipeInstallSafeChecki;
import com.ecust.equsys.domain.pipe.pipeoverallcheck.PipeHardTest;
import com.ecust.equsys.domain.pipe.pipeoverallcheck.PipeThiCheck;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselHardTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselMagneticTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselMatAna;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselPeneTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselRayDetect;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselTOFDTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselThiTest;
import com.ecust.equsys.domain.vessel.vesselperiodic.VesselUltrasonicDetectTest;

import java.util.HashMap;
import java.util.Map;


public class ConfigMap {

    private static Map<String, String> clazz_En_Name;

    public static Map<String, String> getConfigMap(){
        if (clazz_En_Name==null){
            clazz_En_Name = new HashMap<>();
            //容器配置信息
            clazz_En_Name.put(VesselThiTest.class.getSimpleName(), "v_Thi_Value");
            clazz_En_Name.put(VesselRayDetect.class.getSimpleName(), "v_Radio_value");
            clazz_En_Name.put(VesselUltrasonicDetectTest.class.getSimpleName(), "v_Ult_Value");
            clazz_En_Name.put(VesselTOFDTest.class.getSimpleName(), "v_TOFD_Value");
            clazz_En_Name.put(VesselMagneticTest.class.getSimpleName(), "v_Mag_Value");
            clazz_En_Name.put(VesselPeneTest.class.getSimpleName(), "v_Perm_Value");
            clazz_En_Name.put(VesselMatAna.class.getSimpleName(), "v_Mat_Value");
            clazz_En_Name.put(VesselHardTest.class.getSimpleName(), "v_Hard_Value");

            //管道配置信息
            clazz_En_Name.put(PipeThiCheck.class.getSimpleName(), "p_Thick_Qua");
            clazz_En_Name.put(PipeHardTest.class.getSimpleName(), "p_Hard_Qua");

            clazz_En_Name.put(PipeInstallReview.class.getSimpleName(), "pi_Rev_value");
            clazz_En_Name.put(PipeInstallSafeChecka.class.getSimpleName(), "pi_Wel_Ma");
            clazz_En_Name.put(PipeInstallSafeCheckb.class.getSimpleName(), "pi_Wel_Qua");
            clazz_En_Name.put(PipeInstallSafeCheckc.class.getSimpleName(), "pi_Compen");
            clazz_En_Name.put(PipeInstallSafeCheckd.class.getSimpleName(), "pi_Appurt");
            clazz_En_Name.put(PipeInstallSafeChecke.class.getSimpleName(), "pi_Cross");
            clazz_En_Name.put(PipeInstallSafeCheckf.class.getSimpleName(), "pi_InsPro");
            clazz_En_Name.put(PipeInstallSafeCheckg.class.getSimpleName(), "pi_Dry");
            clazz_En_Name.put(PipeInstallSafeCheckh.class.getSimpleName(), "pi_Leak");
            clazz_En_Name.put(PipeInstallSafeChecki.class.getSimpleName(), "pi_SafeEqu");
        }
        return clazz_En_Name;
    }

}
