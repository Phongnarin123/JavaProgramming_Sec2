import java.util.*;
import java.text.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		DecimalFormat frm = new DecimalFormat("$0,###.00");
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;
		
		int sales; 
		double salary;
        
		while (true) {
			System.out.print("Enter salary in dollars (or -1 to end):");
			sales = scan.nextInt();
			System.out.print("Salary is: ");
			
			if (sales==SENTINEL) {
				System.out.print("bye");
				break;
				
			}
			salary = sales * COMMISSION_RATE +1000;
		    System.out.print("salary is: "+frm.format(salary));
			System.out.println();
			
		}
		
		
		
	}

}
