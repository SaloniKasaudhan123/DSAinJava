public class CeilingOfNumber {
    public static void main(String[] args){
        int[] arr = {2,4,16,17,19,23,57,91};
        int target = 14 , st = 0 , en = arr.length-1 , ans = -1;
        while(st <= en){
            int mid = st + (en - st)/2;
            if(arr[mid] == target) {
                ans = arr[mid];
                break;
            }
            if(arr[mid] < target){
                st = mid + 1; 
            } else{
                ans = arr[mid];
                en = mid - 1;
            }
        }
        System.out.println( "ans : " + ans);
    }
}
