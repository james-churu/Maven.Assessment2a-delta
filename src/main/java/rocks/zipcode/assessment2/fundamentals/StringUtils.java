package rocks.zipcode.assessment2.fundamentals;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String padded = "";

        int remainingPads = amountOfPadding - stringToBePadded.length();

        for(int x = 1; x<= remainingPads; x++){
            padded += " ";
        }
        padded += stringToBePadded;
        return padded;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String padded = "";
        padded += stringToBePadded;
        int remainingPads = amountOfPadding - stringToBePadded.length();

        for(int x = 1; x<= remainingPads; x++){
            padded += " ";
        }

        return padded;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String repeated = "";
        for(int x = 1; x <= numberOfTimeToRepeat; x++){
            repeated += stringToBeRepeated;
        }

        return repeated;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        boolean allIsUpper = true;

        for(int x = 0; x <= string.length() -1; x++){
            if(string.charAt(x) == ' '){

            }
            else if ((Character.isLetter(string.charAt(x)) == false)) {
                allIsUpper = false;
                break;
            }
        }

        return allIsUpper;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        boolean allIsNumeric = true;

        for(int x = 0; x <= string.length() -1; x++){
            if(string.charAt(x) == ' '){
                allIsNumeric = false;
                break;
            }else if ((Character.isDigit(string.charAt(x)) == false)) {
                allIsNumeric = false;
                break;
            }
        }

        return allIsNumeric;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        if(isAlphaString(string)){
            return false;
        } else if(isNumericString(string)){
            return false;
        }else{
            return true;
        }
    }

}

