package String.letco;

import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

public class RomantoIntegersol2 {
    public static void main(String[] args){
        String s = "MCMXCIV";

        Map<Character,Integer> map = new HashMap<>();

        map.put('M',1000);
        map.put('C',100);
        map.put('X',10);
        map.put('I',1);
        map.put('V',5);
        map.put('L',50);
        map.put('D',500);
        int res = 0;
        for(int i =0 ; i < s.length() ; i++){
            if(i < s.length() - 1 && map.get(s.charAt(i))  <map.get(s.charAt(i + 1))){
                res -= map.get(s.charAt(i));

            }else //if ( i < s.length() - 1 && s.charAt(i) > s.charAt(i + 1))
             {

                res += map.get(s.charAt(i));
            }

        }

    }
}
