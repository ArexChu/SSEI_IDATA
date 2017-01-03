package com.ecust.equsys.utils;

import com.pow.api.cls.RfidPower;
import com.uhf.api.cls.Reader;

/**
 * Created by ares on 2016/10/31.
 */

public class RFIDReader {
    private static RfidPower rpower;
    private static Reader mreader;

    public static RfidPower getRfidPower() {
        if (rpower==null){
            rpower = new RfidPower(RfidPower.PDATYPE.IDATA);
        }
        return rpower;
    }
    public static Reader getReader() {
        if (mreader==null){
            mreader = new Reader();
        }
        return mreader;
    }
}
