/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdev;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author George Aziz
 */
public class DiscountRateTest {

    /**
     * Test of getServiceDiscountRate method, of class DiscountRate.
     */
    @Test
    public void testGetServiceDiscountRate() {
        System.out.println("getServiceDiscountRate");
        String type = "Premium";
        double expResult = 0.2;
        double result = DiscountRate.getServiceDiscountRate(type);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of getServiceDiscountRate method, of class DiscountRate.
     */
    @Test
    public void testGetServiceDiscountRate2() {
        System.out.println("getServiceDiscountRate");
        String type = "Gold";
        double expResult = 0.15;
        double result = DiscountRate.getServiceDiscountRate(type);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of getServiceDiscountRate method, of class DiscountRate.
     */
    @Test
    public void testGetServiceDiscountRate3() {
        System.out.println("getServiceDiscountRate");
        String type = "Silver";
        double expResult = 0.10;
        double result = DiscountRate.getServiceDiscountRate(type);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of getProductDiscountRate method, of class DiscountRate.
     */
    @Test
    public void testGetProductDiscountRate() {
        System.out.println("getProductDiscountRate");
        String type = "Premium";
        double expResult = 0.2;
        double result = DiscountRate.getProductDiscountRate(type);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of getProductDiscountRate method, of class DiscountRate.
     */
    @Test
    public void testGetProductDiscountRate2() {
        System.out.println("getProductDiscountRate");
        String type = "Gold";
        double expResult = 0.15;
        double result = DiscountRate.getProductDiscountRate(type);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of getProductDiscountRate method, of class DiscountRate.
     */
    @Test
    public void testGetProductDiscountRate3() {
        System.out.println("getProductDiscountRate");
        String type = "Silver";
        double expResult = 0.1;
        double result = DiscountRate.getProductDiscountRate(type);
        assertEquals(expResult, result, 0.0);
    }
}
