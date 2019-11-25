package common;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestNotRepeatSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        String str1 = "bbbbb";
        String str2 = "pwwkew";
        System.out.println(findSubStrBruteForce(str2));
    }

    public static Integer findSubStrBruteForce(String str){
        String output = "";
        Set<Character> set = new HashSet<>();
        for(int i = 0 ; i < str.length(); i++){

            int j = i;
            for(;j < str.length() ; j++){
                char currentChar = str.charAt(j);
                if(set.contains(currentChar)){
                    set.clear();
                    break;
                }else{
                    set.add(currentChar);
                }
            }

            if(output.length() < j - i + 1){
                output = str.substring(i,j);
            }
        }


        return output.length();

    }

}
