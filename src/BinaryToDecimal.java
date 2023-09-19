public class BinaryToDecimal {

    public static int binaryToDecimal(double binario) {
        String binarioStr = String.valueOf(binario);
        int decimal = Integer.parseInt(binarioStr, 2);
        return decimal;
    }

    public static void main(String[] args) {
        double numeroBinario = 1010.0; // Ejemplo: el número binario 1010.0
        int resultadoDecimal = binaryToDecimal(numeroBinario);
        System.out.println(resultadoDecimal); // Salida: 10
    }
}