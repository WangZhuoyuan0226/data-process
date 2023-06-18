package com.tongji.dataProcess.analyz;

import com.tongji.dataProcess.entity.DataEntity;

public class AnalyzeMeanWithLog implements Analyze{

    AnalyzeMean analyzeMean;
    @Override
    public double analyzeMethod(DataEntity rawData) {
        analyzeMean = new AnalyzeMean();
        System.out.println("calculating mean value");
        double res = analyzeMean.analyzeMethod(rawData);
        System.out.println("calculate end");
        return res;
    }
}
