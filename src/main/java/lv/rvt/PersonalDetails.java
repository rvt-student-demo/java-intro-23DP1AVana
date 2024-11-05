package lv.rvt;
import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int totalYears = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            String name = parts[0];
            int birthYear = Integer.parseInt(parts[1]);

            if (name.length() > longestName.length()) {
                longestName = name;
            }

            totalYears += birthYear;
            count++;
        }

        double average = (double) totalYears / count;
        System.out.println("Longest name: " + longestName);
        System.out.printf("Average of the birth years: %.1f\n", average);
    }
}

