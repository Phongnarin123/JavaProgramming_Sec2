import javax.swing.*;
import java.text.*;
public class Lab706 {

	public static void main(String[] args) {
		int[] nums = {25,78,41,22,36,85,37};
		int indexNumb = Integer.parseInt(JOptionPane.showInputDialog("Input index of array: "));
		
		while (!checkIndex(nums,indexNumb)) {
			indexNumb = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again: "));
		}
		int currentValue = currentData(nums,indexNumb);
		
		JOptionPane.showConfirmDialog(null, "Current data,nums["+indexNumb+"] is "+currentValue+"\nPrevious data,nums"
				+ ""+((indexNumb-1<0)?"No previous data" : "Previous data,nums["+(indexNumb-1)+"] is "+prevData(nums,indexNumb))
				+"\n"+((indexNumb+1>nums.length-1)?"No next data" : "Next data,nums["+(indexNumb+1)+"] is"+nextData(nums,indexNumb)));
				
	}
	public static boolean checkIndex(int[] nums, int index) {
	/*	if ((index>=nums.length)||(index<0)) {
			return true;
		}
		else {
			return false;
		}  */
		return ((index>=nums.length)||(index<0))?true:false;
		
	}
	public static int currentData(int[] nums,int index) {
		
		return nums[index];
	}
	public static int prevData(int[]nums,int index) {
		
		return nums[index-1];
	}
	public static int nextData(int nums[],int index) {
		
		return nums[index+1];
	}
}
