package String.letco;

//Input: chars = ["a","a","b","b","c","c","c"]
//Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
//Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
//Example 2:
//
//Input: chars = ["a"]
//Output: Return 1, and the first character of the input array should be: ["a"]
//Explanation: The only group is "a", which remains uncompressed since it's a single character.
//Example 3:
//
//Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
//Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
//Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args){
        String[]  chars = {"a","a","b"};
        int i =0;
        int j=0;

        int n = chars.length;

        while(i < n){
            int count = 1;
            String s = chars[i];

            while(i + 1 < n && chars[i] == chars[i+ 1]){
                count++;
                i++;

            }
            //if char count is 1 then enter the char itself
            if (count == 1) {

                chars[j++] = s;
            }
            //if the char count is > 1 then add the char and check if it is
            //greater then 9 if so then take var = count as string (eg -> 10 -> {a,b,1,0})
            //if less then 9 add the count
            if(count >1){
                chars[j++] = chars[i];
                //taking count as string
                String temp = count+"";
                for(int k = 0; k < temp.length(); k++){
                    chars[j++] = temp.charAt(k)+"";
                }
            }
            i++;
        }


        System.out.println(j);
        System.out.println(Arrays.toString(chars));


    }
}
