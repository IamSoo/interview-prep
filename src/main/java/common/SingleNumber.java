package common;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class SingleNumber {

    public static void main(String []args){
        int []arr = {2,2,1};
        System.out.println(singleNumber(arr));

    }

    public static  int singleNumber(int [] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int a : arr){
            if(!set.add(a)){
                set.remove(a);
            }
        }

        Iterator<Integer> it = set.iterator();
        return it.next();
    }

}
