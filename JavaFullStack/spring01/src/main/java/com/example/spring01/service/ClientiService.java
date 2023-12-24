package com.example.spring01.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javadb.entities.Cliente;
import com.example.spring01.repository.ClientiRepository;

/*@Service indica a Spring che questa classe è un componente di servizio e 
  deve essere gestita come tale. Questa annotazione suggerisce a Spring 
  di considerare questa classe come parte del livello di servizio dell'applicazione. */
@Service
public class ClientiService {
	
	private static Logger log = LogManager.getLogger(ClientiService.class);

	/*Spring fornirà automaticamente un'istanza di ClientiRepository 
	  quando viene creato l'oggetto ClientiService. */
	@Autowired ClientiRepository repository;
	
	//@Autowired CittaRepository cittaRepository;
	
	
	/*Il metodo allClienti restituisce un elenco (List) di tutti i clienti 
	 * ottenuti dal repository (ClientiRepository). Il metodo utilizza il 
	 * metodo findAll() fornito da ClientiRepository per ottenere l'elenco 
	  completo di clienti dal database. */
	public List<Cliente> allClienti(){
		log.trace("Inizio metodo allClienti()");
		log.debug("ClientiRepository Optionallass name{}", repository.getClass().getName());
		List<Cliente> clienti = repository.findAll(); //prenderlo dal service		
		// Cliente c = clienti.get(0);
		// Cliente c = repository.findById(0); // ID : 0 , nome : Marco,  cognome: Purpura ...., id_citta: 3,
		// Citta citta =  cittaRepository.findById(c.getIdCitta()); //id : 3 , nome : Palermo,  n_abitanti : .... , .... , ..
		// c.setCitta(citta.getNome());
		// return cliente
		return clienti;
	}
	
	/*Il metodo getCliente restituisce un oggetto Optional contenente 
	  un cliente con l'ID specificato. Questo metodo utilizza il metodo 
	  findById fornito da ClientiRepository per cercare un cliente nel 
	  database per l'ID specificato */
	//microservio
	public Optional<Cliente> getCliente(Integer id) {
		return repository.findById(id);
	}
	
	
	public boolean deleteById(Integer id) {
		if(getCliente(id).isEmpty()) { // l'id non corrisponde a nessun cliente
			return false;
		}
		repository.deleteById(id);
		return true;
	}
}
