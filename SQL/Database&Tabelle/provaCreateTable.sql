/* Basi sulla creazione di tabelle in SQL*/

CREATE TABLE Studente(
    ID INT PRIMARY KEY,
    Nome VARCHAR (20),
    Cognome VARCHAR(50) /*stringa di lunghezza variabile (Variable Character) con una lunghezza massima di 50 caratteri. */
);

CREATE TABLE Libro(
    ISBN VARCHAR(20) PRIMARY KEY,
    Titolo VARCHAR(100),
    Autore VARCHAR(100)
);

CREATE TABLE Ordine(
    ID INT PRIMARY KEY,
    Data DATE,
    Totale DECIMAL(10,2)  /*numerici decimali con una precisione massima di 10 cifre totali, di cui 2 dopo il punto decimale.*/
);

CREATE TABLE Cliente(
    ID INT PRIMARY KEY,
    Nome VARCHAR(100),
    EMAIL VARCHAR(100) UNIQUE  /* la colonna Email deve contenere valori univoci*/
);

CREATE TABLE Prodotto(
    ID INT PRIMARY KEY,
    Nome VARCHAR(100),
    Prezzo DECIMAL(10,2) NOT NULL
);