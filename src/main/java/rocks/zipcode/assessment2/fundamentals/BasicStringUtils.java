package rocks.zipcode.assessment2.fundamentals;

import sun.jvm.hotspot.debugger.bsd.x86.BsdX86ThreadContext;

import java.util.ArrayList;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String holder = "";
        for(int x = string1.length()-1 ; x >= 0 ; x--){
            holder += string1.charAt(x);
        }
        return holder;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String reversed1 = reverse(string1);
        String reversed2 = reverse(string2);
        return reversed1 + reversed2;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {

        ArrayList<Character> badChars = new ArrayList<>();

        for(int i = 0; i <= charactersToRemove.length() -1; i++){
            badChars.add(charactersToRemove.charAt(i));
        }

        String newString = "";

        for(int x = 0; x <= string.length() -1; x ++){
            boolean isBad = false;
            for(int z =0; z <= badChars.size() -1; z++){
                if(string.charAt(x) == badChars.get(z)){
                    isBad = true;
                    break;
                }
            }
            if(isBad == false){
                newString += string.charAt(x);
            }
        }
        return newString;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String removed = removeCharacters(string,charactersToRemove);
        String reversed = reverse(removed);
        return reversed;
    }
}
