package springerNature.ColdDrinks;

import springerNature.abstraction.ColdDrink_Interface;

/**
 * @author Chandrahas
 */
public class Coke implements ColdDrink_Interface {
    private final static double PRICE = 20;

    @Override
    public double getPrice() {
        return PRICE;
    }
}
