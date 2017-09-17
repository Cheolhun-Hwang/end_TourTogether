package com.hchooney.qewqs.tourtogether.AccountListsItems;

/**
 * Created by qewqs on 2017-09-16.
 */

public class AccountClipsItem {
    private String Title;
    private String ImageUrl;

    public AccountClipsItem() {
        Title = "";
        ImageUrl = "null";
    }

    public AccountClipsItem(String title) {
        Title = title;
        ImageUrl = "null";
    }

    public AccountClipsItem(String title, String imageUrl) {
        Title = title;
        ImageUrl = imageUrl;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }
}
