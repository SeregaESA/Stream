import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] array = {1,3,2,4,6,5,8,9,10};

        System.out.println(findMissingNumber(array, 10));
    }
    public static int findMissingNumber(int[] array, int n) {
        // Сумма первых n натуральных чисел
        int expectedSum = n * (n + 1) / 2;

        // Сумма элементов в массиве
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }

        // Пропущенное число
        return expectedSum - actualSum;
    }
}


