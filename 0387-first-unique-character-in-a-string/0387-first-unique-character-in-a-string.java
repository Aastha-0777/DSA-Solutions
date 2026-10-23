class Solution {
    public int firstUniqChar(String s) {
        int alpCounters[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        for (int i = 0; i < s.length(); i++) {
            alpCounters[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (alpCounters[s.charAt(i) - 'a'] == 1)
                return i;
        }

        return -1;

    }
}