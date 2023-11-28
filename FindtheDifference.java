package String.letco;

//Example 1:
//
//Input: s = "abcd", t = "abcde"
//Output: "e"
//Explanation: 'e' is the letter that was added.
//Example 2:
//
//Input: s = "", t = "y"
//Output: "y"

public class FindtheDifference {
    public static char findTheDifference(String s, String t) {
        int j = 0;
        int val = 0;
        for(char c : s.toCharArray()){
            val ^= (int)c;
        }
        while( j < t.length()){
            val ^=  (int)t.charAt(j);
            j++;

        }
        return (char)val;

    }
    public static void main(String[] args){
        String s = "a", t = "aa";



        System.out.println(findTheDifference(s,t));
    }
}

//2 sol
// public char findTheDifference(String s, String t) {
//        // Initialize variables to store sum of ASCII codes for
//        // each string
//        int charCodeS = 0, charCodeT = 0;
//        // Iterate through both strings and char codes
//        for (int i = 0; i < s.length(); ++i) charCodeS += (int)s.charAt(i);
//        for (int i = 0; i < t.length(); ++i) charCodeT += (int)t.charAt(i);
//        // Return the difference between 2 strings as char
//        return (char)(charCodeT - charCodeS);
//    }

