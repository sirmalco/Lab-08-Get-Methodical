public class CtoFDisplay
{
    public static void main(String[] args)
    {
        System.out.printf("%-10s %-10s%n", "Celsius", "Fahrenheit");

        for (int celsius = -100; celsius <= 100; celsius++)
        {
            System.out.printf("%-10d %-10.2f%n", celsius, CtoF(celsius));
        }
    }

    public static double CtoF(double celsius)
    {
        return (celsius * 9/5) + 32;
    }
    
}