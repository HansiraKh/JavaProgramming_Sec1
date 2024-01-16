
public class Author {
	private String name;
	private String email;
	private char gender;
	
	Author(String name,String email,char gender){
		this.name = name; 
		this.email = email;
		this.gender= gender;	
	}
	Author(String name,String email){
		this.name = name; 
		this.email = email;
		this.gender= ' ';
	}
	Author(){
		this.name = null; 
		this.email = null;
		this.gender= ' ';
	}
	public String getName();{
		return name;
	}

}
