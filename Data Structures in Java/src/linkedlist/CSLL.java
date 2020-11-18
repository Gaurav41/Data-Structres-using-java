package linkedlist;

class CSLLNode{
	int data;
	CSLLNode next;
}
public class CSLL {
	CSLLNode head;
	public void insert(int Data)
	{
		CSLLNode CSLLNode = new CSLLNode();
		CSLLNode.data=Data;
		CSLLNode.next=null;
		
		if(head==null)
		{
			head=CSLLNode;
			CSLLNode.next=head;
		}
		else
		{	CSLLNode n =head;
			while(n.next!=head)
			{
				n=n.next;
			}
			n.next=CSLLNode;
			CSLLNode.next=head;

		}	
	}
	public void Show()
	{	CSLLNode n=head;
		while(n.next!=head)
		{
			System.out.print(n.data+"->");
			n=n.next;
		}
		System.out.print(n.data+"\n");
		
	}
	public void insertAt(int index,int data)
	{
		CSLLNode CSLLNode = new CSLLNode();
		CSLLNode.data=data;
		CSLLNode.next=null;
		
		if(index==0)
		{
			CSLLNode.next=head;
			head=CSLLNode;
		}
		else {
			CSLLNode n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			CSLLNode.next=n.next;
			n.next=CSLLNode;
		}
	}
	public void deleteAt(int index)
	{
		CSLLNode n=head;CSLLNode n1=null;
		if(index==0)
		{  	n1=head;
			while(n.next!=head)
			{
				n=n.next;
			}
			n.next=head.next;
			head=head.next;
			n1=null;
		}else {
		for(int i=0; i<index-1;i++)
		{
			n=n.next;
		}
		n1 =n.next;
		n.next=n1.next;
		n1=null;
		}
		
	}
	public void search(int element)
	{
		boolean found=false;
		CSLLNode n=head;int i=1;
		while(n.next!=head)
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



	public static void main(String[] args) {		
		 CSLL ld = new  CSLL(); 
		 ld.insert(10); 
		 ld.insert(20); 
		 ld.insert(30); 
		 ld.insert(40); 
		 ld.insert(50);
		
		 ld.Show();
		 
		 ld.deleteAt(0);ld.Show(); ld.deleteAt(1);
		 ld.Show();//ld.insert(60); ld.Show();
		

	}

}
