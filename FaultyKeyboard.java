package String.letco;
//Input: s = "string"
//Output: "rtsng"
//Explanation:
//After typing first character, the text on the screen is "s".
//After the second character, the text is "st".
//After the third character, the text is "str".
//Since the fourth character is an 'i', the text gets reversed and becomes "rts".
//After the fifth character, the text is "rtsn".
//After the sixth character, the text is "rtsng".
//Therefore, we return "rtsng".
//Example 2:
//
//Input: s = "poiinter"
//Output: "ponter"
public class FaultyKeyboard {
    public static void main(String[] args){
        String s = "poiinter";
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c == 'i'){
                sb.reverse();
            }else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());



    }
}
