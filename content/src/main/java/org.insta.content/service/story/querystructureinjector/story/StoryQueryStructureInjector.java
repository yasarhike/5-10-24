package org.insta.content.service.story.querystructureinjector.story;

import org.example.DeleteQueryBuilder;
import org.example.model.Column;

public class StoryQueryStructureInjector {

    private static StoryQueryStructureInjector storyQueryStructureInjector;
    private final DeleteQueryBuilder deleteQueryBuilder;

    private StoryQueryStructureInjector() {
        deleteQueryBuilder = DeleteQueryBuilder.getInstance();
    }

    public static StoryQueryStructureInjector getInstance() {
        return storyQueryStructureInjector == null ? new StoryQueryStructureInjector() : storyQueryStructureInjector;
    }

    public String getDeleteQuery() {
        return deleteQueryBuilder.buildDeleteQuery(new Column("id", "story"));
    }
}
