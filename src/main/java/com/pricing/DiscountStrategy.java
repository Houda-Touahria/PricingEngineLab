package com.pricing;

public interface DiscountStrategy {
    double calculateDiscount(double subtotal, String discountCode);
}