package common;

public class LongestPallindrom {

    public static void main(String[] args) {
        System.out.println("".equals(""));
    }

    /**
     * start with zero, check if 1 and last are same then increase counter from left
     * decrease counter from right
     *
     * @param str
     * @return
     */
    public static String findPalliondrom(String str){
        if(str==null || "".equals(str)){
            return "";
        }
        String longestP = str.substring(0);



        return longestP;
    }

    public String extractPalliondrom(String s,int l, int r){
        if(l > r ) return null;
        while(l >= 0 && r < s.length() && s.charAt(l)==s.charAt(r)){
            l++;
            r--;
        }
        return s.substring(l + 1, r);
    }


}
