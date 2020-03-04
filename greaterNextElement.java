package dataStructure;
import java.util.*;
public class greaterNextElement {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
			Stack<Integer> st=new Stack<>();
			for(int i=0;i<n;i++)
			{
				while(!st.isEmpty() && arr[i]>st.peek()){
					
					System.out.println(st.peek()+"->"+arr[i]);
					st.pop();
				}
				st.push(arr[i]);
		
			}
			while(!st.isEmpty())
			{
			System.out.println(st.peek()+"-> -1");
			st.pop();
		    }
		}
}
