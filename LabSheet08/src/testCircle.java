
public class testCircle {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		c1.redius = 12.5;
		System.out.println("Radius of odject c1 = "+c1.getRadius());
		System.out.println("Area of odject c1 = "+c1.getArea());
		System.out.println();
		
		c2.redius = 5.5;
		System.out.println("Radius of odject c2 = "+c2.getRadius());
		System.out.println("Area of odject c2 = "+c2.getArea());
		System.out.println();
		
		System.out.println(showColor("red"));
		
	} //create a static method
	public static String showColor(String color) {
		return "The color is " + color;
	}
	
	
	
	
	
	
	
}
