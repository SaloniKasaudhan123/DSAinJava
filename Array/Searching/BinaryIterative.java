package Searching;

import java.util.Scanner;

public class BinaryIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {12,23,34,34,34,45,56,67,78,78,89,90,100};
        System.out.println("Enter target : ");
        int target = sc.nextInt();
        int idx = -1 , low = 0 , high = arr.length-1 ;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                idx = mid;
                break;
            }else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        System.out.println("Target at idx : " + idx + Math.ceil(5.98));


        sc.close();
    }
}
