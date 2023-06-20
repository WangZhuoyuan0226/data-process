package com.tongji.dataProcess.mock;

import com.tongji.dataProcess.utils.DataStamp;

import java.util.ArrayList;

public class Mock {
    public static ArrayList<DataStamp> mockJsonData(int length){
        return Mock.randomRawData(length);
    }

    public static ArrayList<DataStamp> mockXmlData(int length){
        return Mock.randomRawData(length);
    }

    private static ArrayList<DataStamp> randomRawData(int length){
        ArrayList<DataStamp> dataList = new ArrayList<>();
        double startTime = 0;
        while (length-- > 0){
            dataList.add(new DataStamp(startTime,Math.random()));
            startTime++;
        }
        return dataList;
    }
}
