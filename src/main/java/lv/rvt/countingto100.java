package lv.rvt;
import java.util.Scanner;
public class countingto100 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Ievadi skaitli no kura skaitisi");
        int sk=Integer.valueOf(Scanner.nextLine());
        int end =101;
        for (int i = sk; i < end; i++) {
            System.out.println(i);
        }  
    }
}

