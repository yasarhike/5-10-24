package org.insta.content.service.story.querystructureinjector.post;

import org.example.DeleteQueryBuilder;
import org.example.model.Column;

public class PostQueryStructureInjector {

    private static PostQueryStructureInjector postQueryStructureInjector;
    private final DeleteQueryBuilder deleteQueryBuilder;

    private PostQueryStructureInjector() {
        deleteQueryBuilder = DeleteQueryBuilder.getInstance();
    }

    public static PostQueryStructureInjector getInstance() {
        return postQueryStructureInjector == null ? new PostQueryStructureInjector() : postQueryStructureInjector;
    }

    public String getDeleteQuery() {
        return deleteQueryBuilder.buildDeleteQuery(new Column("id", "post"));
    }
}
