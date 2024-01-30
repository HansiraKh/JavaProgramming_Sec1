import java.util.*;
public class FictionDemo1 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("input Name of book: ");
	String Bookname = scan.nextLine();
	System.out.print("input PublishedYear of book: ");
	int BookYear = scan.nextInt();
	FictionBook book1 = new FictionBook(Bookname,BookYear);
	System.out.print("input Name of Author: ");
	String Authorname = scan.nextLine();
	System.out.print("input Email of Author: ");
	String Authoremail = scan.nextLine();
	book1.setAuthorName(Authorname);
	book1.setEmail(Authoremail);
	while(!book1.checkFormatName()) {
		System.out.print("input Name of Author: ");
		Authorname = scan.nextLine();
		book1.setAuthorName(Authorname);
	}
	

}
}