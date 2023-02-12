package com.jsp.hospital.branch;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {
	public static void main(String[] args) {
		EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("sahil");
		EntityManager entityManager = entityMangerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Branch branch = new Branch();
		branch.setName("Gokuldham");
		branch.setLocation("Goregaon");

		Branch branch1 = new Branch();
		branch1.setName("Yashodham");
		branch1.setLocation("Goregaon");

		Branch branch3 = new Branch();
		branch3.setName("Lakshadham");
		branch3.setLocation("Goregaon");

		ArrayList<Branch> al = new ArrayList<Branch>();
		al.add(branch);
		al.add(branch1);
		al.add(branch3);

		Hospital hospital = new Hospital();
		hospital.setName("Lilavati");
		hospital.setGmail("lilavati@gmail.com");
		hospital.setPhone_no(9876543210l);
		hospital.setBranches(al);

		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch);
		entityManager.persist(branch1);
		entityManager.persist(branch3);
		entityTransaction.commit();

	}
}
