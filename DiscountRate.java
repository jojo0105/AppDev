/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdev;

/**
 * Assignment 1
 * @author George Aziz 2070513
 * For Application Development 2 (Mobile) - Winter 2022
 * 
 * A Discount Rate class that identifies the amount of discount based on the member type
 */
public class DiscountRate {
    
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.2;
    private static double productDiscountGold = 0.15;
    private static double productDiscountSilver = 0.1;
    
    /**
     * Calculate the service rate based on the member type level
     * @param type the member type level
     * @return the rate
     */
    public static double getServiceDiscountRate(String type) {
        switch (type) {
            case "Premium":
                return serviceDiscountPremium;
            case "Gold":
                return serviceDiscountGold;
            case "Silver":
                return serviceDiscountSilver;
            default:
                throw new IllegalArgumentException("wrong member type specified");
        }
    }

    /**
     * Calculate the product rate based on the member type level
     * @param type the member type level
     * @return the rate
     */
    public static double getProductDiscountRate(String type) {
        switch (type) {
            case "Premium":
                return productDiscountPremium;
            case "Gold":
                return productDiscountGold;
            case "Silver":
                return productDiscountSilver;
            default:
                throw new IllegalArgumentException("wrong member type specified");
        }
    }
}
