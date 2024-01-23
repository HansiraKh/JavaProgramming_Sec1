
public class Person {

	private String firstname;
	private String lastname;
	
	Person(){
		firstname = "" ;
		lastname = "" ;
	}
	Person(String first,String last){
		//firstname = first ;
		//lastname = last ;
		setName(first,last);
		
	}
	//set get
	public void setName(String first,String last) {
		firstname = first ;
		lastname = last ; 
	}
	public String getFirstname(){
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}//out put firstname lastname
	public String toString () {
		return firstname+" "+lastname;
	}

}
