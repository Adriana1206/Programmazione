//definisco l'oggetto persona
let persona = {
    nome: String,
    cognome: String, 
    eta: 0
}


//creo un nuovo oggetto studente che eredita da persona
let studente = Object.create(persona);


//aggiungo una proprietà
studente.corso = "Informatica";


//oggetto con sintassi simile a java 
class Persona{
    constructor(nome, cognome,eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }
}


//template literal
let nome = 'Mario Rossi';

console.log(`ciao &{nome}`);

//funzione classica
function somma(a,b){
    return a+b;
}

//arrow function 
let somma = (a,b) => a+b;

/*le call back sono funzioni che vengono passate come argomento di altre funzioni
 function prova(parametro, callback){

    ......
 }



 quando la richiamo
prova("funzione di prova", somma(a,b));
*/



