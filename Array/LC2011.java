public class LC2011 {
    public static int ShuffleTheArray(String[] nums) {
        int x = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == "--X")
        //         System.out.print(nums[i]);
        //     if (nums[i] == "X--")
        //         System.out.print(x--);
        //     if (nums[i] == "++X")
        //         System.out.print(++x);
        //     if (nums[i] == "X++")
        //         System.out.print(x++);
        // }
        for(String op : nums){
            if(op.charAt(1) == '+') x +=1;
            else x -=1;
        }
        return x;
    }

    public static void main(String[] args) {
        String[] nums = { "--X", "X++", "X++" };
        int res = ShuffleTheArray(nums);
        System.out.print(res);

    }
}
