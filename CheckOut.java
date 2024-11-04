import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double total = 0;
        String moreItems;

        do
        {
            double price = getRangedDouble(in, "Enter item price ($0.50 - $10.00): ", 0.50, 10.00);
            total += price;

            System.out.print("Do you have more items? (Y/N): ");
            moreItems = in.next();
        }

        while (moreItems.equalsIgnoreCase("Y"));

        System.out.printf("Total cost: $%.2f\n", total);
        in.close();
    }

    public static double getRangedDouble(Scanner in, String prompt, double low, double high) {

        double input;

        do
        {
            System.out.print(prompt);

            while (!in.hasNextDouble())
            {
                System.out.print("Invalid input. " + prompt);
                in.next();
            }

            input = in.nextDouble();
        }
        while (input < low || input > high);

        return input;
    }
}