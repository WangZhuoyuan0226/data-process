package com.tongji.dataProcess.analyz;

import com.tongji.dataProcess.entity.DataEntity;

public class AnalyzeMinWithLog implements Analyze{

    AnalyzeMin analyzeMin;
    @Override
    public double analyzeMethod(DataEntity rawData) {
        analyzeMin = new AnalyzeMin();
        System.out.println("calculating min value");
        double res = analyzeMin.analyzeMethod(rawData);
        System.out.println("calculate end");
        return res;
    }
}
