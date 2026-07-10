

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// 1.Reverse (Store in new array)-------------->

    System.out.print("Enter size of array : ");
        int num = sc.nextInt();
        
        int arr1[] = new int[num];
        for(int i = 0 ; i < num ; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Reverse of array : ");
        int arr2[] = new int[num];
        int j = arr1.length-1; 
        for(int i = 0 ; i < num ; i++){
            arr2[i] = arr1[j];
            System.out.println("arr["+ i + "] : " +arr2[i]);
            j--;
        }
    




    // 2.Reverse (in-place swap)------------->

//         System.out.print("Enter size of array : ");
//         int num = sc.nextInt();
        
//         int arr1[] = new int[num];
//         for(int i = 0 ; i < num ; i++){
//             arr1[i] = sc.nextInt();
//         }
//         int j = 0 , k = arr1.length-1;
//         for(int i = 0 ; i <= (arr1.length-1)/2 ; i++){
//             int temp = arr1[j];
//             arr1[j] = arr1[k];
//             arr1[k] = temp;
//             j++;
//             k--;
//         }
// for(int i = 0 ; i < num ; i++){
//             System.out.println("arr1["+ i + "] : " +arr1[i]);
//         }










        sc.close();
    }
}
