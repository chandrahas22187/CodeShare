package springerNature.Coffee;

import springerNature.abstraction.Coffee_Interface;

/**
 * @author Chandrahas
 */
public class LatteCoffee implements Coffee_Interface {

    private static final double PRICE = 30;
    @Override
    public double getPrice() {
        return PRICE;
    }
}
