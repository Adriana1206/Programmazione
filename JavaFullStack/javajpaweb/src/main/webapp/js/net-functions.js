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

