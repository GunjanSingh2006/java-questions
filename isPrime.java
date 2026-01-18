class UserMainCode{
    public int isPrime(int input1){
         int i=2;
         while(i*i<=input1){
             if(input1%i == 0) return 1;
             i++;
         }
         return 2;
    }
}    