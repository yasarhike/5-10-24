package org.insta.content.service.querystructureinjector.story.share;

import org.example.DeleteQueryBuilder;
import org.example.model.Column;

public class StoryShareQueryStructureBuilder {

    private static StoryShareQueryStructureBuilder storyShareQueryStructureBuilder;
    private final DeleteQueryBuilder deleteQueryBuilder;

    private StoryShareQueryStructureBuilder() {
        deleteQueryBuilder = DeleteQueryBuilder.getInstance();
    }

    public static StoryShareQueryStructureBuilder getInstance() {
        return storyShareQueryStructureBuilder == null ? new StoryShareQueryStructureBuilder() : storyShareQueryStructureBuilder;
    }

    public String getDeleteQuery() {
        return deleteQueryBuilder.buildDeleteQuery(new Column("id", "story_share"));
    }
}
