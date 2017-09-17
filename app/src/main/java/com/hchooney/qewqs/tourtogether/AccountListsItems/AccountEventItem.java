package com.hchooney.qewqs.tourtogether.AccountListsItems;

/**
 * Created by qewqs on 2017-09-16.
 */

public class AccountEventItem {
    private String Title;
    private String Who;
    private String DeadLine;
    private String ImageUrl;

    public AccountEventItem( ) {
        Title = "";
        Who = "";
        DeadLine = "";
        ImageUrl = "";
    }

    public AccountEventItem(String title, String who, String deadLine, String imageUrl) {
        Title = title;
        Who = who;
        DeadLine = deadLine;
        ImageUrl = imageUrl;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getWho() {
        return Who;
    }

    public void setWho(String who) {
        Who = who;
    }

    public String getDeadLine() {
        return DeadLine;
    }

    public void setDeadLine(String deadLine) {
        DeadLine = deadLine;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }
}
