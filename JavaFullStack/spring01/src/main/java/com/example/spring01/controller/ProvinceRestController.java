package com.example.spring01.controller;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.javadb.entities.Provincia;
import com.example.spring01.service.ProvinceService;

@RestController
@RequestMapping("/province")
@CrossOrigin(origins = "*")
public class ProvinceRestController {

	private static final Logger log = LogManager.getLogger();
	@Autowired ProvinceService serviceProvince;

	@GetMapping
	public ResponseEntity <List<Provincia>> findAllProvince(){
		log.trace("Start del metodo findAllProvince");
		List<Provincia> province = serviceProvince.findAll();
		return new ResponseEntity<> (province,HttpStatus.OK) ;
	}

}