import java.util.Random;

public class Member3_BubbleSort {
    public static void main(String[] args) {
        System.out.println("Algorithm: Bubble Sort");
        System.out.println("Input Size | Time (ms)");
        System.out.println("----------------------");

        int[] sizes = {100, 500, 1000};
        for (int size : sizes) {
            int[] arr = generateRandomArray(size);
            System.out.println("Generated array of size: " + size);
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
