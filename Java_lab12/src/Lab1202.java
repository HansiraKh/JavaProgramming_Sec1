import java.util.Scanner;
import java.io.*;
public class Lab1202 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		System.out.print("Input email: ");
		String inputemail = input.next();
		while(readFile.hasNext()) {
			readFile.next();
			readFile.next();
			String password =readFile.next();
			String email = readFile.next();
			if(email.equalsIgnoreCase(inputemail)) {
				System.out.print("Your password is "+password);	
				break;
			}
			else 
				{System.out.print("The data not found");
				break;}
			
		}
	}
	

}
