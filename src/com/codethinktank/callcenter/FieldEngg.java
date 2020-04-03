package com.codethinktank.callcenter;

public class FieldEngg extends FrontLineEngg {

    private boolean onField;
    private String location;


    public boolean isOnField() {
        return onField;
    }

    public void setOnField(boolean onField) {
        this.onField = onField;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
