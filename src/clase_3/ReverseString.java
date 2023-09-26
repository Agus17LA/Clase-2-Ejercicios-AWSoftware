package clase_3;

public class ReverseString {

    public static String reverseString(String str) {
        // Base case: if the string is empty or has only one character, it is already reversed
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        // Recursive step: reverse the substring starting from the second character, then append the first character
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String inputString = "Hello World";
        String reversedString = reverseString(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }


}
