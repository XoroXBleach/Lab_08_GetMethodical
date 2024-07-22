
    import java.util.Scanner;

    public class BirthDateTime {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int year = SafeInput.getRangedInt(scanner, "Enter year", 1950, 2015);
            int month = SafeInput.getRangedInt(scanner, "Enter month", 1, 12);
            int day = SafeInput.getRangedInt(scanner, "Enter day", 1, getDaysInMonth(month, year));
            int hour = SafeInput.getRangedInt(scanner, "Enter hour", 1, 24);
            int minute = SafeInput.getRangedInt(scanner, "Enter minute", 0, 59);

            System.out.println("Date and time of birth: " + year + "-" + month + "-" + day + " " + hour + ":" + minute);
        }

        public static int getDaysInMonth(int month, int year) {
            switch (month) {
                case 2:
                    return (isLeapYear(year)) ? 29 : 28;
                case 4: case 6: case 9: case 11:
                    return 30;
                default:
                    return 31;
            }
        }

        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
}
