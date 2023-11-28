package String.letco;

//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//Example 2:
//
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
//Example 3:
//
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric characters.
//Since an empty string reads the same forward and backward, it is a palindrome.

import java.util.Arrays;

public class ValidPalindrome {
    public static  boolean isPalindrome(String s) {

    int start = 0;
    int last = s.length() - 1;
        while(start < last)

    {
        char currFirst = s.charAt(start);
        char currLast = s.charAt(last);
        if (!Character.isLetterOrDigit(currFirst)) {
            start++;
        } else if (!Character.isLetterOrDigit(currLast)) {
            last--;
        } else {
            if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                return false;
            }
            start++;
            last--;
        }
    }
        return true;

    }
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));


    }
}
