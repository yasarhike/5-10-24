package org.insta.content.service.story.querystructureinjector.reel.like;

import org.example.DeleteQueryBuilder;
import org.example.model.Column;

public class ReelLikeQueryStructureInjector {

    private static ReelLikeQueryStructureInjector reelLikeQueryStructureInjector;
    private final DeleteQueryBuilder deleteQueryBuilder;

    private ReelLikeQueryStructureInjector() {
        deleteQueryBuilder = DeleteQueryBuilder.getInstance();
    }

    public static ReelLikeQueryStructureInjector getInstance() {
        return reelLikeQueryStructureInjector == null ? new ReelLikeQueryStructureInjector() : reelLikeQueryStructureInjector;
    }

    public String getDeleteQuery() {
        return deleteQueryBuilder.buildDeleteQuery(new Column("id", "reel_Like"));
    }
}
