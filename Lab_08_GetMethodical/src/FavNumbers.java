import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favNum = 0;
        double faveDub = 0;
        favNum = SafeInput.getInt(in, "Enter your favorite integer");
        faveDub = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.println("\nYour favorite integer is: " + favNum + " and your favorite double is " + faveDub);
    }
}
