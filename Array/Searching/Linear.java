package Searching;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {23,54,67,98,20,34,27,38,61};
        System.out.println("Enter target : ");
        int target = sc.nextInt();
        int idx = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                idx = i;
                break;
            }
        }
            System.out.println("Target at idx " + idx);
        

            sc.close();  
    }
}
       