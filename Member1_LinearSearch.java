import java.util.Random;

public class Member1_LinearSearch {
    public static void main(String[] args) {
        System.out.println("Algorithm: Linear Search");
        System.out.println("Input Size | Time (ms)");
        System.out.println("----------------------");

         int[] sizes = {100, 500, 1000};
        for (int size : sizes) {
            int[] arr = generateRandomArray(size);
            int target = arr[new Random().nextInt(size)]; // Random target element
            long startTime = System.nanoTime();
            linearSearch(arr, target);
            long endTime = System.nanoTime();
            double timeTaken = (endTime - startTime) / 1_000_000.0;
            System.out.printf("%-10d | %.4f%n", size, timeTaken);
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
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
