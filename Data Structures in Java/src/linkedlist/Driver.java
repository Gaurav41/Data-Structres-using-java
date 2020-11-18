package linkedlist;

class Node {
	public int data;
	public Node next;
}

class LinkedList {
	Node head;
	public void insert(int Data)
	{
		Node node = new Node();
		node.data=Data;
		node.next=null;
		
		if(head==null)
		{
			head=node;
		}
		else
		{	Node n =head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}	
	}
	public void Show()
	{	Node n=head;
		while(n.next!=null)
		{
			System.out.print(n.data+"->");
			n=n.next;
		}
		System.out.print(n.data+"->");
		System.out.print("null\n");
	}
	public void insertAt(int index,int data)
	{
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(index==0)
		{
			node.next=head;
			head=node;
		}
		else {
			Node n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		}
	}
	public void deleteAt(int index)
	{
		Node n=head;Node n1=null;
		if(index==0)
		{  	n1=head;
			head=n.next;
			n1=null;
		}
		for(int i=0; i<index-1;i++)
		{
			n=n.next;
		}
		n1 =n.next;
		n.next=n1.next;
		n1=null;
		
	}
	public void search(int element)
	{
		boolean found=false;
		Node n=head;int i=1;
		while(n.next!=null)
		{
			if(element == n.data)
			{
				System.out.println("Element found at positon:"+i);
				found=true;
				break;
			}
			else {
			n=n.next;
			i++;
			}
		}
		if(!found && element==n.data)
		{
			System.out.println("Element found at positon:"+i);
		}
		else {
			System.out.println("Element is not found");
		}
	}
}

public class Driver {

	public static void main(String[] args) {		
		 LinkedList ld = new LinkedList(); 
		 ld.insert(10); 
		 ld.insert(20); 
		 ld.insert(30); 
		 ld.insert(40); 
		 ld.insert(50);
		 
		 ld.insertAt(4,56);
		 ld.Show();
		 
		//ld.deleteAt(0);
		 ld.Show();
		 ld.search(110);

	}

}
