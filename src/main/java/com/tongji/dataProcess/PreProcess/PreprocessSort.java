package com.tongji.dataProcess.PreProcess;

import com.tongji.dataProcess.entity.DataStamp;
import com.tongji.dataProcess.entity.DataEntity;

import java.util.ArrayList;

public class PreprocessSort extends PreProcess {

    @Override
    public DataEntity preProcessedMethod(DataEntity dataEntity) {
        ArrayList<DataStamp> data = dataEntity.getData();
        data.sort((o1, o2) -> (o1.time >= o2.time) ? -1 : 1);
        dataEntity.setData(data);
        return dataEntity;
    }
}
