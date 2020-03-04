package dataStructure;

import java.util.Stack;

public class reverseStack {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
         for(int i=1;i<=5;i++)
         {
        	 st.push(i*10);
         }
         System.out.println(st);
         Stack<Integer> temp=new Stack<>();
         reversestack(st,temp,0);
         System.out.println(st);
	}
public static void reversestack(Stack<Integer> st,Stack<Integer> temp,int index)
{
	if(st.isEmpty())
	{
		return;
	}
     int variable= (int) st.pop();
   reversestack(st,temp,index+1);
   temp.push(variable);
   if(index==0)
	   while(!temp.isEmpty())
	   {
		  st.push(temp.pop()); 
	   }
}
}
