package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for ( String index : array){
            if (index == value){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        ArrayList<String> newArray = new ArrayList<String>();
        for (int i = array.length - 1; i >= 0; i--){
            newArray.add(array[i]);
        }
        return newArray.toArray(new String[0]);
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i = 0; i < array.length; i++){
            for (int k = array.length -1; i>= 0; i--){
                if (array[i] == array[k]){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for (int i = 0; i > alphabet.length; i++){
            if(contains(array, alphabet[i])){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int numOfOccurrences = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] == value){
                numOfOccurrences++;
            }
        }
        return numOfOccurrences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> newArray = new ArrayList(Arrays.asList(array));

        newArray.remove(valueToRemove);

        String[] newNewArray = newArray.toArray(new String[0]);



        return newNewArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
//        //make an arraylist of the array
//       /* ArrayList<String> newArray = new ArrayList<String>(Arrays.asList(array));
//        //loop through the arraylist
//        for (int i = 0; i < newArray.size() + 1; i++){
//            //if statement should say that the element in index i gets compared to the one next to it
//            //if they are equal, remove the initial one from the array
//            if (newArray.size() == i ){
//                break;
//            }
//            else if (newArray.indexOf(i) == newArray.indexOf(i + 1) /*|| newArray.get(i) == newArray.get(i + 2)){
//               /* newArray.remove(newArray.indexOf(i));
//            }*/
//        }//initializing the new new array and making it into a modified version of the new array
//        String[] newNewArray = newArray.toArray(new String[0]);
//        return newNewArray;
        ArrayList<String> newArray = new ArrayList<String>();
        String newElement = "";
        for (String element : array){
            if (element != newElement){
                newArray.add(element);
            }
            newElement = element;
        }
        return newArray.toArray(new String [0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
