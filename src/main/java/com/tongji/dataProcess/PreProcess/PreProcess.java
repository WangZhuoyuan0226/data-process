package com.tongji.dataProcess.PreProcess;

import com.tongji.dataProcess.utils.DataEntity;
import lombok.Getter;
import lombok.Setter;

public interface PreProcess{

    public DataEntity preProcessedMethod(DataEntity dataEntity);
}
