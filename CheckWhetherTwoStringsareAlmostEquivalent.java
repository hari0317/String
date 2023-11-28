package String.letco;

import java.util.Arrays;

//Input: word1 = "aaaa", word2 = "bccb"
//Output: false
//Explanation: There are 4 'a's in "aaaa" but 0 'a's in "bccb".
//The difference is 4, which is more than the allowed 3.
//Example 2:
//
//Input: word1 = "abcdeef", word2 = "abaaacc"
//Output: true
//Explanation: The differences between the frequencies of each letter in word1 and word2 are at most 3:
//- 'a' appears 1 time in word1 and 4 times in word2. The difference is 3.
//- 'b' appears 1 time in word1 and 1 time in word2. The difference is 0.
//- 'c' appears 1 time in word1 and 2 times in word2. The difference is 1.
//- 'd' appears 1 time in word1 and 0 times in word2. The difference is 1.
//- 'e' appears 2 times in word1 and 0 times in word2. The difference is 2.
//- 'f' appears 1 time in word1 and 0 times in word2. The difference is 1.
//Example 3:
//
//Input: word1 = "cccddabba", word2 = "babababab"
//Output: true
//Explanation: The differences between the frequencies of each letter in word1 and word2 are at most 3:
//- 'a' appears 2 times in word1 and 4 times in word2. The difference is 2.
//- 'b' appears 2 times in word1 and 5 times in word2. The difference is 3.
//- 'c' appears 3 times in word1 and 0 times in word2. The difference is 3.
//- 'd' appears 2 times in word1 and 0 times in word2. The difference is 2.
public class CheckWhetherTwoStringsareAlmostEquivalent {
    public static  boolean checkAlmostEquivalent(String word1, String word2) {
        int[] word1Freq = new int[26];
        int[] word2Freq = new int[26];

        for (char c : word1.toCharArray()) {
            word1Freq[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            word2Freq[c - 'a']++;
        }
        System.out.println(Arrays.toString(word1Freq));
        System.out.println(Arrays.toString(word2Freq));


        for (int i = 0; i < 26; i++) {
            int temp = word1Freq[i] - word2Freq[i];

            if (Math.abs(temp) > 3  ) {
                return false;
            }



        }
        return true;
    }
    public static void main(String[] args){
        String word1 = "zzzyyy", word2 = "iiiiii";


        System.out.println(checkAlmostEquivalent(word1, word2));
    }
}
