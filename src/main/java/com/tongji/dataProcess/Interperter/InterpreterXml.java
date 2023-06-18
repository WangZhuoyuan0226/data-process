package com.tongji.dataProcess.Interperter;

import com.tongji.dataProcess.utils.RawData;

public class InterpreterXml implements Interpreter{
    @Override
    public RawData getRawData() {
        System.out.println("This data is in the form of xml");
        RawData rawData = new RawData();
        rawData.setType("xml");
        return rawData;
    }
}
