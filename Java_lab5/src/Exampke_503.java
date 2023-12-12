import java.util.*;
public class Exampke_503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//input sentence
		System.out.print("Input a sentence: ");
		String sentence = scan.nextLine();
		//end of full stop or not
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence,again: ");
			sentence = scan.nextLine();
		}
		System.out.println(); 
		//loop for check space bar
		int spacebar = 0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spacebar +=1;
			}
		}
		System.out.println("This sentence has "+ spacebar +" spacebar.");
		System.out.print("This sentence has "+ (spacebar+1) +" word.");
	}

}
