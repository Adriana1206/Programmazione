package com.example.javadb.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;


import com.example.javadb.entities.Cliente;

class ClientiJpaDAOTest {

	private static final Logger log = LogManager.getLogger(ClientiJpaDAO.class);

//	@Test
	void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	void testFindAll() {
		ClientiJpaDAO cJpaDao = new ClientiJpaDAO();
		List<Cliente> clienti = cJpaDao.findAll();
		assert(clienti.size() > 0);
		for(Cliente c : clienti) {
			log.debug(c);
		}
	}

//	@Test
	void testCreate() {
		fail("Not yet implemented");
	}

//	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

//	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

}
