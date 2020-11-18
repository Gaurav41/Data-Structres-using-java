package Queue;

public class CQueue {

	int size = 5;
	int queue[] = new int[size];
	int front, rear;
	int elements = 0;

	public void enQueue(int data) {
		if(!isFull())
		{
		queue[rear] = data;
		rear = (rear + 1) % size;  //rear++;
		elements++;
		}else {
			System.out.println("Queue Is Full");
		}
	}

	public int deQueue() {
		int data = -1;
		if(!isEmpty()) {
		data = queue[front];
		elements--;
		front = (front + 1) % size;//front++;
		}else {
			System.out.println("Queue Is Empty");
		}
		return data;
	}

	public void show() {
		System.out.print("Queue: ");
		for (int i = 0; i < elements; i++) {
			System.out.print(queue[(front + i) % size] + " ");
		}
		System.out.println();
	}

	public boolean isEmpty() {
		return elements == 0;
	}

	public boolean isFull() {
		return elements == size;
	}

	public static void main(String[] args) {
		CQueue q = new CQueue();
		System.out.println("empty: " + q.isEmpty());
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		
		q.show();
		System.out.println("full: " + q.isFull());
		
		q.deQueue();
		q.show();
		  
		  q.enQueue(6); 
		  q.deQueue();
		  
		  q.enQueue(7);
		  q.show();
		 
	}

}
