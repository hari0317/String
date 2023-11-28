package String.letco;

//Example 1:
//
//Input: s = "abc", t = "ahbgdc"
//Output: true
//Example 2:
//
//Input: s = "axc", t = "ahbgdc"
//Output: false

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        if(t.length() == 0) return false;
        int i = 0;
        int sLength =0;
        while(i < t.length()){

            if(sLength < s.length() && t.charAt(i) == s.charAt(sLength)){
                sLength++;
            }
            i++;
        }

        if(sLength == s.length()){
            return true;
        }else{
            return false;
        }
        //if slen == s.length() return true
        //incr slen when it finds the char in string

    }

    public static void main(String[] args){

        String  s = "", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
}
