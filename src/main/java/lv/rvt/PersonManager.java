package lv.rvt; 
 
import java.io.BufferedReader; 
import java.io.BufferedWriter; 
import java.nio.file.StandardOpenOption; 
import java.util.ArrayList; 
 
public class PersonManager { 
    public static ArrayList<Person> getPersonList() throws Exception { 
        ArrayList<Person> persons = new ArrayList<>(); 
        BufferedReader reader = Helper.getReader("persons.csv"); 
 
        reader.readLine(); 
         
        String line; 
        while ((line = reader.readLine()) != null) { 
            String[] parts = line.split(", "); 
 
            Person person = new Person(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), Integer.valueOf(parts[3])); 
            persons.add(person); 
        } 
 
        return persons; 
    } 
 
        public static void addPerson (Person person) throws Exception { 
        BufferedWriter writer = Helper.getWriter("persons.csv", StandardOpenOption.APPEND); 
 
        writer.write(person.toCsvRow()); 
        writer.newLine(); 
        writer.close(); 
 
        System.out.println("Program ended!"); 
    } 
}