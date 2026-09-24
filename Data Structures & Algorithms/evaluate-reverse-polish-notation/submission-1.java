class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i < tokens.length; i++){
            String token = tokens[i];

            if(isOperator(token)){
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = evaluate(token,operand1,operand2);

                stack.push(result);
            }else{
                int operand = Integer.parseInt(token);
                stack.push(operand);
            }
        }

        return stack.peek();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private int evaluate(String operator, int operand1, int operand2) {
        switch(operator) {
            case "+":
            return operand1 + operand2;

            case "-":
            return operand1 - operand2;

            case "*":
            return operand1 * operand2;

            case "/":
            return operand1 / operand2;

            default:
             return 0;

        }
    }
}
