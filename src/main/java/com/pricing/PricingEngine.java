package com.pricing;

import java.util.List;

public class PricingEngine {
    
    public double calculate(double[] prices, int[] quantities, String customerType, String discountCode) {
        // Calculate subtotal
        double subtotal = 0;
        for (int i = 0; i < prices.length; i++) {
            subtotal = subtotal + (prices[i] * quantities[i]);
        }
        
        // Calculate discount
        double discount = 0;
        if (customerType.equals("VIP")) {
            if (discountCode.equals("SAVE10")) {
                discount = subtotal * 0.1;
            } else if (discountCode.equals("SAVE20")) {
                discount = subtotal * 0.2;
            } else {
                discount = subtotal * 0.05;
            }
        } else {
            if (discountCode.equals("SAVE10")) {
                discount = subtotal * 0.05;
            } else if (discountCode.equals("SAVE20")) {
                discount = subtotal * 0.1;
            } else {
                discount = 0;
            }
        }
        
        // Calculate tax (10%)
        double tax = (subtotal - discount) * 0.1;
        
        // Final price
        double finalPrice = subtotal - discount + tax;
        
        // Print everything (bad design!)
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Discount: $" + discount);
        System.out.println("Tax: $" + tax);
        System.out.println("Final Price: $" + finalPrice);
        
        return finalPrice;
    }
}