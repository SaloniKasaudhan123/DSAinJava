package PrefixSum;

import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,1,7,4,6,3};
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i = 0 ; i < prefix.length ; i++){
            System.out.print(prefix[i] + " ");
        }
        

        
        sc.close();
    }
}
