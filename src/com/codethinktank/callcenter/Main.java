package com.codethinktank.callcenter;

public class Main {

    public static void main(String[] args) {

        CallCenterEmp emp = new EscalationEngg();

        emp.setName("Anand M");
        emp.setSalary("100000");

        EscalationEngg escEmp = (EscalationEngg)emp;
        escEmp.startDevAnalysis();

        System.out.println(escEmp.getName());
        System.out.println(escEmp.getSalary());

        Manager m = new Manager();
        m.grantLeave();




    }
}
