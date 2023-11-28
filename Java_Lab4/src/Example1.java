import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		//input data form keyboard
		Scanner scan = new Scanner(System.in);
		//display
		System.out.print("Input a number : ");
		int previousNumber = scan.nextInt();
		
		int currentNumber;
		
		//loop for input next number
		while(true) {
			System.out.print("Input a number : ");
			currentNumber = scan.nextInt();
			if(currentNumber < previousNumber) {
				System.out.print("BYE BYE");
				break;
			}
			previousNumber = currentNumber;
		}

	}

}
