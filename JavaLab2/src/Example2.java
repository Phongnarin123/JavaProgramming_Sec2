import java.text.*;
public class Example2 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		
		final int BUFFET = 299;
        int numberofCustomer = 5;
		
		float totalPrice = BUFFET * numberofCustomer;
		System.out.println("Buffet of "+numberofCustomer+"customer is "+frm.format(totalPrice));
		float seviceCharge = totalPrice + (totalPrice*3/100);
		System.out.println("Add Serice Charge 3% is "+frm.format(seviceCharge));
	}

}
