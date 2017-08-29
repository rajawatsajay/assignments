public class Stack {
	int top=-1;
	int size=3;
private int stack[]=new int [size];
	void push(int pushElement) {
		if(top<size-1){
			top++;
	        stack[top]=pushElement;
         	System.out.println("Element " + pushElement+ " is pushed to Stack !");   
				  }
		else {  
				   System.out.println("Stack Overflow !");  
		}
	}
	public void pop(){
		if (top >= 0) {  
			   top--;  
			   System.out.println("Pop operation done !");  
			  } else {  
			   System.out.println("Stack Underflow !");  
			  }  
	}
	public void printElements() {  
		  if (top >= 0) {  
		   System.out.println("Elements in stack :");  
		   for (int i = 0; i <= top; i++) {  
		    System.out.println(stack[i]);  
		   }
		  } 
	}
	public static void main(String []args){
		
		Stack stack=new Stack();
		stack.pop();
		stack.push(4);
		stack.push(6);
		stack.push(9);
		stack.push(15);
		stack.printElements();
	}

}
