package com.zipcodewilmington.arrayutility;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <K>{K[] inputArray;

    public ArrayUtility(K[] inputArray){this.inputArray = inputArray;}

    ArrayList<K>mergedArray = new ArrayList<>();

    public int countDuplicatesInMerge(K[] arrayToMerge, K valueToEvaluate) {
        int count = 0;
        mergedArray.addAll(Arrays.asList(inputArray));
        mergedArray.addAll((Arrays.asList(arrayToMerge)));
        for (K k : mergedArray) if (valueToEvaluate == k) count++;
        return count;
    }

    public K getMostCommonFromMerge(K[] arrayToMerge) {return null;}

    public int getNumberOfOccurrences(K valueToEvaluate) {
        int count = 0;
        for(K val : inputArray ) if ((val == valueToEvaluate))count++;
        return count;
    }
    public K[] removeValue(K valueToRemove) {
        ArrayList<K>list = new ArrayList<>(Arrays.asList(inputArray));
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==valueToRemove){
                list.remove(i);
                i-=1;
            }
        }
        K[]array=Arrays.copyOf(inputArray,list.size());
        for (int i = 0; i < array.length; i++) array[i] = list.get(i);
        return array;}
}
