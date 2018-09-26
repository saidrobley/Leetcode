import java.util.Stack;

public class ValidParentheses {
	
	public static void main(String[] args) {
	
	}
	public static boolean isValidParenthesis(String s) {
		char[] arr = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(char c : arr) {
			if (c == '{' || c == '(' || c == '[') {
				stack.push(c);
			} else if (c == '}' && stack.peek() == '{'){
				stack.pop();
			} else if (c == ')' && stack.peek() == '('){
				stack.pop();
			} else if (c == ']' && stack.peek() == '['){
				stack.pop();
			} else {
				return false
			}
			
		}
		
		return stack.isEmpty();
	}
	
	
}
