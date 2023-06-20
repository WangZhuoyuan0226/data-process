package com.tongji.dataProcess.PreProcess;


import com.tongji.dataProcess.utils.DataStamp;
import com.tongji.dataProcess.utils.DataEntity;

import java.util.ArrayList;

public class PreProcessUpSample implements PreProcess {
    @Override
    public DataEntity preProcessedMethod(DataEntity dataEntity) {
        ArrayList<DataStamp> data = dataEntity.getData();
        ArrayList<DataStamp> upSampleList = new ArrayList<>();
        for(int i = 0; i < data.size() - 1; i++){
            DataStamp dataStamp = data.get(i);
            upSampleList.add(dataStamp);
            DataStamp dataStampPoly = new DataStamp();
            dataStampPoly.time = (dataStamp.time + data.get(i + 1).time) / 2;
            dataStampPoly.value = (dataStamp.value + data.get(i + 1).value) / 2;
            upSampleList.add(dataStampPoly);
        }
        upSampleList.add(data.get(data.size() - 1));
        dataEntity.setData(upSampleList);
        return dataEntity;
    }
}
