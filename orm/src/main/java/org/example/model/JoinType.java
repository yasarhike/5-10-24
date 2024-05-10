package org.example.model;

public enum JoinType {

    INNER("inner"), OUTER("outer"), JOIN("join");

    private final String value;


    JoinType(String value) {
        this.value = value;
    }


    public static JoinType getOperator(final String value) {
        return switch (value) {
            case "inner" -> INNER;
            case "outer" -> OUTER;
            case "join" -> JOIN;
            default -> null;
        };
    }

    public String getValue() {
        return this.value;
    }
}
