package com.tongji.dataProcess.PreProcess;

import com.tongji.dataProcess.utils.DataEntity;

import java.util.ArrayList;
import java.util.List;

public class PreProcessBuilder implements PreProcess {
    public List<PreProcess> list;
    public PreProcessBuilder(){
        list = new ArrayList<>();
    }
    public PreProcessBuilder add(PreProcess preProcess){
        list.add(preProcess);
        return this;
    }
    @Override
    public DataEntity preProcessedMethod(DataEntity dataEntity) {
        for(int i = 0; i < list.size(); i++){
            dataEntity = list.get(i).preProcessedMethod(dataEntity);
        }
        return dataEntity;
    }
}
