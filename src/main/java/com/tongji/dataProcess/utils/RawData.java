package com.tongji.dataProcess.utils;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.TreeMap;

public class RawData {

    @Getter
    @Setter
    String type;

    @Getter
    @Setter
    ArrayList<DataStamp> data;

    @Override
    public String toString(){
        String resStr = null;
        String nullStr = "null";
        String typeStr = (type != null ? type : nullStr);
        String dataStr = nullStr;
        if(data != null){
            dataStr = "";
            for (DataStamp datum : data)
                dataStr = dataStr + datum + " ";
        }
        resStr = typeStr + " : " + dataStr;
        return resStr;
    }
}