package springerNature.Tea;


import springerNature.abstraction.Tea_Interface;

/**
 * @author Chandrahas
 */
// Concrete beverage classes
public class MasalaTea implements Tea_Interface {

    private static final double PRICE = 10;


    @Override
    public double getPrice() {
        return PRICE;
    }
}
