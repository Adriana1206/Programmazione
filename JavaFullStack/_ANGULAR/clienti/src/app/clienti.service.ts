import { Injectable } from '@angular/core';
//Node module
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, catchError } from 'rxjs';
import { Cliente } from '../entities';
@Injectable({
  providedIn: 'root' //con root fornisco a tutta l'applicazione il service clienti
})
export class ClientiService {
  //HttpClient all'interno del modulo ci sono i metodi Get, post etc 
  constructor(private httpClient: HttpClient) {}

  private url = 'http://localhost:8080/clienti';

  findAll(): Observable<Cliente[]> {
    return this.httpClient.get<Cliente[]>(this.url);
  }

  findById(idCliente: string | null): Observable<Cliente> {
    return this.httpClient.get<Cliente>(this.url + '/' + idCliente); // ritorna un Observable, uno stream di dati
  }

  delete(idCliente: string | number | null | undefined): Observable<any> {
    return this.httpClient.delete<any>(this.url + '/' + idCliente).pipe(
      catchError((error: any) => {
        console.error('Si è verificato un errore:', error);
        throw Error(error.message || 'server error');
      })
    );
  }

  create(cliente: Cliente): Observable<Cliente> {
    const httpOptions = {
      headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
    };
    const body = JSON.stringify(cliente);
    return this.httpClient.post<Cliente>(this.url, body, httpOptions);
  }
  /*

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(private http: HttpClient) { }
  getCustomers(): Observable<Cliente[]> {
    return this.http.get<Cliente[]>(this.customersUrl)
      .pipe(
        catchError(this.handleError<Cliente[]>('getCustomers', []))
      );
  }

  getCustomer(id: number): Observable<Cliente> {
    const url = `${this.customersUrl}/${id}`;
    return this.http.get<Cliente>(url).pipe(
      catchError(this.handleError<Cliente>(`getCustomer id=${id}`))
    );
  }

  updateCustomer(customer: Cliente): Observable<any> {
    return this.http.put(this.customersUrl,
    }





deleteCustomer(id: number) {
  this.apiService.deleteCustomer(id)
    .subscribe(
      data => {
        console.log(data);
        this.reloadData();
      },
      error => console.log(error));
}

updateCustomer() {
  this.apiService.updateCustomer(this.customer.id, this.customer)
    .subscribe(data => {
      console.log(data);
      this.customer = new Customer();
      this.reloadData();
    }, error => console.log(error));
}
*/
}
