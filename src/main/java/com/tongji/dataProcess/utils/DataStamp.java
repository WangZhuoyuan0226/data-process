package com.tongji.dataProcess.utils;

public class DataStamp {
    public DataStamp(double time, double value){
        this.time = time;
        this.value = value;
    }
    public double time;
    public double value;

    public DataStamp() {
    }

    public String toString(){
        return "(" + time + "," + value + ")";
    }
}
