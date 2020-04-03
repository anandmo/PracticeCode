package com.codethinktank.callcenter;

public class offlineEmp extends CallCenterEmp implements Laptop {

    private boolean workFromHome;

    @Override
    public void useLaptop() {
        System.out.println("Using Laptop");
    }

    public boolean isWorkFromHome() {
        return workFromHome;
    }

    public void setWorkFromHome(boolean workFromHome) {
        this.workFromHome = workFromHome;
    }
}
