package String.letco;

import java.util.HashMap;
import java.util.Map;

//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

//sliding window tech
//keep incr right var and store char in map
//if duplicate char found >> incr left to duplicate char index + 1
public class Longestsubstringwithoutrepeatingcharacters {
    public static int lengthOfLongestSubstring(String s) {

        Map<Character,Integer> map = new HashMap<>();
        int len = 0;
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            //if char already present
            if(map.containsKey(c)){
                //if index of left <= char index
                if(left <= map.get(c))
                {
                    //contract the left window to duplicate char + 1
                    left = map.get(c) + 1;
                }
            }
            len = Math.max(len,right-left + 1);
            map.put(c,right);
        }
        return len;
    }
    public static void main(String[] args){

        String s = "pwwkew";
        System.out.print(lengthOfLongestSubstring(s));


        }

}
