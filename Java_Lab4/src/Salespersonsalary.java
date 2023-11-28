import java.util.*;
import java.text.DecimalFormat;
public class Salespersonsalary {

	public static void main(String[] args) {
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		int sales;
		double salary;
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			
		System.out.print("Enter sales in dollars :$ ");
		sales = scan.nextInt();
        if(sales ==SENTINEL) {
        	System.out.print("bye");
        	break;
		}
		salary = 1000+sales*COMMISSION_RATE ;
		System.out.print("Salary is : $ "+frm.format(salary));
		System.out.println();
		
		}
	}

}
