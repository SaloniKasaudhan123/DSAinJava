public class Rect_Star {
    public static void main(String[] args) {

        // ---------------------Rectangle---------------------->
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 5; j++) {
        // System.out.print("* ");
        // }
        // System.out.print("\n");
        // }

        // -----------------------------Star----------------------->
        // for (int i = 0; i <= 5; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        // -----------------------Inverted Star------------------>
        // for (int i = 5; i >= 0; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        // -----------------1 2 3 Star----------------------->
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.print("\n");
        // }

        // -----------------
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *
        // int n = 5 , c ;
        // for (int i = 1; i <= 2*n-1; i++) {
        // i <= n ? c = i : c = 2*n - i;
        // for (int j = 1; j <= c; j++) {
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        // ---------------------Star with space----------------->
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 5; j >= 1; j--) {
        //         if(i >= j) System.out.print("*");
        //         else System.out.print(" ");
        //     }
        //     System.out.print("\n");
        //   }



        //-------------------Star with space inverted--------->
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= 5; j++) {
        //         if(i <= j) System.out.print("*");
        //         else System.out.print(" ");
        //     }
        //     System.out.print("\n");
        //   }




        //----------------------Pyramid of Stars---------------->
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 2*n; j++) {
                
            }
            System.out.print("\n");
          }




    }
}
