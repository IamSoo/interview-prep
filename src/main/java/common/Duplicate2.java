package common;

import java.util.HashMap;

public class Duplicate2 {

    /**
     *
     * Check two integers i and j if num[j] == num [j] and their difference is k
     *
     */

    public static void main(String []args){
        int [] arr = {3,4,6,2,3};
        System.out.println(containsDuplicateWithDifference(arr,5));
    }

    public static boolean containsDuplicateWithDifference(int arr[] , int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i  <  arr.length; i++){
            if(map.containsKey(arr[i])){
                int index = map.get(arr[i]);
                System.out.println(index);
                if(i - index <= k ){
                    return true;
                }else{
                    map.put(arr[i],i);
                }
            }else{
                map.put(arr[i],i);
            }
        }
        return false;
    }
}
