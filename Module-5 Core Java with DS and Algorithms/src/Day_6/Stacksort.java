package Day_6;



import java.util.Stack;

public class Stacksort {
	  public static void sortStack(Stack<Integer> stack) {
	        Stack<Integer> temp = new Stack<>();
	        while (!stack.isEmpty()) {
	            int current = stack.pop();
	            while (!temp.isEmpty() && temp.peek() < current) { 
	                stack.push(temp.pop());
	            }
	           temp.push(current);
	        }
	        while (!temp.isEmpty()) {
	            stack.push(temp.pop());
	        }
	    }
	  public static void main(String[] args) {
	        Stack<Integer> stack=new Stack<>();
	        stack.push(227);
	        stack.push(24);
	        stack.push(27);
	        stack.push(127);
	        stack.push(7);
	        stack.push(733);

	        System.out.println("Stack before sorting: " + stack);

	        sortStack(stack);

	        System.out.println("Stack after sorting: " + stack);
	    }


}
/*-Pop the first element from the main-stack.
-Push it onto the temp-stack.
-For each subsequent element in the main-stack:
-Pop the next element.
-While the temp-stack is not empty and the top element of the temp-stack is greater than the Popped element, pop the temp-stack and push the popped element back into the main-stack.
-Push the popped element onto the temp-stack.
-After processing all elements in the main-stack, pop all elements from the temp-stack and push them back into the main-stack.
-This will sort the elements in ascending order.*/



//code-by-dugar
