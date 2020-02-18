package com.thoughtworks;


import java.util.ArrayList;
import java.util.List;

public class HalfPrice implements Discount {
    private double totalPrice;
    private ArrayList<SelectedDish> selectedDishes;
    StringBuilder halfPriceName = new StringBuilder();

    public HalfPrice(double totalPrice, ArrayList<SelectedDish> selectedDishes) {
        this.totalPrice = totalPrice;
        this.selectedDishes = selectedDishes;
    }

    @Override
    public double getDiscountedPrice() {
        List<String> halfPriceList = DataProvider.getHalfDishIds();
        for (SelectedDish selectedDish : selectedDishes) {
            for (String s : halfPriceList) {
                if(selectedDish.getId().equals(s)) {
                    totalPrice -= selectedDish.getPrice() / 2 * selectedDish.getCount();
                    halfPriceName.append(selectedDish.getName()).append("，");
                }
            }
        }
        return totalPrice;
    }

    @Override
    public String getDescription() {
        return  "使用优惠:\n"
                + "指定菜品半价("+ halfPriceName.substring(0, halfPriceName.length() - 1) +")，省"
                + (totalPrice - getDiscountedPrice() ) +"元\n"
                + "-----------------------------------\n";
    }
}
