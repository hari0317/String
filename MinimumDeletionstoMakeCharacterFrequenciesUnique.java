package String.letco;

//Example 1:
//
//Input: s = "aab"
//Output: 0
//Explanation: s is already good.
//Example 2:
//
//Input: s = "aaabbbcc"
//Output: 2
//Explanation: You can delete two 'b's resulting in the good string "aaabcc".
//Another way it to delete one 'b' and one 'c' resulting in the good string "aaabbc".
//Example 3:
//
//Input: s = "ceabaacb"
//Output: 2
//Explanation: You can delete both 'c's resulting in the good string "eabaab".
//Note that we only care about characters that are still in the string at the end (i.e. frequency of 0 is ignored).
// Logic
// 1 -> add the frequency of each char in int[]
//2 -> Sort the freq  in ascending order. This will arrange the frequencies in non-decreasing order.(0 0 1 2 2)

//3 -> Initialize a variable del to keep track of the minimum deletions required and set it to 0.

//4 -> Iterate through the sorted freq  in reverse order,
// starting from index 24 (since there are 26 lowercase English letters).

//5 -> Inside the loop, check if the current frequency freq[i] is greater than or equal to the next frequency freq[i+1].
// If it is, then you need to delete some characters to make them unique.

//6 -> Calculate the number of characters to delete to make freq[i] less than freq[i+1].
// This is done by subtracting freq[i+1] - 1 from freq[i] and setting freq[i] to this new value. Update the del variable by adding this difference.
//Continue this process until you have iterated through all frequencies,

import java.util.Arrays;

public class MinimumDeletionstoMakeCharacterFrequenciesUnique {
    public static int minDeletions(String s){
        int[] freq = new int[26];
        for(char c: s.toCharArray()){
            freq[c - 'a']++;
        }

        Arrays.sort(freq);
        System.out.println(Arrays.toString(freq));
        int del = 0;
        for(int i = 24; i >= 0; i--){
            //after certain iteartion we could see freq[i] == 0  eg -> 0000000012334
             if(freq[i] == 0){
                break;
            }
            if(freq[i] >= freq[i + 1]){
                int prev = freq[i];
                freq[i] = Math.max(0,freq[i + 1] -1); //reducing the present element frequency by (next element frequency - 1)
                del += prev - freq[i];
            }
        }
        return del;
    }
    public static void main(String[] args){
        String  s = "ceabaacb";

        System.out.println(minDeletions(s));
    }
}
