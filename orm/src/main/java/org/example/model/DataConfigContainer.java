package org.example.model;

import java.util.List;

public class DataConfigContainer {

   private String tableName;
   private List<Column> columnList;
   private List<JoinClause> joinClauseList;
   private List<WhereClause> whereClauses;
   private List<SubQueryClause> subQueryClauses;
   private List<AggregiateFunction> aggregiateFunctions;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<Column> getColumnList() {
        return columnList;
    }

    public void setColumnList(final List<Column> columnList) {
        this.columnList = columnList;
    }

    public List<JoinClause> getJoinClauseList() {
        return joinClauseList;
    }

    public void setJoinClauseList(List<JoinClause> joinClauseList) {
        this.joinClauseList = joinClauseList;
    }

    public List<WhereClause> getWhereClauses() {
        return whereClauses;
    }

    public void setWhereClauses(final List<WhereClause> whereClauses) {
        this.whereClauses = whereClauses;
    }

    public void setSubQueryClauses(final List<SubQueryClause> subQueryClauses) {
        this.subQueryClauses = subQueryClauses;
    }

    public List<SubQueryClause> getSubQueryClauses() {
        return subQueryClauses;
    }

    public List<AggregiateFunction> getAggregiateFunctions() {
        return aggregiateFunctions;
    }

    public void setAggregiateFunctions(final List<AggregiateFunction> aggregiateFunctions) {
        this.aggregiateFunctions = aggregiateFunctions;
    }
}

