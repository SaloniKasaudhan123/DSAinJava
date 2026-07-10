

import java.util.Scanner;

public class SpanProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i = 0 ; i < num ; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[1];
        for(int i = 0 ; i < num ; i++){
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Span : " + (max - min) );
        sc.close();
        
    }
}
