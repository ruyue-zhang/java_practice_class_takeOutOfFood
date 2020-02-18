package com.thoughtworks;


import java.util.ArrayList;
import java.util.List;


public class ParsingUserInput {
    private String input;

    public ParsingUserInput(String input) {
        this.input = input;
    }

    public ArrayList<SelectedDish> getSelectedDishList() {
        ArrayList<SelectedDish> selectedDishes = new ArrayList<>();
        String[] singleArray = input.split(",");
        for (String s : singleArray) {
            String[] arr = s.split(" x ");
            selectedDishes.add(new SelectedDish(arr[0], Integer.parseInt(arr[1])));
        }
        List<Dish> dataList = DataProvider.getDishes();
        for (SelectedDish selectedDish : selectedDishes) {
            for (Dish dish : dataList) {
                if(selectedDish.getId().equals(dish.getId())) {
                    selectedDish.setName(dish.getName());
                    selectedDish.setPrice(dish.getPrice());
                }
            }
        }
        //System.out.println(selectedDishes);
        return selectedDishes;
    }

}
