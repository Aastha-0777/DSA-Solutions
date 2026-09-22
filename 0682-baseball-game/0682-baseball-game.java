class Solution {
    public int calPoints(String[] operations) {

        int[] scoreArr = new int[operations.length];
        int top = -1;
        for (String opr : operations) {
            switch (opr) {
                case "+":
                    scoreArr[top + 1] = scoreArr[top] + scoreArr[top - 1];
                    top++;
                    break;
                case "D":
                    scoreArr[top + 1] = scoreArr[top] * 2;
                    top++;
                    break;
                case "C":
                    top--;
                    break;
                default:
                    top++;
                    scoreArr[top] = Integer.parseInt(opr);
            }
        }
        int sum = 0;
        for (int i = 0; i <= top; i++) {
            sum += scoreArr[i];
        }
        return sum;
    }
}