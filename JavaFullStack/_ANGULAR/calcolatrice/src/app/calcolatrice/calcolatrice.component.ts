import { Component } from '@angular/core';
import { DisplayComponent } from "../display/display.component";
import { TastieraComponent } from "../tastiera/tastiera.component";


@Component({
    selector: 'app-calcolatrice',
    standalone: true,
    templateUrl: './calcolatrice.component.html',
    styleUrl: './calcolatrice.component.css',
    imports: [DisplayComponent, TastieraComponent]
})
export class CalcolatriceComponent {
    titolo = "Calcolatrice con Angular"
}
