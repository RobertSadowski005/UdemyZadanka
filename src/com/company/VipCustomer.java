package com.company;

public class VipCustomer {

    private String vipCustomerName;
    private double vipCeditLimit;
    private String vipCustomerEmailAdress;

    public VipCustomer() {
        this("Default value name", 99999, "default@email.com");
    }

    public VipCustomer(String vipCustomerName, double vipCeditLimit) {
        this(vipCustomerName,vipCeditLimit,"Default@mail.com");
    }

    public VipCustomer(String vipCustomerName, double vipCeditLimit, String vipCustomerEmailAdress) {
        this.vipCustomerName = vipCustomerName;
        this.vipCeditLimit = vipCeditLimit;
        this.vipCustomerEmailAdress = vipCustomerEmailAdress;
    }

    public String getVipCustomerName() {
        return vipCustomerName;
    }

    public double getVipCeditLimit() {
        return vipCeditLimit;
    }

    public String getVipCustomerEmailAdress() {
        return vipCustomerEmailAdress;
    }
}
