import java.util.Scanner;


public class AnyBaseToDecimal {
    public static void ConvertInDecimal(int num , int base){
        int n = num , i = 0 , sum = 0 , r;
        while (n > 0) {
            r = n % 10 ;
            sum = sum + r * (int)(Math.pow(base, i));
            i++;
            n = n / 10;
        }
        System.out.println("Decimal value of " + num + " base " + base + " is : " + sum );
    }
 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of num : ");
        int base = sc.nextInt();
        System.out.print("Enter num  to convert it in Decimal number system : ");
        int num = sc.nextInt();
        ConvertInDecimal(num , base);

        sc.close();
    }
}
