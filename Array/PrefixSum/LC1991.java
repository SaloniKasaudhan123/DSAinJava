


public class LC1991 {
    public static int findMiddleIndex(int[] nums){
        int leftSum = 0 , rightSum = 0;
        for(int i = 1 ; i < nums.length ; i++){
            nums[i] = nums[i] + nums[i-1];
        } 
        int idx = -1;
        for(int i = 0 ; i < nums.length ; i++){
            if(i == 0) leftSum = 0;
            else leftSum = nums[i-1];
            if(i == nums.length) rightSum = 0;
            else rightSum = nums[nums.length - 1] - nums[i];
            if(leftSum == rightSum) return idx = i;
    }
    return idx;
    }
    public static void main(String[] args){
        int[] nums = {3,2,-1,7,4};
        int res = findMiddleIndex(nums);
            System.out.print(res);
        }
}
