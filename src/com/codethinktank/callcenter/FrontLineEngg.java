package com.codethinktank.callcenter;

public class FrontLineEngg extends CallCenterEmp {

    private String techSkill;


    public void takeCall() {

        System.out.println("Engg took the call");
    }

    public void dropCall() {

        System.out.println("Engg drop the call");
    }

    public String getTechSkill() {
        return techSkill;
    }

    public void setTechSkill(String techSkill) {
        this.techSkill = techSkill;
    }
}
