import java.util.Scanner;

public class MergeSort {
    public static void merge(int arr[], int begin, int end){
        int i = begin;
        int mid = begin + (end - begin) / 2;
        int j = mid + 1;
        int k = 0;
        int d[] = new int[arr.length];

        while (i <= mid && j <= end){
            if (arr[i] <= arr[j]){
                d[k] = arr[i];
                i++;
            }
            else{
                d[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid){
            d[k] = arr[i];
            i++;
            k++;
        }

        while (j <= end){
            d[k] = arr[j];
            j++;
            k++;
        }

        for (i = 0; i < k; i++)
            arr[begin + i] = d[i];
    }

    public static void mergeSort(int[] arr, int left, int right){
        int swap;
        if (left < right){
            if (right - left == 1){
                if (arr[left] > arr[right]){
                    swap = arr[left];
                    arr[left] = arr[right];
                    arr[right] = swap;
                }
            }
            else{
                mergeSort(arr, left, left + (right - left) / 2);
                mergeSort(arr, left + (right - left) / 2 + 1, right);
                merge(arr, left, right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Merge sort: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();

        mergeSort(arr, 0, n - 1);

        System.out.print("Result: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
