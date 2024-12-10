package lv.rvt; 
 
import java.util.ArrayList; 
import java.util.Scanner; 
 
public class App { 
    public static void main(String[] args) throws Exception { 
        Scanner scanner = new Scanner(System.in); 
        ArrayList<Person> persons = new ArrayList<>(); 
 
        System.out.println("Hello! Please select a command:"); 
        System.out.println("show - shows all users"); 
        System.out.println("add - adds a new user"); 
        System.out.println("exit - exits the program\n"); 
 
        String userCommand = scanner.nextLine(); 
 
        while (!userCommand.equals("exit")) { 
            if (userCommand.equals("add")) { 
                System.out.println("adds a user"); 
            } else if (userCommand.equals("show")) { 
                persons = PersonManager.getPersonList(); 
                System.out.printf("%-20s%-6s%-10s%-10s%n", "Name", "Age", "Height", "Weight"); 
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-"); 
                for (Person person : persons) { 
                    System.out.printf("%-20s%-10s%-10s%-10s%n", person.getName(), person.getAge(), person.getHeight(), person.getWeight()); 
                } 
            } else { 
                System.out.println("Input a correct command"); 
            } 
     
            System.out.println("\nPlease select a command:"); 
            userCommand = scanner.nextLine(); 
        } 
 
        scanner.close(); 
    } 
}