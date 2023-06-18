package com.tongji.dataProcess.Interperter;

import com.tongji.dataProcess.mock.Mock;
import com.tongji.dataProcess.entity.DataEntity;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class InterpreterJsonTest {
    @Test
    void InterpreterJson() {
        Interpreter jsonInterpreter = InterpreterFactory.getInterpreterInstance("json");
        DataEntity dataEntity = jsonInterpreter.parse(Mock.mockJsonData(10));
        System.out.println(dataEntity);
        assertEquals(dataEntity.getType(), "json");
        assertEquals(dataEntity.getData().size(), 10);
    }
}