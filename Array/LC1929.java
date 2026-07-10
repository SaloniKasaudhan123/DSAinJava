class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length * 2;
        int[] arr = new int[len];
    for(int i = 0; i < arr.length; i++){
        if(i < arr.length/2)
        arr[i] = nums[i];
        else
        arr[i] = nums[i-arr.length/2];
    }
    return arr;
    }
}
public class LC1929{
public static void main(String[] args){
    Solution s = new Solution();
    int[] nums = {1,2,1};
    int[] res = s.getConcatenation(nums);
    for(int i = 0; i < res.length; i++){
        System.out.println(res[i]);
    }
   }
}