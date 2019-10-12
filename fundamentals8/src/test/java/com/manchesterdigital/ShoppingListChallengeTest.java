package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;

public class ShoppingListChallengeTest {

    /* Given what you have learnt so far, build a shopping list program that:
            * Adds an item.
            * Removes an item.
            * Updates an item.
            * Retrieves an item.
            * Retrieves all items.

    Prints all items in the shopping list at any point.

    No cheating. For now I am not interested in interactive behaviour so just
    hard code values to run the code.

    TDD only.
     */

    @Test
    public void checkShoppingArrayListExistsEmpty() {
        // ShoppingListChallenge shoppingList = new ShoppingListChallenge();
        ArrayList<String> arrayShoppingList = new ArrayList<>();

        ArrayList result = ShoppingListChallenge.containsList(arrayShoppingList);

        Assertions.assertThat(result).isEqualTo(arrayShoppingList);

    }

    @Test
    public void checkItemAppleExistsWithinArray() {

        // Arrange
        ArrayList<String> arrayShoppingList = new ArrayList<>();
        arrayShoppingList.add("Apple");

        // Act
        ArrayList result = ShoppingListChallenge.containsList(arrayShoppingList);

        // Assert
        Assertions.assertThat(result).contains("Apple");
    }


    @Test
    public void addItemToArrayList() {
        ArrayList<String> arrayShoppingList = new ArrayList<>();
        String item = "Test";

        // ArrayList result = ShoppingListChallenge.addItem(arrayShoppingList, item);
    }
}



/*
    @Test
    public void checkItemAppleExists() {
        String item = "Apple";
        // Act
        String shoppingList = ShoppingListChallenge.exists(item);
        // Arrange
        Assertions.assertThat(shoppingList.contains(item));
    }

    @Test
    public void checkItemBananaExists() {
        String item = "Banana";
        // Act
        String shoppingList = ShoppingListChallenge.exists(item);
        // Arrange
        Assertions.assertThat(shoppingList.contains(item));
    }

 */


