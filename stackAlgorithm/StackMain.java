package stackAlgorithm;

public class StackMain {

	public static void main(String[] args) {
		Stack stack = new Stack(3);
		
		try {
			stack.push(20);
			stack.push(40);
			stack.push(60);
		
			while(!stack.isEmpty()){
				int position = stack.currentPosition();
				long value = stack.pop();
				System.out.println("Element at "+ position + "th positon in stack - "+value);
			}
		
			stack.push(80);
			stack.push(100);
			stack.push(120);
			
			//Should throw error
			stack.push(140);
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
