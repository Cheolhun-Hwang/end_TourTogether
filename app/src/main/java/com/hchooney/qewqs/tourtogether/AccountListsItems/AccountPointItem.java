package com.hchooney.qewqs.tourtogether.AccountListsItems;

/**
 * Created by qewqs on 2017-09-16.
 */

public class AccountPointItem {
    private String When;
    private String How;
    private String Point;
    private boolean AddOrSub;

    public AccountPointItem() {
        When = "";
        How = "";
        Point = "";
        AddOrSub = false;
    }

    public AccountPointItem(boolean addOrSub) {
        When = "";
        How = "";
        Point = "";
        AddOrSub = addOrSub;
    }

    public AccountPointItem(String when, String how, String point, boolean addOrSub) {
        When = when;
        How = how;
        Point = point;
        AddOrSub = addOrSub;
    }

    public String getWhen() {
        return When;
    }

    public void setWhen(String when) {
        When = when;
    }

    public String getHow() {
        return How;
    }

    public void setHow(String how) {
        How = how;
    }

    public String getPoint() {
        return Point;
    }

    public void setPoint(String point) {
        Point = point;
    }

    public boolean isAddOrSub() {
        return AddOrSub;
    }

    public void setAddOrSub(boolean addOrSub) {
        AddOrSub = addOrSub;
    }
}
