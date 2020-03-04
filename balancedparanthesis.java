package dataStructure;
import java.util.Scanner;
import java.util.Stack;

public class balancedparanthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(paranthesis(s));

	}

	private static boolean paranthesis(String s) {
		Stack<Character> p=new Stack<>();
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
			p.push(s.charAt(i));
		}else{
			if(p.isEmpty())
				return false;
		if(s.charAt(i)==')' && p.peek()!='(' ||
				s.charAt(i)=='}'&&p.peek()!='{'||
				s.charAt(i)==']'&& p.peek()!='[') {
			return false;
		}
			p.pop();
		}
		}
		return p.isEmpty();
	}

}
