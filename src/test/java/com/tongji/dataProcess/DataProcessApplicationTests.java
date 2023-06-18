package com.tongji.dataProcess;

import com.tongji.dataProcess.controller.Client;
import com.tongji.dataProcess.utils.RawData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DataProcessApplicationTests {

    @Autowired
    Client client;

    @Test
    void contextLoads() {
    }

    @Test
    void testRawData(){
//        System.out.println(client.preProcess());
        RawData rawData = client.getRawData("json");
//        System.out.println(client.preProcess());
        client.analyze(rawData);
    }

}
