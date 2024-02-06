import java.io.*;
import java.util.Scanner;
public class Lab1204 {

	public static void main(String[] args) throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//Bookdata.txt"));
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rating of books: ");
		String rating = input.next();
		String tmp=""; 
		int i =1;
		Line();
		while((tmp=readFile.readLine())!=null){
			String[] data= tmp.split("\t");
			if(data[3]>=(rating)) {
				System.out.println("book"+data[4]+data[0]+"by"+data[1]+"("+data[3]+")reviews");
				i++;
			}
				
			
		}
		Line();
		System.out.println();
		System.out.print("There are "+i+"book get rating more than "+rating);
	}
	public static void Line() {
		System.out.print("---------------------------------------------");
	}

}
