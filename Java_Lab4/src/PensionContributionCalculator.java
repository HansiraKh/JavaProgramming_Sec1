import java.util.*;
import java.text.DecimalFormat;
public class PensionContributionCalculator {

	public static void main(String[] args) {
		final int SALARY_CEILING = 6000;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final double EMPLOYYEE_RATE_55_AND_BELOW =0.2;
		final double EMPLOYYER_RATE_55_AND_BELOW =0.17;
		final double EMPLOYYEE_RATE_55_TO_60 =0.2;
		final double EMPLOYYER_RATE_55_TO_60 =0.13;
		final double EMPLOYYEE_RATE_60_TO_65 =0.075;
		final double EMPLOYYER_RATE_60_TO_65 =0.09;
		final double EMPLOYYEE_RATE_65_ABOVE =0.05;
		final double EMPLOYYER_RATE_65_ABOVE =0.075;
		Scanner scan = new Scanner(System.in);
		int salary,age;
		int contributableSalary;
		double employeeContribution,employerContribution,totalContribution;
		
		
		System.out.print("Enter the monthly salary :$ ");
		 salary = scan.nextInt();
		System.out.print("Enter the age : ");
		 age = scan.nextInt();
		 contributableSalary = Math.min(salary, SALARY_CEILING);
		
		 if(age<=55) {
		employeeContribution=contributableSalary*EMPLOYYEE_RATE_55_AND_BELOW;
		employerContribution=contributableSalary*EMPLOYYER_RATE_55_AND_BELOW;
	    totalContribution=employerContribution+employeeContribution;
				}
		 else if(age<=60) {
				employeeContribution=contributableSalary*EMPLOYYEE_RATE_55_TO_60;
				employerContribution=contributableSalary*EMPLOYYER_RATE_55_TO_60;
			    totalContribution=employerContribution+employeeContribution;
						}
		 else if(age<=65) {
				employeeContribution=contributableSalary*EMPLOYYEE_RATE_60_TO_65;
				employerContribution=contributableSalary*EMPLOYYER_RATE_60_TO_65;
			    totalContribution=employerContribution+employeeContribution;
						}
		 else {
				employeeContribution=contributableSalary*EMPLOYYEE_RATE_65_ABOVE;
				employerContribution=contributableSalary*EMPLOYYER_RATE_65_ABOVE;
			    totalContribution=employerContribution+employeeContribution;
						}
		System.out.println("The employee's contribution is :$ "+frm.format(employeeContribution));
		
		System.out.println("The employer's contribution is :$ "+frm.format(employerContribution));
		System.out.println("The total contribution is :$ "+frm.format(totalContribution));
		

	}

}
