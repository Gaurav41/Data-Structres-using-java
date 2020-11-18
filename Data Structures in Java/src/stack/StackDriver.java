package stack;

public class StackDriver {
	int size=10;
	int Stack[] = new int[size];
	int top = -1;

	public boolean isEmpty() {
		if(top==-1)
		return true;
		return false;
	}

	public boolean isFull() {
		if(top==size-1)
		return true;
		return false;
	}

	public void push(int data) {
		if(!isFull()) {
			top++;
			Stack[top] = data;
		}else {
			System.out.println("Stack is full");
		}

	}

	public int pop() {
		if(!isEmpty())
		{
		int data = Stack[top];
		Stack[top] = -1;
		top--;
		return data;
		}else {
			System.out.println("Stack is Empty");
			return -1;
		}
	
	}

	public int peek() {
		if(!isEmpty())
		{
		int data = Stack[top];
		return data;
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public void show() {
		for (int i=0;i<=top;i++) {
			System.out.println(Stack[i]);
		}
	}

public static void main(String args[]) {
		StackDriver st = new StackDriver();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		st.push(8);
		st.push(9);
		st.push(10);
		
		
		st.show();
		System.out.println("pop"+st.pop());
		st.show();
		System.out.println("peek"+st.peek());
		st.show();
		


	}
}
