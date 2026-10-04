
public class LC238 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int prefix[] = new int[nums.length];
        prefix[0] = 1;
        for(int i = 1 ; i < nums.length ; i++){
            prefix[i] = nums[i-1] * prefix[i-1];
        }
        int suffix[] = new int[nums.length];
        suffix[nums.length-1] = 1;
        for(int i = nums.length-2 ; i >= 0 ; i--){
            suffix[i] = nums[i+1] * suffix[i+1];
        }
        for(int i =0 ; i < prefix.length ; i++){
            System.out.println(prefix[i] * suffix[i]);
        }
        
        

    }
}
