package inheritance;

public class Polygon {
	protected int height;
	protected int width;
	
	public void set_values(int a, int b){
		height = a;
		width = b;
	}
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		
		
		rec.set_values(20, 30);
		tri.set_values(30, 40);
		
	    System.out.println("Area of rectangle =" +rec.area());
	    System.out.println("Area of triangle =" +tri.area());
	}
}

    