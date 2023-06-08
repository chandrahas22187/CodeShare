package springerNature.Coffee;

import springerNature.abstraction.Coffee_Interface;

/**
 * @author Chandrahas
 */
public class MochaCoffee implements Coffee_Interface {

    private static final double PRICE = 40;
    @Override
    public double getPrice() {
        return PRICE;
    }
}
