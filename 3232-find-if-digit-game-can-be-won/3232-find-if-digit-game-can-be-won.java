class Solution {
    public boolean canAliceWin(int[] nums) {

        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int i : nums) {

            if (i <= 9) {

                singleDigitSum += i;

            } else {

                doubleDigitSum += i;

            }

        }

        return (singleDigitSum != doubleDigitSum);

    }
}