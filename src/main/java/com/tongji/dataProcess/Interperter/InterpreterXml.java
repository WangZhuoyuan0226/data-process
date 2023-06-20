package com.tongji.dataProcess.Interperter;

import com.tongji.dataProcess.mock.Mock;
import com.tongji.dataProcess.utils.DataEntity;

public class InterpreterXml implements Interpreter{
    @Override
    public DataEntity getRawData() {
        DataEntity dataEntity = new DataEntity();
        dataEntity.setType("xml");
        dataEntity.setData(Mock.mockXmlData(3));
        return dataEntity;
    }
}
