import javax.swing.*;
public class RectangleDemo {

	public static void main(String[] args) {
		double width = Double.parseDouble(JOptionPane.showInputDialog("Input width:"));
		double length = Double.parseDouble(JOptionPane.showInputDialog("Input length:"));
		/*String color = JOptionPane.showInputDialog("Input color:");
		Rectangle obj1 = new Rectangle(width,length,color);
		JOptionPane.showMessageDialog(null, obj1.toString()+"\nArea of Rectangle is "+obj1.getArea());
	*/
		Rectangle2 obj2 = new Rectangle2(width,length);
		JOptionPane.showMessageDialog(null, obj2.toString()+"\nArea of Rectangle is "+obj2.getArea());
	
	
	
	
	
	}
	
	
	
	
}
