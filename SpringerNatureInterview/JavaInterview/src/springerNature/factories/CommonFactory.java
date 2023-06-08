package springerNature.factories;

import springerNature.Enums.CoffeeCodes;
import springerNature.Enums.ColdDrinksCodes;
import springerNature.Enums.TeaCodes;
import springerNature.abstraction.Meals;

import java.util.stream.Stream;

/**
 * @author Chandrahas
 */
public class CommonFactory {


    public static Meals getBeverageType(String code) {


            final boolean isTea = Stream.of(TeaCodes.TI.name(), TeaCodes.TM.name(), TeaCodes.TL.name()).anyMatch(s -> s.equalsIgnoreCase(code));
            if (isTea) {
                return TeaFactory.getTea(code);
            }
            if (Stream.of(CoffeeCodes.CC.name(), CoffeeCodes.CL.name(), CoffeeCodes.CM.name()).anyMatch(s -> s.equalsIgnoreCase(code))) {
                return CoffeeFactory.getCoffee(code);
            }
            if (Stream.of(ColdDrinksCodes.CDC.name(), ColdDrinksCodes.CDP.name(), ColdDrinksCodes.CDS.name()).anyMatch(s -> s.equalsIgnoreCase(code))) {
                return ColdDrinksFactory.getColdDrinks(code);
            }
            else
                return null;


    }


}
