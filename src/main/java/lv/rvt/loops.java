package lv.rvt;
import java.util.Scanner;

    public class loops {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int sum = 0;
System.out.println("Uzraksti Skailti : ");
int input = Integer.valueOf(scanner.nextLine());
    for(int i = 1; i < (input+1);i++) {
    sum = sum + i;
     }
    System.out.println(sum);
    }
}
