package com.groundgurus.day2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jhomar
 */
public class WineShopTest {
    @Test
    public void testSomeMethod() {
        WineShop wineshop = new WineShop("Juan's Wine Shop",
                new String[] {"Wine 1", "Wine 2", "Wine 3"},"123ABC, 1st street, Mandaluyong, C", 5, false);
        
        assertEquals(false, wineshop.isAreMinorsAllowed());
    }
    
}
