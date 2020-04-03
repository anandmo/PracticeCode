package com.codethinktank.callcenter;

public class TechSupportEngg extends FrontLineEngg {

    private boolean onBreak;

    public boolean isOnBreak() {
        return onBreak;
    }

    public void setOnBreak(boolean onBreak) {
        this.onBreak = onBreak;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
