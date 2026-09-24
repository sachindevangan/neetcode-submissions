class Solution {
    public int[] productExceptSelf(int[] nums) {

       int[] output = new int[nums.length];

       int left = 1;
       int right = 1;

       for(int i =0; i < nums.length; i++){
        output[i] = left;
        left = left * nums[i];
       } 

       for(int i = nums.length - 1; i >= 0; i--){
        output[i] = output[i] * right;
        right = right* nums[i];
       }

       return output;
    }
}  
