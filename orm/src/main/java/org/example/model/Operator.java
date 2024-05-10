package org.example.model;

public enum Operator {

    AND("and"), OR("or");

    private final String value;


    Operator(String value) {
        this.value = value;
    }


    public static Operator getOperator(final String value) {
        return switch (value) {
            case "and" -> AND;
            case "or" -> OR;
            default -> null;
         };
    }

    public String getValue() {
        return this.value;
    }
}
