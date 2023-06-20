package com.tongji.dataProcess.utils;

import lombok.Getter;

public enum DataType {
    JSON("json"), XML("xml");
    @Getter
    private String name;
    private DataType(String name){
        this.name = name;
    }
}
