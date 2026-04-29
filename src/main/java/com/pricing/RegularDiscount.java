package main.java.com.pricing;

public class RegularDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double subtotal, String discountCode) {
        if (discountCode.equals("SAVE10")) return subtotal * 0.05;
        if (discountCode.equals("SAVE20")) return subtotal * 0.1;
        return 0;
    }
}