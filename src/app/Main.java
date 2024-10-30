package app;

public class Main  {
    public static void main (String[] args) {
        System.out.println("Temperature converter app");

        double a = 68;
        double b = 33;

        double celsius = FarenheitToC(a);
        System.out.println("68F to C = " + celsius + "C");
    }

    public static double FarenheitToC (double a) {
        double result = (a - 32) * 5/9;

        return result;
    }
}
