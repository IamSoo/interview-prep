package common;

import java.util.Arrays;

public class Anagrams {

    public static void main(String [] args){

    }

    public static boolean isAnagram(String s, String t){
        if(s != null && t != null){
            char[] s1 = s.toCharArray();
            Arrays.sort(s1);

            char[] t1 = t.toCharArray();
            Arrays.sort(t1);

            if(new String(s1).equals(new String(t1))){
                return true;
            }
        }
        return  false;
    }

    public static boolean isAnagramByHashMap(String s1,String t1){
        char [] s1_c = s1.toCharArray();
        char [] t1_c = t1.toCharArray();

       // for()

        return false;
    }
}
