import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int year = getRangedInt(in, "Enter birth year (1950-2015): ", 1950, 2015);
        int month = getRangedInt(in, "Enter birth month (1-12): ", 1, 12);
        int day = getDaysInMonth(in, month);
        int hour = getRangedInt(in, "Enter birth hour (0-23): ", 0, 23);
        int minute = getRangedInt(in, "Enter birth minute (0-59): ", 0, 59);

        System.out.printf("Birth Date and Time: %d-%d-%d %02d:%02d\n", year, month, day, hour, minute);
        in.close();
    }

    public static int getRangedInt(Scanner in, String prompt, int low, int high)
    {
        int input;

        do
        {
            System.out.print(prompt);

            while (!in.hasNextInt())
            {
                System.out.print("Invalid input. " + prompt);
                in.next();
            }
            input = in.nextInt();
        }
        while (input < low || input > high);

        return input;
    }
    public static int getDaysInMonth(Scanner in, int month)
    {
        switch(month)
        {
            case 2: return getRangedInt(in, "Enter day (1-29): ", 1, 29);
            case 4: case 6: case 9: case 11: return getRangedInt(in, "Enter day (1-30): ", 1, 30);
            default: return getRangedInt(in, "Enter day (1-31): ", 1, 31);
        }
    }
}