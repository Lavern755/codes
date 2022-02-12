package com.liwen.demo.exception;

public class ExceptionService {
    public ExceptionService() throws MyException {
        try {
            int x = 1 / 0;
        }catch (ArithmeticException exception) {
            throw new MyException("10000","zero can not be divide");
        }
    }
}
