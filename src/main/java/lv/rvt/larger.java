package lv.rvt;
import java.util.Scanner;

public class larger {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ievadi 1sk");
        int number = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadi 2sk");
        int number2 = Integer.valueOf(scanner.nextLine());
        
        
        if (number > number2){
            System.out.println("Lielāks skaitlis ir : " + number);
        }else if(number == number2){
            System.out.println("Abi skaitļi ir  : " + number2);
        }else{
            System.out.println("Lielāks skaitlis ir : " + number2);
    

       
    }

}}
    


