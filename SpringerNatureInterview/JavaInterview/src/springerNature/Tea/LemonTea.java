package springerNature.Tea;

import springerNature.abstraction.Tea_Interface;

/**
 * @author Chandrahas
 */
public class LemonTea implements Tea_Interface {

   private static final double PRICE = 15;

    @Override
    public double getPrice() {
        return PRICE;
    }
}
