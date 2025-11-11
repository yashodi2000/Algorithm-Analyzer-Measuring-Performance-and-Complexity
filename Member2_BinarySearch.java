import java.util.Arrays;
import java.util.Random;

public class Member2_BinarySearch {
    public static void main(String[] args) {
        System.out.println("Algorithm: Binary Search");
        System.out.println("Input Size | Time (ms)");
        System.out.println("----------------------");

        int[] sizes = {100, 500, 1000};
        for (int size : sizes) {
            int[] arr = generateRandomArray(size);
            Arrays.sort(arr);
            int target = arr[new Random().nextInt(size)];

long startTime = System.nanoTime();
            binarySearch(arr, target);
            long endTime = System.nanoTime();
            double timeTaken = (endTime - startTime) / 1_000_000.0;
            System.out.printf("%-10d | %.4f%n", size, timeTaken);
        }
    }
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
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