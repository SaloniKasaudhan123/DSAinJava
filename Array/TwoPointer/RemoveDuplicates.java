package TwoPointer;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,3,3,4};
        int  i = 0 , j = 1;
       while(j < arr.length){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++ ;
            }
            else j++;
        }
        for(int k = 0 ; k < arr.length ; k++){
          System.out.println(arr[k]);
        }
        
    }
}
