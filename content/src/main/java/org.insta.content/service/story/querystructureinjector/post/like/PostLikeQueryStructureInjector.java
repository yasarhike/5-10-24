package org.insta.content.service.story.querystructureinjector.post.like;

import org.example.DeleteQueryBuilder;
import org.example.model.Column;

public class PostLikeQueryStructureInjector {

    private static PostLikeQueryStructureInjector postLikeQueryStructureInjector;
    private final DeleteQueryBuilder deleteQueryBuilder;

    private PostLikeQueryStructureInjector() {
        deleteQueryBuilder = DeleteQueryBuilder.getInstance();
    }

    public PostLikeQueryStructureInjector getInstance() {
        return postLikeQueryStructureInjector == null ? new PostLikeQueryStructureInjector() : postLikeQueryStructureInjector;
    }

    public String getDeleteQuery() {
        return deleteQueryBuilder.buildDeleteQuery(new Column("id", "post_like"));
    }
}
