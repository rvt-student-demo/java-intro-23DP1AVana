package lv.rvt;

import java.util.Scanner;

public class App
{
public static void main( String[] args ) {
Scanner scanner = new Scanner(System.in); // Izveidojam skaneri vienu reizi, un pielietojam visā programmā

System.out.println("Ievadi savu vārdu:");
String name = scanner.nextLine();
System.out.println("Ievadiet savu uzvārdu:");
String lastname = scanner.nextLine();
System.out.println("Ievadiet savu grupu");
String group = scanner.nextLine();

// Izvade vienā rindiņā izmantojot 3 mainīgos
// Output example: Students: <name> <surname>, grupa: <group>

// String concatenation
System.out.println(name + " " + lastname + " " + "grupa: " + group);


}

}



