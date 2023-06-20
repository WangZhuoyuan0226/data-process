package com.tongji.dataProcess.Interperter;

import com.tongji.dataProcess.utils.DataEntity;
import com.tongji.dataProcess.utils.DataType;
import org.springframework.stereotype.*;

@Component
public class InterpreterFactory {
    public static Interpreter createInterpreter(DataType dataType){
        Interpreter interpreter = null;
        switch (dataType){
            case JSON:
                interpreter = new InterpreterJson();
                break;
            case XML:
                interpreter = new InterpreterXml();
                break;
        }
        return interpreter;
    }
}
