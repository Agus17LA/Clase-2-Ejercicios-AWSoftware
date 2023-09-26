package clase_3;

import java.util.ArrayList;
import java.util.List;

public class SumOfConsecutiveNumbersRecursive {
    public static List<Integer> isSumOfConsecutiveNumbersRecursive(int value, int start) {
        if (value <= 0 || start > value) {
            return null;
        }

        if (value == start) {
            List<Integer> result = new ArrayList<>();
            result.add(value);
            return result;
        }

        List<Integer> result = isSumOfConsecutiveNumbersRecursive(value - start, start + 1);

        if (result != null) {
            result.add(0, start);
            return result;
        }

        return isSumOfConsecutiveNumbersRecursive(value, start + 1);
    }

    public static void main(String[] args) {
        int value = 21;
        List<Integer> result = isSumOfConsecutiveNumbersRecursive(value, 1);

        if (result != null) {
            System.out.println(value + " can be expressed as the sum of consecutive positive integers:");
            System.out.println(result);
        } else {
            System.out.println(value + " cannot be expressed as the sum of consecutive positive integers.");
        }
    }
}
