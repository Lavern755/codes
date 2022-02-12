package com.liwen.demo.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyException extends Exception {
    private String code;
    private String message;

    public MyException(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
