package linkedlist;

class DNode {
	public int data;
	public DNode next;
	public DNode prev;
}
class DLinkedList {
	DNode head;
	public void insert(int Data)
	{
		DNode DNode = new DNode();
		DNode.data=Data;
		DNode.next=null;
		DNode.prev=null;
		
		if(head==null)
		{
			head=DNode;
		}
		else
		{	DNode n =head;
			while(n.next!=null)
			{
				n=n.next;
			}
			
			n.next=DNode;
			DNode.prev=n;
		}	
	}
	public void Show()
	{	DNode n=head;
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
		DNode DNode = new DNode();
		DNode.data=data;
		DNode.next=null;
		DNode.prev=null;
		
		if(index==0)
		{
			DNode.next=head;
			head=DNode;
		}
		else {
			DNode n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			DNode.next=n.next;
			n.prev=DNode;
			
			n.next=DNode;
			DNode.prev=n;
		}
	}
	public void deleteAt(int index)
	{
		DNode n=head;
		DNode n1=null;
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
		n1.prev=n;
		n1=null;
		
	}
	public void search(int element)
	{
		boolean found=false;
		DNode n=head;int i=1;
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
		if(!found) { 
			if(element==n.data)
			
		{
			System.out.println("Element found at positon:"+i);
		}
		else {
			System.out.println("Element is not found");
		}
		}
	}
}

public class DLL {

	public static void main(String[] args) {		
		 DLinkedList ld = new DLinkedList(); 
		 ld.insert(10); 
		 ld.insert(20); 
		 ld.insert(30); 
		 ld.insert(40); 
		 ld.insert(50);
		 
		 ld.insertAt(4,56);
		 ld.Show();
		 
		//ld.deleteAt(0);
		 ld.Show();
		 ld.search(10);

	}

}
