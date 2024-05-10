package org.example.model;

public class SubQueryDef {

    private KeywordConstraints subQueryLocation;
    private String prevNodeName;

    public void setSubQueryLocation(final KeywordConstraints subQueryLocation) {
        this.subQueryLocation = subQueryLocation;
    }

    public KeywordConstraints getSubQueryLocation() {
        return subQueryLocation;
    }
}
