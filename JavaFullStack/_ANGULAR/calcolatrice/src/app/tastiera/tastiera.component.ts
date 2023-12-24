import { Component} from '@angular/core';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-tastiera',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './tastiera.component.html',
  styleUrl: './tastiera.component.css'
})

export class TastieraComponent {
  
  inserisciNumero(index: any) {
    console.log("Indice: ", index);
    let selectNumero = this.buttons[index];
    console.log("Numero selezionato :" , selectNumero.name);
  }

  buttons = [
    {
      name: '1',
    },
    {
      name: "2",
    },
    {
      name: '3',
    },
    {
      name: "/",
      
    },
    {
      name: "4",
    },
    {
      name: '5',
    },
    {
      name: "6",
    },
    {
      name: "x",
    },
    {
      name: "7",
    },
    {
      name: '8',
    },
    {
      name: "9",
    },
    {
      name: "-",
    },
    {
      name: "0",
    },
    {
      name: ".",
      //style: 'bottonePoint'
    },
    {
      name: "=",
    },
    {
      name: "+",
    },
  ] 
}
