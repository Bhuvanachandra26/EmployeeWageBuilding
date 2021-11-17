package com.bridgelabz.employeewage;

public class EmployeeWage {

	private String company = "";
	private int empRatePerHour = 0;

	public int getEmpRatePerHour() {
		return empRatePerHour;
	}

	public int getNumOfWorkingDays() {
		return numOfWorkingDays;
	}

	public int getMaxHoursPerMonth() {
		return maxHoursPerMonth;
	}

	private int numOfWorkingDays = 0;
	private int maxHoursPerMonth = 0;
	private int totalEmpWage;

	public void CompanyEmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}





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




