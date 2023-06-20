package com.tongji.dataProcess.analyze;

import com.tongji.dataProcess.logger.Logger;
import com.tongji.dataProcess.utils.DataEntity;

public class AnalyzeMeanWithLog implements Analyze{

    Logger logger;
    AnalyzeMean analyzeMean;
    public AnalyzeMeanWithLog(AnalyzeMean analyzeMean){
        logger = new Logger();
        this.analyzeMean = analyzeMean;
    }
    @Override
    public double analyzeMethod(DataEntity dataEntity) {
        logger.debug("calculating mean value!");
        double res = analyzeMean.analyzeMethod(dataEntity);
        logger.debug("calculate end");
        return res;
    }
}
