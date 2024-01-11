package convertdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ShortDateConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();

        // Parse the input date
        LocalDate date = LocalDate.parse(shortDate);

        // Extract year, month, and day
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        // Convert month number to month name
        String monthName = date.getMonth().toString();

        // Format and display the full date representation
        System.out.println("Correct Date ="+ monthName.substring(0, 1) + monthName.substring(1).toLowerCase() + " " + day + ", " + year);
        scanner.close();
    }
}
