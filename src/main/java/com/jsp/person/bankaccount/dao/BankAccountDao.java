package com.jsp.person.bankaccount.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.person.bankaccount.dto.BankAccount;



public class BankAccountDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sahil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public BankAccount createBankAccount(BankAccount BankAccount) {
		entityTransaction.begin();
		entityManager.persist(BankAccount);
		entityTransaction.commit();

		System.out.println("BankAccount Details Saved...");
		return BankAccount;
	}

	public BankAccount getBankAccountById(int id) {
		BankAccount p1 = entityManager.find(BankAccount.class, id);

		return p1;
	}

	public BankAccount deleteBankAccountById(int id) {
		BankAccount p1 = entityManager.find(BankAccount.class, id);

		entityTransaction.begin();
		entityManager.remove(p1);
		entityTransaction.commit();

		System.out.println("BankAccount Details deleted....");
		return p1;
	}

	public BankAccount updateBankAccountById(int id, String name, String branch) {

		BankAccount p1 = entityManager.find(BankAccount.class, id);

		if (p1 != null) {
			p1.setName(name);
			p1.setBranch(branch);;
			entityTransaction.begin();
			entityManager.merge(p1);
			entityTransaction.commit();
		} else {
			System.out.println("BankAccount details not found...");
		}
		return p1;
	}
}
