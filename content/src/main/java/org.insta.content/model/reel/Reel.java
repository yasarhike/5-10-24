package org.insta.content.model.reel;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import org.insta.content.groups.ReelValidator;
import org.insta.content.model.common.Common;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.List;

/**
 * <p>
 * Represents a Reel.
 * </p>
 *
 * <p>
 * This class defines properties for a reel, including the reel ID, user ID,
 * content ID, and the reel itself.
 * </p>
 *
 * @author Mohamed Yasar
 * @version 1.0 6 Feb 2024
 * @see Common
 */
@Entity
public final class Reel extends Common {

    @Id
    private int id;
    @Positive(message = "User id must be positive", groups = ReelValidator.class)
    private int userId;
    @NotNull(message = "Caption must not be null", groups = ReelValidator.class)
    private String caption;
    @NotNull(message = "Is private must not be null", groups = ReelValidator.class)
    private boolean isPrivate;
    @Positive(message = "Reel id must  be positive", groups = ReelValidator.class)
    private int reelId;
    @Positive(message = "Duration must be positive", groups = ReelValidator.class)
    private String duration;
    @NotNull(message = "User name must not be null", groups = ReelValidator.class)
    private String userName;
    @Positive(message = "Timestamp must be positive", groups = ReelValidator.class)
    private Timestamp timestamp;
    @PositiveOrZero(message = "Total likes must be positive", groups = ReelValidator.class)
    private int totalLikes;
    @PositiveOrZero(message = "Total comment must be positive", groups = ReelValidator.class)
    private int totalComment;
    @PositiveOrZero(message = "Total shares must be positive", groups = ReelValidator.class)
    private int totalShares;

    public Boolean isPrivate() {
        return isPrivate;
    }

    public int getReelId() {
        return reelId;
    }

    public void setReelId(final int reelId) {
        this.reelId = reelId;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(final String caption) {
        this.caption = caption;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(final String duration) {
        this.duration = duration;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(final Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public Boolean getPrivate() {
        return isPrivate;
    }

    public void setPrivate(final Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @PositiveOrZero(message = "Total comment must be positive", groups = ReelValidator.class)
    public int getTotalComment() {
        return totalComment;
    }

    @PositiveOrZero(message = "Total likes must be positive", groups = ReelValidator.class)
    public int getTotalLikes() {
        return totalLikes;
    }

    @PositiveOrZero(message = "Total shares must be positive", groups = ReelValidator.class)
    public int getTotalShares() {
        return totalShares;
    }

    public void setTotalComment(@PositiveOrZero(message = "Total comment must be positive", groups = ReelValidator.class) int totalComment) {
        this.totalComment = totalComment;
    }

    public void setTotalLikes(@PositiveOrZero(message = "Total likes must be positive", groups = ReelValidator.class) int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public void setTotalShares(@PositiveOrZero(message = "Total shares must be positive", groups = ReelValidator.class) int totalShares) {
        this.totalShares = totalShares;
    }
}

