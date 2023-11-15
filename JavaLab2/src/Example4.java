import javax.swing.*;
import java.text.*;
import java.util.*;
public class Example4 {

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		String productName = JOptionPane.showInputDialog("Input product name :");
		int unitPrice = Integer.parseInt(JOptionPane.showInputDialog("Input product unit"));
		float pricePerUnit = Float.parseFloat(JOptionPane.showInputDialog("Input Price per unit"));
		
		double totalPrice = unitPrice * pricePerUnit;
		double vat = totalPrice +(totalPrice*7/100);
		
		 JOptionPane.showMessageDialog(null,"Total Price is "+frm.format(totalPrice)+" baht."
				 +"\nAdd VAT 7% is "+frm.format(vat)+" baht.");
		 
		 
		 

	}

}
