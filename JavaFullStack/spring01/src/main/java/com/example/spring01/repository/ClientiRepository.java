package com.example.spring01.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.javadb.entities.Cliente;
import com.example.spring01.controller.ClientiController;

/*Segnalo a Spring che questa interfaccia è una repository
  e dovrebbe essere gestita come tale*/
@Repository
public interface ClientiRepository extends JpaRepository<Cliente, Integer> { /*In questo caso Cliente è l'entità con 
																			   cui sto lavorando e Integer è il tipo 
																		   	   di chiave primaria dell'entità*/
}


/*JpaRepository è un'interfaccia parametrica, accetta due tipi di parametri generici*/

/*JpaRepository semplifica notevolmente la scrittura di repository per l'accesso ai dati
 *Quando estendo JpaRepository sto ottenendo un set completo di operazioni CRUD predefinite 
 *senza dover implementare nulla manualmente.
 */
 