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

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
