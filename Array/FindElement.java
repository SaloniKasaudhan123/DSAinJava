

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int num = sc.nextInt();
        
        int arr[] = new int[num];
        for(int i = 0 ; i < num ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value to find in array : ");
        int key = sc.nextInt();

        int idx = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == key){
                idx = i;
                break;
            }
        }

        System.out.println("Index of key is : " + idx);


        sc.close();



        
    }
}
