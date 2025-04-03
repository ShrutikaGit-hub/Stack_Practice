package stackPractise;

import java.util.Stack;

public class DisplayWithRecursion {
	static void display(Stack<Integer> st) {
		if(st.size()==0) {
			return;
		}
		int x = st.pop();
		System.out.println(x);
		display(st);
		st.push(x);
	}
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(3);
		st.push(4);
		st.push(2);
		st.push(6);
		display(st);
	}
}
