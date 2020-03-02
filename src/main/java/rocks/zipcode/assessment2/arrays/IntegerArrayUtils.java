package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer[] newArr = new Integer[integerArray.length + 1];

        int pos = 0;
        for(Integer element : integerArray){
            newArr[pos] = element;
            pos++;
        }
        newArr[newArr.length -1] = valueToBeAdded;
        return newArr;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        Integer[] newArr = new Integer[integerArray.length];

        for(int X = 0; X <= integerArray.length -1; X++){
            if(X == indexToInsertAt){
                newArr[X] = valueToBeInserted;
            }else{
                newArr[X] = integerArray[X];
            }
        }

        return newArr;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        Integer[] newArr = new Integer[integerArray.length];

        for(int X = 0; X <= integerArray.length -1; X++){
            if(integerArray[X] % 2 == 0){
                newArr[X] = integerArray[X] +1;
            }else{
                newArr[X] = integerArray[X] -1;
            }
        }
        return newArr;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        Integer[] newArr = new Integer[integerArray.length];

        for(int X = 0; X <= integerArray.length -1; X++){
            if(integerArray[X] % 2 == 0){
                newArr[X] = integerArray[X] +1;
            }else{
                newArr[X] = integerArray[X];
            }
        }
        return newArr;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        Integer[] newArr = new Integer[input.length];

        for(int X = 0; X <= input.length -1; X++){
            if(input[X] % 2 == 0){
                newArr[X] = input[X];
            }else{
                newArr[X] = input[X] - 1;
            }
        }
        return newArr;
    }
}
