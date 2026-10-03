package LinearSearch;

public class MinElement {
     public static void main(String[] args){
        int[] arr = {-7,12,-7,3,14,28};
        int min = arr[0] ;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] < min) min = arr[i];
        }
        System.out.println(min);
    }
}
