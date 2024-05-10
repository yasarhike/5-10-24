package org.insta.content.service.querystructureinjector.story.like;

import org.example.DeleteQueryBuilder;
import org.example.model.Column;

public class StoryLikeQueryStructureInjector {

    private static StoryLikeQueryStructureInjector storyLikeQueryStructureInjector;
    private final DeleteQueryBuilder deleteQueryBuilder;

    private StoryLikeQueryStructureInjector() {
        deleteQueryBuilder = DeleteQueryBuilder.getInstance();
    }

    public static StoryLikeQueryStructureInjector getInstance() {
        return storyLikeQueryStructureInjector == null ? new StoryLikeQueryStructureInjector() : storyLikeQueryStructureInjector;
    }

    public String getDeleteQuery() {
        return deleteQueryBuilder.buildDeleteQuery(new Column("id", "story_like"));
    }
}
