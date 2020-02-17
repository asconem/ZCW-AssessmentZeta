package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        int found = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectToCount)) {
                found++;
            }
        }
        return found;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

        int n = objectArray.length - getNumberOfOccurrences(objectArray, objectToRemove);
        Integer[] newArr = new Integer[n];

        int j = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectToRemove)) {
                continue;
            }
            newArr[j++] = (Integer) objectArray[i];
        }

        return newArr;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int element = 0;
        int count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            int tempElement = (int) objectArray[i];
            int tempCount = 0;
            for (int j = 0; j < objectArray.length; j++) {
                if (objectArray[j].equals(tempElement)) {
                    tempCount++;
                }
            }if (tempCount > count) {
                element = tempElement;
                count = tempCount;
            }
        }
        return element;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int element = 0;
        int count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            int tempElement = (int) objectArray[i];
            int tempCount = 0;
            for (int j = 0; j < objectArray.length; j++) {
                if (!(objectArray[j].equals(tempElement))) {
                    tempCount++;
                }
            }if (tempCount > count) {
                element = tempElement;
                count = tempCount;
            }
        }
        return element;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Integer firstLength = objectArray.length;
        Integer secondLength = objectArrayToAdd.length;
        Integer[] result = new Integer[firstLength + secondLength];

        System.arraycopy(objectArray, 0, result, 0, firstLength);
        System.arraycopy(objectArrayToAdd, 0, result, firstLength, secondLength);
        return result;
    }
}
