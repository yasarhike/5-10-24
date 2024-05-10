package org.example.model;

public class WhereClause {

    private String columnName;
    private String operator;

    public WhereClause(final String columnName, final String operator) {
        this.columnName = columnName;
        this.operator = operator;
    }

    public WhereClause(final String columnName) {
        this (columnName, null);
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(final String operator) {
        this.operator = operator;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(final String columnName) {
        this.columnName = columnName;
    }
}
