
package lv.rvt;
import java.util.Scanner;

public class gifttax {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Whats the gifts value ?");
        int number = Integer.valueOf(scanner.nextLine());
        
        
        if (number < 5000){
            System.out.println("No tax! " + number);
        }else if(number >=5000 && number <25000){
            System.out.println("Tax : "+ (100+(number-5000)*0.08));
        }else if(number >= 25000 && number <55000){
            System.out.println("Tax : "+ (1700+(number-25000)*0.1));
        }else if(number >= 55000 && number <200000){
            System.out.println("Tax : "+ (4700+(number-55000)*0.12));
        }else if(number >= 200000 && number <1000000){
            System.out.println("Tax : "+ (22100+(number-200000)*0.15));
        }else if(number >= 1000000){
        System.out.println("Tax : "+ (	142100+(number-100000)*0.17));
     
    

       
    }

}} 
     
