package com.pricing;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PricingEngine engine = new PricingEngine();
        
        List<Double> prices = List.of(100.0, 50.0, 30.0);
        List<Integer> quantities = List.of(2, 1, 3);
        
        double finalPrice = engine.calculate(prices, quantities, "VIP", "SAVE20");
        
        System.out.println("Final price returned: $" + finalPrice);
    }
}