class CircularQueue {
	static final int MAX = 5;
	int a[] = new int[100];
	int front, rear;
	
	CircularQueue() {
		front = rear = 0;
	}
	
	boolean enqueue(int x) {
		if((rear+1)%MAX==front) {
			
			System.out.println("Queue is full");
			return false;
			
			
		}
		
		else {
			
			rear=(rear+1)%MAX;
			a[rear]=x;
			return true;
			
			
			
		}
	}
	
	int dequeue() {
		if(front ==rear) {
			System.out.println("Queue Underflow!");
			return 0;
			
		}
		else {
			
			front = (front+1)%MAX;
			int x = a[front];
			return x;
				
		}
	}
}

class CircularQueueDemo {
	public static void main(String args[]) {
		CircularQueue cq = new CircularQueue();
		
		cq.enqueue(10);
		cq.enqueue(10);
		cq.enqueue(10);
		cq.enqueue(10);
		cq.dequeue();
		cq.enqueue(10);
		cq.dequeue();
		cq.enqueue(10);
		cq.dequeue();
		cq.dequeue();
		cq.dequeue();
		cq.dequeue();
		cq.dequeue();
		cq.dequeue();
	}
		
}
	
		