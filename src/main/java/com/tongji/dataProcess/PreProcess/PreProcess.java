package com.tongji.dataProcess.PreProcess;

import com.tongji.dataProcess.entity.DataEntity;
import lombok.Getter;
import lombok.Setter;

//TODO why abstract class? necessary?
public abstract class PreProcess{

    public abstract DataEntity preProcessedMethod(DataEntity rawData);
}
