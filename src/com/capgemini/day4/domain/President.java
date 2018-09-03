package com.capgemini.day4.domain;
public class President extends Employee{
	private double kilometertravelled;
	private double tourallowance;
	
	public final int telephoneallowance=200;

	public President(double basicSalary, long employeeId, String employeeName, double kilometerTravelled) {

		super(employeeId, employeeName, basicSalary);
		this.kilometertravelled=kilometerTravelled;
	}
	
	public double getKilometertravelled() {
		return kilometertravelled;
	}

	public void setKilometertravelled(double kilometertravelled) {
		this.kilometertravelled = kilometertravelled;
	}
	@Override
	public double netSalary()
	{
		return super.netSalary()+8*kilometertravelled+telephoneallowance;
		
	}
}