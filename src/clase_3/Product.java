package clase_3;

public class Product {
    public static int product(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        if (b == 1) {
            return a;
        }
        return a + product(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int result = product(a, b);

        System.out.println("The product of " + a + " and " + b + " is: " + result);
    }
}
