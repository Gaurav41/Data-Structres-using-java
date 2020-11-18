package Queue;

public class Queue {
	int size=10;
	int queue[]=new int[size];
	int front=-1,rear=-1;
	
	public void enQueue(int data)
	{
		if(rear==-1)
		{
			front =0;
			rear=0;
			queue[rear]=data;
			
		}else if(!isFull()){
		rear++;
		queue[rear]=data;
		
		}else {
			System.out.println("Queue is full");
		}
	
	}
	
	public int deQueue() {
		int data=-1;
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			
		}else {
			if(front==rear)
			{
			data=queue[front];
			front=-1;rear=-1;
			}else {
				data=queue[front];
				front++;
			}
		}
		return data;
	}
	
	public void show()
	{	System.out.print("Queue: ");
		if(!isEmpty()) {
		for(int i=front;i<=rear;i++)
		{
			System.out.print(queue[i]+" ");
		}
		System.out.println();
		}else {
			System.out.println("Queue is empty");
		}
	}
	
	public boolean isEmpty()
	{
		if(rear==-1)
		return true;
		return false;
	}
	public boolean isFull()
	{
		if(rear==size-1)
		return true;
		return false;
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5); 
		q.enQueue(6); 
		q.enQueue(7); 
		q.enQueue(8); 
		q.enQueue(9);
		q.enQueue(10);
		 
		q.show();
		
		q.enQueue(11);//full
		
		
		for(int i=0;i<=9;i++)
			q.deQueue();
		q.show();
		
	}

}
