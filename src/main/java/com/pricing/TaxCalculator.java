package com.pricing;

public class TaxCalculator {
    private static final double TAX_RATE = 0.1;
    
    public static double calculateTax(double amount) {
        return amount * TAX_RATE;
    }
}