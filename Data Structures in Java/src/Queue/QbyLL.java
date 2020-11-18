package Queue;

class Node{
	int data;
	Node next;
}

public class QbyLL {
	Node head;
	
	public void enQueue(int data)
	{
		Node node= new Node();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
	}
	public int deQueue()
	{
		int data=-1;
		if(head==null)
		{
			System.out.println("Underflow");
		}else {
			Node n=head;
			data=head.data;
			head=head.next;
			n=null;
		}
		return data;
	}
	public void show()
	{
		Node n=head;
		if(head==null)
		{
			System.out.println("Underflow");
		}else {
		while(n.next!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.print(n.data+" ");
		System.out.println("");
		}
	}
	

	public static void main(String[] args) {
		QbyLL ql=new QbyLL();
		ql.enQueue(1);
		ql.enQueue(2);
		ql.enQueue(3);
		ql.enQueue(4);
		ql.show();
		
		ql.deQueue();
		ql.show();
		
		

	}

}
