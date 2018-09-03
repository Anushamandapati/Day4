package com.capgemini.day4.domain;

public class Employee {
	private long employeeid;
	private String employeeName;
	private double basicsalary;
	public static final double medical=2500;
	
	public static final int pt=200;
	public Employee()
	{
		super();
	}
	public Employee(long id,String Name,double basicsalary)
	{
		this();
		this.employeeid=id;
		this.employeeName=Name;
		this.basicsalary=basicsalary;
		//this.employeeAddress=address;
		//this.employeephone=phone;
	}
	public double netSalary()
	{
		double  hra = basicsalary*0.5;
		double pf  = basicsalary*0.12;
		double grosssalary = hra+basicsalary+medical;
		double netsalary = grosssalary-(pf+pt);	
		return netsalary;	
	}
	public void employeeInfo(long employeeid,String employeeName,double netsalary)
	{
		System.out.println("EmployeeId is"+employeeid+"Employee Name is"+employeeName+"netsalary of an employee is"+netsalary);
	}
}
