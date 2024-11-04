public class PrettyHeader
{
    public static void main(String[] args)
    {
        prettyHeader("Program start");
    }

    public static void prettyHeader(String msg)
    {
        int width = 60;
        int padding = (width - msg.length() - 6) / 2;

        System.out.println("*".repeat(width));
        System.out.println("***" + " ".repeat(padding) + msg + " ".repeat(padding) + "***");
        System.out.println("*".repeat(width));
    }
}
