package org.example;

import org.example.model.DataConfigContainer;
import org.example.model.KeywordConstraints;

public class DeleteQueryBuilder {

    private static DeleteQueryBuilder deleteQueryBuilder;
    private final QueryGenerator queryGenerator;

    private DeleteQueryBuilder() {
        queryGenerator = QueryGenerator.getInstance();
    }

    public static DeleteQueryBuilder getInstance() {
        return deleteQueryBuilder == null ? new DeleteQueryBuilder() : deleteQueryBuilder;
    }

    public String buildDeleteQuery(final DataConfigContainer dataConfigContainer) {
        final String tableName = dataConfigContainer.getTableName();
        final String whereCondition = queryGenerator.getWhereQuery(dataConfigContainer.getWhereClauses());

        return buildFinalQuery(tableName, whereCondition);
    }

    public String buildFinalQuery(final String tableName, final String whereCondition) {
        return String.join(" ", KeywordConstraints.DELETE.getValue(), KeywordConstraints.FROM.getValue(),
                tableName, KeywordConstraints.WHERE.getValue(), whereCondition);
    }
}
