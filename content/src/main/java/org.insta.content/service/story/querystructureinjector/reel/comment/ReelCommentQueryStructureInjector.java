package org.insta.content.service.story.querystructureinjector.reel.comment;

import org.example.DeleteQueryBuilder;
import org.example.model.Column;

public class ReelCommentQueryStructureInjector {

    private static ReelCommentQueryStructureInjector reelCommentQueryStructureInjector;
    private final DeleteQueryBuilder deleteQueryBuilder;

    private ReelCommentQueryStructureInjector() {
        deleteQueryBuilder = DeleteQueryBuilder.getInstance();
    }

    public static ReelCommentQueryStructureInjector getInstance() {
        return reelCommentQueryStructureInjector == null ? new ReelCommentQueryStructureInjector() : reelCommentQueryStructureInjector;
    }

    public String getDeleteQuery() {
        return deleteQueryBuilder.buildDeleteQuery(new Column("id", "reel_comment"));
    }
}
