package String.letco;

//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//
//Input: s = "rat", t = "car"
//Output: false

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
    // APPROACH 2 for space O(1) / O(K)
        // use int[] -- using 1-26 array index by [char - 'a']
        // construct sCountArray and tCountArray by iterating for the lenght any string
        // -- both the string should be of same length if anagram
        // compare both the countArrays, if any of the element value is not equal return false
        // At the end return true


        // APPROACH 2 for space O(1) / O(K)
        // use int[] -- using 1-26 array index by [char - 'a']
        // construct sCountArray and tCountArray by iterating for the lenght any string
        // -- both the string should be of same length if anagram
        // compare both the countArrays, if any of the element value is not equal return false
        // At the end return true


        if(s.length() != t.length()) return false;

        int[] sCountArray = new int[26];
        int[] tCountArray = new int[26];

        for (int i = 0; i < s.length(); i++) {
            sCountArray[s.charAt(i) - 'a']++;
            tCountArray[t.charAt(i) - 'a']++;
        }

        // compare
        for (int j = 0; j < 26; j++) {
            if(sCountArray[j] != tCountArray[j]) return false;
        }

        return true;

    }

    public static void main(String[] args){

        String s ="anagram";
        String t = "nagaram";
        System.out.print(isAnagram(s, t));


    }
}
