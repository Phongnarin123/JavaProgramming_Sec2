import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int currentNumber,previouNumber;
		
		System.out.print("Input number : ");
        previouNumber = scan.nextInt();
		
        while (true) {
        	System.out.print("Input number : ");
            currentNumber = scan.nextInt();
            if(currentNumber<previouNumber) {
            	break;
            }
            previouNumber = currentNumber;
        }
		System.out.print("\nBYE BEY");
        
        
        
        
        
		
	}

}
