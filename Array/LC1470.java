public class LC1470 {
    public static int[] ShuffleTheArray(int[] nums , int n) {
        int[] output = new int[nums.length];
        output[0] = nums[0];
        int bin = nums[1] , j = 2;
        for( int i = 1 ; i < nums.length ; i += 2 ){
            output[i] = nums[n];
            if(i != nums.length-1) {
            output[i+1] = bin;
            bin = nums[j];
            j++;
            }
            n++;
        }
        
        return output;
    }
    public static void main(String[] args){
        int[] nums = {7,5,9,7,5,8,10,4,3,3,2,5,9,10};
        int n = nums.length/2;
        int[] res = ShuffleTheArray(nums , n);
        for(int i = 0 ; i < res.length ; i++){
            System.out.print(res[i] + "  ");
        }
    }
}
