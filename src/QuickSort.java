import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] arr, int from, int to) {

        if (from < to) {

            int divideIndex = partition(arr, from, to);

            quickSort(arr, from, divideIndex - 1);

            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                int swap  = arr[rightIndex];
                arr[rightIndex] = arr[leftIndex];
                arr[leftIndex] = swap;
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Quick sort: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();

        quickSort(arr, 0, n - 1);

        System.out.print("Result: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
