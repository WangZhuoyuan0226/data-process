package com.tongji.dataProcess.analyze;

import com.tongji.dataProcess.utils.DataStamp;
import com.tongji.dataProcess.utils.DataEntity;

import java.util.ArrayList;

public class AnalyzeMin implements Analyze{
    @Override
    public double analyzeMethod(DataEntity dataEntity) {
        ArrayList<DataStamp> list = dataEntity.getData();
        double res = Integer.MAX_VALUE;
        for (DataStamp dataStamp : list){
            if (dataStamp.value < res) res = dataStamp.value;
        }
        return res;
    }
}
