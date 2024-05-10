package org.example;

import org.example.model.*;

import java.util.ArrayList;
import java.util.List;

public class InsertQueryBuilder {

    private static InsertQueryBuilder insertQueryBuilder;
    private final QueryGenerator queryGenerator;

    private InsertQueryBuilder() {
        queryGenerator = QueryGenerator.getInstance();
    }

    public static InsertQueryBuilder getInstance() {
        return insertQueryBuilder == null ? new InsertQueryBuilder() : insertQueryBuilder;
    }

    public String buildInsertQuery(final DataConfigContainer dataConfigContainer) {
        final String columnQuery = queryGenerator.setBrackets(buildColumnQuery(dataConfigContainer.getColumnList()));
        final String valueQuery = queryGenerator.setBrackets(queryGenerator.setPlaceholder(columnQuery));

        return buildFinalQuery(dataConfigContainer.getTableName(), columnQuery, valueQuery);
    }


    public String buildColumnQuery(final List<Column> columns) {
        final List<String> resultSet = new ArrayList<>();

        for(final Column column : columns) {
            resultSet.add(column.getColumnName());
        }

        return String.join(", ", resultSet);
    }

    public String buildFinalQuery(final String tableName, final String columnQuery, final String valueQuery) {
        return String.join(" ", KeywordConstraints.INSERT.getValue(), KeywordConstraints.INTO.getValue(),
                tableName, columnQuery, KeywordConstraints.VALUES.getValue(), valueQuery);
    }
}
