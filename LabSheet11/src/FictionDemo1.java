import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Title : ");
		String title = sc.nextLine();
		
		System.out.print("Input book year : ");
		int year = sc.nextInt();
		
		FictionBook book = new FictionBook(title,year);
		sc.nextLine();
		do {
			System.out.print("Input author Name:");
			book.setAuthorName(sc.nextLine());
		}while(!book.checkFormatName());
		do {
			System.out.print("Input Email:");
			book.setEmail(sc.nextLine());
		}
		
		while(!book.checkEmail());
		
		System.out.print(book);
	}

}
