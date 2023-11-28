package String.letco;

//ignorecase since it can appear both Lower and Upper
//try two pointer approch
//store vowels in map

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//have two pointer index l and r
//if l is not vowel then incr l + 1 if vowel stay
//if r is not vowel incr if vowel stay
// if both l and r are vowel then exchange the value
// s consist of printable ASCII characters.
//
public class ReverseVowelsofaString {

    public static String reverseVowels(String s) {
        if(s == null || s.length()==0) return s;
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            //contains(chars[start]+"")

            while(start<end && vowels.indexOf(chars[start]) == - 1){
                start++;
            }

            while(start<end && !vowels.contains(chars[end]+"")){
                end--;
            }

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }
        return new String(chars);
    }
    public static void main(String[] args){
        String s = "leetcode";

        System.out.print(reverseVowels(s));

    }
}
