package springerNature.factories;

import springerNature.Coffee.ColdCoffee;
import springerNature.Coffee.LatteCoffee;
import springerNature.Coffee.MochaCoffee;
import springerNature.Enums.CoffeeCodes;
import springerNature.abstraction.Coffee_Interface;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chandrahas
 */
public class CoffeeFactory {

    private static final Map<String, Coffee_Interface> coffeeTypeMap = new HashMap<>();

    static {
        coffeeTypeMap.put(CoffeeCodes.CC.name(), new ColdCoffee());
        coffeeTypeMap.put(CoffeeCodes.CL.name(), new LatteCoffee());
        coffeeTypeMap.put(CoffeeCodes.CM.name(), new MochaCoffee());

    }

    public static Coffee_Interface getCoffee(String code) {

        return coffeeTypeMap.get(code);
    }
}
