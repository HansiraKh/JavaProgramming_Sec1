import java.util.Scanner;
public class Exercise_503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scan.nextLine();
		message = message.toLowerCase();
		if(message.indexOf("nichi")>=0) {
			System.out.print("Nichi is a sentence");
		}
		else {
			System.out.print(message);
		}

	}

}
