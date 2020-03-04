package dataStructure;

public class StackUsingArrayclient {

	public static void main(String[] args) throws Exception {
		stackUsingArray st=new stackUsingArray(5);
		for(int i=1;i<=5;i++)
		{
			st.push(i*10);
		
		st.Display();}
		System.out.println(st.pop());
		System.out.println(st.top());
	st.Display();
      
	}

}
