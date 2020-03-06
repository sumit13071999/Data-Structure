/*Q->write a program to implement the stack using Array
intput-> size=5
             elements:10 20 30 40 50
output-> display= 50 40 30 20 10
*/
package dataStructure;

public class stackUsingArray {
	private int []data;
	private int top;
	//10 is a default capacity of the stack
    public static final int default_capacity=10;
	// it is a constructor of stack with default capacity
	public stackUsingArray() throws Exception
	{
		this(default_capacity);
	}

       //it is another constructor of stack
	public stackUsingArray(int capacity) throws Exception{
	//this line throw exception if the size of stack is less then 1	
		if(capacity<1)throw new Exception("invalid capacity");
		//this line assign the capacity of stack
		this.data=new int[capacity];
		this.top=-1;
	}
	//this function return the size of stack
	public int size()
	{
		return this.top+1;
	}
	//this function return true if size is 0 else return false size is greater than 0
public boolean isEmpty() {
	return this.size()==0;
}
	// this function is use for enter the element in stack
public void push(int value)throws Exception {
	//this if statement through the exception if size of stack is equal to array of length
	if(this.size()==this.data.length) {
		throw new Exception("Stack is full");
	}
	this.top++;
	this.data[this.top]=value;
}
public int pop() throws Exception{
	if(this.size()==0) throw new Exception("Stack is empty");
	int temp=this.data[this.top];
	this.data[this.top]=0;
	top--;
	return temp;
}
public int top()throws Exception{
	if(this.size()==0)throw new Exception("Stack is empty");
	int rv=data[top];
	return rv;
}
public void Display() throws Exception
{
	for(int i=this.top;i>=0;i--)
	{
		System.out.print(data[i]+",");
	}
	System.out.println("END"); 
}
}
