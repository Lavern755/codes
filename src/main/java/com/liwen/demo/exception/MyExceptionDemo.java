package com.liwen.demo.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyExceptionDemo {
    private static Logger logger = LoggerFactory.getLogger(MyExceptionDemo.class);
    public static void main(String[] args) {
        try {
            logger.info("line number test");
            ExceptionService exceptionService = new ExceptionService();
        }catch (Exception ex) {
            logger.error("logback exception:{}", ex); // 多余的大括号
            logger.error("info: {}", ex.getMessage(), ex); // 增加一个参数的意义不大
            logger.error("info: {}", ex, ex.getMessage()); // 堆栈信息不会打印
            logger.error("exception msg: ", ex); // 正确用法
        }
    }
}
