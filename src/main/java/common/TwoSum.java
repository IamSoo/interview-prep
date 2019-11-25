package common;

import java.util.HashMap;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {
        int [] testNumbers = {1,2,3,4,5,6};
        int target = 7;
       int  ans[] =  calculateSum(testNumbers,target);
       for(int i : ans){
           System.out.printf(i+" ");
       }

        ans =  calculateSumWithMap(testNumbers,target);

        for(int i : ans){
            System.out.printf(i+" ");
        }

    }

    public static int[] calculateSum(int [] input,int target){
        int[] retVal = new int[2];
            for(int i=0 ;i < input.length -1 ;i++){
                for(int j = i+1; j < input.length; j++){
                    if(input[i] + input [j] == target){
                        retVal[0] = i;
                        retVal[1] = j;

                    }
                }
            }
        return retVal;
    }

    public static int[] calculateSumWithMap(int [] input,int target){
        int[] retVal = new int[2];
        //input : array of integer , output : target

        /**
         * input[0] = 1
         * +
         * input[1] = 2
         * =
         * target 3
         *  target - input[1] = input[0]
         */
        HashMap<Integer,Integer> data = new HashMap<>();
        for(int i = 0; i < input.length ;i ++){
            //check if value is not present
            if(data.containsKey(input[i])){
                retVal[0]= data.get(input[i]) + 1;
                retVal[1] = i+1;
                break;
            }else {
                data.put(target - input[i], i);
            }
            //if present then thats the value
        }
        return retVal;
    }

}
