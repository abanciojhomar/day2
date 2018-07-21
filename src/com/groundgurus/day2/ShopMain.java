package com.groundgurus.day2;

/**
 *
 * @author Jhomar
 */
public class ShopMain {
    public static void main(String[] args) {
        Shop wineShop = new WineShop("Juan's Wine Shop",new String[] {"Wine 1", "Wine 2", "Wine 3"},"123ABC, 1st street, Mandaluyong, C", 5, false);
        wineShop.printDetails();
    }
}
