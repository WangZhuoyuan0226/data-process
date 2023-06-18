package com.tongji.dataProcess.PreProcess;

import com.tongji.dataProcess.Interperter.Interpreter;
import com.tongji.dataProcess.Interperter.InterpreterFactory;
import com.tongji.dataProcess.entity.DataEntity;
import com.tongji.dataProcess.mock.Mock;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PreProcessTest {

    @Test
    public void preProcessTest(){
        // parse raw data
        Interpreter jsonInterpreter = InterpreterFactory.getInterpreterInstance("json");
        DataEntity dataEntity = jsonInterpreter.parse(Mock.mockJsonData(10));
        System.out.println(dataEntity);
        assertEquals(dataEntity.getType(), "json");
        assertEquals(dataEntity.getData().size(), 10);
        // preProcess
        PreProcessBuilder builder = new PreProcessBuilder();
        builder.add(new PreProcessAddBase(1)).add(new PreprocessSort());
        dataEntity = builder.process(dataEntity);
        System.out.println(dataEntity);
    }

}