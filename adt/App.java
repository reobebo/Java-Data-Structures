package adt;

public class App {
	
	public static void main (String[] args){
		Counter test = new Counter("billy");
		test.increment();
		test.increment();
		System.out.println(test.getCurrentValue());
	}

}
