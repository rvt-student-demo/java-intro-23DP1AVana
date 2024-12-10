package lv.rvt;
import java.io.BufferedReader;
import java.util.ArrayList;

import lv.rvt.Helper;

public class PersonManger {
    public ArrayList<Person> getPersonList() throws Exception{
    ArrayList<Person> persons = new ArrayList<>();

Person person1 = new Person("Adrians");

while( Helper.getReader("src/data/person.csv").readLine() != null){
    String line = Helper.getReader("src/data/person.csv").readLine();
    String[] data = line.split(",");
    Person person = new Person(data[0], data[1]);
    persons.add(person);
};
persons.add(person1);
    return persons;
}
}