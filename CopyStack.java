package stackPractise;

import java.util.Stack;

public class CopyStack {
	public static void main(String[] args) {
		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
		Stack<Integer> st3 = new Stack<>();
		st1.push(3);
		st1.push(4);
		st1.push(2);
		st1.push(6);
		
		for(int i = 1; i <= 4; i++) {
			st2.push(st1.pop());
		}
		for(int i = 1; i <= 4; i++) {
			st3.push(st2.pop());
		}
		
//		while(st1.size()>0) {
//			st2.push(st1.pop());
//		}
//		
//		while(st2.size()>0) {
//			st3.push(st2.pop());
//		}
		
		System.out.println("Entered Stack : "+st1);
		System.out.println("Copied Stack : "+st3);
	}
}
