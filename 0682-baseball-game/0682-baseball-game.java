class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> score = new Stack<Integer>();
        int sum = 0;

        for (String opr : operations) {

            switch (opr) {
                case "+":
                    int prevSum = score.peek() + score.get(score.size() - 2);
                    score.push(prevSum);
                    break;

                case "D":
                    int doublePrevRes = score.peek() * 2;
                    score.push(doublePrevRes);
                    break;

                case "C":
                    score.pop();
                    break;

                default:
                    score.push(Integer.parseInt(opr));

            }

        }

        for (Integer s : score) {

            sum += s;

        }

        System.out.println(score);

        return sum;

    }
}