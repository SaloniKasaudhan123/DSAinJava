package PrefixSum;

import java.util.Scanner;

public class RangeSumQuert {
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
        System.out.print("Enter left range : ");
        int L = sc.nextInt();
        System.out.print("Enter right range : ");
        int R = sc.nextInt();
        if(L==0) System.out.println(prefix[R]);
        else System.out.println(prefix[R]-prefix[L-1]);

        
        sc.close();
    }
}
