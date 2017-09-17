package com.hchooney.qewqs.tourtogether.AccountListsItems;

/**
 * Created by qewqs on 2017-09-16.
 */

public class AccountLikeListItem {
    private String CateOne;
    private String CateTwo;
    private String CateThree;

    private String Location;
    private String Address;
    private String ImageURL;

    public AccountLikeListItem() {
        CateOne = "";
        CateTwo = "";
        CateThree = "";
        Location = "";
        Address = "";
        ImageURL = "";
    }

    public AccountLikeListItem(String cateOne, String cateTwo, String cateThree, String location, String address) {
        CateOne = cateOne;
        CateTwo = cateTwo;
        CateThree = cateThree;
        Location = location;
        Address = address;
    }

    public AccountLikeListItem(String cateOne, String cateTwo, String cateThree, String location, String address, String imageURL) {
        CateOne = cateOne;
        CateTwo = cateTwo;
        CateThree = cateThree;
        Location = location;
        Address = address;
        ImageURL = imageURL;
    }

    public String getCateOne() {
        return CateOne;
    }

    public void setCateOne(String cateOne) {
        CateOne = cateOne;
    }

    public String getCateTwo() {
        return CateTwo;
    }

    public void setCateTwo(String cateTwo) {
        CateTwo = cateTwo;
    }

    public String getCateThree() {
        return CateThree;
    }

    public void setCateThree(String cateThree) {
        CateThree = cateThree;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }
}
