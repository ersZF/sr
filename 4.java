import java.util.Scanner;

public class ArrayFill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = fillArray(n);

        System.out.println("Array elements:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] fillArray(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }
}
