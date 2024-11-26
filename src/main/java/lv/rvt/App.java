package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
public class App {

public static void main(String[] args) throws Exceptions{
BufferedReader reader = Helper.getReader("person.csv");

String row1 = reader.readLine();

System.out.println(row1);
}
}