class Solution {
    public List<String> generateParenthesis(int n) {   
        List<String> result = new ArrayList<>();
        generateParenthesisRecursively(n,0,0,"", result);
        return result;
    }

    public void generateParenthesisRecursively(int n, int openCount, int closeCount, String current, List<String> result){
        if(openCount == n && closeCount == n){
            result.add(current);
            return;
        }

        if(openCount < n){
            generateParenthesisRecursively(n, openCount + 1, closeCount, current + "(", result);
        
        }

        if(closeCount < openCount){
            generateParenthesisRecursively(n, openCount, closeCount + 1, current + ")", result);
        }
    }
}
