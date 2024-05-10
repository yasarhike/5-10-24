package org.insta.content.service.querystructureinjector.reel;

import org.example.DeleteQueryBuilder;
import org.example.model.Column;

public class ReelQueryStructureInjector {

    private static ReelQueryStructureInjector reelQueryStructureInjector;
    private final DeleteQueryBuilder deleteQueryBuilder;

    private ReelQueryStructureInjector() {
        deleteQueryBuilder = DeleteQueryBuilder.getInstance();
    }

    public static ReelQueryStructureInjector getInstance() {
        return reelQueryStructureInjector == null ? new ReelQueryStructureInjector() : reelQueryStructureInjector;
    }

    public String getDeleteQuery() {
        return deleteQueryBuilder.buildDeleteQuery(new Column("id", "reels"));
    }
}
