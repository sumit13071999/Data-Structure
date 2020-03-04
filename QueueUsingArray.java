package dataStructure;

public class QueueUsingArray {
	private  int front;
	private int []data;
	private  int top;
	private int default_capacity=10;
	public QueueUsingArray() throws Exception{
		this.data=new int[this.default_capacity];
	}
	public QueueUsingArray(int capacity)throws Exception{
		if(1>capacity) throw new Exception("invalid capacity");
		data=new int[capacity];
		this.front=0;
		this.top=0;
	}
public int size() throws Exception{
	return this.top;
}
public boolean isEmpty()throws Exception{
	return this.top==0;
}
public void enqueue(int value) throws Exception{
	if(this.size()==this.data.length) throw new Exception("stack is full");
	int r=(this.front+this.top)%this.data.length;
	this.data[r]=value;
	this.top++;
}
public int dequeue()throws Exception {
	if(this.top==0)throw new Exception("stack is empty");
	int result=this.data[this.front];
	System.out.println(result);
	data[this.front]=0;
	this.front=(this.front+1)%this.data.length;
	top--;
	return result;
}
public int front() throws Exception {
	if(size()==0)throw new Exception("stack is empty");
	return this.data[this.front];
}
public void display() {
	for(int i=0;i<this.top;i++) {
		System.out.print(this.data[(front+i)%this.data.length]+",");
	}
	System.out.println("end");
}

}
