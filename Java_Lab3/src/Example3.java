import javax.swing.*;
import java.text.DecimalFormat;
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.0");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight : "));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Hight : "));
		//convert height cm. to m.
		height = height/100;
        double bmi = weight/(height*height);
        String bmiCatogory;
        if(bmi<18.5) { bmiCatogory = "Underweight";
        JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi) + "\nYou're "+bmiCatogory, "BMI",JOptionPane.WARNING_MESSAGE);}
        else if (bmi<25) { bmiCatogory = "Normal-weight";
        JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi) + "\nYou're "+bmiCatogory, "BMI",JOptionPane.INFORMATION_MESSAGE);}
        else if (bmi<30) {bmiCatogory = "Overweight";
        JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi) + "\nYou're "+bmiCatogory, "BMI",JOptionPane.WARNING_MESSAGE);}
        else {bmiCatogory = "Obesity";
        JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi) + "\nYou're "+bmiCatogory, "BMI",JOptionPane.WARNING_MESSAGE);}
        

}
}
