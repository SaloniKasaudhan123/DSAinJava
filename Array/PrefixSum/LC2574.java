
public class LC2574{
    public static int[] leftRightDifference(int[] nums) {
        int leftSum = 0 , rightSum = 0;
        for(int i = 1 ; i < nums.length ; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        int[] arr = new int[nums.length]; 
        for(int i = 0 ; i < nums.length ; i++){
            if(i == 0) leftSum = 0;
            else leftSum = nums[i-1];
            if(i == nums.length) rightSum = 0;
            else rightSum = nums[nums.length - 1] - nums[i];
            if((rightSum - leftSum) >= 0)
            arr[i] = rightSum - leftSum;
            else
            arr[i] = -(rightSum - leftSum);
    
        }
            return arr;
    }
    public static void main(String[] args){
        int[] nums = {10 , 4, 8,3};
        int[] res = leftRightDifference(nums);
        for(int i = 0 ; i < res.length ; i++){
            System.out.print(res[i] + "  ");
        }}
 }