import { Component, OnDestroy, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { Para01Component } from "./para01/para01.component";


@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [CommonModule, RouterOutlet, Para01Component]
})

export class AppComponent implements OnInit, OnDestroy{
  title = 'Prima Applicazione Angular'; // variabile di istanza

  constructor() { // Angular esegue ==> let ac = new AppComponent();
    console.log('Costruttore attivato');
    this.title = "Nuovo titolo";
  }

  ngOnInit(): void {
    console.log("LIFECYCLE: modifica valori durante l'inizializzazione del componente");
  }

  ngOnDestroy(): void {
    console.log('LIFECYCLE: il componenente sta per essere distrutto');
  }

}
