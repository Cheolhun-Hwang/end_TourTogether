package com.hchooney.qewqs.tourtogether.ColumnItem;

/**
 * Created by qewqs on 2017-09-16.
 */

public class ColumnItems {
    private String Title;
    private String ImageUrl;

    public ColumnItems() {
        Title = "";
        ImageUrl = "null";
    }

    public ColumnItems(String title) {
        Title = title;
        ImageUrl = "null";
    }

    public ColumnItems(String title, String imageUrl) {
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
