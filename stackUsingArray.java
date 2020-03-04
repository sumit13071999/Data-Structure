package dataStructure;

public class stackUsingArray {
	private int []data;
	private int top;
    public static final int default_capacity=10;
	public stackUsingArray() throws Exception
	{
		this(default_capacity);
	}


	public stackUsingArray(int capacity) throws Exception{
		if(capacity<1)throw new Exception("invalid capacity");
		this.data=new int[capacity];
		this.top=-1;
	}
	public int size()
	{
		return this.top+1;
	}
public boolean isEmpty() {
	return this.size()==0;
}
public void push(int value)throws Exception {
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
