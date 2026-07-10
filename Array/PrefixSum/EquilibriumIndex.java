package PrefixSum;

import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,7,3,6,5,6};
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        int idx = -1;
        if(arr.length == 1 || arr.length == 0) {
            idx = 0;
        }else{
        for(int i = 1 ; i < arr.length ; i++){
            int Lsum = prefix[i-1];
            int Rsum = prefix[arr.length-1] - prefix[i];
            if(Lsum == Rsum ){
                idx = i ;
            }   
            
        }
    }
         System.out.println( "index " + idx);



        sc.close();
    }
}
