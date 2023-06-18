package com.tongji.dataProcess.analyz;

import com.tongji.dataProcess.entity.DataStamp;
import com.tongji.dataProcess.entity.DataEntity;

import java.util.ArrayList;

public class AnalyzeMin implements Analyze{
    @Override
    public double analyzeMethod(DataEntity rawData) {
        ArrayList<DataStamp> list = rawData.getData();
        double res = Integer.MAX_VALUE;
        for (DataStamp dataStamp : list){
            if (dataStamp.value < res) res = dataStamp.value;
        }
        return res;
    }
}
