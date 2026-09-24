class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] output = new int[nums.length];

        int left = 1;
        int right = 1;

        //first pass
        for(int i =0; i < nums.length; i++){
            output[i] = left;
            left *= nums[i];
        }

        //second pass
        for(int i = nums.length - 1; i>=0; i--){
            output[i] *= right;
            right *= nums[i];
        }

        return output;
    }
}  
