package stack;

class Node{
	int data;
	Node next;
}
public class StackByLL {
	int top;
	Node head;
	
	public void push(int data)
	{
		Node n=new Node();
		n.data=data;
		if(head==null)
		{
		n.next=null;
		}else {
			n.next=head;

		}
		head=n;
	}
	
	public int pop()
	{ int data=-1;
		if(head==null)
		{
			System.out.println("Underflow");
		}
		else
		{ 	Node n=head;
			data=n.data;
			head=head.next;
			n=null;
		}
		return data;
	}
	
	public void show()
	{
		Node n=head;
		if(head!=null)
		{
		while(n.next!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.print(n.data+"\n");
		}else {
			System.out.println("Empty");
		}
	}

	public static void main(String[] args) {
		StackByLL s= new StackByLL();
		s.push(1);
		s.push(2);
		
		
		s.show();
		
		System.out.println("Popped :"+s.pop());
		
		s.show();
		System.out.println("Popped :"+s.pop());
		
		s.show();

	}

}
