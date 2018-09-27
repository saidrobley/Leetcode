
import java.util.Stack;
/*
	Given a non-empty array of integers, every element appears twice
	except for one. Find that single one.
*/

public class SingleNumber {
	
	public static void main(String[] args) {
		int[] arr = {4, 1, 2, 1, 2};
		System.out.println(getSingleNumber(arr));
	}
	
	public static int getSingleNumber(int[] arr) {
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int number: arr) {
			
			if(stack.isEmpty()){
				stack.push(number);
			} else if(stack.peek() == number) {
					stack.pop();
				
			}
		}
		
		return stack.pop();
	}
	
}
