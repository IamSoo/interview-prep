package common;

import java.util.*;
import java.util.stream.Collectors;

public  class RemoveDuplicate {


    public static <T> ArrayList<T> removeDuplicateFromArrayList(ArrayList<T> input){
        Set<T> dataSet = new HashSet<>();
        dataSet.addAll(input);
        input.clear();
        input.addAll(dataSet);
        return input;
    }

    public static void main(String[] args) {
       ArrayList<Integer> inputData = new ArrayList<>(Arrays.asList(1,2,3,3,4,5,5,6));
       List<Integer> cleanedData = removeDuplicateFromArrayList(inputData);
       System.out.printf("Cleaned data :" + inputData);
       cleanedData = removeDuplicateUsingJava8(inputData);
        System.out.printf("Cleaned data from set :" + inputData);
    }

    public static List<Integer> removeDuplicateUsingJava8(ArrayList<Integer> input){
        List<Integer> data = input.stream().distinct().collect(Collectors.toList());
        return data;
    }



}
