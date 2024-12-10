package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello! Choose a command");
        System.out.println();
        System.out.println("show - show all persons");
        System.out.println("add - add a person");
        System.out.println("help - show commands");
        System.out.println("exit - exit the programm");
        
        while (true) {
            System.out.println();
            System.out.print("Command: ");
            String command = scanner.nextLine();
            System.out.println();
            
            if (command.equals("add")) {
                System.out.println("Enter name:");
                String name = scanner.nextLine();
                System.out.println("Enter age:");
                int age = scanner.nextInt();
                System.out.println("Enter weight:");
                double weight = scanner.nextDouble();
                System.out.println("Enter height:");
                double height = scanner.nextDouble();
        
                Person person = new Person(name, age, weight, height);
                PersonManager.addPerson(person);
            }
    
            if (command.equals("show")) {
                ArrayList<Person> persons = PersonManager.getPersonList();
    
                for (Person person : persons) {
                    System.out.println(person);
                }
            }

            if (command.equals("help")) {
                System.out.println("show - show all persons");
                System.out.println("add - add a person");
                System.out.println("help - show commands");
                System.out.println("exit - exit the programm");
            }

            if (command.equals("exit")) {
                break;
            }
        }
        scanner.close();
        
    }
}