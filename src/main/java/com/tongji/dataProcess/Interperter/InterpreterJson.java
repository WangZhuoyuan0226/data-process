package com.tongji.dataProcess.Interperter;

import com.tongji.dataProcess.mock.Mock;
import com.tongji.dataProcess.utils.DataEntity;
import com.tongji.dataProcess.utils.DataType;

public class InterpreterJson implements Interpreter{
    @Override
    public DataEntity getRawData() {
        DataEntity dataEntity = new DataEntity();
        dataEntity.setType("json");
        dataEntity.setData(Mock.mockJsonData(3));
        return dataEntity;
    }
}
