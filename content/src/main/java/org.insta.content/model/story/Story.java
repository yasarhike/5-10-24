package org.insta.content.model.story;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.insta.content.groups.StoryValidator;
import org.insta.content.model.common.Common;
import org.insta.content.model.home.Media;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * <p>
 * Represents a story.
 * </p>
 *
 * <p>
 * This class defines properties for a story, including the story ID, user ID,
 * content ID, and the story content itself.
 * </p>
 *
 * @author Mohamed Yasar
 * @version 1.0 6 Feb 2024
 * @see Common
 */
@Entity
@Table(name = "story")
public final class Story {

    @Id
    @Positive(message = "Story id must be in positive", groups = StoryValidator.class)
    private int id;

    @Column(name = "is_private")
    @NotNull(message = "Is private mst not be null", groups = StoryValidator.class)
    private boolean isPrivate;

    private Media media;

    @Column(name = "music")
    @NotNull(message = "Music field must not be null", groups = StoryValidator.class)
    private String music;

    @Column(name = "caption")
    @NotNull(message = "Text field must not be null", groups = StoryValidator.class)
    private String text;

    @Column(name = "user_id")
    @Positive(message = "User id must be in positive", groups = StoryValidator.class)
    private int userId;

    @Column(name = "username")
    @NotNull(message = "User name must not be null", groups = StoryValidator.class)
    private String userName;

    @Column(name = "timestamp")
    private Timestamp timestamp;

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(final boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(final String music) {
        this.music = music;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(final int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public int getStoryId() {
        return id;
    }

    public void setStoryId(final int storyId) {
        this.id = storyId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(final Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
