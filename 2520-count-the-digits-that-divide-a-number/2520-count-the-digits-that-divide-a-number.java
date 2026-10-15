class Solution {
    public int countDigits(int num) {

        int digitCounter = 0;
        int orgNum = num;

        while (num != 0) {

            if (orgNum % (num % 10) == 0) {

                digitCounter++;

            }

            num /= 10;

        } //end of while

        return digitCounter;

    }
}