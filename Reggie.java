import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = getRegExString(in, "Enter SSN (XXX-XX-XXXX): ", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNumber = getRegExString(in, "Enter UC M number (M#####): ", "^(M|m)\\d{5}$");
        String choice = getRegExString(in, "Enter choice (O/S/V/Q): ", "^[OoSsVvQq]$");

        System.out.println("SSN: " + ssn);
        System.out.println("M number: " + mNumber);
        System.out.println("Choice: " + choice);

        in.close();
    }

    public static String getRegExString(Scanner in, String prompt, String pattern)
    {
        String input;

        do
        {
            System.out.print(prompt);
            input = in.nextLine();
        }
        while (!input.matches(pattern));

        return input;
    }
}