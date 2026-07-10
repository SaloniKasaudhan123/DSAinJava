public class Pattern5 {
    public static void main(String[] args) {
        int num = 5;
        int sp = num/2;
        int st = 1;
        for(int i = 1 ; i<= num ; i++){
           for(int j = 1 ; j<= sp ; j++){
            System.out.print(" ");
        } 
           for(int j = 1 ; j<= st ; j++){
            System.out.print("*");
        } 
        if (i <= num/2){
            sp--;
            st += 2;
        }else{
            sp++;
            st -= 2;
        }
        System.out.println();
        }
    }
}



