package String.letco;

//Example 1:
//
//Input: s = "()"
//Output: true
//Example 2:
//
//Input: s = "()[]{}"
//Output: true
//Example 3:
//
//Input: s = "(]"
//Output: false

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public  static boolean isValid(String s) {

        Stack stack = new Stack<>();

        String closedParentheses ="}])";
        Map<Character,Character> map = new HashMap<>();

        map.put(')','(');
        map.put('}','{'); //{ -> {
        map.put(']','[');

        for (char currentchar : s.toCharArray()){
            if(closedParentheses.indexOf(currentchar) != -1 ){ //allowing only closed parantheses
                if(stack.empty() == true) return false; // if first paranthese is closed one

                char peekchar = (char) stack.peek();

                if(peekchar != map.get(currentchar)) return false; //checking if matching parantheses
                stack.pop(); // if matched pop


            }else{
                stack.push(currentchar); // push only open paranthese
            }
        }
        if (stack.empty()) return true;
        return false;

        //   ()[ 3 - 1 = 2
    }    //  012

    public static void main(String[] args){

        String s = "()}";
        System.out.print(isValid(s));



    }

}
