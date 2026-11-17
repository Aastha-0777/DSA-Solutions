class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        int currentNum = 0;
        char prevSign = '+';
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                currentNum = currentNum * 10 + (c - '0');
            }

            if ((!Character.isDigit(c) && c != ' ') || i == n - 1) {
                if (prevSign == '+') {
                    stack.push(currentNum);
                } else if (prevSign == '-') {
                    stack.push(-currentNum);
                } else if (prevSign == '*') {
                    stack.push(stack.pop() * currentNum);
                } else if (prevSign == '/') {
                    stack.push(stack.pop() / currentNum);
                }

                prevSign = c;
                currentNum = 0;
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}