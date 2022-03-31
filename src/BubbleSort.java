import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int swap;
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 1; j < arr.length; j++){
                if (arr[j - 1] > arr[j]){
                    swap = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = swap;
                }
            }
            for (int k = 0; k < arr.length; k++)
                System.out.print(arr[k] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Bubble sort: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();

        bubbleSort(arr);

        System.out.print("Result: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
