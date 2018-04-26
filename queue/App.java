package ds.queue;

public class App {
	
	public static void main(String args[]){
		Queue myQueue = new Queue(5);
		myQueue.insert(100);
		myQueue.insert(15);
		myQueue.insert(140);
		myQueue.insert(10);
		myQueue.insert(44);
		myQueue.insert(34);
		myQueue.view();
		
	}

}
