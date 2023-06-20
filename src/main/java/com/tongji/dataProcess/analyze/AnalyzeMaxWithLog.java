package com.tongji.dataProcess.analyze;

import com.tongji.dataProcess.logger.Logger;
import com.tongji.dataProcess.utils.DataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class AnalyzeMaxWithLog implements Analyze{

    Logger logger;
    AnalyzeMax analyzeMax;

    public AnalyzeMaxWithLog(AnalyzeMax analyzeMax){
        this.analyzeMax = analyzeMax;
        logger = new Logger();
    }
    @Override
    public double analyzeMethod(DataEntity dataEntity) {
        logger.warn("calculating max value!");
        double res = analyzeMax.analyzeMethod(dataEntity);
        logger.warn("calculate end");
        return res;
    }
}