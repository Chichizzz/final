import java.util.Stack;
import java.util.Vector;

public class DODO {
	public static void main(String[] args) {

    	
  	  // Example of using Vector
      Vector<Integer> vector = new Vector<>();
      vector.add(10);
      vector.add(20);
      vector.add(30);

      System.out.println("Vector elements: " + vector);

      // Example of using Stack
      Stack<Integer> stack = new Stack<>();
      stack.push(30);
      stack.push(40);
      stack.push(50);

      System.out.println("Stack elements: " + stack);

      // Perform stack operations
      System.out.println("Top element of the stack: " + stack.peek());
      System.out.println("Popped element from the stack: " + stack.pop());
      System.out.println("Stack after pop operation: " + stack);

  }
}
