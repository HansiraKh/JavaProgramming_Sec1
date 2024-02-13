import java.util.Scanner;
import java.io.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException {
		Scanner readFile = new Scanner(new File("d://txtFile//student.txt"));
		int i =1;
		Header();
		while(readFile.hasNext()) {
			String id = readFile.next();
			readFile.next();
			String fname = readFile.next().substring(0,1).toUpperCase();
			String lname = readFile.next();
			double grade = readFile.nextDouble();
			int level = readFile.nextInt();
			//Level(id);
			
			
				System.out.println(i+".\t"+id+"\t"+level+"th\t"+fname+"."+lname+"\t"+grade+"\t"+Status(grade));
				i++;
				}
			
			

	}
 	public static String Level(String id) {
		int year = 22-Integer.parseInt(id.substring(0,2));
		
			return year+"th" ;
		
		
	}
	public static String Status(double grade) {
		if(grade>=2.01) {
			return "Pass";
		}
		else if(grade<=2.00&&grade>=1.00) {
			return "Critical";
		}
		else {return "Retried";}
		
	} 
	public static void Header() {
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("********************************************************************");

	}

}
