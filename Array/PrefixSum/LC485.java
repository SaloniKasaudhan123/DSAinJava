package PrefixSum;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
                int count = 0 , bin = 0;
                for(int i = 0 ; i < nums.length ; i++){
                    if(nums[i] == 1) count++;
                    else{
                        if(count >= bin){
                            bin = count;
                            count = 0;
                        }
                    }
                }
                if(count >= bin) return count;
                else return bin;               
    }
}

public class LC485{
    public static void main(String[] args){
        Solution s = new Solution();
        int[] nums = {1,1,0,1,1,1};
        int res = s.findMaxConsecutiveOnes(nums);
        System.out.print(res);
    }
}
