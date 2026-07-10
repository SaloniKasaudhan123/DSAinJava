

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int num = sc.nextInt();
        
        int arr[] = new int[num];
        for(int i = 0 ; i < num ; i++){
            arr[i] = sc.nextInt();
    }
         int max = arr[0];
         for(int i = 0 ; i < num ; i++){
            if(arr[i] > max)
                max = arr[i];
        }

        for(int i = max ; i > 0 ; i--){
            for(int j = 0 ; j < num ; j++){
                if(i <= arr[j])
                    System.out.print("* ");
                else
                    System.out.print("  ");
                
            }
            System.out.println();
        }
    


            sc.close();
        
}
}