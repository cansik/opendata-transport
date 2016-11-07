package ch.fhnw.opentransport.api.util;

/**
 * Created by cansik on 07.11.16.
 */
public class BooleanUtils {
    public static String toNumeralString(final Boolean input) {
        if (input == null) {
            return "null";
        } else {
            return input.booleanValue() ? "1" : "0";
        }
    }
}
