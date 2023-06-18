package com.tongji.dataProcess.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class DataEntity {

    // TODO using Enum
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