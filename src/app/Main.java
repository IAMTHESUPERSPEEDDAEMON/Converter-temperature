package app;

public class Main  {
    public static void main (String[] args) {
        System.out.println("Temperature converter app");

        double a = 68;
        double b = 33;

        double celsius = FarenheitToC(a);
        double farenheit = CelsiusToF(b);

        System.out.println("68F to C = " + celsius + "C\n33C to F = " + farenheit + "F");
    }

    public static double FarenheitToC (double a) {
        return (a - 32) * 5/9;
    }

    public static double CelsiusToF (double b) {
        return (b * 9/5) + 32;
    }
}
