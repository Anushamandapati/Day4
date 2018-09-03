package com.capgemini.day4.tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day4.domain.Employee;
import com.capgemini.day4.domain.President;
import com.capgemini.day4.domain.SalesManager;

class EmployeeTest {
	Employee employee;
	@Test
	void testparent() {
		assertEquals(3680.0, new SalesManager(1234, "devika",1000).netSalary());
		assertEquals(3944.0,new President(1000,157691,"anu", 8).netSalary());
	}
	
	

}
