package com.bridgelabz.employeewage;

public class EmployeeWage {


	public static void main(String[] args) {
		int IS_FULL_TIME = 1;


		double empCheck = Math.floor(Math.random()*10)%2;

		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else if (empCheck == IS_PART_TIME)
			empHrs = 4;
		else
			empHrs = 0;
		empWage = empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage:" + empWage);


	}

}


