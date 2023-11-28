package String.letco;

//Input: s = "ABAB", k = 2
//Output: 4
//Explanation: Replace the two 'A's with two 'B's or vice versa.
//Example 2:
//
//Input: s = "AABABBA", k = 1
//Output: 4
//Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
//The substring "BBBB" has the longest repeating letters, which is 4.
//There may exists other ways to achieve this answer too.

import java.util.Arrays;

//Sliding window technique
public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args){
        String  s = "AABABBA";
        Integer k = 1;

        int[] arr = new int[26];
        int maxLength = 0;
        int start = 0;
        for(int end =0 ; end < s.length();end++){
            maxLength = Math.max(maxLength,++arr[s.charAt(end) -'A']);
            System.out.println(Arrays.toString(arr));
            //since it is voilating the condition that k = 2 should be replacement ,
            //sliding window - maxfrequency > k =2 condition (sliding window - maxfrequency will give k)
            // so we are reducing frequency of start char by 1 and incr start
            if ((end - start + 1) - maxLength > k) {
                arr[s.charAt(start) - 'A']--;
                start++;
            }
        }
        System.out.print(s.length() - start);


    }
}
