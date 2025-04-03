package stackPractise;
import java.util.Stack;
import java.util.Scanner;

public class ReverseStack {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
		int size;
		System.out.print("Enter the size of stack : ");
		size = sc.nextInt();
		for(int i = 1; i <= size; i++) {
			System.out.printf("Enter %d number : ",i);
			st1.push(sc.nextInt());
		}
		System.out.println("Entered Stack : "+st1);
		
		int temp;
		for(int i = 1; i <= size; i++) {
			temp = st1.pop();
			st2.push(temp);
		}
		System.out.println("Copied Stack : "+st2);
		sc.close(); 
	}
}
