class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(new ArrayList<>(), s, result,0);
        return result;
    }

    private void backtrack(List<String> path, String s, List<List<String>> result, int start){
        if(start == s.length()){
            result.add(new ArrayList<>(path));
            return;            
        }

        for(int end = start; end < s.length(); end++){
            if(isPalindrome(s,start,end)){
                //choose
                path.add(s.substring(start, end + 1));

                //explore
                backtrack(path, s, result, end + 1);

                //undo
                path.remove(path.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
