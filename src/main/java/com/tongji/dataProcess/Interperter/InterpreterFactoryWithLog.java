package com.tongji.dataProcess.Interperter;

import com.tongji.dataProcess.utils.RawData;

public class InterpreterFactoryWithLog implements InterpreterFactoryI {

    @Override
    public RawData queryRawData(String type) {
        InterpreterFactory interpreterFactory = new InterpreterFactory();
        System.out.println("querying data, type is : " + type);
        RawData rawData = interpreterFactory.queryRawData(type);
        System.out.println("query end");
        return rawData;
    }
}
