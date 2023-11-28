package String.letco;

//Input: n = 3
//Output: ["1","2","Fizz"]
//Example 2:
//
//Input: n = 5
//Output: ["1","2","Fizz","4","Buzz"]

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static  void main(String[] args){

        List<String> result = new ArrayList<>();

        Integer n = 15;

        //int buzz =0;
       for(int i = 1,fizz =0,buzz=0; i <= n ; i++){
           fizz++;
           buzz++;
           if(fizz==3 && buzz==5){
               result.add("FizzBuzz");
               fizz=0;
               buzz=0;

           }
            else if(fizz == 3 ){
                result.add("Fizz");
                fizz=0;
            }
            else if(buzz==5){
                result.add("Buzz");
                buzz=0;
            }else result.add(i+"");
        }
       System.out.println(result);



    }
}
