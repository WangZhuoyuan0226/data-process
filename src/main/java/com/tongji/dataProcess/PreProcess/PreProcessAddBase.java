package com.tongji.dataProcess.PreProcess;

import com.tongji.dataProcess.utils.DataStamp;
import com.tongji.dataProcess.utils.RawData;
import lombok.Getter;
import lombok.Setter;

public class PreProcessAddBase extends PreProcess{
    @Getter
    @Setter
    double base = 0;
    public PreProcessAddBase(RawData rawData) {
        super(rawData);
    }
    public PreProcessAddBase(RawData rawData, double base){
        super(rawData);
        this.base = base;
    }
    @Override
    public RawData preProcessedMethod() {
        for(int i = 0; i < rawData.getData().size(); i++){
            DataStamp dataStamp = rawData.getData().get(i);
            dataStamp.value = dataStamp.value + base;
            rawData.getData().set(i, dataStamp);
        }
        return rawData;
    }
}
