package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 10, 8, 6, 2 };
        for (int i = 0; i < arr.length; i++) {
            int j = 1, maxIndex = 0;
            while (j < arr.length - i) {
                if (arr[j] > arr[maxIndex])
                    maxIndex = j;
                j++;
            }
            int swapIndex = arr.length - 1 - i;
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[swapIndex];
            arr[swapIndex] = temp;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println("arr[k] : " + arr[k]);
        }
    }
}
