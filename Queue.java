package graph;

public class Queue {
	private int size ;
	private int[] queue;
	private int front;
	private int rear;
	int nums;
	
	public Queue(int size) {
		this.size = size;
		queue = new int[size];
		front = 0;
		rear = -1 ;
		nums=0;
	}
	public void insert(int i){
		if (rear==size-1) {
			rear=-1;
		}
		queue[++rear] = i;
		nums++;
	
	}
	public int remove(){
		int temp = queue[front++];
		if (front ==size) {
			front = 0;
		}
		nums--;
		return temp;
	}
	public int peek(){
		return queue[front];
	}
	public boolean isEmpty(){
		return nums==0?true:false; 
	}
}
