import java.util.Stack;

// Bottomline Interview
// Write a program for finding invalid string if it is not closed properly
public class T10_Bottomline_StackInvalidString {
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		
		for (char ch : s.toCharArray()) {
			// Push opening brackets onto the stack
			if (ch == '(' || ch == '{' || ch == '[')
			{
				stack.push(ch);
			}
			// Check closing brackets
			else if (ch == ')' || ch == '}' || ch == ']')
			{
				if (stack.isEmpty())
				{
					return false; // No matching opening bracket
				}
				char top = stack.pop();
				// Check if the popped bracket matches the current closing bracket
				if ((ch == ')' && top != '(') ||
						    (ch == '}' && top != '{') ||
						    (ch == ']' && top != '['))
				{
					return false;
				}
			}
		}
		
		// If the stack is empty, all brackets are balanced
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		// Test cases
		String[] testStrings = {"[{()}]", "[()()]{}", "([]", "([{]})"};
		for (String s : testStrings)
		{
			System.out.println("Is \"" + s + "\" valid? " + isValid(s));
		}
	}
}
