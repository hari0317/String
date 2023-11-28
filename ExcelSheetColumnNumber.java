package String.letco;

//A -> 1
//B -> 2
//C -> 3
//...
//Z -> 26
//AA -> 27
//AB -> 28
//...

//Example 1:
//
//Input: columnTitle = "A"
//Output: 1
//Example 2:
//
//Input: columnTitle = "AB"
//Output: 28
//Example 3:
//
//Input: columnTitle = "ZY"
//Output: 701

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNumber {
    public static void main(String[] args){
        String columnTitle = "AB";
        int result = 0;
        for(int i = 0; i < columnTitle.length(); i++){
            result *= 26;
            result += columnTitle.charAt(i) - 'A' + 1;
        }
        System.out.print(result);
    }
}
