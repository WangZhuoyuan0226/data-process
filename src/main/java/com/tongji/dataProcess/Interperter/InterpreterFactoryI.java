package com.tongji.dataProcess.Interperter;

import com.tongji.dataProcess.utils.RawData;

public interface InterpreterFactoryI {
    RawData queryRawData(String type);
}
