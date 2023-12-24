export interface Cliente {
    idCliente?: number | null;
    nome: string;
    cognome: string;
    citta: string
    cap: string;
    email: string;
    indirizzo: string;
    provincia?: string | null;
}

export interface Provincia {
	id: number | null;
	nome: string;
	regione: Regione;
	siglaAutomobilistica: string;
	codiceCittaMetropolitana: number | null;
	latitudine: number;
	longitudine: number;
}


export interface Regione {
  id: number | null;
  nome: string;
  latitudine: number;
	longitudine: number;
}
