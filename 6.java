import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr100 = new int[100];
        int[] arr1000 = new int[1000];
        int[] arr10000 = new int[10000];

        for (int i = 0; i < arr100.length; i++) {
            arr100[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < arr1000.length; i++) {
            arr1000[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < arr10000.length; i++) {
            arr10000[i] = (int) (Math.random() * 10000);
        }

        long startTime, endTime;
        System.out.println("Сортировка массива из 100 элементов:");
        startTime = System.currentTimeMillis();
        Arrays.sort(arr100);
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (endTime - startTime) + " миллисекунд");

        System.out.println("\nСортировка массива из 1000 элементов:");
        startTime = System.currentTimeMillis();
        Arrays.sort(arr1000);
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (endTime - startTime) + " миллисекунд");

        System.out.println("\nСортировка массива из 10000 элементов:");
        startTime = System.currentTimeMillis();
        Arrays.sort(arr10000);
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (endTime - startTime) + " миллисекунд");
    }
}
