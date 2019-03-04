package rocks.zipcode.assessment2.arrays;

import rocks.zipcode.assessment2.fundamentals.PredicateUtilities;

import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    private PredicateUtilities predUtils = new PredicateUtilities();

    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer[] result = Arrays.copyOf(integerArray, integerArray.length + 1);
        result[result.length - 1] = valueToBeAdded;
        return result;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        integerArray[indexToInsertAt] = valueToBeInserted;
        return integerArray;
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
        for (int i = 0; i < integerArray.length; i++) {
            if (PredicateUtilities.isEven(integerArray[i])) {
                integerArray[i] = integerArray[i] + 1;
            } else {
                integerArray[i] = integerArray[i] - 1;
            }
        }
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        for (int i = 0; i < integerArray.length; i++) {
            if (PredicateUtilities.isEven(integerArray[i])) {
                integerArray[i] = integerArray[i] + 1;
            }
        }
        return integerArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        for (int i = 0; i < input.length; i++) {
            if (PredicateUtilities.isOdd(input[i])) {
                input[i] = input[i] - 1;
            }
        }
        return input;
    }
}
