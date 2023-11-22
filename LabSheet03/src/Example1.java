import java.text.*;
import javax.swing.*;
public class Example1 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
        final int BUFFET = 299;
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill?"));
		double discountPrice , totalPrice = 0;
		totalPrice = BUFFET * numberofCustomer;
		int memberCard;
		
		do {
			memberCard = JOptionPane.showConfirmDialog(null, "Total price is"+frm.format(totalPrice)+" baht."+"\nDo you have a member card?");
		}while(memberCard==JOptionPane.CANCEL_OPTION);
		
		if(memberCard==JOptionPane.YES_OPTION) {
			discountPrice = totalPrice *90/100;
			JOptionPane.showConfirmDialog(null, "Amount to be paid is "+frm.format(discountPrice)+" baht.");
			
		}//end
		else if(memberCard==JOptionPane.NO_OPTION) {
			memberCard = JOptionPane.showConfirmDialog(null, "Total price is"+frm.format(totalPrice)+" baht."+"\nDo you have a member card?");
			
		}//end else
		
		
	}

}
