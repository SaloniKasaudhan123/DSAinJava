package Searching;
import java.util.Scanner;

public class Practice  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = {12,23,34,34,34,45,56,67,78,78,89,90,100};
        System.out.println("Enter target : ");
        int target = sc.nextInt();
        

        
        //How many times comparision done -------------------->
        // int idx = -1 , low = 0 , high = arr.length-1 ,count = 0;
        // while (low <= high) {
            //     int mid = low + (high - low)/2;
            //     if(arr[mid] == target){
                //         idx = mid;
        //         break;
        //     }else if(arr[mid] < target){
            //         low = mid + 1;
        //     }
        //     else{
        //         high = mid - 1;
        //     }
        //     count++;
        //     System.out.println("Compare with : " + arr[mid]);
        // }
        // System.out.println("Target at idx : " + idx + " Comparions : " + count);
        
        
        
        
        
        
        
        // Searching in descending sorted array----------->
        // int arrDesce[] = {98,87,76,65,54,43,32,21,11,1};
        // int idx = -1 , low = 0 , high = arrDesce.length-1 ;
        // while (low <= high) {
        //     int mid = low + (high - low)/2;
        //     if(arrDesce[mid] == target){
        //         idx = mid;
        //         break;
        //     }else if(arrDesce[mid] < target){
        //         high = mid - 1;
        //     }
        //     else{
        //         low = mid + 1;
        //     }
        // }
        // System.out.println("Target at idx : " + idx);





        //Lower And Upper Bound --------------------------->
        // Lower
        // int low = 0 , high = arr.length-1 , idx = -1;
        // while(low <= high){
        //     int mid = low + (high - low)/2;
        //     if(arr[mid] >= target){
        //         idx = mid;
        //        high = mid - 1; 
        //     }else low = mid + 1;
        //     System.out.println("Lower Bound : " + idx);
        // }
        // System.out.println("Lower Bound : " + idx);

        // Upper
        // int low = 0 , high = arr.length-1 , idx = -1;
        // while(low <= high){
        //     int mid = low + (high - low)/2;
        //     if(arr[mid] == target){
        //         idx = mid;
        //        low = mid + 1; 
        //     }else if(arr[mid] < target) low = mid + 1;
        //     else high = mid - 1;
        //     System.out.println("Upper Bound : " + idx);
        // }
        // System.out.println("Upper Bound : " + (idx+1));






        //Search Insert Position --------------------------->
        //  int low = 0 , high = arr.length-1 , idx = -1;
        // while(low <= high){
        //     int mid = low + (high - low)/2;
        //     if(arr[mid] >= target){
        //         idx = mid;
        //        high = mid - 1; 
        //     }else low = mid + 1;
        //     System.out.println("Insertion Position : " + idx);
        // }
        // System.out.println("Insertion Position : " + idx);




        //Floor of element------------------------->
    
        //  int idx = -1,low = 0 , high = arr.length-1;
        //  while(low <= high){
        //     int mid = low  + (high - low)/2;
        //     if(arr[mid] >= target){
        //         idx = mid - 1; 
        //         high = mid - 1;
        //  }else low = mid + 1;
        // }
        // System.out.println("Floor of element : " +arr[idx]);




        //Ceil of element---------------------------->
    //     int idx = -1,low = 0,high = arr.length-1;
    //     while (low <= high) {
    //          int mid = low  + (high - low)/2;
    //          if(arr[mid] <= target){
    //             idx = mid + 1; 
    //             low = mid + 1;
    //      }else high = mid - 1;
    // }
    //     System.out.println("Ceil of element : " + arr[idx]);






    //Square Root ------------------>
    int low = 0 , high = target  ,idx = 0;
    for(int i = 0 ; i < target ; i++){
       int mid = low + (high - low)/2;
       if(mid * mid < target){
        idx = mid;
        low = mid + 1;
       }else high = mid -1;
    }
    System.out.println("Integer square root of " + target + " : " + idx);



        sc.close();
    }

}
