class UserMainCode{
    public int countPrimesInRange(int input1,int input2){
         int c=0;
         for(int n=input1;n<=input2;n++){
             if(n>=2){
                 int i=2;
                 while(i*i<=n && n%i!=0)  i++;
                 if(i*i>n)  c++;
             }
         }
         return c;
     }
}