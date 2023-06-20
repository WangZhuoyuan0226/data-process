package com.tongji.dataProcess.PreProcess;

import com.tongji.dataProcess.utils.DataStamp;
import com.tongji.dataProcess.utils.DataEntity;

public class PreProcessAddBase implements PreProcess{
    double base = 0;
    public PreProcessAddBase(double base){
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
