"use strict"

const somma = (x,y) => x + y;
const sottrazione = (x,y) => x - y;
const moltiplicazione = (x,y) => x * y;
const divisione = (x,y) => x / y;


function calcolatore(f, a, b){
    return f(a,b);
}


let risSomma = calcolatore(somma, 100, 233);
console.log(risSomma);

let risSottrazione = calcolatore(sottrazione, 1900, 2330);
console.log(risSottrazione);

const calcolatore2 = (f, a, b) => f(a,b);
risSomma = calcolatore2(somma, 100, 233);