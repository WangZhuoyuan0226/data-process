package com.tongji.dataProcess.PreProcess;

import com.tongji.dataProcess.entity.DataEntity;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;

public class PreProcessBuilder {
    private List<PreProcess> list = new ArrayList<>();

    public PreProcessBuilder add(PreProcess preProcess){
        list.add(preProcess);
        return this;
    }

    public DataEntity process(DataEntity dataEntity){
        DataEntity preData = dataEntity;
        for (PreProcess preProcess : list) {
            preData = preProcess.preProcessedMethod(preData);
        }
        return preData;
    }
}
