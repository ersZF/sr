import java.util.Scanner;

public class ArrayFill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        long startTime = System.currentTimeMillis(); 

        int[] arr = fillArray(n);

        long endTime = System.currentTimeMillis(); 
        long executionTime = endTime - startTime; 

        System.out.println("Array elements:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nExecution time of fillArray method: " + executionTime + " ms");
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
