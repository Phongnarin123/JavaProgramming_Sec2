import java.io.*;
import java.util.*;
public class SentenceText {

	public static void main(String[] args)throws IOException {
		// crate object for write(save) data to File using PrintStrem Class
		PrintStream writeFile = new PrintStream(new File("d://txtFile//sentence.txt"));
		//create object for input data from keyboard(console)
		Scanner scan = new Scanner(System.in);
		int i =1;
		while(true) {
			System.out.print("Sentence");
			String word = scan.next();
			
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			writeFile.println(i+":"+word);
			i++;
		}
		
		System.out.print("File is save!!");
		
		writeFile.close();

	}

}
