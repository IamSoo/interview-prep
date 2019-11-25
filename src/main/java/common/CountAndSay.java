package common;


public class CountAndSay {
    /**
     * 4 1211
     * 5 111221
     * 6 312211
     *
     *
     *
     *
     *
     */

    public static void main(String[] args) {
        java.lang.String ret = countAndSay(5);
        java.lang.String ret1 = countAndSayCopy(5);
        System.out.println(ret);
        System.out.println(ret1);

    }

    public static java.lang.String countAndSay(int n){
        if(n  == 0 ){
            return null;
        }
        java.lang.String result = "1";
        int i = 1;

        while(i < n){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int j=1 ; j < result.length();j++){
                if(result.charAt(j)==result.charAt(j-1)){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(result.charAt(j-1));
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(result.charAt(result.length() - 1));
            i++;
            result = sb.toString();
        }
        return result;
    }


    public static java.lang.String countAndSayCopy(int n){
        if(n == 0 ){
            return "";
        }
        //4 : 1211
        java.lang.String result = "1";
        int i = 1;
        while(i < n){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int j= 1 ; j < result.length(); j++){
                if(result.charAt(j) == result.charAt(j-1)){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(result.charAt(j-1));
                    count = 1;
                }
            }


            sb.append(count);
            sb.append(result.charAt(result.length() - 1));
            i++;
            result = sb.toString();
        }

        return result;
    }














}
