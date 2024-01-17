import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Book b1 = new Book();
		
		System.out.print("Input book title   : ");
		String title = scan.nextLine();
		b1.setTitle(title);
		
		System.out.print("Input book price   : ");
		float price = scan.nextFloat();
		b1.setPrice(price);
		
		System.out.print("Input publish year : ");
		int publishyear = scan.nextInt();
		b1.setPublishyear(publishyear);
		
		System.out.println();
		System.out.println(b1);
	}

}
