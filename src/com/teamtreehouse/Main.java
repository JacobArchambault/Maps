package com.teamtreehouse;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> meals = new HashMap<>();
        meals.put("breakfast", "Eggs");
        meals.put("lunch", "Pizza");
        meals.put("dinner", "Steak");

        System.out.println(meals.get("Dinner"));

        String lunch = meals.remove("lunch");

        boolean hasLunch = meals.containsKey("lunch");
        boolean hasPizza = meals.containsValue("Pizza");
        int size = meals.size();
        System.out.println(lunch + " " + hasLunch +  " " + hasPizza + " " + size);

    }
}
