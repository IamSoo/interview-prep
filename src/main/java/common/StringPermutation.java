package common;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation {

    public static void main(String[] args) {
        String s = "AAC";
        String s1 = "ABC";
        String s2 = "ABCD";
       //System.out.println("\nPermutations for " + s + " are: \n" + permuteWithSet(s));
       // System.out.println("\nPermutations for " + s1 + " are: \n" + permuteWithSet(s1));
       // System.out.println("\nPermutations for " + s2 + " are: \n" + permuteWithSet(s2));

        System.out.println(permutation("ABCD"));
    }

    public static Set<String>  permuteWithSet(String input){
        Set<String> permutation = new HashSet<>();
        if(input == null || ("").equals(input) || input.length()==0){
            permutation.add("");
            return permutation;
        }

        char initialChar = input.charAt(0);
        String restString = input.substring(1).intern();
        Set<String> words = permuteWithSet(restString);
        for(String eachSubstr : words) {
            for (int i = 0; i <= restString.length(); i++) {
                permutation.add(permute(restString, initialChar, i));
            }
        }
     return permutation;
    }

    public static String permute(String input,char firstChar,int indx){
        String begin = input.substring(0,indx);
        String end = input.substring(indx);
        return begin + firstChar + end;
    }



    public static HashSet permutation(String input){
        HashSet<String> perm = new HashSet<>();
        if(input == null || ("").equals(input) ){
            perm.add("");
            return perm;
        }
        char initialChar = input.charAt(0);
        String restString = input.substring(1);
        //BC
        Set<String> subPermute = permutation(restString);
        for(String subWord : subPermute){
            for(int i= 0 ; i <= restString.length(); i++ ){
               perm.add(exchange(restString,initialChar,i));
            }
        }
        return perm;

    }

    public static String exchange(String str, char firstChar, int index){
        String begin = str.substring(0,index);
        String end = str.substring(index);
        return begin + firstChar + end;
    }
}
