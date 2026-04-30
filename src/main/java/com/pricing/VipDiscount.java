package com.pricing;

public class VipDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double subtotal, String discountCode) {
        if (discountCode.equals("SAVE10")) return subtotal * 0.1;
        if (discountCode.equals("SAVE20")) return subtotal * 0.2;
        return subtotal * 0.05;
    }
}