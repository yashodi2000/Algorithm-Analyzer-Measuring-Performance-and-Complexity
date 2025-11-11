import java.util.Random;

public class Member3_BubbleSort {
    public static void main(String[] args) {
        System.out.println("Algorithm: Bubble Sort");
        System.out.println("Input Size | Time (ms)");
        System.out.println("----------------------");

        int[] sizes = {100, 500, 1000};
        for (int size : sizes) {
            int[] arr = generateRandomArray(size);
            long startTime = System.nanoTime();
            bubbleSort(arr);
            long endTime = System.nanoTime();
            double timeTaken = (endTime - startTime) / 1_000_000.0;
            System.out.printf("%-10d | %.4f%n", size, timeTaken);
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(10000);
        }
        return arr;
    }
}
