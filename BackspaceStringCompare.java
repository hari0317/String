package String.letco;

import java.util.Arrays;

//Input: s = "ab#c", t = "ad#c"  ->
//Output: true
//Explanation: Both s and t become "ac".
//Example 2:
//
//Input: s = "ab##", t = "c#d#"
//Output: true
//Explanation: Both s and t become "".
//Example 3:
//
//Input: s = "a#c", t = "b"
//Output: false
//Explanation: s becomes "c" while t becomes "b".
public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        char[] firstString = s.toCharArray();
        char[] secondString = t.toCharArray();

        int k = stringProcessing(firstString);
        int l = stringProcessing(secondString);

        System.out.println(k + "k ================================");
        System.out.println(l + "l=================================");

      //  System.out.println(Arrays.toString(firstString));
      //  System.out.println(Arrays.toString(secondString));

        if( k != l) return false;
        for(int i = 0 ; i < k; i++){
            if(firstString[i] != secondString[i]) return false;

        }
        return true;


    }
    public static int stringProcessing(char[] arr){
        int k = 0; // k =0
        for(char c : arr){
            if(c != '#'){
                arr[k++] = c;
                System.out.println(Arrays.toString(arr));
            }else if(k > 0){
                k--;
            }
        }
        return k;
    }
    public static void main(String[] args){

        String  s = "a#c", t = "b";
        System.out.println(backspaceCompare(s,t));
    }
}
