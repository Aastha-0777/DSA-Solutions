class Solution {
    public int firstUniqChar(String s) {
        int alpCounters[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            alpCounters[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (alpCounters[ch - 'a'] == 1) {

                return i;

            }

        }

        return -1;

    }
}