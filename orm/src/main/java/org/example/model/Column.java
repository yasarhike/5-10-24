package org.example.model;

public class Column {

    private String columnName;
    private String tableName;

    public Column(final String columnName) {
        this.columnName = columnName;
    }

    public Column(final String columnName, final String tableName) {
        this.columnName = columnName;
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(final String columnName) {
        this.columnName = columnName;
    }

    public void setTableName(final String tableName) {
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }
}
