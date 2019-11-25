package common;

public class CommonTest {

    public static void main(String[] args) {
        String word = "soonam";
        // your code goes here
        int ascii[] = new int[word.length()];
        for(int i=0;i< word.length() ; i++){
            ascii[i] = word.charAt(i);
        }

        for(int i : ascii){
            System.out.printf("" + i);
        }
    }
}
