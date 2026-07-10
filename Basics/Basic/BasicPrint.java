import java.util.Scanner;

class BasicPrint{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // System.out.println("*****\n   * \n  *  \n *   \n*****");
        // int num = Integer.parseInt(sc.nextLine());
        // String str = sc.nextLine();

        // System.out.println("num : " +num + "Str : " + str);

        // 1.....Check wheather a number is prime or not -------------->
        // System.out.println("Enter no. of input take from user: ");
        // int n = sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     int count = 0;
        //     System.out.println("Enter num to check : ");
        //     int num = sc.nextInt();
        //     for(int j=2;j*j<=num;j++){
        //         if(num%j==0){
        //              count++;
        //             //  break;
        //     }
        //  }
        //     if(count == 0) System.out.println("Prime");
        //     else System.out.println("Not prime");
        // }
    

        //2.....Print all prime till n -------------->
        // System.out.println("Enter low range : "); 
        // int n1 = sc.nextInt();
        // System.out.println("Enter high range : "); 
        // int n2 = sc.nextInt();
        // for(int i=n1;i<=n2;i++){
        //     int count = 0;
        //     for(int j=2;j*j<=i;j++){
        //         if(i%j==0) {
        //             count = count+1;
        //             break;
        //         }
        //     }
        //     if(count==0) System.out.println(i);
        // }


        //3......Print Fibonacci series till n------------>
        // int t1 = 0;
        // int t2 = 1;
        // int t3 = t1 + t2;
        // int n = sc.nextInt();
        // System.out.print(t1 +" "+ t2 + " ");
        // for(int i=3;i<=n;i++){
        //     System.out.print(t3 + " ");
        //     t1 = t2 ;
        //     t2 = t3 ;
        //     t3 =  t1 + t2;
        // }


        //4.....Print digits in a number ------>
        // int num = sc.nextInt();
        // int count = 0 ;
        // while (num>0) {
        //     num /= 10;
        //     count++;
        // }
        // System.out.println(count + " digits");


        //5......Print all digits of a number --------->
        // int n = sc.nextInt();
        // int num = n;
        // int count =0;
        // while (num>0) {
        //     num /= 10;
        //     count++;
        // }
        // int div = (int)Math.pow(10, count - 1);
        // while(div != 0){
        //     int q = n / div;
        //     System.out.println(q);
        //     n = n % div;
        //     div /= 10;
        // }



        //6.....Print reverse of a number ------->
        // int n = sc.nextInt();
        // int num = n;
        // int sum =0;
        // while (num>0) {
        //     int r = num % 10;
        //     sum = sum * 10 + r ;
        //     num /= 10;
        // }
        // System.out.println("Reverse of " + n + " is " + sum);



        //7.....Inverse of a number --------->
        // ---Optimized way use single loop ------>
        // int num = 52314 , n = num , sum =0;
        // int count = 0 ;
        // while (num>0) {
        //     num /= 10;
        //     count++;
        // }
        // for(int i=1 ; i<=count ; i++){
        //     int r = n % 10 ;
        //     sum = sum + i * ((int)Math.pow(10,(r-1)));
        //     System.out.println("Sum " + sum);
        //     n = n /10 ;
        // }



        //8....Rotate a number by given number ------>
        // int num = 475398, n=num , r=0 , count=0 , sum=n , t=-2;
        // while(n>0){
        //     n /= 10 ;
        //     count++;
        // }
        // int k = t % count;
        // if(k<0) k = count + k;
        // for(int i=1  ; i<=k || i<0 ; i++){
        //     r = num%10;
        //     int q = sum/10;
        //     sum = r*((int)Math.pow(10, count-1)) + q ;
        //     num /= 10;
        //     // System.out.println("Rotation " + sum);
        // }
        // System.out.println("Rotation " + sum);




        //9------.....LCM  ----------->
    //     int sum = 1 , num ;
    //     System.out.print("Enter a : ");
    //     int a = sc.nextInt();
    //     System.out.print("Enter b : ");
    //     int b = sc.nextInt();
    //     if(a>b) num = a ;
    //     else num = b ; 
    //     int n = num ;
    //     for(int i = 2 ; i * i <= num ; i++){
    //         while(a % i == 0 || b % i == 0){
    //             if(a % i == 0) a = a / i ;
    //             if(b % i == 0) b = b / i ;
    //             sum = sum * i ;
    //         }
    //  }
    //  System.out.println(sum);


       // -------------------HCF------------------->
    //    int a = 36 , b = 98 , min ;
    //    if(a>b)  min = b ;
    //    else min = a ;
    //    for(int i = min ; i >= 2 ; i-- ){
    //     if(a % i == 0 && b % i == 0){
    //         System.out.println("HCF : " + i);
    //         break;
    //     }
    //    }
        




// 10......Prime Factorization of a number----------->
    //  int num = 46 ,n = num ;
    //  for(int i = 2 ; i * i <= num ; i++){
    //         while(n % i == 0){
    //             System.out.print(i + " ");
    //             n = n/i;
    //         }
    //     } 
    //     if ( n != 1){
    //         System.out.print(n);
    //     }




//11...... Pythagorean Triplets - Question------>
    // int a = 5 , b = 3 , c = 4;
    // if ( (a*a) == ((b*b) + (c*c))){
    //     System.out.println("It is pythagorean triplet");
    // }else{
    //     System.out.println("It is not pythagorean triplet");
    // }



        sc.close();
    }
}