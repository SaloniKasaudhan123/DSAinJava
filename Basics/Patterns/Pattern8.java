public class Pattern8 {
        public static void main(String[] args) {
        int num = 5 ;
        for(int i = 1 ; i <= num ; i++){
            for(int j = num ; j >= 1 ; j--){
                if( i == j) System.out.print("*");
                else System.out.print(" ");
        }
        System.out.println();
        }
    }
}

