package com.example.service;

/**
 * User: eailes
 * Created: 2/15/17
 * Time: 4:13 PM
 * Project: micro_test
 */
public enum EveDatasource {
    TRANQUILITY("tranquility"),
    SINGULARITY("singularity");

    private String value;

    EveDatasource(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
