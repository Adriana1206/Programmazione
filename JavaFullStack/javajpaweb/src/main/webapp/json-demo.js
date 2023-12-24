"use strict"

/* Oggetto javascript:
   contenitore che tiene insieme informazioni correlate.
   Gli oggetti in JavaScript sono formati da coppie chiave-valore, 
   dove ogni chiave è una stringa (o un simbolo) che identifica univocamente 
   una proprietà dell'oggetto, e ogni valore può essere di qualsiasi tipo di dato, 
   compresi numeri, stringhe, booleani, funzioni o altri oggetti.
*/
let jsObject = {
    prop1: "valore1",
    prop2: "valore2",
    prop1: "valore3",
};

console.log(jsObject);

//posso aggiungere un elemento in questo modo
jsObject.prop4 = "Nuova proprietà 4";
console.log(jsObject);

//posso aggiungere un elemento anche in questo modo
jsObject["prop5"] = "Quinta proprietà";
console.log(jsObject);


console.log(jsObject["prop1"]);
console.log(jsObject).prop2;

/* In js gli oggetti sono anche array di tipo associativo (associano ad una key(la proprietà) un valore) */


//possiamo manipolare questo oggetto tramite JSON
let str = JSON.stringify(jsObject);//converto un oggetto in una stringa (usata per trasmettere dati da js a network)
console.log(str);

let obj = JSON.parse(str); //converte una stringa (JSON) in un oggetto javascript (usata per ricevere dati da rete)
console-log(obj);


/*
    realissa il clone esatto di un oggetto javascript
*/
function clone(obj){
    return JSON.parse(JSON.strungify(obj))
}

const o = {"p1": "aaa", p2: "bbbb"}

const o1 = clone(o);

console.log(o === o1); //stampa truetrue
console.log(o == o1); //stampa false perché sono due oggetti diversi anche se uguali