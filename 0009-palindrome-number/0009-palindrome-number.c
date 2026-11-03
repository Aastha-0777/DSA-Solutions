bool isPalindrome(int x) {

    int orgNo = x;
    long long rev = 0;

    if (x < 0)
        return 0;

    while (x != 0) {
        rev = (rev * 10) + (x % 10);
        x /= 10;
    } // end of while

    if(rev == orgNo)
        return 1;
    else 
        return 0;
}