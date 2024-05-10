package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class JoinQueryBuilder {

    private static JoinQueryBuilder joinQueryBuilder;

    private JoinQueryBuilder() {
    }

    public static JoinQueryBuilder getInstance() {
        return joinQueryBuilder == null ? new JoinQueryBuilder() : joinQueryBuilder;
    }

    public String buildJoinQuery(final List<JoinClause> joinClauseList, final String tableName) {
        final List<String> resultSet = new ArrayList<>();

        if(joinClauseList != null) {
            for (final JoinClause joinClause : joinClauseList) {
                resultSet.add(String.join(" ", joinClause.getJoinType().getValue(), tableName,
                        KeywordConstraints.ON.getValue(), buildDotPart(joinClause.getLeftTable(), joinClause.getLeftColumn()),
                        KeywordConstraints.EQUALS.getValue(), buildDotPart(joinClause.getRightTable(), joinClause.getRightColumn())));
            }
        }

        return String.join(" ", resultSet);
    }

    public String buildDotPart(final String columnOne, final String columnTwo) {
        return String.join("", columnOne, ".", columnTwo);
    }
}
