package com.tongji.dataProcess.Interperter;

import com.tongji.dataProcess.utils.RawData;

public class InterpreterJson implements Interpreter{
    @Override
    public RawData getRawData() {
        System.out.println("This data is in the form of json");
        RawData rawData = new RawData();
        rawData.setType("json");
        return rawData;
    }
}
