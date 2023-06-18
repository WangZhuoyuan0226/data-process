package com.tongji.dataProcess.PreProcess;

import com.tongji.dataProcess.utils.DataStamp;
import com.tongji.dataProcess.utils.RawData;

import java.util.ArrayList;

public class PreprocessSort extends PreProcess {

    public PreprocessSort(RawData rawData) {
        super(rawData);
    }

    @Override
    public RawData preProcessedMethod() {
        ArrayList<DataStamp> data = rawData.getData();
        data.sort((o1, o2) -> (o1.time < o2.time) ? -1 : 1);
        rawData.setData(data);
        return rawData;
    }
}
