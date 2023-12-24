package com.example.spring01.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.javadb.entities.Cliente;
import com.example.spring01.service.ClientiService;

import ch.qos.logback.core.model.Model;

@RestController
@RequestMapping("/clienti")  //pattern della chiamata, URL
@CrossOrigin(origins="*")
public class ClientiRestController {

	private static Logger log = LogManager.getLogger(ClientiRestController.class);
	
	@Autowired ClientiService service;
	
	//controlla che il tipo di dato richiesto è corretto
	@GetMapping()	 
	public ResponseEntity<List<Cliente>> elencoClienti(Model model){
		log.trace("Inizio metodo elencoClienti()");
		List<Cliente> clienti = service.allClienti();
		return new ResponseEntity<>(clienti,HttpStatus.OK);
	}
	
	//microservizio = chiamata front end fetch + getCliente + service.getCliente(id) + repository.findById(id)
	@GetMapping("/{id}") //path variable 
	public ResponseEntity<Cliente> getCliente(@PathVariable("id") Integer id){
		log.trace("Inizio metodo getClienteById() id={}", id);
		
		//Chiamare il service per farci dare il singolo cliente
		Optional<Cliente> opt = service.getCliente(id);
		if(opt.isPresent()) {
			return new ResponseEntity<>(opt.get(), HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	
	// prevedere una (o più) funzione per la cancellazione del cliente
	// formati accettabili:
	// deleteById: quando il client comunica solo l'id da cancellare
	// delete: quando il client comunica l'intero cliente
	@DeleteMapping
	public ResponseEntity<Map<String, String>> delete(@RequestBody Cliente cliente) {
		log.trace("Inizio metodo delete() cliente={}", cliente);
		Map<String, String> map = new HashMap<>();
 
		Integer id = cliente.getIdCliente(); // per velocizzare l'implementazione
		// da qui come per deleteById
		boolean deleted = false;
		try {
			deleted = service.deleteById(id);//da fare ==> service.delete(cliente)
		} catch(RuntimeException e) {
			log.error("Errore nella cancellazione", e);
			map.put("messaggio", e.getMessage());
			return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}
 
		if(deleted) {
			log.trace("Cancellazione OK id={}", id);
			map.put("messaggio", "Cliente eliminato");
			return new ResponseEntity<>(map, HttpStatus.OK);
		}
 
		log.trace("Cliente non trovato id={}", id);
		map.put("messaggio", "Cliente non trovato");
		return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
	}
}
