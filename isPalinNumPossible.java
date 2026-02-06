import java.io.*;
import java.util.*;
class UserMainCode{
	public int isPalinNumPosssible(int input1){
	     int count[]=new int[10];
             while(input1>0){
                  count[input1%10]++;
                  input1/=10;
             }
             int ocount=0;
             for(int i=0;i<10;i++){
                 if(count[i]%2==1) ocount++;
             }
             if(ocont<=1)  return 2;
             else  return 1;
	}
}
