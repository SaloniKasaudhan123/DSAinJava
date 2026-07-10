import java.util.Scanner;

public class DecimalToAnyBase {
   public static void ConvertToAnyBase(int num , int base){
         int n = num , i = 0 , sum = 0 , r;
            while(n > 0){
                r = n % base;
                sum = sum + r * (int)(Math.pow(10, i ));
                i++;
                n = n / base;
            }
            System.out.print("Binary or Octal value of " + num + " is : " + sum );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int base = sc.nextInt();
        System.out.print("Enter num To convert in binary and octal number system : ");
        int num = sc.nextInt();
        ConvertToAnyBase(num,base);

        sc.close();
    }
}
