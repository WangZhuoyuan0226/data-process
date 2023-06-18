package com.tongji.dataProcess.Interperter;

import com.tongji.dataProcess.entity.DataEntity;
import com.tongji.dataProcess.entity.DataStamp;

import java.util.ArrayList;

public class InterpreterJson implements Interpreter{
    @Override
    public DataEntity parse(ArrayList<DataStamp> rawData) {
        System.out.println("This data is in the form of xml");
        DataEntity dataEntity = new DataEntity();
        dataEntity.setType("json");
        dataEntity.setData(rawData);
        return dataEntity;
    }
}
