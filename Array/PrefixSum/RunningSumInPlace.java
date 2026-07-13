

import java.util.Scanner;

public class RunningSumInPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,1,7,4,6,3};
        for(int i = 1 ; i < arr.length ; i++){
            arr[i] = arr[i-1] + arr[i];
        }     
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }     
        sc.close();
    }
}
