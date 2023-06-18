package com.tongji.dataProcess.analyz;

import com.tongji.dataProcess.entity.DataEntity;

public class AnalyzeMaxWithLog implements Analyze{

    AnalyzeMax analyzeMax;
    @Override
    public double analyzeMethod(DataEntity rawData) {
        analyzeMax = new AnalyzeMax();
        System.out.println("calculating max value");
        double res = analyzeMax.analyzeMethod(rawData);
        System.out.println("calculate end");
        return res;
    }
}