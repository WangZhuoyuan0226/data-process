package com.tongji.dataProcess.analyz;

import com.tongji.dataProcess.utils.DataStamp;
import com.tongji.dataProcess.utils.RawData;

import java.util.ArrayList;

public class AnalyzeMin implements Analyze{
    @Override
    public double analyzeMethod(RawData rawData) {
        ArrayList<DataStamp> list = rawData.getData();
        double res = Integer.MAX_VALUE;
        for (DataStamp dataStamp : list){
            if (dataStamp.value < res) res = dataStamp.value;
        }
        return res;
    }
}
