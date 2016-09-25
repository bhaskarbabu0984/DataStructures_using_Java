package com.ds.stackAlgorithm;

public class Stack {
	//Indicator to top of the stack
	private int top;
	
	//Stack Array
	private Long [] stackArray;
	
	//Maxsize of array stack
	private int maxsize;
	
	public Stack(int size) {
		//Top of stack initialized to -1. Since this is array stack, index starts with 0.
		this.top = -1;
		this.maxsize = size;
		this.stackArray = new Long[maxsize];
	}
	
	//Add new element to Stack
	public void push(long newElement) throws Exception {
		
		//First check if stack is full
		if((maxsize-1) != top){
			//Increment the index before adding element to array
			top ++;
			stackArray[top] = newElement;
			System.out.println("New element " + stackArray[top] + " added to stack");
		} else {
			throw new Exception("Stack is Full");
		}
	}
	
	//Pop an element from Stack
	public long pop() throws Exception {
		int old_top = top;
		if(top == -1) {
			throw new Exception("Stack is Empty!");
		}
		
		top --;
		//We are actually not removing the element from Array. To remove an element, u can use ArrayUtils. 
		//array = ArrayUtils.removeElement(array, element)
		return stackArray[old_top];
	}
	
	//Check if stack is full
	public boolean isFull() {
		return (top == maxsize-1);
	}
	
	//Check if stack is Empty
	public boolean isEmpty() {
		return (top == -1);
	}
	
	//Check current position in stack
	public int currentPosition() {
		return top;
	}
}
