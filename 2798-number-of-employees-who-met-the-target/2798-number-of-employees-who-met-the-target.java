class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int targetedHourCounter = 0;

        for (int i : hours) {

            if (i >= target) {

                targetedHourCounter++;

            }

        }

        return targetedHourCounter;

    }
}