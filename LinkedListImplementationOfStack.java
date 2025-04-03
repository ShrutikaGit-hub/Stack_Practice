package stackPractise;

public class LinkedListImplementationOfStack {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	public static class Stack{
		private Node head = null;
		private int size = 0;
		
		void push(int data) {
			Node temp = new Node(data);   //created new temp node
			temp.next = head;             //linking of head and temp node
			head = temp;                  //head is pointing to the temp now
			size++;
		}
		
		void recursiondisplay(Node head) {        // helper function for display with recursion
			if(head==null) return;
			recursiondisplay(head.next);
			System.out.print(head.data+" ");
		}
		void display() {
			recursiondisplay(head);
			System.out.println();
		}
		
		void reversedisplay() {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.println();
		}
		
		int size() {
			return size;
		}
		
		int pop() {
			if(head==null) {
				System.out.println(" Stack is Empty ! ");
			}
			int temp = head.data;
			head = head.next;
			size--;
			return temp;
		}
		
		int peek() {
			if(head==null) {
				System.out.println(" Stack is Empty ! ");
			}
			return head.data;
		}
		
		boolean isEmpty() {
			if(size==0) return true;
			return false;
		}
	} 
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(3);
		st.push(5);
		st.push(8);
		st.pop();
		st.display();
		st.push(8);
		st.push(8);
		st.push(8);
		st.push(8);
		st.display();
		System.out.println("Size of Stack is : "+st.size());
		System.out.println("Peek of Stack is : "+st.peek());
	}
}
