package com.thoughtworks;

import java.util.ArrayList;

public class Render {
    private ArrayList<SelectedDish> selectedDishes;
    private double discountTotal;
    private String description;

    public Render(ArrayList<SelectedDish> selectedDishes, double discountTotal, String description) {
        this.selectedDishes = selectedDishes;
        this.discountTotal = discountTotal;
        this.description = description;
    }

    public String getReceipt() {
        String info = "";
        for (SelectedDish selectedDish : selectedDishes) {
            info = info + selectedDish.getName() + " x " + selectedDish.getCount()
                        + " = " + (int)(selectedDish.getPrice() * selectedDish.getCount()) + "元\n";
        }
        return  "============= 订餐明细 =============\n"
                + info
                + "-----------------------------------\n"
                + description
                + "总计：" + (int)discountTotal + "元\n"
                + "===================================";
    }
}
