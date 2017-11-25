package com.hchooney.qewqs.tourtogether.Columns;

/**
 * Created by hooney on 2017. 11. 18..
 */

public class ColumnItem {
    private String ID;

    private String Title;
    private String Context;
    private String Date;

    private String ImageURL;

    public ColumnItem() {
        this.ID = "";
        this.Title = "";
        this.Context = "";
        this.Date = "";
        this.ImageURL = "";
    }

    public ColumnItem(String ID, String title, String context, String date, String imageURL) {
        this.ID = ID;
        this.Title = title;
        this.Context = context;
        this.Date = date;
        this.ImageURL = imageURL;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContext() {
        return Context;
    }

    public void setContext(String context) {
        Context = context;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }
}
