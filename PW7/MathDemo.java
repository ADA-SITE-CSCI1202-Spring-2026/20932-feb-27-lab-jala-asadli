import java.util.Scanner;

public class MathDemo {

    public static int min(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    public static float mean(int[] arr) {
        return (float) sum(arr) / arr.length;
    }

    public static int factorial(int n) {
        n = Math.abs(n);
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Min: " + min(numbers));
        System.out.println("Max: " + max(numbers));
        System.out.println("Sum: " + sum(numbers));
        System.out.println("Mean: " + mean(numbers));

        System.out.print("Enter number for factorial: ");
        int n = sc.nextInt();

        System.out.println("Factorial: " + factorial(n));

        sc.close();
    }
}