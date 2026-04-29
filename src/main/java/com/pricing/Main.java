package com.pricing;

public class Main {
    public static void main(String[] args) {
        PricingEngine engine = new PricingEngine();
        
        double[] prices = {100, 50, 30};
        int[] quantities = {2, 1, 3};
        
        double finalPrice = engine.calculate(prices, quantities, "VIP", "SAVE20");
        
        System.out.println("\nFinal price returned: $" + finalPrice);
    }
}