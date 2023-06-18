package com.tongji.dataProcess.analyz;

import com.tongji.dataProcess.utils.DataStamp;
import com.tongji.dataProcess.utils.RawData;

import java.util.ArrayList;

public class AnalyzeMinWithLog implements Analyze{

    AnalyzeMin analyzeMin;
    @Override
    public double analyzeMethod(RawData rawData) {
        analyzeMin = new AnalyzeMin();
        System.out.println("calculating min value!");
        double res = analyzeMin.analyzeMethod(rawData);
        System.out.println("calculate end");
        return res;
    }
}
