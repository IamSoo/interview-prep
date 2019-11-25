package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {

    public static void main(String []args){
        int arr[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }

    // -1 , 1 , 0

    //-1 , -1 , 2 :

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalList  = new ArrayList<>();
        HashMap<Integer,Integer> data  = new HashMap<Integer, Integer>();
        for(int i =0 ; i <  nums.length-1 ; i ++){
                int val = nums[i] + nums[i+1];
                if(data.containsKey(0 - val)){
                   List<Integer> innerList  = new ArrayList<>();
                    innerList.add(nums[i]);
                    innerList.add(nums[i+1]);
                    innerList.add(val);
                    finalList.add(innerList);
                }else {
                    data.put((nums[i] + nums[i+1]), i);
                }
        }


        return finalList;
    }

}
