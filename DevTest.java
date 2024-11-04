import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);
 /*
        int favoriteInt = SafeInput.getInt(in, "Enter an integer");
        System.out.println("Your integer is: " + favoriteInt);

        double favoriteDouble = SafeInput.getDouble(in, "Enter a double");
        System.out.println("Your double is: " + favoriteDouble);

        int rangedInt = SafeInput.getRangedInt(in, "Enter an integer within the range", 1, 10);
        System.out.println("You entered: " + rangedInt);

        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double within the range", 0.5, 5.5);
        System.out.println("You entered: " + rangedDouble);

        boolean confirmation = SafeInput.getYNConfirm(in, "Continue?");
        System.out.println("Confirm: " + confirmation);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN (XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN: " + ssn);*/

    }

}
