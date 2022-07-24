package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {
    private Category foodCategory;
    private Purchase hotDog;
    private Purchase burger;
    private User noel;

@BeforeEach
    public void setUp(){
    foodCategory = new Category("food category", 25);
    hotDog = new Purchase("Hot dog", 5);
    burger = new Purchase("Burger", 6);
    noel = new User(100, "Noel");
}

@Test
    public void testCategory() {
    assertEquals(0, foodCategory.getListPurchases().size());
    assertEquals("food category", foodCategory.getName());
    assertEquals(25, foodCategory.getPercent());
    assertEquals(0, foodCategory.getRemainingMoney());
}

@Test
    public void testUpdateMoneyAvailableInCategory() {
    foodCategory.updateMoneyAvailableInCategory(noel);
    assertEquals(25, foodCategory.getRemainingMoney());
}

@Test
    public void testMoneyRemainingInCategory() {
    foodCategory.addPurchase(hotDog);
    foodCategory.addPurchase(burger);
    assertEquals(14, foodCategory.moneyRemainingInCategory());
}

@Test
    public void testMoneySpentInCategory() {
    foodCategory.addPurchase(burger);
    foodCategory.addPurchase(hotDog);
    assertEquals(11, foodCategory.moneySpentInCategory());
}

@Test
    public void testAddPurchase() {
    foodCategory.addPurchase(hotDog);
    assertEquals(1, foodCategory.getListPurchases().size());
    assertTrue(foodCategory.getListPurchases().contains(hotDog));
}

@Test
    public void testRemovePurchaseSuccess() {
    foodCategory.addPurchase(hotDog);
    assertTrue(foodCategory.removePurchase(hotDog));
    assertFalse(foodCategory.getListPurchases().contains(hotDog));
}

    @Test
    public void testRemovePurchaseFailure() {
    foodCategory.addPurchase(burger);
    assertFalse(foodCategory.removePurchase(hotDog));
    }

    @Test
    public void testFeedbackRemovePurchaseSuccess() {
    foodCategory.addPurchase()
    }
}