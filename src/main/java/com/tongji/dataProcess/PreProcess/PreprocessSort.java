package com.tongji.dataProcess.PreProcess;

import com.tongji.dataProcess.utils.DataStamp;
import com.tongji.dataProcess.utils.DataEntity;

import java.util.ArrayList;

public class PreprocessSort implements PreProcess {

    @Override
    public DataEntity preProcessedMethod(DataEntity dataEntity) {
        ArrayList<DataStamp> data = dataEntity.getData();
        data.sort((o1, o2) -> (o1.time < o2.time) ? -1 : 1);
        dataEntity.setData(data);
        return dataEntity;
    }
}
