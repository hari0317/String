package String.letco;

//Input: s = "ab", goal = "ba"
//Output: true
//Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
//Example 2:
//
//Input: s = "ab", goal = "ab"
//Output: false
//Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.
//Example 3:
//
//Input: s = "aa", goal = "aa"
//Output: true
//Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.

//logic
//if len of two strings are different return false
//if the two strings are same then check any of the char has no of frequency = 2
// s = "ab", goal = "ab" even though both string strings are if we swap s != goal
//s = "aa", goal = "aa" since the the frequency char a = 2 s == goal
//if strings are different =>
//check if there are only two char are not same in both strings .
// since only 2 char must be exchanged


import java.util.ArrayList;
import java.util.Arrays;

public class BuddyStrings {
    public static boolean buddyStrings(String s, String goal) {

        ArrayList<Integer> arr = new ArrayList<>();
        int[] frequency = new int[26];

        //case 1 -> if len of both Strings are diff
        if(s.length() != goal.length()) return false;


        //case 2 if both string are same check if any of char has frequency of 2
        if(s.equals(goal)) {
//            for (char c : s.toCharArray()) {
//                frequency[c - 'a']++;
//                System.out.println(Arrays.toString(frequency));
//                if (frequency[c - 'a'] == 2) {
//                    return true;
//                }
//            }
//           // System.out.println(Arrays.toString(frequency));
          //  if()
            if(s.length() == 2 && s.charAt(0) == goal.charAt(1) &&  s.charAt(1) == goal.charAt(0))
            return true;
            else {
                return false;
            }
        }
        //case 3 if both string are not same
        //there should be only two char different when comparing s and goal
        if(!s.equals(goal)) {

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    arr.add(i);
                }
            }
        }
        System.out.println(arr);
        if(arr.size() > 2)
            return false;

        return (arr.size() == 2 && s.charAt(arr.get(0)) == goal.charAt(arr.get(1))
                && s.charAt(arr.get(1)) == goal.charAt(arr.get(0)));
    }
    public static void main(String[] args){
        String s = "aa", goal = "aa";
        System.out.println( buddyStrings(s, goal));
     //   System.out.println(Arrays.toString(frequency));

    }
}
