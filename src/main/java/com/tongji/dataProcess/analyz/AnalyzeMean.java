package com.tongji.dataProcess.analyz;

import com.tongji.dataProcess.entity.DataStamp;
import com.tongji.dataProcess.entity.DataEntity;

import java.util.ArrayList;

public class AnalyzeMean implements Analyze{
    @Override
    public double analyzeMethod(DataEntity rawData) {
        ArrayList<DataStamp> list = rawData.getData();
        double sum = 0.0;
        int n = list.size();
        for (DataStamp dataStamp : list){
            sum += dataStamp.value;
        }
        return sum / n;
    }
}
