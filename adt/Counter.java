package adt;

public class Counter {
	private String name=null;
	private int value=0;
	
	public Counter(String str){
	
		 this.name=str;
	}
	public void increment(){
		this.value++;
		
	}
	
	public int getCurrentValue(){
		return value;
	}
	@Override
	public String toString() {
		return "Counter [name=" + name + ", value=" + value + "]";
	}
	
	

}
