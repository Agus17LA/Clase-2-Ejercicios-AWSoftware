package clase_2;

public class Factorial {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        //int resultado = factorial(3);
        //System.out.println(resultado);

        double resultado = factorial(3);
        System.out.println(resultado);
    }

    public static <T extends Number> double factorial(T n) {
        int num = n.intValue();
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}