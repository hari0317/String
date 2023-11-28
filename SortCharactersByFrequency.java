package String.letco;
//Example 1:
//
//Input: s = "tree"
//Output: "eert"
//Explanation: 'e' appears twice while 'r' and 't' both appear once.
//So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
//Example 2:
//
//Input: s = "cccaaa"
//Output: "aaaccc"
//Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
//Note that "cacaca" is incorrect, as the same characters must be together.
//Example 3:
//
//Input: s = "Aabb"
//Output: "bbAa"
//Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
//Note that 'A' and 'a' are treated as two different characters.

import java.util.Arrays;

public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        int freq[] = new int[256];
        int len = s.length();
        Character str[] = new Character[len];

        //adding the freq of the char in freq[]
        //converting str to char[] in str[]
        for(int i = 0;i<len;i++){
            char ch = s.charAt(i);
            str[i] = ch;
            freq[ch]++;
        }

        // sorting the array using the frequency using compare method in Integer
        Arrays.sort(str,(charA, charB)->
                (freq[charA]==freq[charB])?
                        Integer.compare(charA,charB):Integer.compare(freq[charB],freq[charA]));

        StringBuilder Strbuilder = new StringBuilder();
        for(int idx = 0;idx<len;idx++){
            Strbuilder.append(str[idx]);
        }
        return  Strbuilder.toString();

    }
    public static void main(String[] args){

        String s = "Aabb";
        System.out.println(frequencySort(s));


    }
}
