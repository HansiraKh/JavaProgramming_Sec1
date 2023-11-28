import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input value of x : ");
		int xvalue = scan.nextInt();
		System.out.print("Input value of y : ");
		int yvalue = scan.nextInt();
		
		
		if (yvalue<xvalue) {
		do {
			System.out.print("Input value of y, again : ");
			yvalue = scan.nextInt();
			
		}while(yvalue<xvalue);
		}
			
		int xx = xvalue;
		int sum =0 ;
		int yy;
		
		for(int i =xvalue ;i<yvalue ; i++) {
		yy=i+1;
		sum = xx+yy;
			
			System.out.println(xx+" + "+yy + " = " +sum);
			
			xx =sum;
		}
	}

}
