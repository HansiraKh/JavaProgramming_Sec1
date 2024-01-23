
public class Date {

	private int dMonth;
	private int dDay;
	private int dYear;
	
	
	Date(){
		dMonth = 1;
		dDay = 1;
		dYear = 1900;
		
	}
	
	Date(int month,int day,int year){
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	
	//set get
	public void setDate(int month,int day,int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	//return to month
	public int getMonth() {
		return dMonth;
	}
	//return to day
	public int getDay() {
		return dDay;
	}
	//return to year
	public int getYear() {
		return dYear;
	}
	//return the date in date in mm-dd-yyyy form
	public String toString() {
		return dMonth + "-" + dDay + "-" + dYear;
	}

}
