class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(new ArrayList<>(), result,candidates,target,0);
        return result;
    }

    private void backtrack(List<Integer> path, List<List<Integer>> result, int[] candidates, int target, int start){
        if(target == 0){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i< candidates.length; i++){
            //skip duplicates
            if(i > start && candidates[i] == candidates[i-1]){
                continue;
            }

            if(candidates[i] > target) break;

            //choose
            path.add(candidates[i]);

            //explore
            backtrack(path,result,candidates,target - candidates[i],i + 1);

            //undo
            path.remove(path.size() - 1);
        }
    }
}
