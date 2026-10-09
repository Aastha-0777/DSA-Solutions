class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = -1;
        int last = -1;

        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {

            int mid = (low + high) / 2;

            if (target == nums[mid]) {

                first = mid;

                high = mid - 1;

            } else if (target > nums[mid]) {

                low = mid + 1;

            } else {

                high = mid - 1;

            } // end of if-else ladder

        } // end of while

        if (first == -1)
            return new int[] { -1, -1 };

        low = 0;
        high = nums.length - 1;
        while (low <= high) {

            int mid = (low + high) / 2;

            if (target == nums[mid]) {

                last = mid;
                low = mid + 1;

            } else if (target > nums[mid]) {

                low = mid + 1;

            } else {

                high = mid - 1;

            } // end of if-else ladder

        } // end of while

        return new int[] { first, last };

    }
}