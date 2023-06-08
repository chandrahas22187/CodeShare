package springerNature.factories;

import springerNature.ColdDrinks.Coke;
import springerNature.ColdDrinks.Pepsi;
import springerNature.ColdDrinks.Sprite;
import springerNature.Enums.ColdDrinksCodes;
import springerNature.abstraction.ColdDrink_Interface;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chandrahas
 */
public class ColdDrinksFactory {

    private static final Map<String, ColdDrink_Interface> coldDrinksType = new HashMap<>();

    static {
        coldDrinksType.put(ColdDrinksCodes.CDC.name(), new Coke());
        coldDrinksType.put(ColdDrinksCodes.CDP.name(), new Pepsi());
        coldDrinksType.put(ColdDrinksCodes.CDS.name(), new Sprite());

    }

    public static ColdDrink_Interface getColdDrinks(String code) {

        return coldDrinksType.get(code);
    }
}
