import java.util.Scanner;
import java.io.*;
public class Lab1204 {

	public static void main(String[] args) throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		Scanner enter = new Scanner(System.in);
		String tmp = "";
		System.out.print("Enter ratint of books:");
		double rating = enter.nextDouble();
		System.out.println("----------------------------------------");
		int countBook = 0 , i = 1;
		while((tmp = readFile.readLine())!= null) {
			String[] data = tmp.split("\t");
			double rate = Double.parseDouble(data[2]);
			
			if(rate>=rating) {
				countBook++;
				System.out.println("Book "+i+":"+data[0]+"write by "+data[1]+"("+data[3]+") reviews ");
			}
			
			i++;
			
		}
		
		readFile.close();
		System.out.println("----------------------------------------");
		System.out.println("There are "+countBook+ "book get rating more than "+rating);
	}

}
