package com.bjsxt.strategy;

public class OldCustomerFewStartegy implements Strategy{

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("�����ۣ�");
        return standardPrice*0.85;

    }
}
