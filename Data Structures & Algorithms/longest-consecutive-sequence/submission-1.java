class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> numSet = new HashSet<>();

        for(int i =0; i < nums.length; i++){
            numSet.add(nums[i]);
        }

        int longest = 0;

        Integer[] numArray = numSet.toArray(new Integer[0]);

        for(int i = 0; i <numArray.length; i++){
            int n = numArray[i];

            if(!numSet.contains(n - 1)){
                int length = 1;

                while(numSet.contains(n + length)){
                    length++;
                }

                longest = Math.max(longest,length);
            }

            
        }

        return longest;
    }
}
