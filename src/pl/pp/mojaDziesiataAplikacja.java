package pl.pp;

public class mojaDziesiataAplikacja {

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {1, -1, 2, -2, 3, -3};
        int[] test3 = {};
        int[] test4 = null;

        printResult(test1);  // [5, 15]
        printResult(test2);  // [3, 6]
        printResult(test3);  // [0, 0]
        printResult(test4);  // [0, 0]
    }

    public static int[] countAndSumElements(int[] input) {
        if (input == null || input.length == 0)
            return new int[]{0, 0};

        int count = 0;
        int sum = 0;

        for (int number : input) {
            if (number > 0) {
                count++;
                sum += number;
            }
        }

        return new int[]{count, sum};
    }

    private static void printResult(int[] array) {
        int[] result = countAndSumElements(array);
        System.out.println("Liczba elementów > 0: " + result[0] + ", suma: " + result[1]);
    }
}