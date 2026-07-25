class Solution {
    public static int missingNumber(int[] arr) {

        int orgSum = (arr.length * (arr.length + 1)) / 2;
        int sum = 0;
        int missingNo = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

        }

        missingNo = orgSum - sum;

        return missingNo;

    }//end of missingNumber

    public static void main(String[] args) {

        int[] arr = { 3, 0, 1 };

        System.out.print("Array Elements : ");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }

        System.out.println();

        int missingNumber = missingNumber(arr);

        System.out.println("The Missing Element in the Array is : " + missingNumber);

    }
}