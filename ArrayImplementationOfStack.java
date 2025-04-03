package stackPractise;

public class ArrayImplementationOfStack {
	public static class Stack{
		int n = 5;
		private int []arr = new int[n];
		int idx = 0;
		void push(int val) {
			if(isFull()) {
				System.out.println("Stack is Full!");
				return;
			}
			arr[idx] = val;
			idx++;
		}
		int peek() {
			if(idx == 0) return -1;
			return arr[idx-1];
		}
		int pop() {
			if(idx==0) return -1;
			int top = arr[idx-1];
			arr[idx-1] = 0;
			idx--;
			return top;
		}
		void display() {
			for(int i = 0; i < idx; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		int size() {
			return idx;
		}
		boolean isEmpty() {
			if(idx==0) return true;
			return false;
		}
		boolean isFull() {
			if(idx==n) return true;
			return false;
		}
	}
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(3);
		st.push(5);
		st.push(8);
		st.display();
		st.pop();
		st.display();
		st.push(8);
		st.push(8);
		st.push(8);
		st.push(8);
		System.out.println("Size of Stack is : "+st.size());
		System.out.println("Peek of Stack is : "+st.peek());
		System.out.println(st.isEmpty());
		System.out.println(st.isFull());
	}
}
