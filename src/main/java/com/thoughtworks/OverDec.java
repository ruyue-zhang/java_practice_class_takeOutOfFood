package com.thoughtworks;


public class OverDec implements Discount{
    private double totalPrice;

    public OverDec(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public double getDiscountedPrice() {
        return totalPrice >= 30 ? totalPrice - 6 : totalPrice;
    }

    @Override
    public String getDescription() {
        return  "使用优惠:\n"
                + "满30减6元，省"+ (totalPrice - getDiscountedPrice() ) +"元\n"
                + "-----------------------------------\n";
    }
}
