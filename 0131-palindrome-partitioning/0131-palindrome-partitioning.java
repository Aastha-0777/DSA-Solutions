class Solution {
    public static boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;

        }

        return true;

    }

    private static void backtrack(String s, int start, List<String> currentPath, List<List<String>> result) {

        if (start == s.length()) {
            result.add(new ArrayList<String>(currentPath));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                currentPath.add(s.substring(start, end + 1));
                backtrack(s, end + 1, currentPath, result);
                currentPath.remove(currentPath.size() - 1);
            }
        }

    }

    public static List<List<String>> partition(String s) {

        List<List<String>> result = new ArrayList<List<String>>();
        List<String> currentPath = new ArrayList<String>();

        backtrack(s, 0, currentPath, result);

        return result;

    }
}