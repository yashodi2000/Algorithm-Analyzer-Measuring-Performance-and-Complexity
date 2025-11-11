import java.util.Random;

public class Member4_QuickSort {
     public static void main(String[] args) {
        System.out.println("Algorithm: Quick Sort");
        System.out.println("Input Size | Time (ms)");
        System.out.println("----------------------");

        int[] sizes = {100, 500, 1000};
        for (int size : sizes) {
            int[] arr = generateRandomArray(size);
            long startTime = System.nanoTime();
            quickSort(arr, 0, arr.length - 1);
            long endTime = System.nanoTime();
            double timeTaken = (endTime - startTime) / 1_000_000.0;
            System.out.printf("%-10d | %.4f%n", size, timeTaken);
        }
    }
