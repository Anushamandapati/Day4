package com.capgemini.day4.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day4.domain.BankAccount;


class BankAccountTest
{

	BankAccount account;

	@BeforeEach
	void setUp()
	{
		account = new BankAccount("John Doe", "SAVING", 50000);
	}

	@Test
	void testWithdraw()
	{
		assertEquals(45000.0, account.withdraw(5000), 0.02);
		assertEquals(38000.0, account.withdraw(7000), 0.02);
		assertEquals(33432.66, account.withdraw(4567.34), 0.02);
		assertEquals(33432.66, account.withdraw(120000), 0.02);
	}

	@Test
	void testDeposit() 
	{
		assertEquals(55000.0, account.deposit(5000));
		assertEquals(59567.34, account.deposit(4567.34));
	}

	@AfterEach
	void tearDown()
	{
		account = null;
	} 
}