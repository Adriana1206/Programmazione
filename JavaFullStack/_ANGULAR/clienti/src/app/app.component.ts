import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router, RouterOutlet } from '@angular/router';
import { ClientiComponent } from './clienti/clienti.component';
import { HttpClientModule } from '@angular/common/http';

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [CommonModule, RouterOutlet, ClientiComponent, HttpClientModule]
})
export class AppComponent {

constructor(private router: Router) {
  this.router.navigate(['home']);
}

  title = 'clienti';

  }