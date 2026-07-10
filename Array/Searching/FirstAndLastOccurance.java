
package Searching;

import java.util.Scanner;

class Solution {
    public int[] FirstAndLast(int[] nums, int target) {
        int st = -1 , low1 = 0 , high1 = nums.length-1 ;
        while (low1 <= high1) {
            int mid = low1 + (high1 - low1)/2;
            if(nums[mid] == target){
                st = mid;
                high1 = mid - 1;
            }else if(nums[mid] < target){
                low1 = mid + 1;
            }
            else{
                high1 = mid - 1;
            }
        }
        int end = -1, low2 = 0 , high2 = nums.length;
        while(low2 <= high2){
            int mid = low2 + (high2 - low2)/2;
            if(nums[mid] == target){
                end = mid;
                low2 = mid + 1;
            }
            else if(nums[mid] < target){
                low2 = mid + 1;
            }
            else{
                high2 = mid - 1;
            }

        }
        int res[] = {st , end};
        return res ;
    }
}


public class FirstAndLastOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {};
        System.out.println("Enter target : " + arr.length);
        int target = sc.nextInt();
        Solution s = new Solution();
        int res[] = s.FirstAndLast(arr, target);
        System.out.println("[" + res[0] + "," + res[1] + "]");
        sc.close();
    }
}

