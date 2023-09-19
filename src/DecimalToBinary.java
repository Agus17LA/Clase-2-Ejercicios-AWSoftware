public class DecimalToBinary {

    public static double decimalToBinary(int decimal) {
        String binaryString = Integer.toBinaryString(decimal);
        return Double.parseDouble(binaryString);
    }

    public static void main(String[] args) {
        int numeroDecimal = 10; // Ejemplo: convertir el número 10 a binario
        double resultadoBinario = decimalToBinary(numeroDecimal);
        System.out.println(resultadoBinario); // Salida: 1010.0
    }
}
