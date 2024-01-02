/*Modifica struttura di una tabella con ALTER TABLE*/

ALTER TABLE Studente(
    ADD Indirizzo VARCHAR(100);
);

ALTER TABLE Libro(
    ALTER COLUMN Titolo VARCHAR(200)
);

ALTER Ordine(
    RENAME COLUMN Totale TO ImportoTotale;
);

ALTER TABLE Cliente(
    ADD CONTRAINT UC_Email UNIQUE (Email); /*nomino il vincolo con UC_Email*/
);

ALTER TABLE Prodotto(
    ALTER COLUMN Prezzo DECIMAL (10,12);
);

