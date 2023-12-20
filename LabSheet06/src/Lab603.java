import java.util.*;
public class Lab603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your name, separated by a space. \n:");
		String fullname = scan.nextLine();
		int space = fullname.indexOf(" ");
	 	String firstname = fullname.substring(0,space);
		System.out.println(abbreviatName(fullname)+firstname);
	}
	
	public static String abbreviatName(String fullname) {
		String shortname = " ";
		for(int i = 0;i<fullname.length()-1;i++) {
			if(fullname.charAt(i)== ' ') {
				shortname += fullname.charAt(i+1)+".";
			}
		}
		return shortname;
		
	}
	
}
