package String.letco;

//Input: s = "aba"
//Output: true
//Example 2:
//
//Input: s = "abca"
//Output: true
//Explanation: You could delete the character 'c'.
//Example 3:
//
//Input: s = "abc"
//Output: false

import java.util.Arrays;

public class ValidPalindromeII {
    public static boolean validPalindrome(String s) {
        //abcca
        //case 2 => accba
        // case 3 => acdba

        //case 4 => aab true
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return checkPalindrome(left + 1, right, s) || checkPalindrome(left, right - 1, s);
            left++;
            right--;
        }
        return true;
    }
    private static boolean checkPalindrome(int left, int right, String s) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        }
        return true;
    }
    public static void main(String[] args){

            String s = "ececabbacec";

            System.out.println(validPalindrome(s));



        }
}
