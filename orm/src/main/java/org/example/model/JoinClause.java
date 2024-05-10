package org.example.model;

public class JoinClause {

    private String leftTable;
    private String rightTable;
    private String leftColumn;
    private String rightColumn;
    private JoinType joinType;

    public JoinType getJoinType() {
        return joinType;
    }

    public String getRightColumn() {
        return rightColumn;
    }

    public String getLeftColumn() {
        return leftColumn;
    }

    public String getRightTable() {
        return rightTable;
    }

    public String getLeftTable() {
        return leftTable;
    }

    public void setJoinType(final JoinType joinType) {
        this.joinType = joinType;
    }

    public void setLeftColumn(final String leftColumn) {
        this.leftColumn = leftColumn;
    }

    public void setLeftTable(final String leftTable) {
        this.leftTable = leftTable;
    }

    public void setRightColumn(final String rightColumn) {
        this.rightColumn = rightColumn;
    }

    public void setRightTable(final String rightTable) {
        this.rightTable = rightTable;
    }
}
