package empwages;

public class EmpWagesUC3 {
	public static void main(String[] args) {
		int iS_Part_Time = 1;
		int iS_Full_Time = 2;
		int emp_Rate_Per_Hr = 20;

		int empHrs;
		int empWages;
		// Computation
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == iS_Part_Time)
			empHrs = 4;
		else if (empCheck == iS_Full_Time)
			empHrs = 8;
		else
			empHrs = 0;
		empWages = empHrs * emp_Rate_Per_Hr;
		System.out.println("Daily Employee Wage is : " + empWages);
	}
	}
