package org.insta.content.service.querystructureinjector.reel.share;

import org.example.DeleteQueryBuilder;
import org.example.model.Column;

public class ReelShareQueryStructureInjector {

    private static ReelShareQueryStructureInjector reelShareQueryStructureInjector;
    private final DeleteQueryBuilder deleteQueryBuilder;

    private ReelShareQueryStructureInjector() {
        deleteQueryBuilder = DeleteQueryBuilder.getInstance();
    }

    public static ReelShareQueryStructureInjector getInstance() {
        return reelShareQueryStructureInjector == null ? new ReelShareQueryStructureInjector() : reelShareQueryStructureInjector;
    }

    public String getDeleteQuery() {
        return deleteQueryBuilder.buildDeleteQuery(new Column("id", "reel_share"));
    }
}
