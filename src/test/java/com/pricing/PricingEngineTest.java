// package com.pricing;

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;

// public class PricingEngineTest {
    
//     private final PricingEngine engine = new PricingEngine();
    
//     @Test
//     void testRegularCustomerNoDiscount() {
//         double[] prices = {100};
//         int[] quantities = {1};
        
//         double result = engine.calculate(prices, quantities, "REGULAR", "");
        
//         // Subtotal = 100, discount = 0, tax = 10, final = 110
//         assertEquals(110.0, result, 0.01);
//     }
    
//     @Test
//     void testVIPCustomerWithSAVE20() {
//         double[] prices = {100};
//         int[] quantities = {1};
        
//         double result = engine.calculate(prices, quantities, "VIP", "SAVE20");
        
//         // Subtotal = 100, discount = 20, tax = 8, final = 88
//         assertEquals(88.0, result, 0.01);
//     }
    
//     @Test
//     void testMultipleItems() {
//         double[] prices = {10, 20, 30};
//         int[] quantities = {1, 2, 1};
        
//         double result = engine.calculate(prices, quantities, "REGULAR", "SAVE10");
        
//         // Subtotal = 10 + 40 + 30 = 80
//         // Discount = 80 * 0.05 = 4
//         // Tax = (80 - 4) * 0.1 = 7.6
//         // Final = 80 - 4 + 7.6 = 83.6
//         assertEquals(83.6, result, 0.01);
//     }
// }

// 2
package com.pricing;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class PricingEngineTest {
    
    private final PricingEngine engine = new PricingEngine();
    
    @Test
    void testRegularCustomerNoDiscount() {
        List<Double> prices = List.of(100.0);
        List<Integer> quantities = List.of(1);
        
        double result = engine.calculate(prices, quantities, "REGULAR", "");
        
        assertEquals(110.0, result, 0.01);
    }
    
    @Test
    void testVIPCustomerWithSAVE20() {
        List<Double> prices = List.of(100.0);
        List<Integer> quantities = List.of(1);
        
        double result = engine.calculate(prices, quantities, "VIP", "SAVE20");
        
        assertEquals(88.0, result, 0.01);
    }
    
    @Test
    void testMultipleItems() {
        List<Double> prices = List.of(10.0, 20.0, 30.0);
        List<Integer> quantities = List.of(1, 2, 1);
        
        double result = engine.calculate(prices, quantities, "REGULAR", "SAVE10");
        
        assertEquals(83.6, result, 0.01);
    }
}