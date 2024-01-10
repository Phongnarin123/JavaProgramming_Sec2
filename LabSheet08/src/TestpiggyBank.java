import java.util.*;
public class TestpiggyBank {
		static PiggyBank pb = new PiggyBank();
		static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		/*PiggyBank pb = new PiggyBank();
		pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addFive(100);*/
		inputCoin();
	}
	public static void inputCoin() {
		System.out.println("Money Total : "+pb.getTotal());
		System.out.print("Please difine size of PiggyBank: ");
		int sizeofPiggyBank = scan.nextInt();
		pb.setPiggyBank(sizeofPiggyBank);
		System.out.println("Money Total : "+pb.getPiggyBank());
		MainMenu();
	}
	public static void MainMenu() {
		while(true) {
			System.out.println("================================");
			System.out.println("Menu of PiggyBank");
			System.out.println("================================");
			System.out.println("[1] one baht.");
			System.out.println("[2] two baht.");
			System.out.println("[3] five baht.");
			System.out.println("[4] ten baht.");
			System.out.println("[5] Exit");
			System.out.println("================================");
			
			System.out.print("Please Select Menu[1-5] : ");
			int SelectMenu = scan.nextInt();
			if(SelectMenu ==1) {
				System.out.print("Insert 1 Baht Money: ");
				int one = scan.nextInt();
				pb.addOne(one);
				System.out.println("Money Total : "+pb.getTotal());
				
			}else if(SelectMenu ==2) {
				System.out.print("Insert 2 Baht Money: ");
				int two = scan.nextInt();
				pb.addTwo(two);
				System.out.println("Money Total : "+pb.getTotal());
				
			}else if(SelectMenu ==3) {
				System.out.print("Insert 5 Baht Money: ");
				int five = scan.nextInt();
				pb.addFive(five);
				System.out.println("Money Total : "+pb.getTotal());
				
			}else if (SelectMenu ==4) {
				System.out.print("Insert 5 Baht Money: ");
				int ten = scan.nextInt();
				pb.addTen(ten);
				System.out.println("Money Total : "+pb.getTotal());
				
			}else if (SelectMenu ==5) {
				System.out.println("Bye Bye");
				break;
			}
			
		}
		
		
	}
}
