package common;

import java.util.Arrays;

public class SherlockAndAnagrams {

    public static void main(String [] args){
        String name = "aaabbb";
        System.out.println(name.toCharArray().length%2);
        anagramInAWord("xaxbbbxx");
    }

    public static void checkSherlockAnagrams(String str){
        //for()
    }

    public static int anagramInAWord(String str){
        char[] arr = str.toCharArray();
        if(arr.length%2 != 0 ){
            return -1;
        }
        int count = 0;
        int mid = str.length()/2;
        char [] arr1 = str.substring(0,mid).toCharArray();
        char [] arr2 = str.substring(mid,str.length()).toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0 ; i <  mid ; i ++){
            if(arr1[i] != arr2[i]){
                count++;
            }
        }

        return count;
    }


    public static boolean isAnagram(String a, String b){
        char [] s1 = a.toCharArray();
        char [] s2 = b.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);
        if(new String(s1).equals(new String(s2))){
            return true;
        }
        return false;
    }

}
