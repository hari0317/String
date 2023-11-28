package String.letco;


//Input: s = "III"
//Output: 3
//Explanation: III = 3.
//Example 2:
//
//Input: s = "LVIII"
//Output: 58
//Explanation: L = 50, V= 5, III = 3.


import java.util.HashMap;
import java.util.Map;

//Approch -> Save the roman no and Integer value to Key-value pair(MAP)
// step2 > keep adding the Integer also check for case whether i is less then i + 1 if so (-i + i + 1)
public class RomantoInteger {

    public static int romanToInt(String s) {

        int result = 0;
        Map<String,Integer> romanvalues = new HashMap<>();
        romanvalues.put("I",1);
        romanvalues.put("V",5);
        romanvalues.put("X",10);
        romanvalues.put("L",50);
        romanvalues.put("C",100);
        romanvalues.put("D",500);
        romanvalues.put("M",1000);



        for(int i = 0; i < s.length() ; i++){
            char c = s.charAt(i);
            System.out.println(c);
            System.out.println(romanvalues.get(Character.toString(c)));

                   if (i < s.length() - 1 && romanvalues.get(Character.toString(s.charAt(i))) < romanvalues.get(Character.toString(s.charAt(i + 1)))) {

                       result -= romanvalues.get(Character.toString(s.charAt(i)));
                       System.out.println("res " + result);
                   }else{
                       result += romanvalues.get(Character.toString(s.charAt(i)));
                       System.out.println(result + "ressssssssssssssss");
                   }
        }

        return result;

    }

    public static void main(String[] args){

        String s =  "MCMXCIV";
        System.out.print(romanToInt(s));

    }
}
