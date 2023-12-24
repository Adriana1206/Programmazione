import { Component } from '@angular/core';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';

import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Provincia, Cliente } from '../../entities';
import { ClientiService } from '../clienti.service';
import { ProvinceService } from '../province.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-cliente-form',
  standalone: true,
  imports: [CommonModule, FormsModule, ReactiveFormsModule],
  templateUrl: './cliente-form.component.html',
  styleUrl: './cliente-form.component.css'
})
export class ClienteFormComponent {
  readonly: boolean = true;

  constructor(
    private clientiService: ClientiService,
    private provinceService: ProvinceService,
    private activatedRoute: ActivatedRoute,
    private router: Router
  ) {}

  province: Provincia[] = [];
  id: number | string | null = '';
  mode: string | null = '';

  cliente: Cliente | null = null;

  clientiForm = new FormGroup({
    idCliente: new FormControl(this.cliente?.idCliente),
    nome: new FormControl(this.cliente?.nome),
    cognome: new FormControl(this.cliente?.cognome),
    email: new FormControl(this.cliente?.email),
    indirizzo: new FormControl(this.cliente?.indirizzo),
    citta: new FormControl(this.cliente?.citta),
    provincia: new FormControl(this.cliente?.provincia),
    cap: new FormControl(this.cliente?.cap),
  });

  ngOnInit(): void {
    this.provinceService
      .findAll()
      .subscribe((province) => (this.province = province));

    console.log("***", this.activatedRoute.snapshot);
    this.id = this.activatedRoute.snapshot.paramMap.get('id');
    this.mode = this.activatedRoute.snapshot.paramMap.get('mode');

    this.clientiService.findById(this.id).subscribe((cliente) => {
      this.cliente = cliente;
      this.valuesToForm(cliente);
    });

    if(this.mode === 'Delete'){
      this.readonly = true;
    }else{
      this.readonly = false;
    }
  }

  valuesToForm(cliente: Cliente) {
    this.clientiForm.patchValue({
      idCliente: cliente.idCliente,
      nome: cliente.nome,
      cognome: cliente.cognome,
      email: cliente.email,
      indirizzo: cliente.indirizzo,
      citta: cliente.citta,
      provincia: cliente.provincia,
      cap: cliente.cap,
    });
  }

  back(): void {
    this.router.navigate(['home']);
  }

  execute(): void {
    switch (this.mode) {
      case 'Delete':
        this.delete();
        break;

      case 'Insert':
        this.insert();
        break;

      case 'Update':
        //this.update();
        break;

      default:
        break;
    }
  }

  delete(): void {
    this.clientiService.delete(this.id).subscribe(() => {
      console.log(`cancellato cliente ${this.cliente}`); // this.clienti = this.clienti.filter((c) => c !== customer);
      this.back();
    });
  }

  insert(): void {
    // siccome tutti i nomi dei campi del form corrispondono a quelli di Cliente
    // allora posso effettuare il cast tra il value del form e un'istanza di Cliente
    // this.clientiForm.value as Cliente (per il duck typing)
    this.clientiService
      .create(this.clientiForm.value as Cliente)
      .subscribe(() => {
        console.log(this.clientiForm.value);
        this.back();
      });
  }
}
