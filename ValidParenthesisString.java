package String.letco;

//Example 1:
//
//Input: s = "()"
//Output: true
//Example 2:
//
//Input: s = "(*)"
//Output: true
//Example 3:
//
//Input: s = "(*))"
//Output: true


public class ValidParenthesisString {
    public static boolean checkValidString(String s) {
        int low = 0;
        int high = 0;
        //high is to track highest ( open paranthesis
        //low is to track minum of ( open paranthesis

        for (int i = 0; i < s.length(); i++) {
            // if open parthensis found increase both low and high
            if (s.charAt(i) == '(') {
                low++;
                high++;
                //decrease both l and h when ')' close parthesis
            } else if (s.charAt(i) == ')') {
                if (low > 0) {
                    low--;
                }
                high--;
                // if * -> may be ( or ) so increase high and decrease low
            } else {
                if (low > 0) {
                    low--;
                }
                high++;
            }
            //if there is more ) close parthensis then there is chances that high may go < 0
            // since we are decreasing the high when ) close parthensis is found

            System.out.println(high);
            if (high < 0) {
                return false;
            }
        }
        //when low = 0 means that it has matching closed paranthesis
        return low == 0;
    }
    public static void main(String[] args){
        // ======> (*))
        // case 1 - > Every '(' should have ')'
        //case 2 -> * can be created left,right paranthesis, or -> ""
        String s = "()*)";
        System.out.println(checkValidString(s));





    }
}
