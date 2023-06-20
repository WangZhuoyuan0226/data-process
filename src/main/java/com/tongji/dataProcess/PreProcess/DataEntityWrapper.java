package com.tongji.dataProcess.PreProcess;

import com.tongji.dataProcess.utils.DataEntity;
import com.tongji.dataProcess.utils.DataStamp;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class DataEntityWrapper {
    @Getter
    DataEntity dataEntity;
    public DataEntityWrapper(DataEntity dataEntity){
        this.dataEntity = dataEntity;
    }
    public DataEntityWrapper preProcessSort(){
        ArrayList<DataStamp> data = dataEntity.getData();
        data.sort((o1, o2) -> (o1.time < o2.time) ? -1 : 1);
        dataEntity.setData(data);
        return this;
    }
    public DataEntityWrapper preProcessAddBase(double base){
        for(int i = 0; i < dataEntity.getData().size(); i++){
            DataStamp dataStamp = dataEntity.getData().get(i);
            dataStamp.value = dataStamp.value + base;
            dataEntity.getData().set(i, dataStamp);
        }
        return this;
    }
    public DataEntityWrapper preProcessUpSample(){
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
        return this;
    }
}