class UserMainCode{
     public long nthFibonacci(int input1){
          if(input1==1)  return 0;
          if(input1==2)  return 1;
          long a=0,b=1,c=0;
          int i=3;
          while(i<=input1){
              c=a+b;
              a=b;
              b=c;
              i++;
         }
         return c;
     }
}