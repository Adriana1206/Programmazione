package com.example.spring01.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.javadb.entities.Cliente;
import com.example.spring01.service.ClientiService;

@Controller //indica a Spring che questa classe è un controller e deve essere gestita come tale
@RequestMapping("/clientimvc")//specifica il percorso di base per le richieste gestite da questo controller
public class ClientiController {
	private static Logger log = LogManager.getLogger(ClientiController.class);

	
	/*
	 * Spring fornirà automaticamente un'istanza di ClientiService 
	 * quando viene creato l'oggetto ClientiController.
	 */
	@Autowired ClientiService service;//dichiara che ClientiService è una dipendenza
	
	@GetMapping //specifica che questo metodo gestirà le richieste HTTP di tipo GET
	public String elencoClienti(Model model) {
		/*Il metodo prende come parametro un oggetto Model, 
		  che viene utilizzato per passare dati alla view.*/
		 
		log.trace("Inizio metodo allClienti()");
		
		/*Viene creato un oggetto ArrayList di Cliente chiamato clienti.*/
		List<Cliente> clienti = service.allClienti(); // deve essere passata alla JSP
		
		
		
		/* aggiunge l'oggetto clienti al modello con il nome "elenco-clienti". 
		 * Questo renderà gli elementi disponibili alla view JSP associata. */
		model.addAttribute("elenco-clienti", clienti);
		return "clienti";
	}
}
