package common;

import java.util.HashMap;
import java.util.Stack;

public class EqualBraces {

    public static void main(String[] args) {
        boolean returnedvalue = isBraceStringCorrect("Hi[kalyan}");

        System.out.printf("The output is :" + returnedvalue);

    }

    public static boolean isBraceStringCorrect(String input){
        HashMap<Character,Character> bracesMap = new HashMap<>();
        bracesMap.put('{','}');
        bracesMap.put('(',')');
        bracesMap.put('[',']');

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0 ; i < input.length() ; i ++){
            char curr = input.charAt(i);
            if(bracesMap.containsKey(curr)){
                stack.push(curr);
            }else if(bracesMap.containsValue(curr)){
                if(!stack.empty() && bracesMap.get(stack.peek()) == curr){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
