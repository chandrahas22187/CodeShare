package springerNature;


import springerNature.abstraction.Meals;
import springerNature.factories.CommonFactory;
import java.util.Map;
import java.util.Objects;


/**
 * @author Chandrahas
 */
class BeverageBillCalculation {
    private static final double DISCOUNT_LIMIT_ABOVE_100 = 100;
    private static final double DISCOUNT_LIMIT_ABOVE_200 = 200;
    private static final double DISCOUNT_PERCENTAGE_10 = 10;
    private static final double DISCOUNT_PERCENTAGE_20 = 20;

    public static double getDiscountedBill(Map<String, Integer> items) {

        double totalBillAmount = getTotalBillWithoutDiscount(items);
        double discount = 0;

        if (totalBillAmount > DISCOUNT_LIMIT_ABOVE_100) {
            discount = totalBillAmount * DISCOUNT_PERCENTAGE_10 / 100;
        }

        if (totalBillAmount > DISCOUNT_LIMIT_ABOVE_200) {
            discount = 200* DISCOUNT_PERCENTAGE_10 / 100;
            double extraDiscount = (totalBillAmount - DISCOUNT_LIMIT_ABOVE_200) * DISCOUNT_PERCENTAGE_20 / 100;
            discount += extraDiscount;
        }
        return totalBillAmount - discount;
    }

    public static double getTotalBillWithoutDiscount(Map<String, Integer> items){

        double total = 0;
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            String itemCode = entry.getKey();
            int itemQuantity = entry.getValue();


            if (CommonFactory.getBeverageType(itemCode) != null) {
                Meals beverage = CommonFactory.getBeverageType(itemCode);

                total += Objects.requireNonNull(beverage).getPrice() * itemQuantity;
            }
            else{
                System.out.println("No bill Generated");
            }
        }

        return total;
    }
}
