import java.time.Year;
public class FictionBook implements Author,Book {
	private String author_name ,email,title;
	private int publicYear;
	
	
	Year currentYear = Year.now();
	String abbreviatlastname = lastname.substring(space+1)+".";
	
	 FictionBook(String title,int publicYear){
		this.title = title;
		this.publicYear = publicYear;
	 }
		public void setAuthorName(String name) {
			this.author_name = name;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public boolean checkFormatName() {
			int space = author_name.indexOf(' ');
			String firstname = author_name.substring(0,space);
			String lastname = author_name.substring(space,author_name.length()-1);
			if (space ==1) {
				return true;
			}
			else  {
				return false;
			}
			}
		@Override
		public String getLastName() {
			int space = author_name.indexOf(' ');
			String lastname = author_name.substring(space,author_name.length()-1);
			return lastname = lastname.toUpperCase();
		}
		public String getFirstName() {
			int space = author_name.indexOf(' ');
			String firstname = author_name.substring(0,space);
			return firstname = firstname.toUpperCase();
		}
		public boolean checkEmail() {
			if (email.endsWith("@hotmail.com")||email.endsWith("@windowslive.com")){
				return true;
			}
			else {return false;}
		}
		public int totalPublicYear() {
			return currentYear.getValue() - publicYear;
		}
		public String toString() {
			return  title+" write by"+ abbreviatlastname+firstname+"("+email+")"+"Published for "+totalPublicYear()+"years." ;
		}
		}
	


