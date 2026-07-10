class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length]; 
        for(int i = 0 ; i < nums.length ; i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
public class LC1920{
    public static void main(String[] args){
        Solution s = new Solution();
        int[] nums = {0,2,1,5,3,4}; 
        int[] res = s.buildArray(nums);
        for(int i = 0 ; i < res.length ; i++){
            System.out.println(res[i]);
        }
    }
}