package com.tongji.dataProcess.PreProcess;

import com.tongji.dataProcess.entity.DataStamp;
import com.tongji.dataProcess.entity.DataEntity;

public class PreProcessAddBase extends PreProcess{
    private double base;

    public PreProcessAddBase(double base) {
        this.base = base;
    }

    @Override
    public DataEntity preProcessedMethod(DataEntity dataEntity) {
        for(int i = 0; i < dataEntity.getData().size(); i++){
            DataStamp dataStamp = dataEntity.getData().get(i);
            dataStamp.value = dataStamp.value + base;
            dataEntity.getData().set(i, dataStamp);
        }
        return dataEntity;
    }
}
