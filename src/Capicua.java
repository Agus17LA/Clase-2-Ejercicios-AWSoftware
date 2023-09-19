public class Capicua {

    public static boolean esCapicuaNoRecursivo(int numero) {
        String numeroStr = Integer.toString(numero);
        return numeroStr.equals(new StringBuilder(numeroStr).reverse().toString());
    }

    public static void main(String[] args) {
        boolean resultado = esCapicuaNoRecursivo(121212121);
        System.out.println(resultado); // Salida: true
    }
}
