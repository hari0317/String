package String.letco;

import java.util.Arrays;

//Example 1:
//
//Input: ransomNote = "a", magazine = "b"
//Output: false
//Example 2:
//
//Input: ransomNote = "aa", magazine = "ab"
//Output: false
//Example 3:
//
//Input: ransomNote = "aa", magazine = "aab"
//Output: true
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] arr = new int[26];

        // arr[(a - a)] => arr[65-65] arr by incr by 1
        for (char c : magazine.toCharArray()){
            arr[c - 'a']++;
        }
        System.out.println(Arrays.toString(arr));

        // decr by ransomNote char and check if  any
        // of the value becomes negative(<0 ie -1), return false
        for (char c : ransomNote.toCharArray())
        {
            arr[c - 'a']--;
            if(arr[c - 'a'] < 0){
                return false;
            }
        }
        return true;


    }
    public static void main(String[] args){

        String ransomNote = "aaa";
        String magazine = "aaba";

        System.out.print(canConstruct(ransomNote, magazine));

    }
}
