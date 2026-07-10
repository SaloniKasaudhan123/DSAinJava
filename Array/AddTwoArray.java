

import java.util.Scanner;

public class AddTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size1 = sc.nextInt();
        
        int arr1[] = new int[size1];
        for(int i = 0 ; i < size1 ; i++){
            arr1[i] = sc.nextInt();
    }

    System.out.print("Enter size of array : ");
        int size2 = sc.nextInt();
        
        int arr2[] = new int[size2];
        for(int i = 0 ; i < size2 ; i++){
            arr2[i] = sc.nextInt();
    }

    int arr3[];
    if(size1 > size2)
        arr3 = new int[size1];
    else
        arr3 = new int[size2];

            int i1 = arr1.length-1  , j1 = arr2.length-1 , carry=0;
            for(int k = arr3.length-1 ; k >= 0 ; k--){
                if (i1 < 0 || j1 < 0){
               arr3[k] = arr1[i1];
            }
            else{
               int r = (arr1[i1] + arr2[j1]) % 10;
               arr3[k] = r + carry;
            }
            i1--;
            j1--;
        }

            for(int i = 0 ; i < arr3.length ; i++){
            System.out.print(arr3[i]);
    }


    sc.close();
    }
}
