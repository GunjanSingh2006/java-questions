 class UserMainCode{
     public int EvenOddDigitsSum(int input1,String input2){
        int even=0;
        int odd=0;
        while(input1>0){
            int rem=input1%10;
            if(rem%2==0)  even+=rem;
            else odd+=rem;
            input1=input1/10;
        }
        if(input2.equals("even"))  return even;
        else return odd;
      }
}