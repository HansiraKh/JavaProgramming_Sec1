
public class PersonalINFO {

	private Person name;
	private Date bDay;
	private int PersonID;
	
	//default constructor
	PersonalINFO (){
		name = new Person(); //firstName ="" ,LastName=""
		bDay = new Date(); //dMonth=1 dDay=1 dYear=1990
		PersonID = 0; 
	}
	PersonalINFO (String first,String last ,int month,int day,int year,int ID){
		//กำหนดค่า Name
		name = new Person(first,last);
		bDay = new Date(month,day,year);
		PersonID = ID;
	}
	public void setPersonalINFO(String first,String last ,int month,int day,int year,int ID) {
		name.setName(first, last);
		bDay.setDate(month, day, year);
		PersonID = ID;
	}
	//return string 
	public String toString() {
		return"Name: " + name.toString() + "\n" + "Date of birth: " + bDay.toString() + "\n" + "Personal ID: "+PersonID;
	}

	}


