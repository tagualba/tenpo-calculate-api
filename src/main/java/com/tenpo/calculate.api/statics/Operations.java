package com.tenpo.calculate.api.statics;

public enum Operations {

    LOGIN("LOGIN"),
    SING_UP("SING_UP"),
    CALCULATE_PERCENTAGE("CALCULATE_PERCENTAGE");

    private String operation;
    Operations(String operation) {
        this.operation = operation;
    }

}
