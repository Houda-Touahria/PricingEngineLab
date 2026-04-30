package com.pricing;

public class TestDiscount {
    public static void main(String[] args) {
        System.out.println("Testing DiscountStrategy...");
        
        DiscountStrategy vip = new VipDiscount();
        double discount = vip.calculateDiscount(100, "SAVE20");
        
        System.out.println("Discount: " + discount);
    }
}