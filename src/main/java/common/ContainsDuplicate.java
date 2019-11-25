package common;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(containsDuplicate(arr));


    }

    public static boolean containsDuplicate(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a : arr){
            if(map.containsKey(a)){
                return true;
            }else {
                map.put(a, 1);
            }
        }
        return false;
    }
}
