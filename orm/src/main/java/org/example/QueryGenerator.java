package org.example;

import org.example.model.Column;
import org.example.model.KeywordConstraints;
import org.example.model.Table;
import org.example.model.WhereClause;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class QueryGenerator {

    private static QueryGenerator queryGenerator;

    private QueryGenerator() {
    }

    public static QueryGenerator getInstance() {
        return queryGenerator == null ? new QueryGenerator() : queryGenerator;
    }

    public String getColumnQuery(final Table table) {
        final List<Column> columns = table.getColumnList();
        final List<String> resultSet = new ArrayList<>();

        for(final Column column : columns) {
            resultSet.add(String.join(".", column.getTableName(), column.getColumnName()));
        }

        return String.join(",", resultSet);
    }

    public String getWhereQuery(final List<WhereClause> whereClauses) {
       final List<String> resultSet = new ArrayList<>();

       if (whereClauses != null) {
           for (final WhereClause whereClause : whereClauses) {
               if (Objects.isNull(whereClause.getOperator())) {
                   resultSet.add(setColumnPlaceholder(whereClause.getColumnName()));
               } else {
                   resultSet.add(String.join(" ", setColumnPlaceholder(whereClause.getColumnName()), whereClause.getOperator()));
               }
           }
       }

       return String.join(" ", resultSet);
    }

    public String setColumnPlaceholder(final String columnName) {
        return String.join(" ", columnName, KeywordConstraints.EQUALS.getValue(), KeywordConstraints.PLACEHOLDER.getValue());
    }

    public String setPlaceholder(final String query) {
        final List<String> columnFields = Arrays.asList(query.split(","));
        final List<String> resultSet = new ArrayList<>();

        for(int index = 0; index < columnFields.size(); index++) {
            resultSet.add(KeywordConstraints.PLACEHOLDER.getValue());
        }

        return String.join(" ,", resultSet);
    }

    public String setBrackets(final String query) {
        return String.join("", "(", query, ")");
    }
}
