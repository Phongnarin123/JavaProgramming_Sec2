import java.util.Scanner;
import java.io.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException{
		Header();
		Scanner readFile = new Scanner(new FileReader("d://txtFile//Student.txt"));
		int i = 1;
		String tmp = "";
		while(readFile.hasNext()) {
	        String id = readFile.next();
	        readFile.next();
			String fName = readFile.next().substring(0,1).toUpperCase();
			String lName = readFile.next();
			double grade = readFile.nextDouble();
			int level = readFile.nextInt();
			System.out.println(i+"."+"\t"+id+"\t"+Level(id)+"\t"+fName+"."+lName+"\t"+grade+"\t"+Status(grade));
			i++;
			
		}
		readFile.close();
	}
	
	public static String Level(String id) throws IOException{
		int stLevel = Integer.parseInt(id.substring(0,2));
		int stYear = 22-stLevel;
		return stYear+"th";
	}
	public static String Status(double grade) throws IOException{
		if(grade>2.00) {
			return "Pass";
		}else if (grade>=1.00 && grade<=2.00) {
			return "Critical";
		}else return "Retried";
		
		
	}
	public static void Header() {
		System.out.println("No.\tID\t\tLevel\tName \t Grade \t Status");
		System.out.println("**************************************************************");
		
	}
}
