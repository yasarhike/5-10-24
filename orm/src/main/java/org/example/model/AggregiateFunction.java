package org.example.model;

public enum AggregiateFunction {
    COUNT("count");

    private final String param;

    AggregiateFunction(final String value) {
        param = value;
    }
}
