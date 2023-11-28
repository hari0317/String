package String.letco;

//The reason why we sort the input array of strings and compare
// the first and last strings is that the longest common prefix
// of all the strings must be a prefix of the first string and a prefix of the last string in the sorted array.
// This is because strings are ordered based on their alphabetical order (Lexicographical order).
//For example, consider the input array of strings {"flower", "flow", "flight"}.
// After sorting the array, we get {"flight", "flow", "flower"}.
// The longest common prefix of all the strings is "fl",
// which is located at the beginning of the first string "flight" and the second string "flow". Therefore, by comparing
// the first and last strings of the sorted array, we can easily find the longest common prefix.

//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "floght", "fhhght"};

        //find smallest string s in array
        //compare string s with other strings
        //start from first char of s


        Arrays.sort(strs);

        String s1 = strs[0];
        String s2 = strs[strs.length-1];

        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }


            System.out.print( idx == 0 ? "" : s1.substring(0, idx));
    }

        }

