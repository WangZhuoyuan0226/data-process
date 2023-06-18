package com.tongji.dataProcess.Interperter;

import com.tongji.dataProcess.utils.RawData;
import org.springframework.stereotype.*;

@Component
public class InterpreterFactory implements InterpreterFactoryI {
    public RawData queryRawData(String type){
        RawData rawData = null;
        Interpreter interpreter = null;
        switch (type){
            case "json":
                interpreter = new InterpreterJson();
                break;
            case "xml":
                interpreter = new InterpreterXml();
                break;
        }
        rawData = interpreter.getRawData();
        return rawData;
    }
}