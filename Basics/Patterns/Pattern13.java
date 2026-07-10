
public class Pattern13 {
    static int fact(int a){
        int f = 1;
        for(int i = 1 ; i <= a ; i++){
            f *= i;
        }
            return f;
        }
    public static void main(String[] args) {
        
        int n = 6 ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(fact(i) / (fact(i-j)*fact(j)) + " ");
            }
            System.out.println();
        }



    }
}
