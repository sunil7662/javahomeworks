
public abstract class Abstraction {
	
	abstract void run();
	{
	System.out.println("hai im first");	
	}
	void print(){
	
	}
	abstract class Abc extends Abstraction {
		
		void run(){
			System.out.println("hai im running");
		}
	}
	public static void main(String[] args){
		
		Abc obj = new Abc();
		obj.run();
	}

}
