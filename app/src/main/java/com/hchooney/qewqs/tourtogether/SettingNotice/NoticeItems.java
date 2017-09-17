package com.hchooney.qewqs.tourtogether.SettingNotice;

/**
 * Created by qewqs on 2017-09-16.
 */

public class NoticeItems {
    private String Filter;
    private String Title;
    private String When;

    public NoticeItems() {
        Filter = "공지";
        Title = "Title";
        When = "2017.00.00";
    }


    public NoticeItems(String filter, String title, String when) {
        Filter = filter;
        Title = title;
        When = when;
    }

    public String getFilter() {
        return Filter;
    }

    public void setFilter(String filter) {
        Filter = filter;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getWhen() {
        return When;
    }

    public void setWhen(String when) {
        When = when;
    }
}
