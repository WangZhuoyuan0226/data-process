package com.tongji.dataProcess;

import com.tongji.dataProcess.Interperter.Interpreter;
import com.tongji.dataProcess.Interperter.InterpreterFactory;
import com.tongji.dataProcess.PreProcess.*;
import com.tongji.dataProcess.analyze.Analyze;
import com.tongji.dataProcess.analyze.AnalyzeMax;
import com.tongji.dataProcess.analyze.AnalyzeMaxWithLog;
import com.tongji.dataProcess.utils.DataEntity;
import com.tongji.dataProcess.utils.DataType;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DataProcessApplicationTests {


    @Test
    void contextLoads() {
    }

    @Test
    void testPreProcessBuilder(){
        Interpreter interpreter = InterpreterFactory.createInterpreter(DataType.JSON);
        DataEntity dataEntity = interpreter.getRawData();
        PreProcessBuilder preProcessBuilder = new PreProcessBuilder();
        preProcessBuilder.add(new PreProcessUpSample()).add(new PreProcessAddBase(10));
        dataEntity = preProcessBuilder.preProcessedMethod(dataEntity);
        System.out.println(dataEntity);
    }

    @Test
    void testPreProcessWrapper(){
        Interpreter interpreter = InterpreterFactory.createInterpreter(DataType.JSON);
        DataEntity dataEntity = interpreter.getRawData();
        DataEntityWrapper dataEntityWrapper = new DataEntityWrapper(dataEntity);
        dataEntityWrapper.preProcessUpSample().preProcessAddBase(10);
        System.out.println(dataEntityWrapper.getDataEntity());
    }

    @Test
    void testAnalyze(){
        Interpreter interpreter = InterpreterFactory.createInterpreter(DataType.JSON);
        DataEntity dataEntity = interpreter.getRawData();
        AnalyzeMaxWithLog analyzeMaxWithLog = new AnalyzeMaxWithLog(new AnalyzeMax());
        double res = analyzeMaxWithLog.analyzeMethod(dataEntity);
        System.out.println(res);
    }


    @Test
    void testAssert(){
        assertEquals(1,2);
    }
}
