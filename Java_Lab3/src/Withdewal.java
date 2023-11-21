import javax.swing.*;
import java.text.DecimalFormat;
import java.util.*;
public class Withdewal {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("00");
		Random rand = new Random();
		int balance = rand.nextInt(9) *100000;
		int withdrawMoney = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+frm.format(balance)+"\nInput money to withdraw : "));
		
		if(withdrawMoney>balance) {
			JOptionPane.showMessageDialog(null, "ERROR:Cannot withdraw more than balance", "ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(withdrawMoney>20000) {
			JOptionPane.showMessageDialog(null, "ERROR:Cannot withdraw more than 20,000", "ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(withdrawMoney%100!=0) {
			JOptionPane.showMessageDialog(null, "ERROR:Cannot withdraw "+withdrawMoney%100+" baht.", "ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else {
			int remainingAmount = withdrawMoney;

            int num1000 = remainingAmount / 1000;
            remainingAmount %= 1000;

            int num500 = remainingAmount / 500;
            remainingAmount %= 500;

            int num100 = remainingAmount / 100;
			JOptionPane.showMessageDialog(null, "You withdraw"+withdrawMoney+" baht."+"\n1,000 = "
		+num1000+"\n500 = "+num500+"\n100 = "+num100, "Message",JOptionPane.INFORMATION_MESSAGE);}
		}

	}

