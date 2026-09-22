class Solution {
    public int calPoints(String[] operations) {

        int scoreArr[] = new int[operations.length];
        int top = -1;
        int sum = 0;

        for (String opr : operations) {

            switch (opr) {
                case "+":
                    int prevSum = scoreArr[top] + scoreArr[top - 1];
                    // score.push(prevSum);
                    if (top == scoreArr.length - 1) {

                        break;

                    } else {

                        top++;
                        scoreArr[top] = prevSum;

                    }

                    break;

                case "D":
                    int doublePrevRes = scoreArr[top] * 2;
                    if (top == scoreArr.length - 1) {

                        break;

                    } else {

                        top++;
                        scoreArr[top] = doublePrevRes;

                    }
                    break;

                case "C":

                    if (top == -1) {

                        break;

                    } else {

                        top--;

                    }

                    break;

                default:
                    if (top == scoreArr.length - 1) {

                        break;

                    } else {

                        top++;
                        scoreArr[top] = Integer.parseInt(opr);

                    }
            }

        }

        for (int i = 0; i <= top; i++) {

            sum += scoreArr[i];
            System.out.println(scoreArr[i] + " ");

        }

        return sum;

    }
}