package lv.rvt;
import java.util.Scanner;

public class numbersumofnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int numberSum = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }

            numberSum += input;
            number++;
        }
        System.out.println("Number of numbers: " + number);
        System.out.println("Sum of the numbers: " + numberSum);


    }
}


       
    
