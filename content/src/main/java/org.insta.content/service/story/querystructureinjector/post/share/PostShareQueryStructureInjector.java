package org.insta.content.service.story.querystructureinjector.post.share;

import org.example.DeleteQueryBuilder;
import org.example.model.Column;

public class PostShareQueryStructureInjector {

    private static PostShareQueryStructureInjector postShareQueryStructureInjector;
    private final DeleteQueryBuilder deleteQueryBuilder;

    private PostShareQueryStructureInjector() {
        deleteQueryBuilder = DeleteQueryBuilder.getInstance();
    }

    public static PostShareQueryStructureInjector getInstance() {
        return postShareQueryStructureInjector == null ? new PostShareQueryStructureInjector() : postShareQueryStructureInjector;
    }

    public String getDeleteQuery() {
        return deleteQueryBuilder.buildDeleteQuery(new Column("id", "post_share"));
    }
}
