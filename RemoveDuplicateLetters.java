package String.letco;

//Input: s = "bcabc"
//Output: "abc"
//Example 2:
//
//Input: s = "cbacdcbc"
//Output: "acdb"

import java.util.Arrays;
import java.util.Stack;

//if char - 'a' == 0; => add in string
//if char - 'a' > 0 => neglate
public class RemoveDuplicateLetters {
    public static void main(String[] args){

        String  s = "cbacdcbc";
        Stack<Character> stack = new Stack<>();
        int[] count = new int[26];
        char[] arr = s.toCharArray();
        for(char c : arr) {
            count[c-'a']++;
        }
        boolean[] visited = new boolean[26];
        for(char c : arr) {
            count[c-'a']--;
            System.out.println(Arrays.toString(count));
            if(visited[c-'a']) {
                continue;
            }
            while(!stack.isEmpty() && stack.peek() > c && count[stack.peek()-'a'] > 0) {
                System.out.println(c);
                System.out.println(stack.peek() + "peek ...");
                visited[stack.peek()-'a'] = false;
                stack.pop();
            }
            stack.push(c);
            visited[c-'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stack) {
            sb.append(c);
        }

        System.out.println(sb.toString());


    }
}
