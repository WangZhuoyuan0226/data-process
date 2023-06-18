package com.tongji.dataProcess.analyz;

import com.tongji.dataProcess.utils.DataStamp;
import com.tongji.dataProcess.utils.RawData;

import java.util.ArrayList;

public class AnalyzeMaxWithLog implements Analyze{

    AnalyzeMax analyzeMax;
    @Override
    public double analyzeMethod(RawData rawData) {
        analyzeMax = new AnalyzeMax();
        System.out.println("calculating max value!");
        double res = analyzeMax.analyzeMethod(rawData);
        System.out.println("calculate end");
        return res;
    }
}