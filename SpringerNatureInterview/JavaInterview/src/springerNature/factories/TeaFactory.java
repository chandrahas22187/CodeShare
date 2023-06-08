package springerNature.factories;

import springerNature.Enums.TeaCodes;
import springerNature.Tea.IceTea;
import springerNature.Tea.LemonTea;
import springerNature.Tea.MasalaTea;
import springerNature.abstraction.Tea_Interface;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chandrahas
 */
public class TeaFactory {

    private static final Map<String, Tea_Interface> teaTypeMap = new HashMap<>();

    static {
        teaTypeMap.put(TeaCodes.TM.name(), new MasalaTea());
        teaTypeMap.put(TeaCodes.TI.name(), new IceTea());
        teaTypeMap.put(TeaCodes.TL.name(), new LemonTea());

    }

    public static Tea_Interface getTea(String code) {

        return teaTypeMap.get(code);
    }
}
