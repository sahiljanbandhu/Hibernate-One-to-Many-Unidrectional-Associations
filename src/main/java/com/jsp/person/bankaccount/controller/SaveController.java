package com.jsp.person.bankaccount.controller;

import java.util.ArrayList;

import com.jsp.person.bankaccount.dto.BankAccount;
import com.jsp.person.bankaccount.dto.Person;
import com.jsp.person.bankaccount.services.BankAccountServices;
import com.jsp.person.bankaccount.services.PersonServices;

public class SaveController {

	public static void main(String[] args) 
	{	
		BankAccountServices bankAccountServices = new BankAccountServices();
		PersonServices personServices = new PersonServices();
		
		BankAccount bankAccount = new BankAccount();
		bankAccount.setName("SBI");
		bankAccount.setBranch("Goregaon");

		BankAccount bankAccount1 = new BankAccount();
		bankAccount1.setName("Axis");
		bankAccount1.setBranch("Goregaon");

		BankAccount bankAccount2 = new BankAccount();
		bankAccount2.setName("Kotak");
		bankAccount2.setBranch("Goregaon");

		ArrayList<BankAccount> al = new ArrayList<BankAccount>();
		al.add(bankAccount);
		al.add(bankAccount1);
		al.add(bankAccount2);

		Person person = new Person();
		person.setName("sahil");
		person.setGmail("sahil144987@gmail.com");
		person.setBankAccounts(al);
		
		personServices.createPerson(person);
		bankAccountServices.createBankAccount(bankAccount);
		bankAccountServices.createBankAccount(bankAccount1);
		bankAccountServices.createBankAccount(bankAccount2);
	}

}
