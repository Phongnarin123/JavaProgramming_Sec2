import java.text.*;
import javax.swing.*;
public class Example3 {

	public static void main(String[] args) {
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height:"));
		
		height = height/100;
		double bmi = weight/(height*height);
        
		String bmiCategory;
		if(bmi<18.5) {
			bmiCategory = "Underweight";
		}
		else if (bmi<25) {
			bmiCategory = "Normal-weight";
		}
		else if (bmi<30) {
			bmiCategory = "Over-weight";	
		}
		else bmiCategory = "Obesity";	
		
		JOptionPane.showConfirmDialog(null, "BMI = "+String.format("%.1f",bmi)+"\nYor're "+bmiCategory);
		
		
		
	}

}
