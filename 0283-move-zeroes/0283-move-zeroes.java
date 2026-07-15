class Solution {
    public void moveZeroes(int[] nums) {
        //logic
        int traker = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] != 0){

                nums[traker] = nums[i];
                traker++;

            }//end of if

        }//end of for

        for(int i = traker; i < nums.length; i++){

            nums[i] = 0;

        }//end of 2nd for

        for(int i = 0; i < nums.length; i++){

            System.out.print(nums[i] + " ");

         }//end of 3for

    }

    public static void main(String args[]){

        int arr[] = {0, 1, 0, 3, 12};

        Solution s = new Solution();

        s.moveZeroes(arr);

    }
}