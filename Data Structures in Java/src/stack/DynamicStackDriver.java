package stack;

public class DynamicStackDriver {
	int size=2;
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
		if(isFull()) {
			expand();
			top++;
			Stack[top] = data;
			
		}else {
			top++;
			Stack[top] = data;
		}

	}

	public int pop() {
		if(!isEmpty())
		{
		int data = Stack[top];
		Stack[top] = -1;
		top--;
		shrink();
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
	public void expand()
	{
		int newSize=size*2;
		int newStack[]=new int[newSize];
		for(int i=0;i<=top;i++)
		{
			newStack[i]=Stack[i];
		}
		Stack=newStack;
		size=newSize;
		/*
		 * for (int i=0;i<=top;i++) { System.out.println(newStack[i]); }
		 */
		
	}
	public void shrink()
	{
		if(top+1==size/2)
		{
		int newSize=size/2;
		int newStack[]=new int[newSize];
		for(int i=0;i<top;i++)
		{
			newStack[i]=Stack[i];
		}
		Stack=newStack;
		size=newSize;
		}
		for (int i=0;i<=top;i++) 
		{ System.out.println(Stack[i]);
		}
		

	}
public static void main(String args[]) {
		DynamicStackDriver st = new DynamicStackDriver();
		st.push(1);
		st.push(2);
		System.out.println("size:"+st.size);
		st.push(3);
		System.out.println("size:"+st.size);

		st.push(4);
		System.out.println("size:"+st.size);

		st.push(5);
		System.out.println("size:"+st.size);

		st.push(6);
		System.out.println("size:"+st.size);

		st.push(7);
		System.out.println("size:"+st.size);
		
		st.push(8);
		System.out.println("size:"+st.size);
		
		st.push(9);
		System.out.println("size:"+st.size);
		st.show();
		
		System.out.println("popping");
		System.out.println(st.pop());
		System.out.println("size:"+st.size);
		st.show();
		System.out.println(st.pop());;
		System.out.println("size:"+st.size);

		System.out.println(st.pop());
		System.out.println("size:"+st.size);

		System.out.println(st.pop());
		System.out.println("size:"+st.size);

		System.out.println(st.pop());
		System.out.println("size:"+st.size);

		System.out.println(st.pop());
		System.out.println("size:"+st.size);
		
		System.out.println(st.pop());
		System.out.println("size:"+st.size);
		
		System.out.println(st.pop());
		System.out.println("size:"+st.size);
		
		System.out.println(st.pop());
		System.out.println("size:"+st.size);
		st.show();
		
	
		


	}
}
