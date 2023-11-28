package String.letco;

import java.util.Stack;

//first  enter the frequency of each char int[]
//iterate each char and while iteration reduce frequency for current char by 1
//and check if is already visted (duplicate) if so continue
//if the char is not visted then push to stack and put visted = true
//The line while(!stack.isEmpty() && stack.peek() > c && count[stack.peek()-'a'] > 0)
// checks that the queued character should be removed or not
//

public class RemoveDuplicateLetterscopy {
    public static void main(String[] args){
        String s = "cbacdcbc";
        Stack<Character> stack = new Stack<>();
        int[] arr = new int[26];
        //enter the frequency of char
        for (char c : s.toCharArray()){
            arr[c -'a']++;
        }
        boolean[] visted = new boolean[26];
        //when current char enter reduce its its frequency by 1 .
        for(char c : s.toCharArray()){
            arr[c-'a']--;
            if(visted[c-'a']){
                continue;
            }
            //here we are checking whether peek char > current char and peek char has dupliacte of it (its count > 0)
            //so we can later push that char(Since the result should be the smallest in lexicographical order)
            // if so pop peek char
            while(stack.isEmpty() != true && stack.peek() > c && arr[stack.peek() - 'a'] > 0)
            {
                visted[ stack.peek() -'a'] = false;
                stack.pop();

            }


            stack.push(c);
            visted[c-'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stack){
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
