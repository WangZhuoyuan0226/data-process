package com.tongji.dataProcess.analyze;

import com.tongji.dataProcess.logger.Logger;
import com.tongji.dataProcess.utils.DataEntity;

public class AnalyzeMinWithLog implements Analyze{

    Logger logger;
    AnalyzeMin analyzeMin;
    public AnalyzeMinWithLog(AnalyzeMin analyzeMin){
        logger = new Logger();
        this.analyzeMin = analyzeMin;
    }
    @Override
    public double analyzeMethod(DataEntity dataEntity) {
        analyzeMin = new AnalyzeMin();
        logger.info("calculating min value!");
        double res = analyzeMin.analyzeMethod(dataEntity);
        logger.info("calculate end");
        return res;
    }
}
