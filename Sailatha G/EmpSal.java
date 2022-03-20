package assignment3;

public class EmpSal {
	
	public static void main(String[] args) {
		double grossSalary=30000;
		double incomeTax=1500;
		double providentFund=1200;
		double professionalTax=500;
		double netSalary=grossSalary-(incomeTax+providentFund+professionalTax);
		System.out.println("Net Salary is ="+netSalary);
	}

}
