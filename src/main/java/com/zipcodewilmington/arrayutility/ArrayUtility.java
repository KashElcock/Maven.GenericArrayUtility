package com.zipcodewilmington.arrayutility;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <K>{

    K[] inputArray;

    ArrayUtility(K[] inputArray){this.inputArray = inputArray;}

    ArrayList<K>mergedArray = new ArrayList<>();

    public int countDuplicatesInMerge(K[] arrayToMerge, K valueToEvaluate) {
        int count = 0;
        mergedArray.addAll(Arrays.asList(inputArray));
        mergedArray.addAll((Arrays.asList(arrayToMerge)));
        for (K k : mergedArray) if (valueToEvaluate == k) count++;
        return count;
    }

    public K getMostCommonFromMerge(K[] arrayToMerge) {
        int maxCount = 0;
        int count = 0;
        K mostCommon = null;
        for (K v: inputArray) {
            count = countDuplicatesInMerge(arrayToMerge,v);
            if(count>maxCount) {
                maxCount = count;
                mostCommon = v;
            }
        }return mostCommon;
    }

    public int getNumberOfOccurrences(K valueToEvaluate) {
        int count = 0;
        for(K val : inputArray ) if ((val == valueToEvaluate))count++;
        return count;
    }

    public K[] removeValue(K valueToRemove) {
        ArrayList<K>list = new ArrayList<>(Arrays.asList(inputArray));
        list.removeIf(val -> val == valueToRemove);
        return list.toArray(Arrays.copyOf(inputArray,list.size()));
    }


}
