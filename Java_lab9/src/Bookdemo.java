import java.time.Year;
import java.util.Scanner;

public class Bookdemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book b1 = new Book();
				
		System.out.print("Input book title : ");
		String title = scan.nextLine();
		System.out.print("Input book price : ");
		float price = scan.nextFloat();
		System.out.print("Input book publish year : ");
		int publishyear = scan.nextInt();
		
		b1.setTitle(title);
		b1.setPrice(price);
		b1.setPublishyear(publishyear);
		
		System.out.println();
		System.out.print(b1) ;

	}

}
