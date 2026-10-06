class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int complement;
        int res[] = { -1, -1 };

        for (int i = 0; i < nums.length; i++) {

            complement = target - nums[i];

            if (!(map.containsKey(complement))) {

                map.put(nums[i], i);

            } else {

                res[0] = map.get(complement);
                res[1] = i;
                return res;

            }

        }

        return res;

    }
}