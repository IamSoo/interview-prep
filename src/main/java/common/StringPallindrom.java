package common;

public class StringPallindrom {

    public static void main(String[] args) {
        if(isPallindrom("SNS")){
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }
        if(isPallindromWithOutClass("SNS")){
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }


    }

    public static boolean isPallindrom(String input){
        if(input == null){
            return false;
        }else{
            StringBuffer builder = new StringBuffer(input);
            builder.reverse();
            return builder.toString().equals(input);
        }
    }

    public static boolean isPallindromWithOutClass(String input) {
        if (input == null) {
            return false;
        } else {
            int len = input.length();
            for (int i = 0; i < len / 2 ; i++) {
                if (input.charAt(i) != input.charAt(len - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }

}
