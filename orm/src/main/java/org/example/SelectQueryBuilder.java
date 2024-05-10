package org.example;

import org.example.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SelectQueryBuilder {

    private static SelectQueryBuilder selectQueryBuilder;
    private final JoinQueryBuilder joinQueryBuilder;
    private final QueryGenerator queryGenerator;

    private SelectQueryBuilder() {
        joinQueryBuilder = JoinQueryBuilder.getInstance();
        queryGenerator = QueryGenerator.getInstance();
    }

    public static SelectQueryBuilder getInstance() {
        return selectQueryBuilder == null ? new SelectQueryBuilder() : selectQueryBuilder;
    }

    public String buildSelectQuery(final DataConfigContainer dataConfigContainer) {
        final String columnQuery = buildColumnQuery(dataConfigContainer);
        final String joinQuery = joinQueryBuilder.buildJoinQuery(dataConfigContainer.getJoinClauseList(), dataConfigContainer.getTableName());
        final String whereQuery = queryGenerator.getWhereQuery(dataConfigContainer.getWhereClauses());

        return buildFinalQuery(columnQuery, joinQuery, whereQuery, dataConfigContainer.getTableName());
    }

    public String buildColumnQuery(final DataConfigContainer dataConfigContainer) {
        final List<String> resultSet = new ArrayList<>();

        for(final Column column : dataConfigContainer.getColumnList()) {
            resultSet.add(String.join("", column.getTableName(), ".", column.getColumnName()));

            final SubQueryClause subQueryClause = checkSubqueryIsPresent(dataConfigContainer.getSubQueryClauses());

            if (Objects.nonNull(subQueryClause)) {
                resultSet.add(queryGenerator.setBrackets(buildSelectQuery(subQueryClause.getDataConfigContainer())));
            }
        }

        return String.join(", ", resultSet);
    }

    public SubQueryClause checkSubqueryIsPresent(final List<SubQueryClause> subQueryList) {
        if (subQueryList != null) {
            for (final SubQueryClause subQueryClause : subQueryList) {
                if (subQueryClause.getSubQueryDef().getSubQueryLocation().getValue().equals("column")) {
                    return subQueryClause;
                }
            }
        }

        return null;
    }

    public String buildFinalQuery(final String columnQuery, final String joinQuery, final String whereQuery, final String tableName) {
        return String.join(" ", KeywordConstraints.SELECT.getValue(), columnQuery, KeywordConstraints.FROM.getValue(),
                tableName, joinQuery, whereQuery);
    }
}
