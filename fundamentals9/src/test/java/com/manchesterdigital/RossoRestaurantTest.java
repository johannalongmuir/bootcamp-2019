package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RossoRestaurantTest {

    /*
    Rosso restaurant has a set number of dishes:
    Mexican Dishes: Taco, Burrito
    Indian Dishes: Tandoori Chicken, Bhuna Ghosht
    Pan Asian Dishes: Stir Fry Noodles, Dimsum
    English Dishes: Beef Wellington, Fish and Chips

    Your challenge is to create a program that can store these menu options
    and return them based on a criteria based on the type of dish.

    For example
    Requesting mexican, should return all mexican dishes and print them to console.

    For any dish not supported provide a meaningful response or a way of handling this edge case.

    TDD only.
     */


    @Test
    public void whenMexicanRequestedReturnsTacoBurrito() {
        String mexican = "Mexican";

        String result = RossoRestaurant.getDish(mexican);

        Assertions.assertThat(result).isEqualTo("Tacos, Burrito");

    }


    @Test
    public void whenIndianRequestedReturnsTandooriChickenBhunaGhosht() {
        String mexican = "Indian";

        String result = RossoRestaurant.getDish(mexican);

        Assertions.assertThat(result).isEqualTo("Tandoori Chicken, Bhuna Ghosht");

    }
}
