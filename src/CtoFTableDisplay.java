public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.println("Celsius  Fahrenheit");

        for (int i = -100; i <= 100; i++) {
            double f = CtoF(i);
            System.out.printf("%-5d %10.2f \n", i, f);
         }






    }

    public static double CtoF(double Celsius) {
        double c = Celsius;
        double f = (c*1.8) + 32;
        return f;
    }
}
