class UserMainCode{
     public int nFactorial(int input1){
        int fact=1;
        while(input1>1){
            fact = fact*input1;
            input1--;
        }
        return fact;
     }
}