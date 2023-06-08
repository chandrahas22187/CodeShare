package springerNature;


import springerNature.abstraction.Meals;
import springerNature.factories.CommonFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chandrahas
 */
public class OrderPayableBill {
    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap<>();
       // Add the Code as instructed in pdf and quantity in line 19 20 and also few more lines can be added.
       //        Code | Quantity
        items.put("TM", 1);
        items.put("TI", 10);
        items.put("CL", 10);
        items.put("CM", 10);

        System.out.println("Item Name\t\tCount\t\tPrice");
        System.out.println("==================================");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            String code = entry.getKey();
            int quantity = entry.getValue();

            Meals beverage = CommonFactory.getBeverageType(code);
            if (beverage != null) {
                System.out.println(beverage.getClass().getSimpleName() + "\t\t\t" + quantity + "\t\t" + (beverage.getPrice() * quantity));
            }
        }

        double totalBill = BeverageBillCalculation.getTotalBillWithoutDiscount(items);
        System.out.println("Total Bill\t\t\t\t\t" + totalBill);
        System.out.println("Bill after Discount\t\t\t" + BeverageBillCalculation.getDiscountedBill(items));
    }
}
