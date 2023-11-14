import java.text.DecimalFormat;

import javax.swing.*;//import library for input data form dialog box
public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//2.input data form dialog box 
		String productName = JOptionPane.showInputDialog("Input product name : ");
	/*	//input unit price form dialog box
		String strUnit = JOptionPane.showInputDialog("Input product unit : ");
		//convert string to int 
		int productUnit = Integer.parseInt(strUnit); */
		
		//input and convert data form dialog box
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input product unit : "));
		
		
		//input price per unit form dialog box
		String strPrice = JOptionPane.showInputDialog("Input price per unit : ");
		float pricePerUnit = Float.parseFloat(strPrice);
		
		//calculate total price
		float totalprice = productUnit * pricePerUnit;
		double vat = totalprice+(totalprice*7/100);
		//show data to dialog box 
		JOptionPane.showMessageDialog(null,"Total Price is "
				+ frm.format(totalprice)+" baht."+"\nAdd Vat 7% is "+frm.format(vat)+" baht");
		
	}

}
