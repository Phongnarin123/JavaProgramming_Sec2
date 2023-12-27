import java.util.*;
import java.text.*;
public class Lab701 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int odd = 0;
		int[] num = new int[7];
		int i =0;
		for (int _num:num) {
			System.out.print("Input number " +(i+1)+" : ");
			num[i] = scan.nextInt();
			if (_num %2 !=0) {
				
			}
			i++;
		}
		System.out.println();
		System.out.println("There are "+odd+"of odd number.");
		System.out.print("List of odd number : ");
		for(int _num:num) {
			if (_num %2 !=0) {
				System.out.print(_num+" ");
			}
		}
	}

}
