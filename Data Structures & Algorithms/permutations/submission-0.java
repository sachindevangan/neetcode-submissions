class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(new ArrayList<>(), result, nums, used);
        return result;
    }

    private void backtrack(List<Integer> path, List<List<Integer>> result, int[] nums, boolean[] used){
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;
            //choose
            path.add(nums[i]);
            used[i] = true;

            //explore
            backtrack(path,result,nums, used);

            //undo
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }
}
