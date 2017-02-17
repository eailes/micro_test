package com.example.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.sql.Timestamp;

/**
 * User: eailes
 * Created: 2/8/17
 * Time: 3:12 PM
 * Project: micro_test
 */
@Getter
@ToString
@AllArgsConstructor
public class Error {
    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    private int status;
    private String message;

    public Error(int code, String message) {
        this.status = code;
        this.message = message;
    }
}
