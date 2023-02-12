package com.jsp.person.bankaccount.services;

import com.jsp.person.bankaccount.dao.PersonDao;
import com.jsp.person.bankaccount.dto.Person;

public class PersonServices {
	PersonDao personDao = new PersonDao();

	public Person createPerson(Person person) {
		return personDao.createPerson(person);
	}

	public Person gePersonById(int id) {
		return personDao.getPersonById(id);
	}

	public Person deletePersonById(int id) {
		return personDao.deletePersonById(id);
	}

	public Person updatePersonById(int id, String name, String gmail) {

		return personDao.updatePersonById(id, name, gmail);
	}
}
