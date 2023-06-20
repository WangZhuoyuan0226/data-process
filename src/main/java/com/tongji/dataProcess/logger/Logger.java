package com.tongji.dataProcess.logger;

import org.springframework.stereotype.Component;

import java.util.Date;

public class Logger {
    public void warn(String msg){
        Date date = new Date();
        System.out.println(date);
        String format = "\033[33m";//黄色
        String type = "WARN: ";
        System.out.println(format + type + msg);
    }

    public void debug(String msg){
        Date date = new Date();
        System.out.println(date);
        String format = "\033[32m";//绿色
        String type = "DEBUG: ";
        System.out.println(format + type + msg);
    }

    public void info(String msg){
        Date date = new Date();
        System.out.println(date);
        String format = "\033[37m";//白色
        String type = "INFO: ";
        System.out.println(format + type + msg);
    }
}