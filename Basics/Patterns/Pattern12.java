import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t1 = 0;
        int t2 = 1;
        int t3 = t1 + t2;
        int n = sc.nextInt();
        for(int i = 1; i <= n ; i++){
        for(int j = 1 ; j <= i ; j++ ){
            System.out.print(t1 + " ");
            t1 = t2 ;
            t2 = t3 ;
            t3 =  t1 + t2;
        }
        System.out.println();
    }
        sc.close();
    }
}
