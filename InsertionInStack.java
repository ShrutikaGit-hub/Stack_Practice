package stackPractise;
import java.util.Stack;

public class InsertionInStack {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		Stack<Integer> temp = new Stack<>();
		int idx = 2, val = 5;
		st.push(3);
		st.push(4);
		st.push(2);
		st.push(6);
		
		while(st.size()>=idx) {
			temp.push(st.pop());
		}
		temp.push(val);
		while(temp.size()>0) {
			st.push(temp.pop());
		}
		System.out.println(st);
	}
}
