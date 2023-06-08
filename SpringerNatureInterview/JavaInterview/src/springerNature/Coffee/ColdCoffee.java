package springerNature.Coffee;

import springerNature.abstraction.Coffee_Interface;

/**
 * @author Chandrahas
 */
public class ColdCoffee implements Coffee_Interface {

    private static final double PRICE = 15;

    @Override
    public double getPrice() {
        return PRICE;
    }

  /*  public void processBill(int quantity) {

        System.out.println(quantity * PRICE);
    }*/
}
