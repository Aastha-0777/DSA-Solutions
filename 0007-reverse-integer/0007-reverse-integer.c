int reverse(int x) {

     long long rev = 0;
        //321
        //32
    while(x != 0){

        int digit = x % 10; //1 2
        rev = rev * 10 + digit; // 1 12
        if(rev > INT_MAX || rev < INT_MIN){

            return 0;

        }
        x  /=  10;   //32    

    }

    return (int)rev;
}