package String.letco;

import java.util.Arrays;
import java.util.stream.Stream;



//Input: s = "Hello World"
//Output: 5
//Explanation: The last word is "World" with length 5.
//Example 2:
//
//Input: s = "   fly me   to   the moon  "
//Output: 4
//Explanation: The last word is "moon" with length 4.
//Example 3:
//
//Input: s = "luffy is still joyboy"
//Output: 6
//Explanation: The last word is "joyboy" with length 6.
public class LengthofLastWord {

    public static void main(String[] args){

        String s = "   fly me   to   the moon  ";

        String[] ss = Stream.of(s.split(" ")).toArray(String[]::new);


        System.out.print(ss[ss.length - 1].length());




    }
}
