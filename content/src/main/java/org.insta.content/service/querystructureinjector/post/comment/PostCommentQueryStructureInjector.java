package org.insta.content.service.querystructureinjector.post.comment;

import org.example.DeleteQueryBuilder;
import org.example.model.Column;

public class PostCommentQueryStructureInjector {

    private static PostCommentQueryStructureInjector postCommentQueryStructureInjector;
    private final DeleteQueryBuilder deleteQueryBuilder;

    private PostCommentQueryStructureInjector() {
        deleteQueryBuilder = DeleteQueryBuilder.getInstance();
    }

    public static PostCommentQueryStructureInjector getInstance() {
        return postCommentQueryStructureInjector == null ? new PostCommentQueryStructureInjector() : postCommentQueryStructureInjector;
    }

    public String getDeleteQuery() {
        return deleteQueryBuilder.buildDeleteQuery(new Column("id", "post_comment"));
    }
}
