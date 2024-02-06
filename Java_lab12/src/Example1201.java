import java.util.Scanner;
import java.io.*;
public class Example1201 {
	public static void main(String[] args) throws IOException{
		//using scanner class for read data form file
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		
		while(readFile.hasNext()) {
			//read name form file 
			String fname = readFile.next();//read first name
			//String lname = readFile.next();//read last name
			readFile.next();//read last name *ไม่ใช้
			readFile.next();//read password *ไม่ใช้
			String email = readFile.next().toUpperCase();//read Email และทำให้เป็นพิมพ์ใหญ่
			System.out.println(fname+" "+"("+email+")");
		}
		//close file
		readFile.close();
	}

}
