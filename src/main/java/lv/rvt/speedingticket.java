package lv.rvt;
import java.util.Scanner;

public class speedingticket {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ievadi ātrumu");

        int number = Integer.valueOf(scanner.nextLine());
        
        if (number > 120){
            System.out.println("Ātrums lielāks par 120");
        }

       


    
    }

}

