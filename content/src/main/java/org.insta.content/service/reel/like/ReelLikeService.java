package org.insta.content.service.reel.like;

/**
 * <p>
 * Managing user reel likes.
 * </p>
 *
 * <p>
 * This interface defines methods for adding and removing likes on reels, allowing users to like and unlike reels.
 * </p>
 *
 * @author Mohamed Yasar
 * @version 1.0 6 Feb 2024
 * @see ReelLikeServiceImpl
 */
public interface ReelLikeService {

    /**
     * <p>
     * Add a like for the particular reel.
     * </p>
     *
     * @param reelId Refers to the ID of the reel.
     * @param userId Refers to the ID of the user.
     * @return A byte array representing the result of the operation.
     */
    byte[] reelLike(final int reelId, final int userId);

    /**
     * <p>
     * Unlike a particular reel.
     * </p>
     *
     * @param id Refers to the ID of the reel.
     * @return A byte array representing the result of the operation.
     */
    byte[] reelUnlike(final int id);
}
