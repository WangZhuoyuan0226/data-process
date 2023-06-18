package com.tongji.dataProcess.PreProcess;

import com.tongji.dataProcess.utils.RawData;
import lombok.Getter;
import lombok.Setter;

public abstract class PreProcess{
    PreProcess(RawData rawData){
        this.rawData = rawData;
    }
    @Getter
    @Setter
    public RawData rawData;
    public abstract RawData preProcessedMethod();
}
