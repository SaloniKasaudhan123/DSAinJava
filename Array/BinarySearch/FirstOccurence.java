public class FirstOccurence {
    public static void main(String[] args){
        int[] arr = {3,4,4,4,4,5,12,14,14,14,14,26,29};
        int target = 14 , idx = -1 , st = 0 , en = arr.length-1;
        while(st <= en){
            int mid = st + (en - st)/2;
            if(arr[mid] == target){
                idx = mid;
                en = mid -1;
            }else if(arr[mid] > target) en = mid -1;
            else st = mid + 1;
        }
        System.out.println("idx : " + idx);
    }
}
