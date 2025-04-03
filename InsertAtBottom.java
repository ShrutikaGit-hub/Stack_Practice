package stackPractise;
import java.util.Stack;

public class InsertAtBottom {
	public static void main(String[] args) {
		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
		Stack<Integer> st3 = new Stack<>();
		st1.push(3);
		st1.push(4);
		st1.push(2);
		st1.push(6);
				
		while(st1.size()>0) {
			st2.push(st1.pop());
		}
		st2.push(5);

		while(st2.size()>0) {
			st3.push(st2.pop());
		}
		System.out.println(st3);
	}
}
