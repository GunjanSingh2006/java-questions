import java.io.*;
import java.util.*;
class UserMainCode{
	public int isPalindrome(String input1){
             int i=0;
             int j=input1.length()-1; 
             while(i<j){
                 char c1=Character.toLowerCase(input1.charAt(i));
                 char c2=Character.toLowerCase(input1.charAt(j));
                 if(c1!=c2)  return 1;
                 i++ , j--;
             }
              return 2;   
		
	}
}
