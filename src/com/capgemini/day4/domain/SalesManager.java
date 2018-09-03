package com.capgemini.day4.domain;
public class SalesManager extends Employee {
	private double basicsalary;

	
	public SalesManager() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public SalesManager(long id, String Name, double basicsalary) {
		super(id, Name, basicsalary);
		// TODO Auto-generated constructor stub
		
	}



	@Override
	public double netSalary()
	{
	
		double petrolallowance=basicsalary*0.08;
		double foodallowance=basicsalary*0.13;
		double otherallowance=basicsalary*0.03;
		return super.netSalary()+petrolallowance+foodallowance+otherallowance;
		 

	}
}