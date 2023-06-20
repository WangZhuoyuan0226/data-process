package com.tongji.dataProcess.analyze;

import com.tongji.dataProcess.utils.DataStamp;
import com.tongji.dataProcess.utils.DataEntity;

import java.util.ArrayList;

public class AnalyzeMean implements Analyze{
    @Override
    public double analyzeMethod(DataEntity dataEntity) {
        ArrayList<DataStamp> list = dataEntity.getData();
        double sum = 0.0;
        int n = list.size();
        for (DataStamp dataStamp : list){
            sum += dataStamp.value;
        }
        return sum / n;
    }
}
