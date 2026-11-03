bool isPalindrome(int x) {

    if (x < 0)
        return false;

    int orgNo = x;
    long rev = 0;

    while (x != 0) {
        rev = (rev * 10) + (x % 10);
        x /= 10;
    } // end of while

    return rev == orgNo;
}