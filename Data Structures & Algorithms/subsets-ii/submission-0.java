class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(new ArrayList<>(), result, nums,0);
        return result;
    }

    private void backtrack(List<Integer> path, List<List<Integer>> result, int[] nums,int start){
            result.add(new ArrayList<>(path));

            for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;

            // choose
            path.add(nums[i]);
            // explore further
            backtrack(path, result,nums, i+1);
            // undo choice
            path.remove(path.size() - 1);

    }
}
}
