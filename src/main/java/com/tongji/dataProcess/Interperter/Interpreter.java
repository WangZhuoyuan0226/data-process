package com.tongji.dataProcess.Interperter;

import com.tongji.dataProcess.entity.DataEntity;
import com.tongji.dataProcess.entity.DataStamp;

import java.util.ArrayList;

public interface Interpreter {
    public DataEntity parse(ArrayList<DataStamp> rawData);
}
