class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();
        int sign = 1;
        int total = 0;

        // Step 1: Whitespace 

        while (i < n && s.charAt(i) == ' ') {
            i++;
        } //end of while

        // Step 2: Sign 

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }

            i++;
        } //end of if

        // Step 3: Digits & Overflow clamp

        while (i < n && (s.charAt(i) >= 48 && s.charAt(i) <= 57)) {

            int digit = s.charAt(i) - '0';

            if (total > Integer.MAX_VALUE / 10 || (total == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = total * 10 + digit;

            i++;

        } //end of while

        return total * sign;

    }
}