package com.letr1x3n.stickerworld.domain.util;

import com.letr1x3n.stickerworld.domain.User;

public abstract class MessageHelper {
    public static String getAuthorName(User author) {
        return author != null ? author.getUsername() : "<none>";
    }
}
