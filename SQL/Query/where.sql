 /* creare query che filtrano dati in SQL utilizzando la parola chiave WHERE*/

 SELECT Nome, Cognome, Età
 FROM Studente
 WHERE Età > 20;

 SELECT Titolo, Autore, AnnoPubblicazione
 FROM Libro
 WHERE AnnoPubblicazione > 2000;

 SELECT Nome, Indirizzo, NumeroTelefono
 FROM Cliente
 WHERE Indirizzo LIKE 'Via%';

