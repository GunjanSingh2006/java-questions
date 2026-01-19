class UserMainCode{
    public int allDigitsCount(int input1){
       int c=0;
       while(input1>0){
          c++;
          input/=10;
       }
       return c;
    }
}