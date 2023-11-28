package String.letco;
//Input: s = "(()())(())"
//Output: "()()()"
//Explanation:
//The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
//After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
//Example 2:
//
//Input: s = "(()())(())(()(()))"
//Output: "()()()()(())"
//Explanation:
//The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
//After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
//Example 3:
//
//Input: s = "()()"
//Output: ""
//Explanation:
//The input string is "()()", with primitive decomposition "()" + "()".
//After removing outer parentheses of each part, this is "" + "" = "".


import java.util.Stack;

//logic
//first if and only char == '(' open parthensis we are going to push into the stack
//if stack size > 0 then only we are going to add to result string "("
//if char is ')' going to pop the last char in stack . After poping if size > 0 then going to add to result String ")"
public class RemoveOutermostParentheses {
    public static  String removeOuterParentheses(String s){

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i)=='('){
                if(stack.size() > 0 ){
                    sb.append(s.charAt(i));
                }
                stack.push(s.charAt(i));
            }else{
                //if char is ')'
                stack.pop(); //pop '('
                //then check if size > 0 if so add the char ')' to resultant String
                if(stack.size() > 0){
                    sb.append(s.charAt(i));
                }
            }
        }
       return sb.toString();
    }
    public static void main(String[] args){
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));

    }
}
