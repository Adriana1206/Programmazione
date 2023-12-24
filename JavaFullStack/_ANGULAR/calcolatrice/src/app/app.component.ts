import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { CalcolatriceComponent } from "./calcolatrice/calcolatrice.component";
import { TastieraComponent } from "./tastiera/tastiera.component";
import { DisplayComponent } from "./display/display.component";
@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [CommonModule, RouterOutlet, CalcolatriceComponent, TastieraComponent, DisplayComponent]
})

export class AppComponent {
  title = 'calcolatrice';
}
