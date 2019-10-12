package com.manchesterdigital;

public class RossoRestaurant {

    public static String getDish(CusineRossoRestaurant foodType) {


        if (foodType.equals(CusineRossoRestaurant.MEXICAN)) {
            return "Tacos, Burrito";
        } else if (foodType.equals(CusineRossoRestaurant.INDIAN)) {
            return "Tandoori Chicken, Bhuna Ghosht";
        } else if (foodType.equals(CusineRossoRestaurant.PAN_ASIAN)){
            return "Stir Fry Noodles, Dimsum";
        } else {
            return "Beef Wellington, Fish and Chips";
        }

    }
}

