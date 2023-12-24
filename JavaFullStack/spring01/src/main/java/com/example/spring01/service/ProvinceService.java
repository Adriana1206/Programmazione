package com.example.spring01.service;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javadb.entities.Provincia;
import com.example.spring01.repository.ProvinceRepository;


@Service
public class ProvinceService {

	private static final Logger log = LogManager.getLogger(ProvinceService.class);

	@Autowired ProvinceRepository repository;

	public List<Provincia> findAll() {
		return repository.findAll();
	}
}