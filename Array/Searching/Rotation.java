package Searching;

import java.util.Scanner;

public class Rotation {
    // public static void RotateLeft(int arr[], int first,int last){
    //     while(first < last){
    //         int temp = arr[last];
    //         arr[last] = arr[first];
    //         arr[first] = temp;
    //         last--;
    //         first++;
    //     }
    // }
    // public static void RotateRight(int arr[], int first,int last){
    //     while(first < last){
    //         int temp = arr[first];
    //         arr[first] = arr[last];
    //         arr[last] = temp;
    //         first++;
    //         last--;
    //     }
    // }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = {2,4,5,8,12,23,45,56,73};


        //Reverse (new array)-------------------------->
        // int arr2[] = new int[arr.length];
        // int idx = arr.length-1;
        // for(int  i = 0 ; i < arr.length ; i++){
        //     arr2[idx] = arr[i];
        //     idx--;
        // }
        // for(int  i = 0 ; i < arr2.length ; i++){
        //     System.out.println(arr2[i]);
        // }


        //Reverse (in place)------------------------------>
        // int idx = arr.length-1;
        // for(int  i = 0 ; i < arr.length/2 ; i++){
        //     int temp = arr[idx];
        //     arr[idx] = arr[i];
        //     arr[i] = temp ;
        //     idx--;
        // }
        // for(int  i = 0 ; i < arr.length ; i++){
        //     System.out.println(arr[i]);
        // }




        //Check if array is sorted-------------------->
        // int arr1[] = {34,23,87,45,32,98,56};
        // for(int  i = 0 ; i < arr1.length-1 ; i++){
        //     if(arr1[i] > arr1[i+1]){
        //         System.out.println("Not Sorted!");
        //         break ;
        //     }
        // }





        //Rotate array left by 3---------------->
        // int k = 3;
        // int arr3[] = {1,2,3,4,5,6,7,8,9};
        // k = k % (arr3.length);
        // RotateLeft(arr3,0,arr3.length-1);
        // RotateLeft(arr3,0,arr3.length-1-k);
        // RotateLeft(arr3,arr3.length-k,arr3.length-1);
        // for(int  i = 0 ; i < arr3.length ; i++){
        //     System.out.print(arr3[i]);
        // }


        


        //Rotate array right by 3---------------->
        // int k = 3;
        // int arr4[] = {1,2,3,4,5,6,7,8,9};
        // k = k % arr4.length;
        // RotateRight(arr4, 0 , arr4.length-1);
        // RotateRight(arr4, 0 , k-1);
        // RotateRight(arr4, k , arr4.length-1);
        // for(int  i = 0 ; i < arr4.length ; i++){
        //     System.out.print(arr4[i]);
        // }







        //Rotate array right by 3---------------->
        // System.out.println("Enter k : ");
        // int k = sc.nextInt();
        // int arr4[] = {1,2,3,4,5,6,7,8,9};
        // k = k % arr4.length;
        // RotateRight(arr4, 0 , arr4.length-1);
        // RotateRight(arr4, 0 , k-1);
        // RotateRight(arr4, k , arr4.length-1);
        // for(int  i = 0 ; i < arr4.length ; i++){
        //     System.out.print(arr4[i]);
        // }






        //Swap alternate elements ---------------
        // [1,2,3,4] -------> [2,1,4,3]
        // int arr5[] = {1,2,3,4,5,6,7};
        // int i = 0 , j = 1, high = arr5.length-1;
        // while(i != high){
        //     int temp = arr5[i];
        //     arr5[i] = arr5[j];
        //     arr5[j] = temp;
        //     System.out.println(arr5[i] + " " + arr[j]);
        //     i += 2;
        //     j += 2;
        // }
        
        //  for(int  k = 0 ; k < arr5.length ; k++){
        //     System.out.print(arr5[k]);
        // }
        
        
        
        
        
        
        //Reverse only even numbers in an array------------------->
        // [1,2,3,4,6,7,8] ----------> [1,8,3,6,4,7,2]
        // int arr6[] = {1,2,3,4,6,7,8};
        // int i = 0 , j = arr6.length-1;
        // while(i <= j){
        //     if(arr6[i]%2==0 && arr6[j]%2==0){
        //         int temp = arr6[i];
        //         arr6[i] = arr6[j];
        //         arr6[j] = temp;
        //         i++;
        //         j--;
        //     }
        //     if(arr6[i]%2!=0) i++ ;
        //     if(arr6[j]%2!=0) j--;
        // }
        // for(int  k = 0 ; k < arr6.length ; k++){
        //      System.out.print(arr6[k]);
        // }




        //








        sc.close();
    }
}
