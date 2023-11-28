package String.letco;

//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.

public class LongestCommonPrefixsol2 {

    public static String longestCommonPrefix(String[] strs) {

        String s = "";
        String smallestString = null;
        int smallestStringLen = strs[0].length();
        int counter = 0;

        for(int i = 0; i < strs.length ; i++){
            if(strs[i].length() <= smallestStringLen){
                smallestString = strs[i];
                smallestStringLen = strs[i].length();
            }
        }
        System.out.println(smallestString);

        for(int i = 0 ; i < smallestStringLen; i++){
            for(int j = 0; j < strs.length; j++){
                if(strs[j] == smallestString){
                    continue;
                }
                if(strs[j].charAt(i) == smallestString.charAt(i)){
                    counter++;
                }else{
                    return s;
                }
                if(counter == strs.length - 1){
                    s += smallestString.charAt(i);
                    counter = 0;
                }
            }
        }
        return s;
    }

    public static void main(String[] args)
    {

        String[] strs = {"fwe", "flot", "floght"};


        System.out.println(longestCommonPrefix(strs));
    }

}
