package springerNature.ColdDrinks;

import springerNature.abstraction.ColdDrink_Interface;

/**
 * @author Chandrahas
 */
public class Sprite implements ColdDrink_Interface {
    private final static double PRICE = 15;

    @Override
    public double getPrice() {
        return PRICE;
    }
}
