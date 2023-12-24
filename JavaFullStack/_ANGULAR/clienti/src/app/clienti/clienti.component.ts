import { Component, OnInit } from '@angular/core';
import { ClientiService } from '../clienti.service';
import { Router } from '@angular/router';
import { Cliente } from '../../entities';
import { CommonModule } from '@angular/common';

@Component({
    selector: 'app-clienti',
    standalone: true,
    templateUrl: './clienti.component.html',
    styleUrl: './clienti.component.css',
    imports: [CommonModule]
})
export class ClientiComponent implements OnInit{
dummy(_t19: Cliente) {
throw new Error('Method not implemented.');
}


  clienti: Cliente[] = [];
  
  constructor(private service: ClientiService, private router: Router) {}

  //operazioni che vengono quando il componente viene generato
  ngOnInit(): void {
    this.service.findAll().subscribe((clienti) => { //clienti è il dato che ritorna la richiesta http
      this.clienti = clienti;
    } 
    /*(error) => {
      console.log(error);
      alert(error);
    }*/

    );
  }


  // delete(customer: Cliente): void {
  //   this.service.delete(customer.idCliente).subscribe(() => {
  //     this.clienti = this.clienti.filter((c) => c !== customer);
  //   });
  // }


   //il metodo accetta un argomento che è di tipo Cliente e ha il nome customer
  deleteViaForm(customer: Cliente): void {
   this.router.navigate(['delete', 'Delete', customer.idCliente]);
    // this.router.navigate(['delete'], { queryParams: { mode: 'Delete', id: customer.idCliente }});
  }

 
  addViaForm() {
    this.router.navigate(['create', 'Insert', -1]);
    }
}
