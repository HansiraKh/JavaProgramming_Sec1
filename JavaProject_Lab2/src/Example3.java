import java.text.DecimalFormat;
import java.util.*;//import for input data form keyboard
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//2.create class scanner for input data form keyboard
		Scanner input = new Scanner(System.in);
		//3.display and input data 
		System.out.print("Input product name   : ");
		String productname = input.nextLine();
		System.out.print("Input product unit   : ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit : ");
		float priceperUnit = input.nextFloat();
		System.out.println();
		float totalPrice = productUnit * priceperUnit;
		System.out.println("Total Price is "+frm.format(totalPrice)+" baht.");
		double vat = totalPrice+(totalPrice*7/100); //calculate vat in baht
        System.out.println("ADD VAT 7%  is "+frm.format(vat)+" baht.");

	}

}
