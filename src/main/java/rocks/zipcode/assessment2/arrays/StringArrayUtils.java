package rocks.zipcode.assessment2.arrays;

import com.sun.org.apache.bcel.internal.generic.ATHROW;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex    - starting index of array to be spliced
     * @param endingIndex      - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        String[] newStringArr;


        if(startingIndex > arrayToBeSpliced.length) {
            throw new java.lang.IndexOutOfBoundsException();
        }else if(startingIndex < 0){
            throw new java.lang.IllegalArgumentException();
        }else {
            newStringArr = new String[endingIndex - startingIndex];
        }


        int pos = 0;

        for (int x = 0; x <= arrayToBeSpliced.length - 1; x++) {
            if (x == startingIndex) {
                newStringArr[pos] = arrayToBeSpliced[x];
                pos++;
            } else if (x > startingIndex && x < endingIndex) {
                newStringArr[pos] = arrayToBeSpliced[x];
                pos++;
            }
        }
        return newStringArr;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex    - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {

        String[] newArr;
        if(startingIndex > arrayToBeSpliced.length){
            throw new java.lang.IllegalArgumentException();
        }else{
            newArr = new String[arrayToBeSpliced.length - startingIndex];
        }


        int pos = 0;
        for (int X = startingIndex; X <= arrayToBeSpliced.length - 1; X++) {
            newArr[pos] = arrayToBeSpliced[X];
            pos++;
        }
        return newArr;
    }
}
