package com.tongji.dataProcess.controller;

import com.tongji.dataProcess.Interperter.InterpreterFactory;
import com.tongji.dataProcess.Interperter.InterpreterFactoryI;
import com.tongji.dataProcess.Interperter.InterpreterFactoryWithLog;
import com.tongji.dataProcess.PreProcess.PreProcessAddBase;
import com.tongji.dataProcess.PreProcess.PreProcessUpSample;
import com.tongji.dataProcess.PreProcess.PreprocessSort;
import com.tongji.dataProcess.analyz.Analyze;
import com.tongji.dataProcess.analyz.AnalyzeMax;
import com.tongji.dataProcess.analyz.AnalyzeMin;
import com.tongji.dataProcess.analyz.AnalyzeMinWithLog;
import com.tongji.dataProcess.utils.DataStamp;
import com.tongji.dataProcess.utils.RawData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Client {

    RawData rawData;
    InterpreterFactoryI interpreterFactory;

    public RawData fullProcess(){
        getRawData("json");
        return preProcess();
    }

    public void analyze(RawData rawData){
        Analyze analyzeClass = new AnalyzeMinWithLog();
        System.out.println(analyzeClass.analyzeMethod(this.rawData));
    }

    public RawData preProcess(){
        RawData resData = new PreprocessSort(rawData).preProcessedMethod();
        resData = new PreProcessUpSample(resData).preProcessedMethod();
        resData = new PreProcessAddBase(resData, 10).preProcessedMethod();
        return resData;
    }

    public RawData getRawData(String type){
        interpreterFactory = new InterpreterFactoryWithLog();
        rawData = interpreterFactory.queryRawData(type);
        ArrayList<DataStamp> list = createList();
        rawData.setData(list);
        return rawData;
    }

    public ArrayList<DataStamp> createList(){
        ArrayList<DataStamp> list = new  ArrayList<>();
        list.add(new DataStamp(4.0, 16.0));
        list.add(new DataStamp(2.0, 4.0));
        list.add(new DataStamp(3.0, 9.0));
        return list;
    }
}