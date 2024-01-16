
public class testDate {

	public static void main(String[] args) {
		// test constructor and to toString
		Date d1 = new Date(2023,2,8);
		System.out.println(d1);
		System.out.println();
		//test setter getter
		d1.setYear(2012);
		d1.setMonth(12);
		d1.setDay(23);
		//12/23/2012
		System.out.println(d1);
		System.out.println();
		//year is 2012
		
		System.out.println("year is : "+ d1.getYear());
		//month is 12
		System.out.println("Month is : "+ d1.getMonth());
		//day is 23
		System.out.println("day is : "+ d1.getDay());
		System.out.println();
		

	}

}
