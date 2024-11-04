import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter integer: ");

        while (!in.hasNextInt())
        {
            System.out.print("Invalid input ... Enter a valid integer: ");
            in.next();
        }

        int favoriteInt = in.nextInt();

        System.out.print("Enter double: ");

        while (!in.hasNextDouble())
        {
            System.out.print("Invalid input ... Enter a valid double: ");
            in.next();
        }

        double favoriteDouble = in.nextDouble();

        System.out.println("integer: " + favoriteInt);

        System.out.println("double: " + favoriteDouble);

        in.close();
    }
}