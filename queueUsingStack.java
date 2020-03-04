package dataStructure;
import java.util.*;
public class queueUsingStack {
   static Stack<Integer> primary;
   static Stack<Integer> secondary;
	public static void main(String[] args) {
	 
		primary =new Stack<>();
		secondary=new Stack<>();
		
	push(10);
	push(20);
		push(30);
		push(40);
		display();
		pop();
		display();
		System.out.println(top());
		push(50);
		push(60);
		push(70);
		display();
        System.out.println(top());
	}
public static void push(int value)
{
	primary.push(value);
	
}
public static int pop()
{
	while(primary.size()!=1)
	secondary.push(primary.pop());
	int pop=primary.pop();
	while(!secondary.isEmpty())
		primary.push(secondary.pop());
	return pop;
	
}
public static int top()
{
	while(primary.size()!=1)
		secondary.push(primary.pop());
		int top= primary.peek();
		while(!secondary.isEmpty())
			primary.push(secondary.pop());
		return top;
}
public static void display()
{
	//while(primary.size()!=0)
		//secondary.push(primary.pop());
	System.out.println(primary);
	//while(!secondary.isEmpty())
		//primary.push(secondary.pop());
	
}
}
