package String.letco;

//Input: str1 = "ABCABC", str2 = "ABC"
//Output: "ABC"
//Example 2:
//
//Input: str1 = "ABABAB", str2 = "ABAB"
//Output: "AB"
//Example 3:
//
//Input: str1 = "LEET", str2 = "CODE"
//Output: ""

//Algo ---> Euclid’s Algorithm
//greatest common divisor of two integers is the largest number which divides both numbers
// with a remainder of zero. We’ll use gcd(a, b) to denote the greatest common divisor of integers a and b.
public class GreatestCommonDivisorofStrings {
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }


        int gcd = gcd(str1.length(), str2.length());
        return str2.substring(0, gcd);
    }
    //ABCABC
    //ABC

    //For some positive integers a and b, it works by repeatedly subtracting the smaller number from the larger one until they become equal.
    // At this point, the value of either term is the greatest common divisor of our inputs
    public static int gcd(int a, int b) {
        return (b == 0)? a : gcd(b, a % b);
    }
    public static  void main(String[] args){
        String str1 = "LEET", str2 = "CODE";
        System.out.println(gcdOfStrings(str1,str2));

    }
}
