package com.pricing;

import java.util.List;

public class PricingEngine {
    
    public double calculate(List<Double> prices, List<Integer> quantities, String customerType, String discountCode) {
        double subtotal = calculateSubtotal(prices, quantities);
        double discount = getDiscountStrategy(customerType).calculateDiscount(subtotal, discountCode);
        double tax = TaxCalculator.calculateTax(subtotal - discount);
        return subtotal - discount + tax;
    }
    
    private double calculateSubtotal(List<Double> prices, List<Integer> quantities) {
        double subtotal = 0;
        for (int i = 0; i < prices.size(); i++) {
            subtotal += prices.get(i) * quantities.get(i);
        }
        return subtotal;
    }
    
    private DiscountStrategy getDiscountStrategy(String customerType) {
        if (customerType.equals("VIP")) {
            return new VipDiscount();
        }
        return new RegularDiscount();
    }
}