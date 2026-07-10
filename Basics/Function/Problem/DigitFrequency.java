import java.util.Scanner;

public class DigitFrequency {
   public static int DigitFrequencyCount(int key , int num){
    int count = 0 , r ;
    while(num > 0){
        r = num % 10 ;
        if(r == key) count++;
        num = num /10;
    }
    return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num to find digit frequency : ");
        int key = sc.nextInt();
        int num = 59327929;
        System.out.print("Digit Frequency : " + DigitFrequencyCount(key , num));

        sc.close();
    }
}
