import java.util.*;
public class Exercise_501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullname = scan.nextLine();
		int space = fullname.trim().indexOf(" ");
		if(space ==-1) {
			System.out.print("IncorrectName");
		}
		else{
		String firstname =	fullname.substring(0,space);
		String lastname = fullname.substring(space,fullname.length());
		System.out.println("First Name: "+firstname);
		System.out.print("Last Name: "+lastname);
		}
		}
		

	}


