package org.example.model;

public enum KeywordConstraints {

    INSERT("insert"), UPDATE("update"), DELETE("delete"), FROM("from"),
    WHERE("where"), EQUALS("="), PLACEHOLDER("?"),
    INTO("into"), VALUES("value"), SET("set"),
    ON("on"), COLUMN("column"), SELECT("select");

    private final String value;

    KeywordConstraints(String value) {
        this.value = value;
    }

    public static KeywordConstraints getMedia(final String value) {
        return switch (value) {
            case "insert" -> INSERT;
            case "delete" -> DELETE;
            case "update" -> UPDATE;
            case "from" -> FROM;
            case "where" -> WHERE;
            case "?" -> PLACEHOLDER;
            case "equals" -> EQUALS;
            default -> null;
        };
    }

    public String getValue() {
        return this.value;
    }
}
