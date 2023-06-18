package com.tongji.dataProcess.Interperter;

import com.tongji.dataProcess.entity.DataEntity;
import org.springframework.stereotype.*;

import java.security.InvalidParameterException;

@Component
public class InterpreterFactory {
    public static Interpreter getInterpreterInstance(String type){
        DataEntity rawData = null;
        Interpreter interpreter = null;
        // TODO using Enum
        switch (type){
            case "json":
                interpreter = new InterpreterJson();
                break;
            case "xml":
                interpreter = new InterpreterXml();
                break;
            default:
                throw new InvalidParameterException("no such data form as " + type);
        }
        return interpreter;
    }
}