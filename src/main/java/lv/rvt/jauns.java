package lv.rvt;
import java.util.Scanner;


public class jauns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ievadi 1 sk");
        String sk = scanner.nextLine();
        System.out.println("Ievadiet 2 sk");
        String sk2 = scanner.nextLine();

        int nr =Integer.valueOf(sk);
        int nr2 =Integer.valueOf(sk2);


        System.out.println(nr + "*" + nr2 + "="+nr * nr2);
    }

}
