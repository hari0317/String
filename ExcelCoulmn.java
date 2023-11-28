package String.letco;

//Input: columnNumber = 1
//Output: "A"
//Example 2:
//
//Input: columnNumber = 28
//Output: "AB"
//Example 3:
//
//Input: columnNumber = 701
//Output: "ZY"

public class ExcelCoulmn {
    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while(columnNumber>0){
            columnNumber--;
            System.out.println(columnNumber + "clllllllllll");
            result.insert(0, (char)('A' + columnNumber % 26));
            System.out.println(result.toString());
            columnNumber /= 26;
        }

        return result.toString();
    }


    public static void main(String[] args){
        int columnNumber = 28;
        System.out.println(convertToTitle(columnNumber) );
        char c = 64 + 49;
       // System.out.println(c);

    }
}
