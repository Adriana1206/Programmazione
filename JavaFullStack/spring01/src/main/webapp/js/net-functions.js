async function getJson(url, processFunction){
    //vado a leggere lo stream json contenente le regioni da disco
    //mi ritorna una promise(=promessa che potrà essere mantenuta o fallita)
    //const response = await fetch("json/regioni_updated.json"); per regioni
    const response = await fetch(url);

    //converto la stringa in formato jason in un array di oggetti js
    const jsonObject = await response.json();

    //passo i dati ricavati alla funzione di elaborazione dati
    console.log(jsonObject);

    processFunction(jsonObject);
 }   
 
 async function deleteHttp(url, processFunction){

    const response = await fetch(url, {"method":"delete"});

    const jsonObject = await response.json();

    processFunction(jsonObject);


 }
    /* sintassi nativa per le promise
    const prom01 = fetch("json/regioni_updated.json")
	const prom02 = prom01.then( response => response.json() )
	const prom03 = prom02.then( dati => console.log(dati) );


	fetch("json/regioni_updated.json")
    .then( response => response.json() )
    .then( dati => console.log(dati) )
    .error(err => console.log(err) );*/

