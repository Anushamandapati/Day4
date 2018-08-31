package com.capgemini.day4.domain;

public class Employee
{
	private int employeeId;
	private String employeeName;
	private String employeeAddress;
	private int employeePhone;
	private double basicSalary;
	public final double specialAllowance=250.80;
	public final double HRA=1000.50;
	public Employee()
	{
		super();
	}
	public Employee(int employeeId,String employeeName,String employeeAddress,int employeePhone)
	{
		this();
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeAddress=employeeAddress;
		this.employeePhone=employeePhone;
	}
	public double calculateSalary()
	{
		double salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * HRA/100);
		System.out.println("Employee salary is:" +salary);
		return salary;
	}
	
}
