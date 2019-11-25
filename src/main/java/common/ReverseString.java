package common;

public class ReverseString {

    public static void main(String[] args) {
        String name = "Soonam";
        System.out.println(reverseString(name.toCharArray()));
        System.out.println(oldMethod(name));
    }

    public static String reverseString(char[] c){

        StringBuffer buffer = new StringBuffer(c.length);
        for(int i = c.length -1 ; i >= 0 ; i--){
            buffer.append(c[i]);
        }
        return buffer.toString();
    }

    public static String oldMethod(String input){
        if(input == null || "".equals(input)){
            return "";
        }else{
            return new StringBuffer(input).reverse().toString();
        }
    }




}

