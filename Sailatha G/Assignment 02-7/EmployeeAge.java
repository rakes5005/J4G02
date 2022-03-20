package Assignment2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class EmployeeAge {
	
	public static void main(String[] args) {
		System.out.print("enter date of birth in YYYY-MM-DD format:");
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		scanner.close();
		
		LocalDate dob = LocalDate.parse(input);
		
		System.out.println("you are" + " "+ calculateAge(dob)+ " " +" year old");
		                                                                                      
	    }
	
	public static int calculateAge(LocalDate dob) {
		LocalDate curDate=LocalDate.now();
		if((dob!=null) && (curDate!=null)) {
			
			return period  .between(dob, curDate).getYears();
		}
		return 0;
	}

}
