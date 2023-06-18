package com.tongji.dataProcess.analyz;

import com.tongji.dataProcess.utils.DataStamp;
import com.tongji.dataProcess.utils.RawData;

import java.util.ArrayList;

public class AnalyzeMeanWithLog implements Analyze{

    AnalyzeMean analyzeMean;
    @Override
    public double analyzeMethod(RawData rawData) {
        analyzeMean = new AnalyzeMean();
        System.out.println("calculating mean value!");
        double res = analyzeMean.analyzeMethod(rawData);
        System.out.println("calculate end");
        return res;
    }
}
