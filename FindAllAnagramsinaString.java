package String.letco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Input: s = "cbaebabacd", p = "abc"
//Output: [0,6]
//Explanation:
//The substring with start index = 0 is "cba", which is an anagram of "abc".
//The substring with start index = 6 is "bac", which is an anagram of "abc".
//Example 2:
//
//Input: s = "abab", p = "ab"
//Output: [0,1,2]
//Explanation:
//The substring with start index = 0 is "ab", which is an anagram of "ab".
//The substring with start index = 1 is "ba", which is an anagram of "ab".
//The substring with start index = 2 is "ab", which is an anagram of "ab".
//

public class FindAllAnagramsinaString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (p.length() > s.length()) {
            return ans;
        }

        int[] pFreq = new int[26];
        int[] sFreq = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pFreq[p.charAt(i) - 'a']++;
            sFreq[s.charAt(i) - 'a']++;
        }
        System.out.println( Arrays.toString(sFreq) + "sfreq");
        System.out.println( Arrays.toString(pFreq)  + "pfreq" );

        if (Arrays.equals(pFreq, sFreq)) {
            ans.add(0);
        }

        int i = 0, j = p.length();
        while (j < s.length()) {
            sFreq[s.charAt(i++) - 'a']--;
            System.out.println( Arrays.toString(sFreq) + "between");
            sFreq[s.charAt(j++) - 'a']++;

            System.out.println( Arrays.toString(sFreq));


            if (Arrays.equals(sFreq, pFreq)) {
                ans.add(i);
                System.out.println(ans);
            }
        }

        return ans;
    }

    public static void main(String[] args){
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s, p));


    }
}
