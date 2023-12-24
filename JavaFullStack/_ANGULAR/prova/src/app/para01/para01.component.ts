import { Component } from '@angular/core';
import { ImmagineComponent } from "../immagine/immagine.component";

@Component({
    selector: 'app-para01',
    standalone: true,
    templateUrl: './para01.component.html',
    styleUrl: './para01.component.css',
    imports: [ImmagineComponent]
})
export class Para01Component {
  titolo = "Come è fatto il Component di Angular"
}
