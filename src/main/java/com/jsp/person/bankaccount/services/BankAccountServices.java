package com.jsp.person.bankaccount.services;

import com.jsp.person.bankaccount.dao.BankAccountDao;
import com.jsp.person.bankaccount.dto.BankAccount;

public class BankAccountServices {
	BankAccountDao bankAccountDao = new BankAccountDao();

	public BankAccount createBankAccount(BankAccount BankAccount) {
		return bankAccountDao.createBankAccount(BankAccount);
	}

	public BankAccount geBankAccountById(int id) {
		return bankAccountDao.getBankAccountById(id);
	}

	public BankAccount deleteBankAccountById(int id) {
		return bankAccountDao.deleteBankAccountById(id);
	}

	public BankAccount updateBankAccountById(int id, String name, String branch) {

		return bankAccountDao.updateBankAccountById(id, name, branch);
	}
}
