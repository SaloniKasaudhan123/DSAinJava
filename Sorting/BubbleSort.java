package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12,11, 13,5,6};
        int j = 1 , i = 0;
        for ( i = 0; i < arr.length-1 ; i++) {
            j = 1;
            while (j <= arr.length-1-i) {
                if(arr[j] < arr[j-1]){
                    int temp =arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    System.out.println( "arr["+i+"] : " + arr[i]);
                    System.out.println( "arr["+j+"] : " + arr[j]);
                }
                j++; 
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println( "arr[k] : " + arr[k]);
        }
    }
}
