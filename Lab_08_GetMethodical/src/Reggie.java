
import java.util.Scanner;

    public class Reggie {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get a valid SSN
            String ssn = SafeInput.getRegExString(scanner, "Enter your SSN (format: XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");
            System.out.println("SSN: " + ssn);

            // Get a valid UC Student M number
            String mNumber = SafeInput.getRegExString(scanner, "Enter your UC Student M number (format: MXXXXX)", "^(M|m)\\d{5}$");
            System.out.println("M number: " + mNumber);

            // Get a valid menu choice
            String menuChoice = SafeInput.getRegExString(scanner, "Enter your menu choice (O/S/V/Q)", "^[OoSsVvQq]$");
            System.out.println("Menu choice: " + menuChoice);

            scanner.close();
        }
    }


