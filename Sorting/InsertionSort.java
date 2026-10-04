package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { };
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1, k = j - 1;
            while (k >= 0 && j >= 0 && arr[k] > arr[j]) {
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                k--;
                j--;
            }
        }
            for (int k = 0; k < arr.length; k++) {
                System.out.println("arr[" + k + "] : " + arr[k]);
            }
    }
}
