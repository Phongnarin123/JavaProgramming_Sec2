import java.text.*;
import java.util.*;
public class Example3 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("###.00");
		System.out.print("Input product name     : ");
		String productName = console.nextLine();
		System.out.print("Input product unit     : ");
		int productUnit = console.nextInt();
		System.out.print("Input product per unit : ");
		float productPerUnit = console.nextFloat();
		
		System.out.println();
		
		float totalPrice = productPerUnit * productUnit;
		System.out.println("Total Price is "+frm.format(totalPrice)+"baht.");
		float vat = totalPrice + (totalPrice*7/100);
        System.out.println("Add VAT 7% is "+frm.format(vat)+"baht.");
	}

}
